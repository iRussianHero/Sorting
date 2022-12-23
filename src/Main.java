import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> sortedList = new ArrayList<>() {};
        Integer temp;
        Integer tempNew = 0;
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

        sortedList.addAll(list1);
        sortedList.addAll(list2);

        for (int i = 0; i < sortedList.size(); i++){
            index = i;
            temp = sortedList.get(i);
            for (int j = i+1; j < sortedList.size(); j++) {
                if (sortedList.get(index) >= sortedList.get(j)){
                    tempNew = sortedList.get(j);
                    index = j;
                }
            }
            sortedList.set(i, tempNew);
            sortedList.set(index, temp);
        }

        for (int i = 0; i < sortedList.size(); i++) {
            System.out.println(sortedList.get(i));
        }
    }
}