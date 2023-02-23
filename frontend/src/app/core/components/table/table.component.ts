import { Component } from '@angular/core';

export interface PeriodicElement{
  name: string;
  position: number;
  department: string;
  occupation: string;
}

const ELEMENTDATA: PeriodicElement[] = [
  {position: 1, name:"Phumlani", department:"F-9-Z-70", occupation:"Full-Stack"},
  {position: 2, name:"Sihle", department:"F-9-Z-73", occupation:"Front-End"},
  {position: 3, name:"Lilo", department:"F-9-Z-73", occupation:"Back-End"},
  {position: 4, name:"Sivuyisiwe", department:"F-9-Z-73", occupation:"Dev-Ops"},
  {position: 5, name:"Advice", department:"F-9-Z-74", occupation:"Dev-Ops"},
  {position: 6, name:"Tina", department:"F-9-Z-74", occupation:"Front-End"},
  {position: 7, name:"Tshepang", department:"F-9-Z-74", occupation:"Dev-Ops"}
]

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent {

  displayColumns: string[] = ["demo-position","demo-name","demo-department","demo-occupation",]
  datasource = ELEMENTDATA;
}
