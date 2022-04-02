package ru.isaev.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;



public class RockMusic implements Music{

    public void doMyInit(){
        System.out.println("Do my init");
    }

    @Override
    public String getSongs() {
        return "rockSong";
    }
}
