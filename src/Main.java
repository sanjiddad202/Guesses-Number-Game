public class Main {
    public static void main(String[] args) {
        Game newGame = new Game();
         boolean gameStatistics = false;
        while (!gameStatistics){
            newGame.takeUserInput();
            gameStatistics = newGame.isCorrectNumber();
        }
    }
}
