package com.info.loanframe.controller;

import com.info.loanframe.business.ManageCitizenService;
import com.info.loanframe.entities.Citizen;
import com.info.loanframe.dto.FilterCitizenDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/citizens")
@CrossOrigin("*")
public class ManageCitizenController {

    @Autowired
    private ManageCitizenService manageCitizenService;

    @PostMapping
    public Boolean addCitizen(@Valid @RequestBody Citizen citizen){
        return manageCitizenService.addCitizen(citizen);
    }

    @PutMapping("/{id}/status/{status}")
    public Boolean updateCitizen(@PathVariable String id, @PathVariable String status){
        return manageCitizenService.updateCitizen(id,status);
    }

    @GetMapping
    public List<Citizen> getCitizen(){
        return manageCitizenService.getCitizens();
    }
}
