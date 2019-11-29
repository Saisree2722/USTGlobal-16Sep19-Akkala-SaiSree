import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parentbike',
  templateUrl: './parentbike.component.html',
  styleUrls: ['./parentbike.component.css']
})
export class ParentbikeComponent implements OnInit {
  selectedBike;
  Bikes =[
    {
      name : 'Honda',
      imgurl : 'https://cdn.pixabay.com/photo/2016/11/18/21/30/bike-1836962__340.jpg',
      description: 'The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'
    },
    {
     name : 'Harley-Davidson',
     imgurl : 'https://cdn.pixabay.com/photo/2016/12/13/22/39/harley-davidson-1905281__340.jpg'
    },
    {
     name : 'Yamaha',
     imgurl : 'https://cdn.pixabay.com/photo/2017/02/18/18/43/yamaha-2077914__340.jpg'
    },
    {
     name : 'Chopper',
     imgurl : 'https://cdn.pixabay.com/photo/2014/04/03/10/54/chopper-311697__340.png'
    }
  ]
   constructor() { }
 
   ngOnInit() {
   }
 
   sendBike(bike){
     console.log(bike);
     this.selectedBike=bike;
   }
 
 }
  