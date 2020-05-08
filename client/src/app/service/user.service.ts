import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from "rxjs";
import {FormModel} from "../domain/form.model";

@Injectable()
export class UserService {

    private resourceUrl = 'http://localhost:8080/api/user';
    constructor(private http: HttpClient) {
    }

    updateRank(form: FormModel) {
        return this.http.put(this.resourceUrl, form);
    }
}
