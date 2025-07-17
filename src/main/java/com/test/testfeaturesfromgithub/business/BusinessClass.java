package com.test.testfeaturesfromgithub.business;

import reactor.core.publisher.Mono;

public class BusinessClass {

    String getData() {
        return Mono.just("Hello from BusinessClass")
                .map(data -> data + " - Processed")
                .block();
    }
}
