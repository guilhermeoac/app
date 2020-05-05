import {Component, OnInit} from '@angular/core';
import {FormModel} from "../../../domain/form.model";
import {FormService} from "../../../service/form.service";
import {ActivatedRoute, Router} from "@angular/router";

interface ngOnInit {
}

@Component({
  selector: 'list-form',
  templateUrl: 'list-form.component.html',
  styleUrls: ['list-form.component.scss']
})
export class ListFormComponent implements OnInit{
  forms: FormModel[] = [];

  constructor(private formService: FormService,
              private route: Router) {}

  ngOnInit(){
    this.findAllForms()
  }

  findAllForms(){
    this.formService.findAllFormsByUser(1).subscribe(resp => {
      this.forms = resp;
    })
  }

  selectItem(form){
    this.route.navigate(['detail-form',form.id]);
  }

}
