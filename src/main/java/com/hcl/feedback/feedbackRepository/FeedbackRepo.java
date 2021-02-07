package com.hcl.feedback.feedbackRepository;

import org.springframework.data.repository.CrudRepository;

import com.hcl.feedback.model.Feedback;

public interface FeedbackRepo extends CrudRepository<Feedback,Integer>{

}
