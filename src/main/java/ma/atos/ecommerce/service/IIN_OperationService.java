package ma.atos.ecommerce.service;

import ma.atos.ecommerce.dto.GetIdCustomer;
import ma.atos.ecommerce.dto.GetSupplierId;
import ma.atos.ecommerce.dto.In_OperationDto;
import ma.atos.ecommerce.exceptions.Out_Operation_Exception;
import ma.atos.ecommerce.model.In_Operation;

import java.util.List;

public interface IIN_OperationService {

    In_Operation save(In_OperationDto operation);

    List<In_Operation> findInByCustomer(GetSupplierId getSupplierId) throws Out_Operation_Exception;

}
