package io.henriquels25.openfeign.tests.sample.age;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureWireMock(port = 0)
class AgePredictorFeignClientTest {

    @Autowired
    private AgePredictorFeignClient agePredictorFeignClient;

    @Test
    void getAge() {
        stubFor(get(urlEqualTo("/age-api?name=Henrique"))
                .willReturn(aResponse().withBodyFile("25_years_old.json")
                        .withHeader("Content-Type", "application/json")));

        Integer age = agePredictorFeignClient.getAge("Henrique").getAge();

        assertThat(age).isEqualTo(25);

        verify(getRequestedFor(urlEqualTo("/age-api?name=Henrique")));
    }
}