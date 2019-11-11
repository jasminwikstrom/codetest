package com.jasmin.webarchive.api;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/users")
@Controller
public class UserController {


    @GetMapping
    public ResponseEntity<List<String>> getAllStrings() {

      return ResponseEntity.ok(List.of(
              "hej",
              "du",
              "är",
              "inloggad")
      );
    }


}
