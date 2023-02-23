import {Component, OnInit} from '@angular/core';

import {AuthenticationService} from "../../services/authentication.service";
import {HomeClient} from "../../clients/home.client";
import { HomeService } from '../../services/home.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
  providers: [HomeClient]
})
export class HomeComponent implements OnInit{

  // public home: Subscription = this.homeClient.gotToHome();
  // @ts-ignore
  public data: any;

  constructor(
    private authenticationService: AuthenticationService,
    private homeClient: HomeClient
  ) {
  }

  ngOnInit(): void {
    console.log(this.data);
    this.homeClient.getHomeData().subscribe(data =>{
      this.data = data
    })
    console.log(this.data);
    
  }

  // getHomeData(){
    
  // }

  logout():void{
    this.authenticationService.logout()
  }
}
