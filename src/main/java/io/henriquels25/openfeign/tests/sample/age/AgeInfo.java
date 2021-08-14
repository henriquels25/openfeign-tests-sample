package io.henriquels25.openfeign.tests.sample.age;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;

@Value
@JsonIgnoreProperties(ignoreUnknown = true)
class AgeInfo {

    Integer age;
    
}
