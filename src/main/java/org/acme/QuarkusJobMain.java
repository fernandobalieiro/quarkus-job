package org.acme;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class QuarkusJobMain {

    public static void main(final String... args) {
        Quarkus.run(QuarkusJobApplication.class, args);
    }
}
