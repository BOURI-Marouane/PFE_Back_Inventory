package ma.atos.ecommerce.mappers;

import ma.atos.ecommerce.dto.OperationDto;
import ma.atos.ecommerce.model.Operation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OperationMappers {

    @Autowired
    private ModelMapper modelMapper;

    public Operation toOperation(OperationDto operationDto)
    {
        Operation operation = modelMapper.map(operationDto, Operation.class);
        return operation;
    }

}
