package com.garfield.hystrix.custom;

public interface Command {
    String run();

    String fallback();
}
