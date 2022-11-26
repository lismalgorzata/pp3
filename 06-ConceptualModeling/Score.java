import java.util.*;

public class Score {

    private ArrayList<Integer> scores= new ArrayList<>();
    private String player;

    public Score(String player) {
        this.player = player;
    }

    public void addScore(int score) {
        if (score>=1 && score<=5) {
            scores.add(score);
        }
    }

    public float result() {
        Collections.sort(scores);

        scores.remove(0);
        scores.remove(scores.size()-1);

        int sum = 0;
        for (int i = 0; i < scores.size(); i++) {
            sum = sum + (int) scores.get(i);
        }
        return sum/ (float) scores.size();
    }

    public void showInfo(){
        System.out.print("Player: " + player + " | ");
        System.out.println("End result: " + result());
    }

    public static void main(String[] args) {
       Score s1 = new Score("Asia");
        s1.addScore(4);
        s1.addScore(3);
        s1.addScore(3);
        s1.addScore(1);
        s1.addScore(5);
        s1.showInfo();

        Score s2 = new Score("Kasia");
        s2.addScore(4);
        s2.addScore(3);
        s2.addScore(3);
        s2.addScore(1);
        s2.addScore(5);
        s2.showInfo();

        Score s3 = new Score("Basia");
        s3.addScore(4);
        s3.addScore(3);
        s3.addScore(3);
        s3.addScore(1);
        s3.addScore(5);
        s3.showInfo();
    }

}

