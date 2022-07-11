package ma.atos.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Operation")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_operation")
@DiscriminatorValue("Operation")
public abstract class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private long quantite;
    private double price;

    @ManyToOne
    @JoinColumn(name = "products_inventory_id")
    @JsonIgnore
    private Product_Inventory products_inventory;

}
