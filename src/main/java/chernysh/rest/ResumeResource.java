package chernysh.rest;

import chernysh.actions.GetInfoAction;
import chernysh.actions.GetInfoActionData;
import chernysh.actions.GetJobsAction;
import chernysh.entities.model.Job;
import lombok.RequiredArgsConstructor;
import org.springframework.data.web.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

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

    @GetMapping("jobs")
    public PagedModel<Job> getJobs (
            @RequestParam Integer offset,
            @RequestParam Integer limit,
            @RequestParam String sortField
    ) {
        return getJobsAction.getSorted(offset, limit, sortField);
    }

    @GetMapping("filteredjobs/company")
    public PagedModel<Job> getFilteredJobsByCompany(
            @RequestParam Integer companyId
    ) {
        return getJobsAction.getFilteredByCompany(companyId);
    }

    @GetMapping("filteredjobs/dates")
    public PagedModel<Job> getFilteredJobsByDates(
            @RequestParam LocalDate startDate,
            @RequestParam LocalDate endDate
    ) {
        return getJobsAction.getFilteredByDates(startDate, endDate);
    }
}
