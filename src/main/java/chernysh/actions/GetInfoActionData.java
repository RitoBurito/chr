package chernysh.actions;

import chernysh.dto.JobDTO;
import chernysh.dto.NameDTO;
import chernysh.dto.SkillDTO;
import lombok.Data;

import java.util.List;

@Data
public class GetInfoActionData {

    private NameDTO nameDTO;
    private List<JobDTO> jobDTO;
    private List<SkillDTO> skillDTOList;

}
