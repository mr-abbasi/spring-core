package com.abbasi.injectBeansOnConstructor.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.abbasi.injectBeansOnConstructor.model"})
public class ProjectConfig {

}
