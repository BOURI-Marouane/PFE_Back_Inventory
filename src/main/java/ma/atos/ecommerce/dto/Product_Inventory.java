package ma.atos.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product_Inventory {
    private long products_reference;
    private long quantity;
    private long purchased_Items;
}
