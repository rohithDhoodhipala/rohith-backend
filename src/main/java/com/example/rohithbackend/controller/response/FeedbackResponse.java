package com.example.rohithbackend.controller.response;

import lombok.Builder;
import lombok.Value;
import java.sql.Timestamp;

@Value
@Builder
public class FeedbackResponse {
    private Long feedbackId;
    private String userName;
    private String userRole;
    private String userCompany;
    private String userFeedback;
    private Timestamp date;
}
