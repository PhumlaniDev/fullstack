import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from "@angular/forms";

import { AuthenticationService } from "../../services/authentication.service";

@Component({
  selector: 'app-material-example',
  templateUrl: './material-example.component.html',
  styleUrls: ['./material-example.component.css']
})
export class MaterialExampleComponent {
  
  public form!: FormGroup;

  notSame = false;

  constructor(private authenticationService: AuthenticationService) {
  }

  ngOnInit(): void {
    this.form = new FormGroup({
      firstname: new FormControl("", Validators.required),
      lastname: new FormControl("", Validators.required),
      email: new FormControl("", [Validators.required, Validators.email]),
      password: new FormControl("", Validators.required),
    })
  }

  public onSubmit() {
    this.authenticationService.register(
      this.form.get("firstname")!.value,
      this.form.get("lastname")!.value,
      this.form.get("email")!.value,
      this.form.get("password")!.value
    )
  }

  get firstname() { return this.form.get("firstname") }
  get lastname() { return this.form.get("lastname") }
  get email() { return this.form.get("email") }
  get password() { return this.form.get("password") }
}

