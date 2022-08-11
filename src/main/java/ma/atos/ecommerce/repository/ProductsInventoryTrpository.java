package ma.atos.ecommerce.repository;

import ma.atos.ecommerce.model.Product_Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsInventoryTrpository extends JpaRepository<Product_Inventory,Long> {
}
