package hello.itemservice.web.validation.form;

import hello.itemservice.domain.item.SaveCheck;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

@Data
public class ItemSaveForm {

    @NotBlank
    private String itemName;

    @NotNull
    @Range(min = 1000, max = 10_00_000)
    private Integer price;


    @NotNull
    @Max(value = 9999)
    private Integer quantity;

}
