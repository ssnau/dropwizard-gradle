package com.ssnau;

import com.ssnau.health.MainHealthCheck;
import com.ssnau.resource.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class MainApplication extends Application<MainConfiguration> {


    public static void main(String[] args) throws Exception {
        new MainApplication().run(args);
    }

    @Override
    public void run(MainConfiguration configuration, Environment environment) throws Exception {
        registerResources(environment);
        registerHealthChecks(environment);
    }

    private void registerResources(Environment environment) {
        environment.jersey().register(HelloWorldResource.class);
    }

    private void registerHealthChecks(Environment environment) {
        environment.healthChecks().register("restjava", new MainHealthCheck());
    }
}

