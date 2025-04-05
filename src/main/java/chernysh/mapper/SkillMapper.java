package chernysh.mapper;

import chernysh.dto.SkillDTO;
import chernysh.entities.model.Skill;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SkillMapper {

    SkillDTO toDTO(Skill skill);

}
