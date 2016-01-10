package com.surabhi.service;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.surabhi.domain.Beneficiary;
import com.surabhi.domain.MyPair;
import com.surabhi.domain.Pal;
import com.surabhi.repository.MongoDBPersistanceService;

@Component
@Service
public class ExactMatchGenerator {

	@Autowired
	MongoDBPersistanceService mongoDBPersistanceService;
	Queue<Beneficiary> benPriorityQueue = new PriorityQueue<Beneficiary>(4);
	Pal pal;

	public Queue<Beneficiary> generateExactmatch(Pal pal) {
		this.pal = pal;
		mongoDBPersistanceService.update(pal);
		List<Beneficiary> beneficiaryList = mongoDBPersistanceService
				.findAllMatchingBeneficiaryRecords(pal.getGender(), pal.getStandard());
		if (!beneficiaryList.isEmpty()) {
		for (Beneficiary beneficiary : beneficiaryList) {
			findMatch(beneficiary);
		}
		Iterator<Beneficiary> iter = benPriorityQueue.iterator();
		while(iter.hasNext())
		{
		System.out.println(iter.next().getScore());
		}
		}
		return benPriorityQueue;
	}

	float studiesscore(List<MyPair> beneficiarysubjects, String[] palsubjects) {
		float studiesscore = 0;
		if (null != beneficiarysubjects && null != palsubjects) {
		Iterator<MyPair> iter = beneficiarysubjects.iterator();
		while (iter.hasNext()) {
			if (!Arrays.asList(palsubjects).contains(iter.next().getName())) {
				studiesscore++;
			}
		}
		}
		return studiesscore;
	}

	float sportsscore(List<MyPair> beneficiarysports, String[] palsports) {
		float sportsscore = 0;
		if (null != beneficiarysports && null != palsports) {
		Iterator<MyPair> iter = beneficiarysports.iterator();
		while (iter.hasNext()) {
			if (!Arrays.asList(palsports).contains(iter.next().getName())) {
				sportsscore++;
			}
		}
		}
		return sportsscore;
	}

	float interestscore(List<MyPair> beneficiaryinterests, String[] palinterests) {
		float interestscore = 0;
		if (null != beneficiaryinterests && null != palinterests) {
		Iterator<MyPair> iter = beneficiaryinterests.iterator();
		while (iter.hasNext()) {
			if (!Arrays.asList(palinterests).contains(iter.next().getName())) {
				interestscore++;
			}
		}
		}
		return interestscore;
	}

	float cumulativescore(float studiesscore, float sportsscore,
			float interestscore) {
		// return studiesscore*policy.study + sportsscore*policy.sport +
		// interestscore*policy.interest;
		return studiesscore * 50 + sportsscore * 20 + interestscore * 30;
	}

	// Policy policy = getPolicy();

	public void findMatch(Beneficiary beneficiary) {
		float studiesscore = studiesscore(beneficiary.getSubject(),
				pal.getLikingSubject());
		float sportsscore = sportsscore(beneficiary.getSports(),
				pal.getLikingSport());
		float interestscore = interestscore(beneficiary.getInterest(),
				pal.getOtherInterest());

		float cumulativescore = cumulativescore(studiesscore, sportsscore,
				interestscore);
		beneficiary.setScore(cumulativescore);
System.out.println("beneficiary"+ beneficiary.getName()+beneficiary.getScore());
		benPriorityQueue.add(beneficiary);
		if(benPriorityQueue.size()>3)
		{
			benPriorityQueue.poll();
		}
		

	}

/*	public static Comparator<Beneficiary> idComparator = new Comparator<Beneficiary>() {

		@Override
		public int compare(Beneficiary c1, Beneficiary c2) {
			return (int) (c1.getScore() - c2.getScore());
		}
	};*/

/*	private static void pollDataFromQueue(
		Queue<Beneficiary> customerPriorityQueue) {
		while (true) {
			Beneficiary beneficiary = customerPriorityQueue.poll();
			if (beneficiary == null)
				break;
			// System.out.println("Processing Customer with ID="+beneficiary.getScore());
		}
	}*/
}
