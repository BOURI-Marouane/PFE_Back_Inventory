package ma.atos.ecommerce.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Out_Operation")
@Data

public class Out_Operation extends Operation{
    @Column(name = "id_Out_Operation")
    private long idOutOperation;
}
