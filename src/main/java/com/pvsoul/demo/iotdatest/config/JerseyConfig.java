package com.pvsoul.demo.iotdatest.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.autoconfigure.jersey.ResourceConfigCustomizer;
import org.springframework.context.annotation.Configuration;


/**
 * Jersey配置类
 *
 */
@Configuration
public class JerseyConfig implements ResourceConfigCustomizer {

    @Override
    public void customize(ResourceConfig config) {
        config.register(com.pvsoul.demo.iotdatest.resource.DataReceiveResource.class);
        //config.registerClasses(ValidationExceptionProvider.class);
        //config.registerClasses(EosExceptionProvider.class);
    }
}