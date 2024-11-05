package hw38;

import java.util.Comparator;

public class SportScoreComparator implements Comparator<Sportsman> {

    @Override
    public int compare(Sportsman s1, Sportsman s2) {

        //return s1.getScore() - s2.getScore();
        return  Double.compare(s1.getScore(),s2.getScore());
    }
}
