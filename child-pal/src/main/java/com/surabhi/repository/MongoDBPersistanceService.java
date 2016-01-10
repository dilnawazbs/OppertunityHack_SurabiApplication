package com.surabhi.repository;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.surabhi.domain.Beneficiary;
import com.surabhi.domain.UniqueId;

@Component
@Repository
public class MongoDBPersistanceService {

	@Autowired
    protected MongoTemplate mongoTemplate;
	
	public List<Beneficiary> findAllMatchingBeneficiaryRecords(String gender, String standard) {
        Query query = new Query(Criteria.where("sex").is(gender).andOperator(Criteria.where("standard").is(Integer.parseInt(standard))));
      //  Query query = new Query();
    //    query.addCriteria(new Criteria().andOperator(Criteria.where("sex").is(gender), Criteria.where("standard").is(standard)));
        return Collections.unmodifiableList(mongoTemplate.find(query, Beneficiary.class, "Beneficiary"));
    }
	
    public UniqueId update(UniqueId uniqueId) {
        if (uniqueId.getId() == null || uniqueId.getId().isEmpty()) {
        	mongoTemplate.insert(uniqueId);
            return uniqueId;
        }
        else {
        	mongoTemplate.save(uniqueId);
            return uniqueId;
        }
    }
    
}
