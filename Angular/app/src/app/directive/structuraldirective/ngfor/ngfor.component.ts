import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngfor',
  templateUrl: './ngfor.component.html',
  styleUrls: ['./ngfor.component.css']
})
export class NgforComponent implements OnInit {
 Products =[
   {
     img :"https://cdn.pixabay.com/photo/2017/11/30/08/56/ice-cream-2987955__340.jpg",
     name :"Icecream",
     price :50
   },
   {
    img :"https://cdn.pixabay.com/photo/2016/11/04/15/49/cosmetic-1798154__340.jpg",
    name :"Flowers",
    price : 100 
  },
  {
    img :"https://cdn.pixabay.com/photo/2018/02/01/19/21/easter-3123834__340.jpg",
    name :"eggs",
    price : 30 
  }
 ]
  constructor() { }

  ngOnInit() {
  }

}
