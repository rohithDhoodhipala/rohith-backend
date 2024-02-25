package com.example.rohithbackend.builder;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
import com.example.rohithbackend.controller.response.FeedbackResponse;
import com.example.rohithbackend.controller.response.FeedbacksResponse;
import com.example.rohithbackend.entity.Feedback;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class FeedbackResponseBuilder {

    public FeedbacksResponse buildFeedbacksResponse(List<Feedback> feedbacks) {
        return FeedbacksResponse.builder()
                .feedbacks(feedbacks.stream()
                        .map(feedback -> FeedbackResponse.builder()
                                .feedbackId(feedback.getFeedbackId())
                                .userName(feedback.getUserName())
                                .userRole(feedback.getUserRole())
                                .userCompany(feedback.getUserCompany())
                                .userFeedback(feedback.getUserFeedback())
                                .date(feedback.getDate())
                                .build())
                        .collect(Collectors.toList()))
                .build();
    }
}
