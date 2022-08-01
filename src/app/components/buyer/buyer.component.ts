import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/product';
import { ActivatedRoute, Router } from '@angular/router';
import { ManagementServiceService } from 'src/app/services/management-service.service';

@Component({
  selector: 'app-buyer',
  templateUrl: './buyer.component.html',
  styleUrls: ['./buyer.component.css']
})
export class BuyerComponent implements OnInit {
  products:Product[];

  constructor(private prodService:ManagementServiceService,private route:Router,private activeRoute:ActivatedRoute) { }

  ngOnInit(): void {
    this.activeRoute.paramMap.subscribe(()=>{
      this.getAllProducts()});
  }
  getAllProducts(){
    this.prodService.getAllProducts().subscribe(data =>{
        console.log(data);
        this.products=data
      }
    );
  }
  buyProd(){
    // this.route.navigateByUrl("/buyProd");
    console.log(this.getAllProducts());
  }

}
