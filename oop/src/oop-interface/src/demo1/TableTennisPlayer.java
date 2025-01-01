package oop;

public class TableTennisPlayer extends Athlete implements SpeakEnglish{

    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println(getName()+"在学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员"+getName()+"说英语");
    }
}
