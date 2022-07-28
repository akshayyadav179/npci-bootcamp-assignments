package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService service;
	
	@GetMapping("/list")
	public String productListView(Model model) {
		 List<Product> products = service.findAll();
		 model.addAttribute("PRODUCT", products);
		 
		 return "productUI/productlist.html";
		
	}
	@GetMapping("/addproduct")
	public String proForm(Model model) {
		model.addAttribute("PRODUCT", new Product());
		return "productUI/productform.html";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("Product") Product product) {
		service.save(product);
		
		return "redirect:/products/prodlist";
	}
	
	@GetMapping("/updateform")
	public String updateForm(@RequestParam("proId") int id, Model model) {
		Product pro = service.findById(id);
		model.addAttribute("PRODUCT", pro);
		return "productUI/productform.html";
	}
	@GetMapping("/delete")
	public String deleteById(@RequestParam("proId") int id) {
		service.deleteById(id);
		return "redirect:/products/prodlist";
	}
	

}
