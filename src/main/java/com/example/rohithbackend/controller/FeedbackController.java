package com.example.rohithbackend.controller;

import com.example.rohithbackend.controller.request.FeedbackRequest;
import com.example.rohithbackend.controller.response.FeedbacksResponse;
import com.example.rohithbackend.service.FeedbackService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class FeedbackController {

    private final FeedbackService feedbackService;

    @GetMapping("/feedbacks")
    public FeedbacksResponse getFeedbacks() {
        return feedbackService.getFeedbacks();
    }

    @PostMapping("/feedback")
    public FeedbacksResponse postFeedback(@RequestBody FeedbackRequest feedbackRequest) {
        return feedbackService.postFeedback(feedbackRequest);
    }
}
