package ma.atos.ecommerce.mappers;

import ma.atos.ecommerce.dto.Out_OperationDto;
import ma.atos.ecommerce.dto.Product_InventoryDto;
import ma.atos.ecommerce.model.Out_Operation;
import ma.atos.ecommerce.model.Product_Inventory;
import ma.atos.ecommerce.web.Responses.Out_Operation_Response;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Out_OperationMappers {
    @Autowired
    private ModelMapper modelMapper;

    public Out_Operation toOperation(Out_OperationDto out_operationDto)
    {
        Out_Operation out_operation = modelMapper.map(out_operationDto, Out_Operation.class);
        return out_operation;
    }

    public Out_Operation_Response outOperationResponse(Out_Operation out_operation)
    {
        Out_Operation_Response out_operation_response = modelMapper.map(out_operation,Out_Operation_Response.class);
        return out_operation_response;
    }
}
