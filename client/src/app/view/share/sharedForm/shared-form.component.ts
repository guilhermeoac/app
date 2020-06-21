import {Component, OnInit} from '@angular/core';
import {FormService} from "../../../service/form.service";
import {Router} from "@angular/router";
import {FormModel} from "../../../domain/form.model";
import {InAppBrowser} from "@ionic-native/in-app-browser/ngx";
import {UserService} from "../../../service/user.service";

@Component({
  selector: 'list-form',
  templateUrl: 'shared-form.component.html',
  styleUrls: ['shared-form.component.scss']
})
export class SharedFormComponent implements OnInit{
  forms: FormModel[] = [];
  page: number = 0;
  numItem: number = 0;

  constructor(private formService: FormService,
              private userService: UserService,
              private inAppBrowser: InAppBrowser,
              private route: Router) {}
  ngOnInit() {
    this.findForms();
  }

  findForms() {
    this.formService.findAllForms(this.page).subscribe(resp => {
      this.forms.push(...resp.content);
    });
  }

  onSlideChange(){
    this.numItem += 1;
    if(this.numItem == 9){
      this.page ++;
      this.findForms();
    }
  }

  openLink(form){
    const browser = this.inAppBrowser.create(form.link,'_self', {footer: 'yes'});
    browser.show();
    browser.on("exit").subscribe(resp =>{
      this.registerAnswer(form);
    });
  }

  registerAnswer(form: FormModel){
    this.userService.updateRank(form).subscribe();
    this.forms = this.forms.filter(value => value.id != form.id);
  }

}
