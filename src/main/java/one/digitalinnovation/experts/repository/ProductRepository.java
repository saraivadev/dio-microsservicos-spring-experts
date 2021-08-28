package one.digitalinnovation.experts.repository;

import one.digitalinnovation.experts.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product, Integer> {

}
