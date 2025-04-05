package chernysh.actions;

import chernysh.dto.JobDTO;
import chernysh.dto.NameDTO;
import chernysh.dto.SkillDTO;
import chernysh.entities.service.JobService;
import chernysh.mapper.CompanyMapper;
import chernysh.mapper.JobMapper;
import chernysh.mapper.PostMapper;
import chernysh.mapper.SkillMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class GetInfoAction {

    private final CompanyMapper companyMapper;
    private final JobMapper jobMapper;
    private final PostMapper postMapper;
    private final JobService jobService;
    private final SkillMapper skillMapper;

    public NameDTO getName() {
        NameDTO name = new NameDTO();
        name.setSurname("Черныш");
        name.setFirstName("Маргарита");
        name.setPatronymic("Александровна");
        return name;
    }

    public GetInfoActionData getInfoActionData() {
        GetInfoActionData getInfoActionData = new GetInfoActionData();
        getInfoActionData.setNameDTO(getName());

        List<JobDTO> jobsList = new ArrayList<>();

        jobService.getAllJobs().forEach(
                job -> {
                    JobDTO jobDTO = jobMapper.toDTO(job);

                    jobDTO.setPost(postMapper.toDTO(job.getPost()));
                    jobDTO.setCompany(companyMapper.toDTO(job.getCompany()));

                    Period period = Period.between(jobDTO.getStartDate(),
                            jobDTO.getEndDate());
                    String jobAmount;

                    if(period.getYears() == 1) {
                        jobAmount = period.getYears() + " год ";
                    } else if(period.getYears() >= 2 && period.getYears() <= 4) {
                        jobAmount = period.getYears() + " года ";
                    } else {
                        jobAmount = period.getYears() + " лет ";
                    }

                    if(period.getMonths() == 1) {
                        jobAmount = jobAmount + period.getMonths() + " месяц";
                    } else if (period.getMonths() >= 2 && period.getMonths() <= 4) {
                        jobAmount = jobAmount + period.getMonths() + " месяца";
                    } else {
                        jobAmount = jobAmount + period.getMonths() + " месяцев";
                    }

                    jobDTO.setMonthsAmount(jobAmount);

                    jobsList.add(jobDTO);
                }
        );

        getInfoActionData.setJobDTO(jobsList);

        List<SkillDTO> skillDTOList = new ArrayList<>();

        jobService.getAllSkills().forEach(
                skill -> skillDTOList.add(skillMapper.toDTO(skill))
        );

        getInfoActionData.setSkillDTOList(skillDTOList);

        return getInfoActionData;
    }
}
