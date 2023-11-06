package com.test.digitalplatform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
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
    @GetMapping("/test2")
    public ResponseEntity test2() {
        ObjectDAO reqPayload = new ObjectDAO().setName("morpheus").setJob("leader");
        return restTemplate.postForEntity("https://reqres.in/api/users", reqPayload, ObjectDAO.class);
    }

    /* Get specific user with id number */
    @GetMapping("/test3/{id}")
    public ResponseEntity test3(@PathVariable String id) {
        return restTemplate.getForEntity("https://reqres.in/api/users/"+id, String.class);
    }
}
