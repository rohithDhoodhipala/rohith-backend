package com.example.rohithbackend.controller.request;

import lombok.Value;

@Value
public class FeedbackRequest {
    private String userName;
    private String userRole;
    private String userCompany;
    private String userFeedback;
}
