package com.kk.utilities.slackintegration;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "text",
        "accessory"
})
public class SlackBlocks {

    @JsonProperty("type")
    private String slackType;
    @JsonProperty("text")
    private SlackText slackText;
    @JsonProperty("accessory")
    private SlackAccessory slackAccessory;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("type")
    public String getType() {
        return slackType;
    }

    @JsonProperty("type")
    public void setType(String slackType) {
        this.slackType = slackType;
    }

    @JsonProperty("text")
    public SlackText getText() {
        return slackText;
    }

    @JsonProperty("text")
    public void setText(SlackText slackText) {
        this.slackText = slackText;
    }

    @JsonProperty("accessory")
    public SlackAccessory getAccessory() {
        return slackAccessory;
    }

    @JsonProperty("accessory")
    public void setAccessory(SlackAccessory slackAccessory) {
        this.slackAccessory = slackAccessory;
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
