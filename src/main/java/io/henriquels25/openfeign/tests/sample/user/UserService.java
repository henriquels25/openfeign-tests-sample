package io.henriquels25.openfeign.tests.sample.user;

public interface UserService {

    UserInfo findByName(String name);

}
