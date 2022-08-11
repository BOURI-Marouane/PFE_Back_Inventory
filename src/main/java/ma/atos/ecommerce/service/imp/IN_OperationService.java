package ma.atos.ecommerce.service.imp;

import ma.atos.ecommerce.dto.GetIdCustomer;
import ma.atos.ecommerce.dto.GetSupplierId;
import ma.atos.ecommerce.dto.In_OperationDto;
import ma.atos.ecommerce.exceptions.Out_Operation_Exception;
import ma.atos.ecommerce.mappers.In_OperationMappers;
import ma.atos.ecommerce.model.In_Operation;
import ma.atos.ecommerce.model.Out_Operation;
import ma.atos.ecommerce.model.Product_Inventory;
import ma.atos.ecommerce.repository.IN_OperationRepository;
import ma.atos.ecommerce.repository.OperationRepository;
import ma.atos.ecommerce.repository.ProductsInventoryTrpository;
import ma.atos.ecommerce.service.IIN_OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IN_OperationService implements IIN_OperationService {

    @Autowired
    IN_OperationRepository operationRepository;

    @Autowired
    In_OperationMappers operationMappers;

    @Autowired
    ProductsInventoryTrpository productsInventoryTrpository;

    @Override
    public In_Operation save(In_OperationDto operationDto) {
        In_Operation operation = operationMappers.toOperation(operationDto);
        Optional<Product_Inventory> product_inventory = productsInventoryTrpository.findById(operationDto.getProducts_inventory());
        operation.setProducts_inventory(product_inventory.get());
         return operationRepository.save(operation);

    }

    @Override
    public List<In_Operation> findInByCustomer(GetSupplierId getSupplierId)  throws Out_Operation_Exception {
        List<In_Operation> listInOperations = null;
        try {
            listInOperations = operationRepository.findByIdInOperation(getSupplierId.getId_in_operation());
            System.out.println("test");
        }catch (Exception e)
        {
            new Out_Operation_Exception("In Operation is not records");
        }
        return listInOperations;
    }
}
