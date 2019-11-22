import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  Movies=[
    {
    name:'Joker',
    imgurl:'https://cdn.pixabay.com/photo/2017/08/28/00/01/thejoker-2688077__340.jpg'
    }]
  
  Movies1=[
    
    {
      name1:'Adventure',
      imgurl1:'https://cdn.pixabay.com/photo/2017/06/29/00/10/movie-poster-2452656__340.jpg'
    }]
    
    Movies2=[{
      name2:'Three Friends',
      imgurl2:'https://cdn.pixabay.com/photo/2012/10/25/23/24/film-poster-62856_960_720.jpg'
    }

]

  constructor() { }

  ngOnInit() {
  
  }

}
