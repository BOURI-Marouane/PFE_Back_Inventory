package ma.atos.ecommerce.web;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class OperationResponseDto extends GeneralResponseDto{
    private Date date;
    private long quantite;
    private double price;
}
