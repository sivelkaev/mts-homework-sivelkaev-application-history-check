package mts.homework.sivelkaev.application.history.check.controller.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mts.homework.sivelkaev.application.history.check.controller.ApplicationController;
import mts.homework.sivelkaev.application.history.check.controller.dto.CheckApplicationRequest;
import mts.homework.sivelkaev.application.history.check.controller.dto.CheckApplicationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ApplicationControllerImpl implements ApplicationController {
    @Override
    public ResponseEntity<CheckApplicationResponse> checkApplication(CheckApplicationRequest req) {
        log.info("Инициализирована проверка кредитной истории клиента");

        var response = CheckApplicationResponse.builder()
                .id(req.getId())
                .result(req.getId() % 2 == 0)
                .build();

        log.info(response.getId().toString() + " " + response.getResult().toString());

        return ResponseEntity.ok(response);
    }
}
