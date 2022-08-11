package ma.atos.ecommerce.web.Responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.atos.ecommerce.model.In_Operation;
import ma.atos.ecommerce.model.Out_Operation;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Response_ListIn {
    private String message;

    private String HttpStatus;

    private List<In_Operation> list_outOperations;
}
