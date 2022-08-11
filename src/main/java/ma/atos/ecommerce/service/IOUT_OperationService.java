package ma.atos.ecommerce.service;

import ma.atos.ecommerce.dto.GetIdCustomer;
import ma.atos.ecommerce.dto.In_OperationDto;
import ma.atos.ecommerce.dto.Out_OperationDto;
import ma.atos.ecommerce.exceptions.Out_Operation_Exception;
import ma.atos.ecommerce.model.In_Operation;
import ma.atos.ecommerce.model.Out_Operation;
import ma.atos.ecommerce.service.imp.OUT_OperationService;
import ma.atos.ecommerce.web.Responses.Response_ListOut;

import java.util.List;

public interface IOUT_OperationService {
    Out_Operation save(Out_OperationDto operation);
    List<Out_Operation> findByCustomer(GetIdCustomer getIdCustomer) throws Out_Operation_Exception;

}
