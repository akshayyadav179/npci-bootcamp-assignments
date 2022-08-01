import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from 'src/app/product';
import { ManagementServiceService } from 'src/app/services/management-service.service';

@Component({
  selector: 'app-prod-form',
  templateUrl: './prod-form.component.html',
  styleUrls: ['./prod-form.component.css']
})
export class ProdFormComponent implements OnInit {
  products:Product=new Product(0,"","",0,"",0,new Date,new Date,0);

  constructor(private service: ManagementServiceService,private route :Router) { }

  ngOnInit(): void {
  }
  onSubmit(){
    // console.log(this.products);
    this.service.saveProducts(this.products).subscribe(data=>{

    console.log(data)
  this.route.navigateByUrl("/products");
});
  }

}
