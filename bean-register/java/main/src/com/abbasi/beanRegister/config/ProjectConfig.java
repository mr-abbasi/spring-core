package com.abbasi.beanRegister.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.abbasi.beanRegister.model"})
public class ProjectConfig {
}
