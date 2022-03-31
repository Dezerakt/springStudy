package ru.isaev.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayerBean", MusicPlayer.class);

        System.out.println(musicPlayer == musicPlayer1);

        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer1.getVolume());

        musicPlayer.setVolume(40);

        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer1.getVolume());
        context.close();
    }
}
