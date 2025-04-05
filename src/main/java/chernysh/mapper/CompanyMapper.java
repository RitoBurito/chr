package chernysh.mapper;

import chernysh.dto.CompanyDTO;
import chernysh.entities.model.Company;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CompanyMapper {

    CompanyDTO toDTO(Company company);

    Company toEntity(CompanyDTO companyDTO);
}
