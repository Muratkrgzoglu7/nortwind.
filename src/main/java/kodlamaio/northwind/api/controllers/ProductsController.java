package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.uitities.results.DataResult;
import kodlamaio.northwind.core.uitities.results.Result;
import kodlamaio.northwind.core.uitities.results.SuccessDataResult;
import kodlamaio.northwind.entities.concrates.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productService;
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll();
				
	}
	@PostMapping("/add")
	public Result add(){
		return new Result(true, "ürün eklendi");
				
	}

}
