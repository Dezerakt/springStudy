package ru.isaev.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music{


    @Override
    public String getSongs() {
        return "classicalSong";
    }
}
