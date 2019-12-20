import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NgForm } from '@angular/forms';
import { ProductserviceService } from '../productservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-updateproduct',
  templateUrl: './updateproduct.component.html',
  styleUrls: ['./updateproduct.component.css']
})
export class UpdateproductComponent implements OnInit {
  error:any;
constructor(private http: HttpClient,private add: ProductserviceService,  private router: Router) { }
   updateProduct(UpdateProductForm: NgForm) 
{
   this.http.post(`${this.add.baseURL}/modifyProduct`, UpdateProductForm.value).subscribe(response => {
   if (response != null) {
     alert('Product updated');
   } else {
      alert('failed to update Product');
     }
     });
   }

  ngOnInit() {
  }

}
