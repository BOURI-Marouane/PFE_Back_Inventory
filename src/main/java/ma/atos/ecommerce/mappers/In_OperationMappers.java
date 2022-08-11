package ma.atos.ecommerce.mappers;

import ma.atos.ecommerce.dto.In_OperationDto;
import ma.atos.ecommerce.dto.Product_InventoryDto;
import ma.atos.ecommerce.model.In_Operation;
import ma.atos.ecommerce.model.Out_Operation;
import ma.atos.ecommerce.model.Product_Inventory;
import ma.atos.ecommerce.web.Responses.In_Operation_Response;
import ma.atos.ecommerce.web.Responses.Out_Operation_Response;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class In_OperationMappers {
    @Autowired
    private ModelMapper modelMapper;

    public In_Operation toOperation(In_OperationDto in_operationDto)
    {
        In_Operation in_operation = modelMapper.map(in_operationDto, In_Operation.class);
        return in_operation;
    }

    public In_Operation_Response intOperationResponse(In_Operation in_operation)
    {
        In_Operation_Response in_operation_response = modelMapper.map(in_operation,In_Operation_Response.class);
        return in_operation_response;
    }
}
