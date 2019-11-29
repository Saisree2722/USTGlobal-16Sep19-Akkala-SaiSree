import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parentlaptops',
  templateUrl: './parentlaptops.component.html',
  styleUrls: ['./parentlaptops.component.css']
})
export class ParentlaptopsComponent implements OnInit {

  selectedLaptop;
  Laptops =[
    {
      name : 'Vivo',
      imgurl : 'https://cdn.pixabay.com/photo/2017/11/06/11/13/vaio-2923377__340.jpg'
    },
    {
     name : 'HP',
     imgurl : 'https://cdn.pixabay.com/photo/2018/10/02/09/52/hp-hq-tre-core-i5-laptop-3718328_960_720.jpg'
    },
    {
     name : 'Dell',
     imgurl : 'https://cdn.pixabay.com/photo/2017/03/14/20/39/dell-2144351__340.jpg'
    },
    {
     name : 'Mac',
     imgurl : 'https://cdn.pixabay.com/photo/2014/09/24/14/29/mac-459196__340.jpg'
    }
  ]
   constructor() { }
 
   ngOnInit() {
   }
 
   sendLaptop(laptop){
     console.log(laptop);
     this.selectedLaptop=laptop;
   }
 
 }
  