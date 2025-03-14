
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);

        //System.out.println(list);
        //System.out.println(hasRepeat(list));
        System.out.println(nroRepeat(list));    

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

    private static int nroRepeat(ArrayList<Integer> l) {
        int repeatedNums = 0;
        for (int i = 0; i < l.size(); i++) {
            int current = l.get(i); 
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(j)==current) {
                    repeatedNums+=1;
                    continue;
                }
            }
        }
        return repeatedNums;
    }


}