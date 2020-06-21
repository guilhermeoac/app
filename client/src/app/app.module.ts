import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {RouteReuseStrategy} from '@angular/router';

import {IonicModule, IonicRouteStrategy} from '@ionic/angular';
import {SplashScreen} from '@ionic-native/splash-screen/ngx';
import {StatusBar} from '@ionic-native/status-bar/ngx';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {FormService} from "./service/form.service";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import {ListFormModule} from "./view/form/list/list-form.module";
import {DetailFormModule} from "./view/form/detail/detail-form.module";
import {TabsPageModule} from "./tabs/tabs.module";
import {SharedFormModule} from "./view/share/sharedForm/shared-form.module";
import {InAppBrowser} from "@ionic-native/in-app-browser/ngx";
import {UserService} from "./service/user.service";

@NgModule({
  declarations: [AppComponent],
  entryComponents: [],
  imports: [ FormsModule, BrowserModule, IonicModule.forRoot(), AppRoutingModule, HttpClientModule, DetailFormModule],
  providers: [
    StatusBar,
    SplashScreen,
    FormService,
    UserService,
    InAppBrowser,
    { provide: RouteReuseStrategy, useClass: IonicRouteStrategy }
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
