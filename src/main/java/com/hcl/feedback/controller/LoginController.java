package com.hcl.feedback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.feedback.feedbackRepository.FeedbackRepo;
import com.hcl.feedback.model.Feedback;

@RestController
public class LoginController {
	
	@Autowired
	FeedbackRepo repo;
	
	List<Feedback> list;
	
	@GetMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index.html");
	}
	
	@GetMapping("/index")
	public List<Feedback> showFeedback() {
		return (List<Feedback>) repo.findAll();
	}
	
	@PostMapping("/submit")
	public Feedback sendFeedback(@RequestBody Feedback feedback) {
		list = (List<Feedback>) repo.findAll();
		long id;
		if(!list.isEmpty()) {
			id = ( list.get(list.size()-1).getId() ) + 1;
		}else {
			id = 101;
		}
		feedback.setId(id);
		if(feedback.getName()==null || feedback.getName().trim().equals("")) {
			feedback.setName("Anonymous");
		}
		return repo.save(feedback);
	}
}