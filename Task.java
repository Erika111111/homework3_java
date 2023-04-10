import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Реализовать алгоритм сортировки слиянием и выборкой.
//(Самое эффективное , это изучить эти сортировки на Питоне , и постараться написать их на java)

public class Task {
    public static void main(String[] args) {
        

      List<Integer> arr = new ArrayList<>(Arrays.asList(9,3,5,7,1,4,2,8));
      List<Integer> sortedArray = mergeSort(arr);
      for (int i = 0; i < sortedArray.size(); i++) {
        System.out.print(sortedArray.get(i) + " ");
      }
      System.out.println("");
      
      for (int i = 0; i < arr.size(); i++) {
        System.out.print(arr.get(i) + " ");
      }
    
    }

    // Сортировка слиянием
    public static List<Integer> mergeSort(List<Integer> arr) {
      if (arr.size() <= 1) {
        return arr;
      }
      int mid = arr.size() / 2;
      List<Integer> left = new ArrayList<>(arr.subList(0, mid));
      List<Integer> right = new ArrayList<>(arr.subList(mid, arr.size()));
      left = mergeSort(left);
      right = mergeSort(right);
      return merge(left, right);
    }
  
    public static List<Integer> merge(List<Integer> left, List<Integer> right) {
      List<Integer> result = new ArrayList<>();
      int i = 0;
      int j = 0;
      while (i < left.size() && j < right.size()) {
        if (left.get(i) <= right.get(j)) {
          result.add(left.get(i));
          i++;
        } else {
          result.add(right.get(j));
          j++;
        }
      }
      while (i < left.size()) {
        result.add(left.get(i));
        i++;
      }
      while (j < right.size()) {
        result.add(right.get(j));
        j++;
      }
      return result;
    }





        
        }
    


