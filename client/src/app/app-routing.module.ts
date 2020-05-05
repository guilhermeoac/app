import {NgModule} from '@angular/core';
import {PreloadAllModules, RouterModule, Routes} from '@angular/router';
import {ListFormComponent} from "./view/form/list/list-form.component";
import {DetailFormComponent} from "./view/form/detail/detail-form.component";

const routes: Routes = [
  {
    path: 'list-form', component: ListFormComponent
  },
  {
    path: '',
    component: ListFormComponent,
  },
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
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {}
