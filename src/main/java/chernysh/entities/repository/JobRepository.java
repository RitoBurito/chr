package chernysh.entities.repository;

import chernysh.entities.model.Job;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {

    @Query("SELECT j FROM Job j WHERE j.company.id = ?1")
    Page<Job> findByCompanyIdJPQL(Integer companyId, Pageable pageable);

    @Query("SELECT j FROM Job j WHERE j.startDate >= ?1 AND j.startDate <= ?2")
    Page<Job> findByStartDateJPQL(LocalDate startDate, LocalDate endDate, Pageable pageable);

}
