package com.info.loanframe.business;

import com.info.loanframe.dto.FilterCitizenDTO;
import com.info.loanframe.entities.Citizen;
import com.info.loanframe.enums.CovidStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ManageCitizenService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Boolean addCitizen(Citizen citizen) {
        mongoTemplate.save(citizen);
        return true;
    }

    public Boolean updateCitizen(String id) {
        return null;
    }

    public List<Citizen> filterCitizen(FilterCitizenDTO filterCitizenDTO) {
        return null;
    }
}
