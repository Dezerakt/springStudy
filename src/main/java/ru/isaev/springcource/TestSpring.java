package ru.isaev.springcource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        //Music music = context.getBean("musicBean", Music.class);

        /*MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayerBean", MusicPlayer.class);

        System.out.println(musicPlayer == musicPlayer1);

        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer1.getVolume());

        musicPlayer.setVolume(40);

        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer1.getVolume());*/

       /* ClassicalMusic cm = context.getBean("classicalMusicBean", ClassicalMusic.class);
        System.out.println(cm.getSong());
        context.close();*/

        /*Music music = context.getBean("MusicBean", Music.class);

        Music music2 = context.getBean("classicalMusicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayer musicPlayer2 = new MusicPlayer();
        musicPlayer.playMusic(music);
        musicPlayer2.playMusic(music2);*/

        /*MusicPlayer mcPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        mcPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);*/

        /*MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(MusicGenre.CLASSICAL);
        musicPlayer.playMusic(MusicGenre.ROCK);


        context.close();*/

        MusicPlayer mcPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(mcPlayer.getVolume());
        context.close();
    }
}
