import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

import { AuthenticationService } from "../../services/authentication.service";

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css'],
})
export class LoginPageComponent implements OnInit {

  public form!: FormGroup;

  constructor(private authenticationService: AuthenticationService) { }

  ngOnInit() {
    this.form = new FormGroup({
      email: new FormControl("", [Validators.required, Validators.email]),
      password: new FormControl("", [Validators.required]),
    });
  }

  public onSubmit() {
    this.authenticationService.login(
      this.form.get("email")!.value,
      this.form!.get("password")!.value
    );
  }

  get email() { return this.form.get("email") }
  get password() { return this.form.get("password") }
}
