package ma.atos.ecommerce.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("In_Operation")
public class In_Operation extends Operation{

}
