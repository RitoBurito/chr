package chernysh.entities.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "company")
@Getter
@Setter
public class Company {

    @Id
    @Column(name = "company_id")
    private Integer id;

    @Column(name = "company_name")
    private String name;

}
