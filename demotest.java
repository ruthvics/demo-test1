import java.util.ArrayList;

public class demotest {

    public static int findMean(ArrayList<Integer> vals) {
        int answ = 0;

        answ = sum(vals);

        System.out.println("SUM:" + answ);
        System.out.println("sze:" + vals.size());

        answ = answ / vals.size();

        return answ;
    }

    public static int sum(ArrayList<Integer> vals) {
        int answ = 0;
        for (int i = 0; i < vals.size(); i++) {
            answ = answ + vals.get(i);
        }
        return answ;
    }
}
