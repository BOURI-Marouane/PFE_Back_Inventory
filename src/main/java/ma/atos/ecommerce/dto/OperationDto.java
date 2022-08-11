package ma.atos.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public abstract class OperationDto {
    private Date date;
    private long quantite;
    private double price;
    private Long products_inventory;
}
