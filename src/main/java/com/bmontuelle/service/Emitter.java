package com.bmontuelle.service;

import io.vertx.core.eventbus.EventBus;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class Emitter {

    @Inject
    Logger log;

    @Inject
    EventBus eventBus;

    public void emit() {
        log.info("Will publish message on 'topic'");
        eventBus.publish("topic", "Message content");
    }

}
