import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> sortedList = new ArrayList<>() {};
        List<Integer> preSortedListCount = new ArrayList<>() {};
        List<Integer> preSortedList = new ArrayList<>() {};
        Integer temp;
        int index;

        List<Integer> list1 = new ArrayList<>() {};
        list1.add(1);
        list1.add(5);
        list1.add(10);
        list1.add(12);
        list1.add(15);
        list1.add(20);
        list1.add(21);
        list1.add(22);

        List<Integer> list2 = new ArrayList<>() {};
        list2.add(-5);
        list2.add(-1);
        list2.add(9);
        list2.add(15);
        list2.add(100);

        preSortedList.addAll(list1);
        preSortedList.addAll(list2);
        preSortedListCount.addAll(preSortedList);

        for (int i = 0; i < preSortedListCount.size(); i++){
            index = i;
            temp = preSortedList.get(i);
            for (int j = i+1; j < preSortedList.size(); j++) {
                if (preSortedList.get(index) >= preSortedList.get(j)){
                    temp = preSortedList.get(j);
                    index = j;
                }
            }
            sortedList.add(temp);
            preSortedList.remove(index);
        }

        for (int i = 0; i < sortedList.size(); i++) {
            System.out.println(sortedList.get(i));
        }
    }
}