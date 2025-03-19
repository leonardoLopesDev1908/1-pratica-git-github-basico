
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }

        //ArrayList<Integer> list2 = new ArrayList<>();

        for(int i = 7; i < 10; i++) {
            list.add(i);
        }

        System.out.println(listRepeat(list));
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

    public static int nroRepetir(ArrayList<Integer> l)
    {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;

        for (int num : l) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int freq : freqMap.values()) {
            if (freq > 1) {
                count += freq - 1;
            }
        }

        return count;
    }

    public static ArrayList<Integer> listRepeat(ArrayList<Integer> l) {

        ArrayList<Integer> listOfRepeated = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            for (int j = i+1; j < l.size(); j++) {
                if ((l.get(j) == l.get(i)) && (!listOfRepeated.contains(l.get(i))) ) {
                    listOfRepeated.add(l.get(i));
                }
            }
        }

        return listOfRepeated;
    }

    public static ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        HashSet<Integer> unionSet = new HashSet<>(l1);
        unionSet.addAll(l2);
        return new ArrayList<>(unionSet);
    }
}


