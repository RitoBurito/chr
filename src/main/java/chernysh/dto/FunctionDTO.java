package chernysh.dto;

import lombok.Data;

@Data
public class FunctionDTO {

    private Integer id;
    private JobDTO job;
    private String comment;
}
