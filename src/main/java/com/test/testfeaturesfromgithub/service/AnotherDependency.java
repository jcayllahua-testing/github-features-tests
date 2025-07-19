package com.test.testfeaturesfromgithub.service;

import org.springframework.stereotype.Service;

@Service
class AnotherDependency {
    public void performAction() {
        System.out.println("Action performed");
    }
}
