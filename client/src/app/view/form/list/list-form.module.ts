import {IonicModule} from '@ionic/angular';
import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {FormsModule} from '@angular/forms';
import {ListFormComponent} from './list-form.component';
import {ListFormRoutingModule} from './list-form-routing.module'
import {DetailFormModule} from "../detail/detail-form.module";

@NgModule({
  imports: [
    IonicModule,
    CommonModule,
    FormsModule,
    ListFormRoutingModule,
  ],
  declarations: [ListFormComponent]
})
export class ListFormModule {}
