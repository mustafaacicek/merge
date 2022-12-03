package Kodlama.io.Devs.webApi.controller;

import Kodlama.io.Devs.business.abstracts.SoftwareLanguagesService;
import Kodlama.io.Devs.business.requests.SoftwareLanguagesRequests.CreateSoftwareLanguageRequest;
import Kodlama.io.Devs.business.requests.SoftwareLanguagesRequests.UpdateSoftwareLanguageRequest;
import Kodlama.io.Devs.business.requests.TechnologyRequests.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.SoftwareLanguagesResponses.GetAllSoftwareLanguagesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

//localhost:8082/languages/add
@RequestMapping("/languages")
public class SoftwareLanguagesController {

    @Autowired
    private final SoftwareLanguagesService languagesService;

    public SoftwareLanguagesController(SoftwareLanguagesService languagesService) {
        this.languagesService = languagesService;
    }

    @GetMapping("/getall")
    public List<GetAllSoftwareLanguagesResponse> getAll(){
        return this.languagesService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateSoftwareLanguageRequest createSoftwareLanguageRequest){
        this.languagesService.add(createSoftwareLanguageRequest);
    }

    @PostMapping("/update")
    public void update(UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest) throws Exception {
        this.languagesService.update(updateSoftwareLanguageRequest);
    }
}
