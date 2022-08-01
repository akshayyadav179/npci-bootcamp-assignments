import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Product } from '../product';
import { ManagementServiceService } from '../services/management-service.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products :Product[];
  constructor(private prodService:ManagementServiceService,private route:Router,private activeRoute:ActivatedRoute){
}

  ngOnInit(): void {
    // console.log(this.getAllProducts());
    this.activeRoute.paramMap.subscribe(()=>{
      this.getAllProducts()});
    }

  
  getAllProducts(){
    this.prodService.getAllProducts().subscribe(
      data =>{
        console.log(data);
        this.products=data
      }
    );
  }
  addEmpProd(){
    this.route.navigateByUrl("/prodform");
  }

}
