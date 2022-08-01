import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Category } from '../category';
import { Product } from '../product';

@Injectable({
  providedIn: 'root'
})
export class ManagementServiceService {
  private produrl = "http://localhost:8080/api/prod"
  private caturl = "http://localhost:8080/api/cat"

  constructor(private httpClient:HttpClient) { }

  getAllProducts():Observable<Product[]>{
    return this.httpClient.get<GetResponseProduct>(this.produrl).pipe(map(response =>response._embedded.products));
   // return this.httpClient.get<getEmployeeResponse>

  }
  getAllCategories():Observable<Category[]>{
   return this.httpClient.get<GetResponseCategory>(this.caturl).pipe(map(response =>response._embedded.categories));
  }
  saveProducts(product:Product) : Observable<Product>{
    console.log(product)
    const httpOptions={
      headers:new HttpHeaders({
      'Content-type':'application/json',
      'Authorization':'auth-token',
      'Acess-Control-Allow-Origin':'*'
      })
    };
    return this.httpClient.post<Product>(this.produrl,product,httpOptions);

   }

}
interface GetResponseProduct{
  _embedded:{
    products:Product[]
  }
 }

 interface GetResponseCategory{
  _embedded:{
    categories:Category[]
  }
 }
