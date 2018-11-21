#!/usr/bin/env groovy

class TestClass {
    String name
    Integer age

    PersonConstructor(name, age) {
        this.name = name
        this.age = age
    }

    def getName() {
        return this.name
    }
}
