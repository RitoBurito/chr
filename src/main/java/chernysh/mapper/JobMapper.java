package chernysh.mapper;

import chernysh.dto.JobDTO;
import chernysh.entities.model.Job;
import org.mapstruct.*;
import org.springframework.data.domain.Page;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface JobMapper {

    @Mapping(target = "company", ignore = true)
    @Mapping(target = "post", ignore = true)
    JobDTO toDTO(Job job);

}
