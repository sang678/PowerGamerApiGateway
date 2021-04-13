package power.gamer.api.gateway.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import power.gamer.api.gateway.PowerGamerApiGatewayApp;

@CucumberContextConfiguration
@SpringBootTest(classes = PowerGamerApiGatewayApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
