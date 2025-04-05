package chernysh.entities.service;

import chernysh.entities.model.Company;
import chernysh.entities.model.Job;
import chernysh.entities.model.Skill;
import chernysh.entities.repository.CompanyRepository;
import chernysh.entities.repository.JobRepository;
import chernysh.entities.repository.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService{

    private final JobRepository jobRepository;
    private final CompanyRepository companyRepository;
    private final SkillRepository skillRepository;

    @Override
    public Job getJob(Integer id) {
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public Company getCompany(Integer id) {
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }
}
