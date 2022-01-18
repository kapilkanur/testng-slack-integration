package com.kk.utilities.slackintegration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackAttachments {

    @JsonProperty("blocks")
    private List<SlackBlocks> slackBlocks = null;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("blocks")
    public List<SlackBlocks> getBlocks() {
        return slackBlocks;
    }

    @JsonProperty("blocks")
    public void setBlocks(List<SlackBlocks> slackBlocks) {
        this.slackBlocks = slackBlocks;
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
