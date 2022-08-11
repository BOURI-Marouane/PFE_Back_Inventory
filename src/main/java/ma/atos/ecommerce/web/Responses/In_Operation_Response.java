package ma.atos.ecommerce.web.Responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class In_Operation_Response extends Response_General{
    private Date date;
    private long quantite;
    private double price;
    private long idInOperation;
}
