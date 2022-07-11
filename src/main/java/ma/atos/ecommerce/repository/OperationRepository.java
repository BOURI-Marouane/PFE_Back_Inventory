package ma.atos.ecommerce.repository;

import ma.atos.ecommerce.model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation,Long> {

}
