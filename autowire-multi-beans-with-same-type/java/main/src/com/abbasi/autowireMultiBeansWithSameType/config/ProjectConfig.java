package com.abbasi.autowireMultiBeansWithSameType.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.abbasi.autowireMultiBeansWithSameType.model"})
public class ProjectConfig {
}
