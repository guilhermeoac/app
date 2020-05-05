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
        return this.http.get(this.resourceUrl);
    }

    findById(id: number): Observable<any> {
        return this.http.get(this.resourceUrl + '/' + id);
    }
}
