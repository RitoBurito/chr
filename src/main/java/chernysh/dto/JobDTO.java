package chernysh.dto;

import chernysh.entities.model.Function;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class JobDTO {

    private Integer id;
    private CompanyDTO company;
    private PostDTO post;
    private LocalDate startDate;
    private LocalDate endDate;
    private String monthsAmount;
    private List<Function> functions;
}
