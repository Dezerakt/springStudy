package ru.isaev.springcource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("ru.isaev.springcource")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
