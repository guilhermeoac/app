import { IonicModule } from '@ionic/angular';
import { RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ListFormComponent } from './list-form.component';
import { ExploreContainerComponentModule } from '../../../explore-container/explore-container.module';

import { ListFormRoutingModule } from './list-form-routing.module'

@NgModule({
  imports: [
    IonicModule,
    CommonModule,
    FormsModule,
    ExploreContainerComponentModule,
    RouterModule.forChild([{ path: '', component: ListFormComponent }]),
    ListFormRoutingModule,
  ],
  declarations: [ListFormComponent]
})
export class ListFormModule {}
