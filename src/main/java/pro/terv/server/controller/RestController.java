package pro.terv.server.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/example")
    public String exampleEndpoint() {
        return "This is an example endpoint.";
    }
}
