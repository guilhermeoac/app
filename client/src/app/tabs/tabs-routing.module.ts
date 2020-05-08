import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {TabsPage} from './tabs.page';

const routes: Routes = [
  {
    path: 'tabs',
    component: TabsPage,
    children: [
      {
        path: 'shared-form',
        loadChildren: () => import('../view/share/sharedForm/shared-form.module').then(m => m.SharedFormModule)
      },
      {
        path: 'list-form',
        loadChildren: () => import('../view/form/list/list-form.module').then(m => m.ListFormModule)
      },
      {
        path: '',
        redirectTo: '/tabs/shared-form',
        pathMatch: 'full'
      }
    ]
  },
  {
    path: '',
    redirectTo: '/tabs/shared-form',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class TabsPageRoutingModule {}
