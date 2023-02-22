import { RouterModule, Routes } from '@angular/router';

import {AuthGuard} from "./helpers/auth.guard";
import { HomeComponent } from './components/home/home.component';
import {LoginPageComponent} from "./components/login-page/login-page.component";
import { MaterialExampleComponent } from './components/material-example/material-example.component';
import { NgModule } from '@angular/core';
import {RegisterPageComponent} from "./components/register-page/register-page.component";
import { TableComponent } from './components/table/table.component';

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
