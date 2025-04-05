package chernysh.entities.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class FunctionSkillPk implements Serializable {

    @Column(name = "function_id")
    private Integer function_id;

    @Column(name = "skill_id")
    private Integer skill_id;

}
