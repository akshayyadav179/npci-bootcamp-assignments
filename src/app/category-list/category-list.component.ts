import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Category } from '../category';
import { ManagementServiceService } from '../services/management-service.service';

@Component({
  selector: 'app-category-list',
  templateUrl: './category-list.component.html',
  styleUrls: ['./category-list.component.css']
})
export class CategoryListComponent implements OnInit {
  categories:Category[];

  constructor(private catService :ManagementServiceService,private routes:Router) { }

  ngOnInit(): void {
    console.log(this.getAllCategoris())

  }
  getAllCategoris(){
    this.catService.getAllCategories().subscribe(
      data =>{
        console.log(data);
        this.categories=data;
      }
    );
  }

}
