import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule} from '@angular/forms';
import { RouterModule} from '@angular/router';
import { AppComponent } from './app.component';
import { ParentbikeComponent } from './parentbike/parentbike.component';
import { ChildbikeComponent } from './childbike/childbike.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { ChildcarComponent } from './childcar/childcar.component';
import { ParentcarComponent } from './parentcar/parentcar.component';
import { ParentmoviesComponent } from './parentmovies/parentmovies.component';
import { ChildmoviesComponent } from './childmovies/childmovies.component';
import { ChildmobilesComponent } from './childmobiles/childmobiles.component';
import { ParentmobilesComponent } from './parentmobiles/parentmobiles.component';
import { ParentlaptopsComponent } from './parentlaptops/parentlaptops.component';
import { ChildlaptopsComponent } from './childlaptops/childlaptops.component';

@NgModule({
  declarations: [
    AppComponent,
    ParentbikeComponent,
    ChildbikeComponent,
    HomeComponent,
    HeaderComponent,
    ChildcarComponent,
    ParentcarComponent,
    ParentmoviesComponent,
    ChildmoviesComponent,
    ChildmobilesComponent,
    ParentmobilesComponent,
    ParentlaptopsComponent,
    ChildlaptopsComponent
  ],
  imports: [
    BrowserModule,
      ReactiveFormsModule,
      RouterModule.forRoot([
        {path : 'home',component : HomeComponent},
        {path : 'cars',component : ParentcarComponent},
        {path : 'bikes',component : ParentbikeComponent},
        {path : 'movies',component : ParentmoviesComponent},
        {path : 'laptops',component : ParentlaptopsComponent},
        {path : 'mobiles',component : ParentmobilesComponent}
      ])   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
