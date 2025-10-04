package com.Basic.Learn_SpringBoot;


import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StatusController {

    @GetMapping("/page")
    public String showPage(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return "Page";
    }


    @GetMapping("/status/{num}")
    public ResponseEntity<?> getStatus(@PathVariable int num) {

        switch (num) {
            case 200:
                return ResponseEntity.ok("Status is OK");

            case 400:
                return ResponseEntity.badRequest().body("Status is not OK");

            case 404:
                return ResponseEntity.notFound().build();

            case 500:
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Status is not OK");

            default:
                return ResponseEntity.ok("Status Found");

        }

    }
}
