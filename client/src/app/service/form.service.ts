import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from "rxjs";
import {FormModel} from "../domain/form.model";

@Injectable()
export class FormService {

    private resourceUrl = 'http://localhost:8080/api/form';
    constructor(private http: HttpClient) {
    }

    saveForm(form: FormModel): Observable<any> {
        return this.http.post(this.resourceUrl, form);
    }

    findAllFormsByUser(id: number): Observable<any> {
        return this.http.get(this.resourceUrl + '/user/' + id);
    }

    findById(id: number): Observable<any> {
        return this.http.get(this.resourceUrl + '/' + id);
    }

    delete(id: number): Observable<any> {
        return this.http.delete(this.resourceUrl + '/' + id);
    }

    findAllForms(page: number): Observable<any> {
        return this.http.get(this.resourceUrl + '/shared/' + page);
    }
}
