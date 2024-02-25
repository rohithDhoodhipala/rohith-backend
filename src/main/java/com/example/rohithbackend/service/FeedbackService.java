package com.example.rohithbackend.service;

import com.example.rohithbackend.controller.request.FeedbackRequest;
import com.example.rohithbackend.entity.Feedback;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.rohithbackend.builder.FeedbackResponseBuilder;
import com.example.rohithbackend.controller.response.FeedbacksResponse;
import com.example.rohithbackend.repository.FeedbackRepository;

import java.sql.Timestamp;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class FeedbackService {
    private final FeedbackRepository feedbackRepository;
    private final FeedbackResponseBuilder feedbackResponseBuilder;
    public FeedbacksResponse getFeedbacks() {
        return feedbackResponseBuilder.buildFeedbacksResponse(feedbackRepository.findTop50ByOrderByDateDesc().get());
    }

    public FeedbacksResponse postFeedback(FeedbackRequest feedbackRequest) {
        Feedback feedback = new Feedback();
        feedback.setUserName(feedbackRequest.getUserName());
        feedback.setUserRole(feedbackRequest.getUserRole());
        feedback.setUserCompany(feedbackRequest.getUserCompany());
        feedback.setUserFeedback(feedbackRequest.getUserFeedback());
        feedback.setDate(new Timestamp(System.currentTimeMillis()));
        feedbackRepository.save(feedback);
        return feedbackResponseBuilder.buildFeedbacksResponse(feedbackRepository.findTop50ByOrderByDateDesc().get());
    }
}
