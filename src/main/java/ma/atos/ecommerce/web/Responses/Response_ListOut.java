package ma.atos.ecommerce.web.Responses;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.atos.ecommerce.model.Out_Operation;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Response_ListOut {
    private String message;

    private String HttpStatus;

    private List<Out_Operation> list_outOperations;
}
