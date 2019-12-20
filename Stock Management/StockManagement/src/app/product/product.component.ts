import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { ProductserviceService } from '../productservice.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
error:any;
constructor(private http: HttpClient,private add: ProductserviceService,  private router: Router) { }
   addProduct(addProductForm: NgForm) 
{
   this.http.post(`${this.add.baseURL}/addProduct`, addProductForm.value).subscribe(response => {
   if (response != null) {
     alert('Product Added');
   } else {
      alert('failed to add Product');
     }
     });
   }
   ngOnInit() {
    
  }
}
