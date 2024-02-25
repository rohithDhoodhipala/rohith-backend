package com.example.rohithbackend.controller.response;

import lombok.Builder;
import lombok.Value;

import java.util.List;
@Value
@Builder
public class FeedbacksResponse {
    List<FeedbackResponse> feedbacks;
}
