package com.info.loanframe.business;

import com.info.loanframe.dto.FilterCitizenDTO;
import com.info.loanframe.entities.Citizen;
import com.info.loanframe.enums.CovidStatus;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

@Service
public class ManageCitizenService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Boolean addCitizen(Citizen citizen) {
        mongoTemplate.insert(citizen);
        return true;
    }

    public Boolean updateCitizen(String id, String status) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(new ObjectId(id)));

        Update update = new Update();
        update.set("isCovidPositive", CovidStatus.valueOf(status).getStatus());
        mongoTemplate.updateFirst(query, update, Citizen.class);
        return true;
    }

    public List filterCitizen(FilterCitizenDTO filterCitizenDTO) {
        Query query = new Query();
        Field[] requestFields = FilterCitizenDTO.class.getDeclaredFields();
        for (Field field : requestFields) {
            field.setAccessible(true);
            try {
                if (Objects.nonNull(field.get(filterCitizenDTO)) && !field.get(filterCitizenDTO).toString().isEmpty()) {
                    query.addCriteria(Criteria.where(field.getName()).is(field.get(filterCitizenDTO)));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return mongoTemplate.find(query,FilterCitizenDTO.class,"citizen");
    }
}
