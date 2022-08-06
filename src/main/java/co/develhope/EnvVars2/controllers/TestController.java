package co.develhope.EnvVars2.controllers;


import co.develhope.EnvVars2.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tania Ielpo
 */
@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping
    public String getEnvironmentVar(){

        return testService.getEnvironmentVar();
    }
}
