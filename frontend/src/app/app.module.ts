import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {HTTP_INTERCEPTORS, HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { BrowserModule } from '@angular/platform-browser';
import { HomeComponent } from './components/home/home.component';
import { LoginPageComponent } from './components/login-page/login-page.component';
import { MaterialExampleComponent } from './components/material-example/material-example.component';
import { MaterialModule } from './module/material.module';
import { NgModule } from '@angular/core';
import { RegisterPageComponent } from './components/register-page/register-page.component';
import { TableComponent } from './components/table/table.component';
import{TokenInterceptor} from "./helpers/token.interceptor";

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    RegisterPageComponent,
    LoginPageComponent,
    MaterialExampleComponent,
    TableComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        BrowserAnimationsModule,
        FormsModule,
        ReactiveFormsModule,
        MaterialModule
    ],
  providers: [
    {
      provide: HTTP_INTERCEPTORS,useClass:TokenInterceptor,multi:true
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
