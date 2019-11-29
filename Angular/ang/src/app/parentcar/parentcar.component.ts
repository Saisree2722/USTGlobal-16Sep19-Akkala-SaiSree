import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parentcar',
  templateUrl: './parentcar.component.html',
  styleUrls: ['./parentcar.component.css']
})
export class ParentcarComponent implements OnInit {
  selectedCar;
  Cars =[
    {
      name : 'Audi',
     imgurl : 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
     description:'The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'
    },
    {
     name : 'sports',
     imgurl : 'https://cdn.pixabay.com/photo/2019/10/02/13/29/motorsport-4520952__340.jpg'
     
    },
    {
     name : 'Ford',
     imgurl : 'https://cdn.pixabay.com/photo/2014/10/22/17/22/ford-498244__340.jpg'
    },
    {
     name : 'Auto',
     imgurl : 'https://cdn.pixabay.com/photo/2015/05/28/23/12/auto-788747__340.jpg'
    }
  ]
   constructor() { }
 
   ngOnInit() {
   }
 
   sendCar(car){
     console.log(car);
     this.selectedCar=car;
   }
 
 }
  