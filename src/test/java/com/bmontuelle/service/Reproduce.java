package com.bmontuelle.service;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
public class Reproduce {

    @Inject
    Emitter emitter;

    @Test
    public void triggerEventMessage() {
        emitter.emit();
    }

}
