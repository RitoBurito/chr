package chernysh.entities.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "function_skill")
@Getter
@Setter
public class FunctionSkill {

    @EmbeddedId
    private FunctionSkillPk functionSkillPk;

}
