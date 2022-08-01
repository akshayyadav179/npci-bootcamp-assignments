import { Component, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { Routes,RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { ProductListComponent } from './product-list/product-list.component';
import { CategoryListComponent } from './category-list/category-list.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { ProdFormComponent } from './components/prod-form/prod-form.component';
import { FormsModule } from '@angular/forms';
import { MerchantComponent } from './components/merchant/merchant.component';
import { BuyerComponent } from './components/buyer/buyer.component';


const routes:Routes=[
  {path:'',component:WelcomeComponent},
  {path:'products',component:ProductListComponent},
  {path:'categories',component:CategoryListComponent},
  {path:'prodform',component:ProdFormComponent},
  {path:'buyProd',component:BuyerComponent}

]
@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    CategoryListComponent,
    WelcomeComponent,
    ProdFormComponent,
    MerchantComponent,
    BuyerComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(routes),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
