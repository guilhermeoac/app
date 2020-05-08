import {Component, OnInit} from '@angular/core';
import {FormService} from "../../../service/form.service";
import {Router} from "@angular/router";
import {NameIdModel} from "../../../domain/nameId.model";

interface ngOnInit {
}

@Component({
  selector: 'list-form',
  templateUrl: 'list-form.component.html',
  styleUrls: ['list-form.component.scss']
})
export class ListFormComponent implements OnInit{
  forms: NameIdModel[] = [];

  constructor(private formService: FormService,
              private route: Router) {}

  ngOnInit(){
    this.findAllForms();
  }

  findAllForms(){
    this.formService.findAllFormsByUser(1).subscribe(resp => {
      this.forms = resp;
    })
  }

  selectItem(form){
    this.route.navigate(['detail-form',form.id]);
  }

  delete(form){
    this.formService.delete(form.id).subscribe(resp => {
      this.findAllForms();
    })

  }

}
