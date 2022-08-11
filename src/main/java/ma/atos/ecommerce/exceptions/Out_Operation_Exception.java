package ma.atos.ecommerce.exceptions;

import lombok.Data;
import ma.atos.ecommerce.web.Responses.Out_Operation_Response;

@Data
public class Out_Operation_Exception extends Exception{

    public Out_Operation_Exception(String message)
    {
        super(message);
    }
}
