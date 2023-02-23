import { RouterModule, Routes } from '@angular/router';

import {AuthGuard} from "./core/guards/auth.guard";
import { HomeComponent } from './core/components/home/home.component';
import {LoginPageComponent} from "./core/components/login-page/login-page.component";
import { MaterialExampleComponent } from './core/components/material-example/material-example.component';
import { NgModule } from '@angular/core';
import {RegisterPageComponent} from "./core/components/register-page/register-page.component";
import { TableComponent } from './core/components/table/table.component';

const routes: Routes = [
  {
    path:"home",
    component: HomeComponent,
    canActivate:[AuthGuard]
  },
  {
    path:"login",
    component:LoginPageComponent
  },
  {
    path:"register",
    component:RegisterPageComponent
  },
  {
    path: "",
    component: MaterialExampleComponent
  }
  // {
  //   path:"**",
  //   redirectTo: "/home",
  //   pathMatch: "full"
  // }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
