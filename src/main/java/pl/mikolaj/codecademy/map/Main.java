import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> myInts = new ArrayList<>();
        Random random = new Random();

        for(int i =0; i < 20; i++) {
            myInts.add(random.nextInt(5));
        }

        for(Integer integer : myInts) {
            System.out.print(integer);
        }
        System.out.println();

        Map<Integer, Integer> intCount = countNumbers(myInts);
        for(Map.Entry<Integer, Integer> entry: intCount.entrySet()) {
            System.out.println("Integer: "+ entry.getKey()+" appears: "+ entry.getValue());
        }
    }

    public static Map<Integer, Integer> countNumbers(List<Integer> list) {
        Map<Integer, Integer> intCount = new HashMap<>();

        for(Integer integer : list) {
            if(intCount.containsKey(integer)) {
                Integer count = intCount.get(integer);
                intCount.put(integer, ++count);
            } else {
                intCount.put(integer, 1);
            }
        }

        return intCount;
    }
}