import java.util.ArrayList;
import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {

        int[] numArray = {3, -2, 9, 38, -23, 9, 100, 9, 15, 38, 24, 16, 9};

        System.out.println(" ----- TESTING PART A: linearSearchFirst -----");
        System.out.println(Search.linearSearchFirst(numArray, 38));
        System.out.println(Search.linearSearchFirst(numArray, 9));
        System.out.println(Search.linearSearchFirst(numArray, 24));
        System.out.println(Search.linearSearchFirst(numArray, 5));

        System.out.println(" ----- TESTING PART B: linearSearchLast -----");
        System.out.println(Search.linearSearchLast(numArray, 38));
        System.out.println(Search.linearSearchLast(numArray, 9));
        System.out.println(Search.linearSearchLast(numArray, 24));
        System.out.println(Search.linearSearchLast(numArray, 5));

        System.out.println(" ----- TESTING PART C: linearSearchFound -----");
        System.out.println(Search.linearSearchFound(numArray, 38));
        System.out.println(Search.linearSearchFound(numArray, 9));
        System.out.println(Search.linearSearchFound(numArray, 24));
        System.out.println(Search.linearSearchFound(numArray, 5));

        System.out.println(" ----- TESTING PART D: linearSearchCount -----");
        System.out.println(Search.linearSearchCount(numArray, 38));
        System.out.println(Search.linearSearchCount(numArray, 9));
        System.out.println(Search.linearSearchCount(numArray, 24));
        System.out.println(Search.linearSearchCount(numArray, 5));

        ArrayList<Integer> numArray2 = new ArrayList<Integer>(Arrays.asList(3, -2, 9, 38, -23, 9, 100, 9, 15, 38, 24, 16, 9));
        System.out.println(" ----- TESTING PART E1: arraylist linearSearchFirst -----");
        System.out.println(Search.linearSearchFirst(numArray2, 38));
        System.out.println(Search.linearSearchFirst(numArray2, 9));
        System.out.println(Search.linearSearchFirst(numArray2, 24));
        System.out.println(Search.linearSearchFirst(numArray2, 5));

        System.out.println(" ----- TESTING PART E2: arraylist linearSearchLast -----");
        System.out.println(Search.linearSearchLast(numArray2, 38));
        System.out.println(Search.linearSearchLast(numArray2, 9));
        System.out.println(Search.linearSearchLast(numArray2, 24));
        System.out.println(Search.linearSearchLast(numArray2, 5));

        System.out.println(" ----- TESTING PART E3: arraylist linearSearchFound -----");
        System.out.println(Search.linearSearchFound(numArray2, 38));
        System.out.println(Search.linearSearchFound(numArray2, 9));
        System.out.println(Search.linearSearchFound(numArray2, 24));
        System.out.println(Search.linearSearchFound(numArray2, 5));

        System.out.println(" ----- TESTING PART E4: arraylist linearSearchCount -----");
        System.out.println(Search.linearSearchCount(numArray2, 38));
        System.out.println(Search.linearSearchCount(numArray2, 9));
        System.out.println(Search.linearSearchCount(numArray2, 24));
        System.out.println(Search.linearSearchCount(numArray2, 5));
    }
}
