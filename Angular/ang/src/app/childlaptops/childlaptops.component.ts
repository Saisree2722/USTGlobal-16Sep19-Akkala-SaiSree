import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-childlaptops',
  templateUrl: './childlaptops.component.html',
  styleUrls: ['./childlaptops.component.css']
})
export class ChildlaptopsComponent implements OnInit {
  @Input() laptop :{imgurl:string,name:string};
  constructor() { }

  ngOnInit() {
  }

}
