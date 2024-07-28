package mts.homework.sivelkaev.application.history.check.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CheckApplicationRequest {
    @NotBlank
    @JsonProperty(value = "id", required = true)
    private Long id;
}
