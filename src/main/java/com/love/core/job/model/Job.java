package com.love.core.job.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.love.core.job.model.enums.JobType;
import lombok.Data;

@Data
public class Job {
    private String jobId;
    private JobType type;
    private JsonNode request;
    private String response;
    private String status;
}
