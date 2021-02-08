package com.bmontuelle.service;

import io.quarkus.vertx.ConsumeEvent;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class Receiver {

    @Inject
    Logger log;


    @ConsumeEvent("topic")
    public void receive(String message) {
        log.infof("Received message : '%s'", message);

        // The exception thrown in event is not shown in logs with default configuration
        throw new RuntimeException("Something occured while processing message");
    }
}
