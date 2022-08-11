package ma.atos.ecommerce.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Products_Inventory")
@Data
public class Product_Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long quantity;
    private long products_reference;
    private long purchased_Items;
    @OneToMany(mappedBy = "products_inventory")
    private List<Operation> operations;
}
