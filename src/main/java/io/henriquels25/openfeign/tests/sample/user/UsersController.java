package io.henriquels25.openfeign.tests.sample.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
class UsersController {

    private final UserService userService;

    @GetMapping("{name}")
    UserInfo getAgeByName(@PathVariable String name){
        return userService.findByName(name);
    }


}
