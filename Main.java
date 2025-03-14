
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

public class ElementosRepetidos
{
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

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5));
        System.out.println(nroRepetir(list));
    }
    }

public class RepeatedElements
{
    public static int nroRepeat(ArrayList<Integer> l)
    {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;

        for (int num : l) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int freq : freqMap.values())
        {
            if (freq > 1)
            {
                count += freq - 1; // Contabiliza os elementos repetidos
            }
        }

        return count;
    }

    public static ArrayList<Integer> listRepeat(ArrayList<Integer> l) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        ArrayList<Integer> repeatedElements = new ArrayList<>();

        for (int num : l) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedElements.add(entry.getKey());
            }
        }

        return repeatedElements;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5));
        System.out.println(nroRepeat(list));
        System.out.println(listRepeat(list)); 
    }
}

public class RepeatedElements {
    public static int nroRepeat(ArrayList<Integer> l) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;

        for (int num : l) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int freq : freqMap.values()) {
            if (freq > 1) {
                count += freq - 1; // Contabiliza os elementos repetidos
            }
        }
        
        return count;
    }

    public static ArrayList<Integer> listRepeat(ArrayList<Integer> l) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        ArrayList<Integer> repeatedElements = new ArrayList<>();

        for (int num : l) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedElements.add(entry.getKey());
            }
        }

        return repeatedElements;
    }

    public static ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        HashSet<Integer> unionSet = new HashSet<>(l1);
        unionSet.addAll(l2);
        return new ArrayList<>(unionSet);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 5, 6, 7));
        
        System.out.println(nroRepeat(list)); // Saída esperada: 3
        System.out.println(listRepeat(list)); // Saída esperada: [2, 4]
        System.out.println(union(list, list2)); // Saída esperada: [1, 2, 3, 4, 5, 6, 7]
    }
}


