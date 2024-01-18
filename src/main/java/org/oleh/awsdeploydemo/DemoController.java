package org.oleh.awsdeploydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    private int counter;

    @GetMapping
    public String demo() {
        counter++;
        return "Hello from DemoController! \n counter = " + counter;
    }

}
