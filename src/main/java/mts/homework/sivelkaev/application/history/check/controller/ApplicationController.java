package mts.homework.sivelkaev.application.history.check.controller;

import mts.homework.sivelkaev.application.history.check.controller.dto.CheckApplicationRequest;
import mts.homework.sivelkaev.application.history.check.controller.dto.CheckApplicationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Validated
@RequestMapping(value = "mts-homework-sivelkaev-application-history-check")
public interface ApplicationController {
    @PostMapping(value = "/check")
    ResponseEntity<CheckApplicationResponse> checkApplication(@RequestBody @Valid CheckApplicationRequest req);
}
