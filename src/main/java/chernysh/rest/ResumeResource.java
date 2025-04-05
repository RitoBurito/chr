package chernysh.rest;

import chernysh.actions.GetInfoAction;
import chernysh.actions.GetInfoActionData;
import chernysh.actions.GetJobsAction;
import chernysh.dto.CompanyDTO;
import chernysh.entities.model.Job;
import chernysh.entities.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.web.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/resume/")
@RequiredArgsConstructor
public class ResumeResource {

    private final GetInfoAction getInfoAction;
    private final GetJobsAction getJobsAction;

    @GetMapping(value = "info", produces = APPLICATION_JSON_VALUE)
    public GetInfoActionData getInfo() {
        return getInfoAction.getInfoActionData();
    }

    @GetMapping(value = "company", produces = APPLICATION_JSON_VALUE)
    public CompanyDTO getCompanyDTO() {
        return getInfoAction.getCompany();
    }

    @GetMapping("jobs")
    public PagedModel<Job> getJobs (
            @RequestParam Integer offset,
            @RequestParam Integer limit,
            @RequestParam String sortField
    ) {
        return getJobsAction.getSorted(offset, limit, sortField);
    }
}
