package ma.atos.ecommerce.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Out_operation")
public class Out_Operation extends Operation{
}
