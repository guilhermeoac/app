import { IonicModule } from '@ionic/angular';
import { RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { DetailFormComponent } from './detail-form.component';

import { DetailFormRoutingModule } from './detail-form-routing.module';
import {TabsPageModule} from "../../../tabs/tabs.module";

@NgModule({
    imports: [
        IonicModule,
        CommonModule,
        FormsModule,
        DetailFormRoutingModule,
        ReactiveFormsModule
    ],
  declarations: [DetailFormComponent]
})
export class DetailFormModule {}
