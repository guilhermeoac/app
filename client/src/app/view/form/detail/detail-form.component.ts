import {Component, OnInit} from '@angular/core';
import {FormService} from "../../../service/form.service";
import {FormModel} from "../../../domain/form.model";
import {ActivatedRoute, Router} from "@angular/router";
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'detail-form',
  templateUrl: 'detail-form.component.html',
  styleUrls: ['detail-form.component.scss']
})
export class DetailFormComponent implements OnInit {

  form: FormModel = new FormModel();
  detailForm: FormGroup;


  constructor(private formService: FormService,
              private route: Router,
              private activatedRoute: ActivatedRoute,
              private formBuilder: FormBuilder) {
    this.detailForm = this.formBuilder.group({
      name: new FormControl(),
      description: new FormControl(),
      time: new FormControl(),
      link: new FormControl()
    });

  }

  ngOnInit(): void {
    this.activatedRoute.params.subscribe(params =>{
      if(params['id']){
        this.formService.findById(params['id']).subscribe(resp =>{
          this.form = resp;
        })
      }
    })

  }

  onSubmit(form) {
    this.form = form.value;
    this.form.userId = 1;
    this.formService.saveForm(this.form).subscribe(resp =>{
      this.route.navigate(['list-form']);
    });

  }

  onChangeDescription(event){
    this.form.description = event.detail.value
  }

  onChangeTime(event){
    this.form.time = event.detail.value
  }

  onChangeLink(event){
    this.form.link = event.detail.value
  }

  onChangeName(event){
    this.form.name = event.detail.value
  }


}
