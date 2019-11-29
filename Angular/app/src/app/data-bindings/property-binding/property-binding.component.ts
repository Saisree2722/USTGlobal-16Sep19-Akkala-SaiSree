import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name : string = 'Sai';
  imgUrl = 'https://cdn.pixabay.com/photo/2019/09/26/15/46/girl-4506318_1280.jpg';
  address: string ='Punganur,Chittoor';
  colorname:string = 'purple';
  isActive:boolean = false;
  colspanvalue="2";
  constructor() { }

  ngOnInit() {
    setInterval(()=>{
      this.colorname='green';
      this.isActive=!this.isActive;
    },3000); 
  }

}
