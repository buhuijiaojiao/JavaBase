package oop;


public class Test {
    public static void main(String[] args) {
        TableTennisCoach tableTennisCoach1=new TableTennisCoach("刘国梁",45);
        TableTennisPlayer tableTennisPlayer1=new TableTennisPlayer("马龙",37);
        BasketballCoaches basketballCoaches1=new BasketballCoaches("科比",100);
        BasketballPlayer basketballPlayer1=new BasketballPlayer("曼波",10);
        tableTennisCoach1.tech();
        tableTennisPlayer1.study();
        basketballPlayer1.study();
        basketballCoaches1.tech();

        tableTennisPlayer1.speakEnglish();
        tableTennisCoach1.speakEnglish();

    }
}
