package chernysh.entities.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "function")
@Getter
@Setter
public class Function {

    @Id
    @Column(name = "function_id")
    private Integer id;

    @Column(name = "function_comment")
    private String comment;

    @Column(name = "job_id")
    private Integer jobId;

}
