import { CommonModule } from '@angular/common';
import {MatButtonModule} from "@angular/material/button"
import {MatCardModule} from "@angular/material/card"
import {MatInputModule} from "@angular/material/input"
import {MatTableModule} from "@angular/material/table"
import { NgModule } from '@angular/core';

@NgModule({
  declarations: [],
  imports: [
    CommonModule
  ],
  exports: [
    MatInputModule,
    MatButtonModule,
    MatCardModule,
    MatTableModule
  ]
})
export class MaterialModule { }
