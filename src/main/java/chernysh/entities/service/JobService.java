package chernysh.entities.service;

import chernysh.entities.model.Company;
import chernysh.entities.model.Job;
import chernysh.entities.model.Skill;

import java.util.List;

public interface JobService {

    Job getJob(Integer id);

    List<Job> getAllJobs();

    Company getCompany(Integer id);

    List<Skill> getAllSkills();
}
