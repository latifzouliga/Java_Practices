package randomPackage.youtube;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class List_to_ListOfLists {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(
                12, 234, 12, 342, 547, 23, 67, 243, 12, 12, 4, 5, 2, 424, 23, 12, 43, 5, 6, 657,
                786, 4, 11, 3, 13, 100, 200, 300
        ));

        //List<List<Integer>> lists = getLists(list, 5);
        // System.out.println(lists);

        List<Integer> maxs = maxNumsOfLists(getLists(list, 6));
        System.out.println(maxs);

        System.out.println("min elements of all the lists");
        List<Integer> maxNum = getLists(list, 6).stream()
                .flatMap(li -> li.stream().min(Integer::compareTo).stream())
                .collect(Collectors.toList());
        System.out.println(maxNum);







    }

    // takes list of lists and returns an array list of numbers in all the lists of list
    private static List<Integer> maxNumsOfLists(List<List<Integer>> lists) {

        List<Integer> maxNums = new ArrayList<>();

        for (int i = 0; i < lists.size(); i++) {
            Collections.sort(lists.get(i));
            maxNums.add(lists.get(i).get(lists.get(i).size() - 1));
        }
        return maxNums;
    }

    // takes list and convert it to list of lists
    private static List<List<Integer>> getLists(List<Integer> list, int listSize) {

        List<List<Integer>> lists = new ArrayList<>();

        int length = (list.size() % listSize == 0) ? (list.size() / listSize) : (list.size() / listSize) + 1;

        int j = 0;

        for (int i = 0; i < length; i++) {

            lists.add(new ArrayList<>());

            for (; j < list.size(); j++) {
                if (lists.get(i).size() >= listSize) {
                    break;
                }
                lists.get(i).add(list.get(j));
            }
        }

        return lists;
    }


}
