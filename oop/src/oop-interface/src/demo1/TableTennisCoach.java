package oop;

public class TableTennisCoach extends Instructor implements SpeakEnglish{
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void tech() {
        System.out.println(getName()+"在教乒乓球");
    }

    @Override
    public void speakEnglish() {

        System.out.println("乒乓球教练"+getName()+"说英语");
    }
}
