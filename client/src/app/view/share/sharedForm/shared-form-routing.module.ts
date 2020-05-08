import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SharedFormComponent } from './shared-form.component';

const routes: Routes = [
  {
    path: '',
    component: SharedFormComponent,
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SharedFormRoutingModule {}
