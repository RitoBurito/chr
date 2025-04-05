package chernysh.actions;

import chernysh.entities.model.Job;
import chernysh.entities.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PagedModel;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class GetJobsAction {

    private final JobRepository jobRepository;

    public PagedModel<Job> getSorted(Integer offset, Integer limit, String sortField) {
        Page<Job> jobs = jobRepository.findAll(
                PageRequest.of(offset, limit, Sort.by(Sort.Direction.ASC, sortField)));
        return new PagedModel<>(jobs);
    }

    public PagedModel<Job> getFilteredByCompany(Integer companyId) {
        Page<Job> jobs = jobRepository.findByCompanyIdJPQL(companyId, PageRequest.of(0, 3));
        return new PagedModel<>(jobs);
    }

    public PagedModel<Job> getFilteredByDates(LocalDate startDate, LocalDate endDate) {
        Page<Job> jobs = jobRepository.findByStartDateJPQL(startDate, endDate, PageRequest.of(0, 3));
        return new PagedModel<>(jobs);
    }
}
