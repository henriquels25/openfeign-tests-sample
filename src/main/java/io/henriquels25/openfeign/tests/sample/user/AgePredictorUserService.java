package io.henriquels25.openfeign.tests.sample.user;

import io.henriquels25.openfeign.tests.sample.age.AgePredictorFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class AgePredictorUserService implements UserService{

    private final AgePredictorFacade agePredictorClient;

    @Override
    public UserInfo findByName(String name) {
        return new UserInfo(name, agePredictorClient.predict(name));
    }
}
