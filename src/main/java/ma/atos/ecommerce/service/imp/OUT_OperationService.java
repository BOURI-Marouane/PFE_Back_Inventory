package ma.atos.ecommerce.service.imp;

import ma.atos.ecommerce.dto.GetIdCustomer;
import ma.atos.ecommerce.dto.Out_OperationDto;
import ma.atos.ecommerce.exceptions.Out_Operation_Exception;
import ma.atos.ecommerce.mappers.Out_OperationMappers;
import ma.atos.ecommerce.model.Out_Operation;
import ma.atos.ecommerce.model.Product_Inventory;
import ma.atos.ecommerce.repository.OUT_OperationRepository;
import ma.atos.ecommerce.repository.ProductsInventoryTrpository;
import ma.atos.ecommerce.service.IOUT_OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OUT_OperationService implements IOUT_OperationService {

    @Autowired
    OUT_OperationRepository operationRepository;

    @Autowired
    Out_OperationMappers operationMappers;

    @Autowired
    ProductsInventoryTrpository productsInventoryTrpository;

    @Override
    public Out_Operation save(Out_OperationDto operationDto) {
        Out_Operation operation = operationMappers.toOperation(operationDto);
        Optional<Product_Inventory> product_inventory = productsInventoryTrpository.findById(operationDto.getProducts_inventory());
        operation.setProducts_inventory(product_inventory.get());
        return operationRepository.save(operation);

    }

    @Override
    public List<Out_Operation> findByCustomer(GetIdCustomer getIdCustomer) throws Out_Operation_Exception {
        List<Out_Operation> listOutOperations = null;
        try {

            listOutOperations = operationRepository.findByIdOutOperation(getIdCustomer.getId_out_operation());
            System.out.println("test");
        }catch (Exception e)
        {
            new Out_Operation_Exception("Out Operation is not records");
        }
        return listOutOperations;
    }
}
