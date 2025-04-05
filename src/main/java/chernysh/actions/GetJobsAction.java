package chernysh.actions;

import chernysh.entities.model.Job;
import chernysh.entities.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PagedModel;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetJobsAction {

    private final JobRepository jobRepository;

    public PagedModel<Job> getSorted(Integer offset, Integer limit, String sortField) {
        Page<Job> jobs = jobRepository.findAll(
                PageRequest.of(offset, limit, Sort.by(Sort.Direction.ASC, sortField)));
        return new PagedModel<>(jobs);
    }
}
