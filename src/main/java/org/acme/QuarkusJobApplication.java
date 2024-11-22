package org.acme;

import java.time.LocalTime;

import io.quarkus.runtime.QuarkusApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.time.LocalTime.NOON;

public class QuarkusJobApplication implements QuarkusApplication {

    public static final Logger LOGGER = LoggerFactory.getLogger(QuarkusJobApplication.class);

    @Override
    public int run(final String... args) {
        final var name = args.length > 0 ? args[0] : "World";
        final var now = LocalTime.now();
        final String period;

        if (now.isBefore(NOON)) {
            period = "morning";
        } else if (now.isBefore(LocalTime.of(18, 0))) {
            period = "afternoon";
        } else {
            period = "night";
        }

        LOGGER.info("Hello {}! It's {} in the {} :)", name, now, period);

        return 0;
    }
}
