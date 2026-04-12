package kr.ac.hansung.cse.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoryForm {

    private Long id;

    @NotBlank(message = "상품명은 필수 입력 항목입니다.")
    @Size(max = 100, message = "상품명은 100자 이하여야 합니다.")
    private String name;


}
