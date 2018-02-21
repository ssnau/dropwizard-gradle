package com.ssnau;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MainConfiguration extends Configuration {
}

