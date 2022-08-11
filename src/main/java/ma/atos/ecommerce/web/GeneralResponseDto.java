package ma.atos.ecommerce.web;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GeneralResponseDto {
    private String message;
    private String HttpStatus;
}
