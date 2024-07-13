package lab.blps.security.dto.response;

import jakarta.validation.constraints.Min;
import lab.blps.dto.Dto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AmountRequestResponseDto extends Dto {
    @Min(1)
    private Long userId;
    @Min(0)
    private Integer amountRequest;
    public AmountRequestResponseDto(Long userId, Integer amountRequest) {
        this.userId = userId;
        this.amountRequest = amountRequest;
    }
}
