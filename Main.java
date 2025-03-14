
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i = 1; i < 10; i++) {
            list2.add(i);
        }

        System.out.println(intersection(list, list2));
    }

    private static int nOcorrencias(ArrayList<Integer> l, Integer j) {
        int count = 0;
        for(int i : l) {
            if (i == j) {
                count+=1;
            }
        }   
        return count;
    }

    private static boolean hasRepeat(ArrayList<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            int current = l.get(i); 
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(j)==current) {
                    return true;
                }
            }
        }
        return false;
    }

    private static ArrayList<Integer> intersection(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        
        ArrayList<Integer> intersecNums = new ArrayList<>();

        for (int i = 0; i < l1.size(); i++) {
            int current = l1.get(i);
            for (int j = 0; j < l2.size(); j++){
                if (current == l2.get(j)) {
                    intersecNums.add(current);
                }
            }
        }
        return intersecNums;
    }


}