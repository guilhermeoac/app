import {IonicModule} from '@ionic/angular';
import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {FormsModule} from '@angular/forms';
import {SharedFormComponent} from './shared-form.component';
import {SharedFormRoutingModule} from './shared-form-routing.module'

@NgModule({
  imports: [
    IonicModule,
    CommonModule,
    FormsModule,
    SharedFormRoutingModule,
  ],
  declarations: [SharedFormComponent]
})
export class SharedFormModule {}
