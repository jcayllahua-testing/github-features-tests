package com.test.testfeaturesfromgithub.reactive;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ReactiveViolations {

    public String violateBlockRule() {
        return Mono.just("Hello World")
                .map(String::toUpperCase)
                .block();
    }

    public void violateSubscribeRule() {
        Mono.just("Processing")
                .map(String::toLowerCase)
                .subscribe(result -> System.out.println(result));
    }

    public void multipleViolations() {
        Mono.just("data")
                .subscribe();

        String result = Mono.just("another")
                .block();
    }
}
