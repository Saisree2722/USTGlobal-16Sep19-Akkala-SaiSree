import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parentmobiles',
  templateUrl: './parentmobiles.component.html',
  styleUrls: ['./parentmobiles.component.css']
})
export class ParentmobilesComponent implements OnInit {
  selectedMobile;
  Mobiles =[
    {
      name : 'Sony',
      imgurl : 'https://cdn.pixabay.com/photo/2014/12/15/13/39/smartphone-569059__340.jpg'
    },
    {
     name : 'Samsung',
     imgurl : 'https://cdn.pixabay.com/photo/2015/06/01/09/04/samsung-793043__340.jpg'
    },
    {
     name : 'Honor',
     imgurl : 'https://cdn.pixabay.com/photo/2017/08/11/14/19/honor-2631271__340.jpg'
    },
    {
     name : 'Oneplus',
     imgurl : 'https://cdn.pixabay.com/photo/2016/10/17/08/07/oneplus-1747152__340.jpg'
    }
  ]
   constructor() { }
 
   ngOnInit() {
   }
 
   sendMobile(mobile){
     console.log(mobile);
     this.selectedMobile=mobile;
   }
 
 }
  
  