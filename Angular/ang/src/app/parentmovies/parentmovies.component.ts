import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parentmovies',
  templateUrl: './parentmovies.component.html',
  styleUrls: ['./parentmovies.component.css']
})
export class ParentmoviesComponent implements OnInit {
  selectedMovie;
  Movies =[
    {
      name : 'Avengers',
      imgurl : 'https://tse4.mm.bing.net/th?id=OIP.blverIh7XMBbvrx1GCVBtQHaEK&pid=Api&P=0&w=268&h=152'
    },
    {
     name : 'Spiderman',
     imgurl : 'https://tse1.mm.bing.net/th?id=OIP.mYtQR_JD3NcIC73fIX6u3wHaLQ&pid=Api&P=0&w=300&h=300'
    },
    {
     name : 'Gravity',
     imgurl : 'https://tse3.mm.bing.net/th?id=OIP.WRiN726TrdMS7O2krCqQHwHaHa&pid=Api&P=0&w=300&h=300'
    },
    {
     name : 'HarryPotter',
     imgurl : 'https://tse3.mm.bing.net/th?id=OIP.dszRvqcJxytRZYEsijEbwQHaEK&pid=Api&P=0&w=325&h=184'
    }
  ]
   constructor() { }
 
   ngOnInit() {
   }
 
   sendMovie(movie){
     console.log(movie);
     this.selectedMovie=movie;
   }
 
 }
  
  