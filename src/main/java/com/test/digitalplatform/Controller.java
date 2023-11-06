package com.test.digitalplatform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author Angga [ADL.ANGGAP@xl.co.id]
 * created at 11/6/2023 7:33 PM
 */

@RestController
public class Controller {
    RestTemplate restTemplate = new RestTemplate();


    /* Get list of users from ReqRes */
    @GetMapping("/test1")
    public ResponseEntity test1() {
        return restTemplate.getForEntity("https://reqres.in/api/users?page=1", String.class);
    }

    /* Post user data to ReqRes */
    @PostMapping(path = "/test2", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity test2(@RequestBody ObjectDAO user) {
        return restTemplate.postForEntity("https://reqres.in/api/users", user, ObjectDAO.class);
    }

    /* Get specific user with id number */
    @GetMapping("/test3/{id}")
    public ResponseEntity test3(@PathVariable String id) {
        return restTemplate.getForEntity("https://reqres.in/api/users/"+id, String.class);
    }
}
