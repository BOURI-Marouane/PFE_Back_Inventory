package ma.atos.ecommerce.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("In_Operation")
@Data
public class In_Operation extends Operation{
    @Column(name = "id_In_Operation")
    private long idInOperation;
}
