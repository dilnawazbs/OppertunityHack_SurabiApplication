package com.surabhi.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.surabhi.domain.Beneficiary;
import com.surabhi.domain.MyPair;
import com.surabhi.domain.Pal;
import com.surabhi.domain.PalUI;
import com.surabhi.service.ExactMatchGenerator;
@Controller
public class SurabhiController {
	@Autowired
	ExactMatchGenerator exactMatchGenerator;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView getIndexPage() {
		ModelAndView view = new ModelAndView("homePage", "command", new Pal());
		return view;
	}

	@RequestMapping(value = "/addPal", method = RequestMethod.POST)
	public ModelAndView addPal(@ModelAttribute PalUI palModel, ModelMap model) {
		String[] subjects=palModel.getLikingSubject().split(",");
		String[] sports=palModel.getLikingSport().split(",");
		String[] interests=palModel.getOtherInterest().split(",");
		Pal pal=mapUIModeltoDomainModel(palModel,sports,subjects,interests);
		Queue<Beneficiary> exactMatch = exactMatchGenerator.generateExactmatch(pal);
		Iterator<Beneficiary> itr = exactMatch.iterator();
		List<PalUI> benefeciaries=new ArrayList<PalUI>();
	    while(itr.hasNext()){
	    	Beneficiary beneficiary=itr.next();
	    	PalUI palUI  = new PalUI();
	    	palUI.setName(beneficiary.getName());
	    	palUI.setGender(beneficiary.getSex());
	    	if(null!=beneficiary.getInterest())
	    	{
	    	String interest = "";
	    	for(MyPair pair:beneficiary.getInterest())
	    	{
	    		interest = interest + pair.getName()+",";
	    	}
	    	interest.substring(0, interest.length()-2);
	    	palUI.setOtherInterest(interest);
	    	}
	    	
	    	if(null!=beneficiary.getSports())
	    	{
	    	String sport = "";
	    	for(MyPair pair:beneficiary.getSports())
	    	{
	    		sport = sport + pair.getName()+",";
	    	}
	    	palUI.setLikingSport(sport);
	    	}
	    	
	    	if(null!=beneficiary.getSubject())
	    	{
	    	String studies = "";
	    	for(MyPair pair:beneficiary.getSubject())
	    	{
	    		studies = studies + pair.getName()+",";
	    	}
	    	palUI.setLikingSubject(studies);
	    	}
	    	palUI.setStandard(beneficiary.getMedium());
	    	benefeciaries.add(palUI);
	    }
	    
	    model.addAttribute("benefeciaries",benefeciaries);
	    if(benefeciaries.size()>0){
	    	return new ModelAndView("displayBeneficiery");
	    }else{
	    	return new ModelAndView("ThankYou");
	    }

	}

	private Pal mapUIModeltoDomainModel(PalUI palModel, String[] sports, String[] subjects, String[] interests) {
		Pal pal= new Pal();
		pal.setGender(palModel.getGender());
		pal.setName(palModel.getName());
		pal.setStandard(palModel.getStandard());
		pal.setLikingSport(sports);
		pal.setLikingSubject(subjects);
		pal.setOtherInterest(interests);
		return pal;
		
	}
	@RequestMapping(value = "/connectBeneficiary", method = RequestMethod.POST)
	public ModelAndView connectBeneficiary(
			@RequestParam String beneficiaryIndex, ModelMap model) {
		System.out.println("beneficiaryIndex: " + beneficiaryIndex);
		return new ModelAndView("ThankYou");
	}
	
	/*
	 * @RequestMapping(value = "/home", method = RequestMethod.GET) public
	 * ModelAndView getI() {
	 * 
	 * return getIndexPage(); }
	 */
}