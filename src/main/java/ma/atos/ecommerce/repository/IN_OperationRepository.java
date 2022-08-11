package ma.atos.ecommerce.repository;

import ma.atos.ecommerce.model.In_Operation;
import ma.atos.ecommerce.model.Out_Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IN_OperationRepository extends JpaRepository<In_Operation,Long> {

    List<In_Operation> findByIdInOperation(long id_in_operation);
}
