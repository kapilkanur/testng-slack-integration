package com.kk.utilities.slackintegration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackMessagePayload {

    @JsonProperty("attachments")
    private List<SlackAttachments> slackAttachments = null;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("attachments")
    public List<SlackAttachments> getAttachments() {
        return slackAttachments;
    }

    @JsonProperty("attachments")
    public void setAttachments(List<SlackAttachments> slackAttachments) {
        this.slackAttachments = slackAttachments;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
