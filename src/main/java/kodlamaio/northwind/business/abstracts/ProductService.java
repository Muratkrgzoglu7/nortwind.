package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.uitities.results.DataResult;
import kodlamaio.northwind.entities.concrates.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
}
