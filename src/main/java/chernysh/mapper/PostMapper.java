package chernysh.mapper;

import chernysh.dto.PostDTO;
import chernysh.entities.model.Post;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PostMapper {

    PostDTO toDTO (Post post);

    Post toEntity (PostDTO postDTO);
}
