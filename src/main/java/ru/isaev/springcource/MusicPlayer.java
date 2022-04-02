package ru.isaev.springcource;

import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> musicList;
    private int volume;

    private String name;

    public MusicPlayer(List<Music> music) {
        this.musicList = music;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public void playMusic(){
        Random random = new Random();
        int a = random.nextInt(musicList.size());
        System.out.println(this.musicList.get(a).getSongs());
        //System.out.println("playing: " + this.music.getSongs());
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
