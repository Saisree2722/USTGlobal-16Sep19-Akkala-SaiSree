import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';

import { HeaderComponent } from './header/header.component';
import { ProductComponent } from './product/product.component';
import { OrdersComponent } from './orders/orders.component';
import { OrdershistoryComponent } from './ordershistory/ordershistory.component';
import { RouterModule } from '@angular/router';
import { SearchproductbyIDComponent } from './searchproductby-id/searchproductby-id.component';
import { SearchproductbyNameComponent } from './searchproductby-name/searchproductby-name.component';
import { SearchproductbycategoryComponent } from './searchproductbycategory/searchproductbycategory.component';
import { SearchproductbycompanyComponent } from './searchproductbycompany/searchproductbycompany.component';
import { UpdateproductComponent } from './updateproduct/updateproduct.component';
import { DisplayproductsComponent } from './displayproducts/displayproducts.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ProductComponent,
    OrdersComponent,
    OrdershistoryComponent,
    SearchproductbyIDComponent,
    SearchproductbyNameComponent,
    SearchproductbycategoryComponent,
    SearchproductbycompanyComponent,
    UpdateproductComponent,
    DisplayproductsComponent,
    
   
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path:"addproduct" ,component :ProductComponent },
      {path:"searchbyid" ,component :SearchproductbyIDComponent},
      {path:"searchbyname" ,component :SearchproductbyNameComponent},
      {path:"searchbycategory" ,component :SearchproductbycategoryComponent},
      {path:"searchbycompany" ,component :SearchproductbycompanyComponent},
      {path:"updateproduct" ,component: UpdateproductComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
