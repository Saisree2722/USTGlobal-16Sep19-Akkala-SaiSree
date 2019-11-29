import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule }from '@angular/router';
import { HttpClientModule }from '@angular/common/http';
import { AppComponent } from './app.component';
import { FooterComponent } from './footer/footer.component';
import { DataBindingsComponent } from './data-bindings/data-bindings.component';
import { PropertyBindingComponent } from './data-bindings/property-binding/property-binding.component';
import { EventBindingComponent } from './data-bindings/event-binding/event-binding.component';
import { TwowaydatabindingComponent } from './data-bindings/twowaydatabinding/twowaydatabinding.component';
import { DirectiveComponent } from './directive/directive.component';
import { StructuraldirectiveComponent } from './directive/structuraldirective/structuraldirective.component';
import { NgifComponent } from './directive/structuraldirective/ngif/ngif.component';
import { NgforComponent } from './directive/structuraldirective/ngfor/ngfor.component';
import { HeaderComponent } from './header/header.component';
import { NgswitchComponent } from './directive/structuraldirective/ngswitch/ngswitch.component';
import { customDirective } from './customer.directive';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RegisterComponent } from './register/register.component';
import { Form1Component } from './form1/form1.component';
import { Form2Component } from './form2/form2.component';
import { Form3Component } from './form3/form3.component';
import { Form4Component } from './form4/form4.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ChildComponent } from './child/child.component';
import { ParentComponent } from './parent/parent.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';
import { AssignmentComponent } from './assignment/assignment.component';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    DataBindingsComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwowaydatabindingComponent,
    DirectiveComponent,
    StructuraldirectiveComponent,
    NgifComponent,
    NgforComponent,
    HeaderComponent,
    NgswitchComponent,
    customDirective,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    RegisterComponent,
    Form1Component,
    Form2Component,
    Form3Component,
    Form4Component,
    ReactiveFormComponent,
    ChildComponent,
    ParentComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollarPipe,
    AssignmentComponent,
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
      RouterModule.forRoot([
        {path : 'home',component : HomeComponent},
        {path : 'about',component : AboutComponent},
        {path : 'help',component : HelpComponent},
        {path : 'property-binding',component : PropertyBindingComponent},
        {path : 'event-binding',component : EventBindingComponent},
        {path : 'two-way',component : TwowaydatabindingComponent},
        {path : 'ng-if',component : NgifComponent},
        {path : 'ng-for',component : NgforComponent},
        {path : 'ng-switch',component : NgswitchComponent},
        {path : 'register' ,component :RegisterComponent},
        {path : 'form1' ,component :Form1Component},
        {path : 'form2' ,component :Form2Component},
        {path : 'form3' ,component :Form3Component},
        {path : 'form4' ,component :Form4Component},
        {path : 'reactiveform' ,component :ReactiveFormComponent},
        {path : 'parent' , component:ParentComponent},
        {path : 'comment-details' , component : CommentDetailsComponent}
      ])
    ],
  
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
