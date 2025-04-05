package chernysh.mapper;

import chernysh.dto.FunctionDTO;
import chernysh.entities.model.Function;
import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FunctionMapper {

    @Mapping(target = "job", ignore = true)
    FunctionDTO toDTO(Function function);

}
