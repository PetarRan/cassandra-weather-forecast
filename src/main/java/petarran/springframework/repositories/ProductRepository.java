package petarran.springframework.repositories;

import petarran.springframework.domain_model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


/**
 *
 */
public interface ProductRepository extends CrudRepository<Product, UUID> {
}
