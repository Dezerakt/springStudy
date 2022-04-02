package ru.isaev.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("musicPlayer")
public class MusicPlayer {
    private Music music;
    private int volume;

    private String name;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music,
                       @Value("${musicPlayer.volume}") int volume,
                       @Value("${musicPlayer.name}") String name) {
        this.music = music;
        this.volume = volume;
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public void playMusic(){
        System.out.println("playing: " + this.music.getSongs());
    }

    /*public void playMusic(MusicGenre genre) {
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.CLASSICAL) {
            // случайная классическая песня
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        } else {
            // случайная рок песня
            System.out.println(rockMusic.getSongs().get(randomNumber));
        }
    }*/
}
