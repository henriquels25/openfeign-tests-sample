package io.henriquels25.openfeign.tests.sample.age;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "agePredictor", url = "${clients.age.url}")
interface AgePredictorFeignClient {

    @RequestMapping
    AgeInfo getAge(@RequestParam("name") String name);


}
