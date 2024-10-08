package lab.blps.dto;

import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AddAmountRequestDto extends Dto {
    @Min(1)
    private Long userId;
    @Min(0)
    private Integer amountRequest;
}
