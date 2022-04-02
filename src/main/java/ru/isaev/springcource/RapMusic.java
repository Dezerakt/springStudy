package ru.isaev.springcource;

public class RapMusic implements Music{
    @Override
    public ClassicalMusic[] getSong() {
        return "Monster";
    }
}
