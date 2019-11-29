import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;
 Cars =[
   {
     name : 'Sports',
     imgurl : 'https://cdn.pixabay.com/photo/2019/10/02/13/29/motorsport-4520952__340.jpg'
   },
   {
    name : 'Audi',
    imgurl : 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg'
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
