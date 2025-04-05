package chernysh.entities.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "job")
@Getter
@Setter
public class Job {

    @Id
    @Column(name = "job_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @Column(name = "job_start")
    private LocalDate startDate;

    @Column(name = "job_end")
    private LocalDate endDate;

    @OneToMany(mappedBy = "jobId")
    private List<Function> functions = new ArrayList<>();
}
