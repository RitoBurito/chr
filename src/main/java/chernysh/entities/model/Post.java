package chernysh.entities.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "post")
@Getter
@Setter
public class Post {

    @Id
    @Column (name = "post_id")
    private Integer id;

    @Column (name = "post_name")
    private String name;
}
