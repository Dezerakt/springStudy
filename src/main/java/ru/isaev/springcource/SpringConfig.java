package ru.isaev.springcource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan("ru.isaev.springcource")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public Music[] musicList(){
        Music[] musicList = new Music[3];
        musicList[0] = classicalMusic();
        musicList[1] = rockMusic();
        musicList[2] = jazzMusic();
        return musicList;
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(Arrays.asList(musicList()));
    }
}
