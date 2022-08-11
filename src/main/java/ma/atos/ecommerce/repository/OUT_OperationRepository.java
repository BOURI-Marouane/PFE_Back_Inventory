package ma.atos.ecommerce.repository;

import ma.atos.ecommerce.model.Out_Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OUT_OperationRepository extends JpaRepository<Out_Operation,Long> {
    /*@Query(value = "SELECT * FROM Out_Operation n where n.id_Out_Operation = ?1",
    nativeQuery = true
    )*/
    List<Out_Operation> findByIdOutOperation(long id_out_operation);
}
