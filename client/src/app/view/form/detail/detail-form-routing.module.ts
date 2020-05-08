import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DetailFormComponent } from './detail-form.component';
import {ListFormComponent} from "../list/list-form.component";

const routes: Routes = [
  {
    path: 'detail-form/:id',
    component: DetailFormComponent,
  },
  {
    path: 'detail-form',
    component: DetailFormComponent,
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DetailFormRoutingModule {}
