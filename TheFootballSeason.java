import java.util.Scanner;

public class TheFootballSeason {

    private static void gameCalculate(long gamesNum, long totalPoint, long winPoint, long drawPoint) {
        if (winPoint * gamesNum > totalPoint) {
            long gamesWon = totalPoint / winPoint;
            totalPoint %= winPoint;
            long gamesDraw = totalPoint / drawPoint;
            totalPoint %= drawPoint;
            if (totalPoint == 0) {
                if (gamesDraw + gamesWon == gamesNum) System.out.println(gamesWon + " " + gamesDraw + " " + 0);
                else if (gamesDraw + gamesWon > gamesNum) System.out.println(-1);
                else
                    System.out.println(gamesWon + " " + gamesDraw + " " + (gamesNum - gamesWon - gamesDraw));
            } else System.out.println(-1);
        } else System.out.println(-1);

}

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        long numberOfGames, totalPoint, pointPerWin, pointPerDraw;
        numberOfGames=input.nextLong();
        totalPoint=input.nextLong();
        pointPerWin=input.nextLong();
        pointPerDraw=input.nextLong();
        gameCalculate(numberOfGames,totalPoint,pointPerWin,pointPerDraw);
    }
}
