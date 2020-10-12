package server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import shared.entity.Product;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;


@Component
public class ProductCatalog {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductCatalog.class);

	private Set<Product> products = new HashSet<>();


	@PostConstruct
	public void init() {
		products.add(makeProduct(1, "Plate", 1.2));
		products.add(makeProduct(2, "Glass", 0.9));

		LOGGER.info("Products = {}", products);
	}


	private Product makeProduct(int productId, String productName, double price) {
		Product theProduct = new Product();
		theProduct.setProductId(productId);
		theProduct.setProductName(productName);
		theProduct.setPrice(price);
		return theProduct;
	}
}
