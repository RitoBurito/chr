package chernysh.rest;

import chernysh.actions.GetInfoAction;
import chernysh.actions.GetInfoActionData;
import chernysh.dto.CompanyDTO;
import chernysh.dto.NameDTO;
import chernysh.mapper.CompanyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/resume/")
@RequiredArgsConstructor
public class ResumeResource {

    private final GetInfoAction getInfoAction;

    @GetMapping(value = "getinfo", produces = APPLICATION_JSON_VALUE)
    public GetInfoActionData getInfo() {
        return getInfoAction.getInfoActionData();
    }

    @GetMapping(value = "getcompany", produces = APPLICATION_JSON_VALUE)
    public CompanyDTO getCompanyDTO() {
        return getInfoAction.getCompany();
    }
}
