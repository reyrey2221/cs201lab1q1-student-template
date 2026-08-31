import java.util.*;

public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,1,5};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));       
        
        System.out.println();

        input = new Integer[] {1,2,3,4,1,2,5,3};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input))); 
    }

    // Write your methods here

    public static int findMax(Integer[] input) {
        int currentMax = Integer.MIN_VALUE;
        
        for (Integer i : input) {
            if (i > currentMax) {
                currentMax = i;
            }
        }

        return currentMax;

    }

    public static Integer[] findDuplicates(Integer[] input) {
        ArrayList<Integer> dupes = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i].equals(input[j]) && !dupes.contains(input[i])) {
                    dupes.add(input[i]);
                }
            }
        }

        return dupes.toArray(new Integer[0]);
    }



    public static Integer[] findUnique(Integer[] input) {
        Integer[] duplicates = findDuplicates(input);
        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer i : input) {
            boolean isDuplicate = false;

            for (Integer d : duplicates) {
                if (i.equals(d)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                unique.add(i);
            }
        }

        return unique.toArray(new Integer[0]);
    }
    
    
}

