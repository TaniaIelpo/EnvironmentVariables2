package co.develhope.EnvVars2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
/**
 * @author Tania Ielpo
 */

@Service
public class TestService {

    @Autowired
    Environment environment;

    public String getEnvironmentVar() {
        return environment.getProperty("myCustomVarTree.welcomeMsg");
    }
}
