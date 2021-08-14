package io.henriquels25.openfeign.tests.sample.age;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class AgePredictorClient implements AgePredictorFacade {

    private final AgePredictorFeignClient agePredictorFeignClient;

    @Override
    public Integer predict(String name) {
        return agePredictorFeignClient.getAge(name).getAge();
    }
}
