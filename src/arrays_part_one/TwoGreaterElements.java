package arrays_part_one;

import java.util.ArrayList;

public class TwoGreaterElements {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> arr = new ArrayList<>();
        //find second largest element
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for(int i = 0 ; i < A.size() ; i++){
            if (A.get(i) > max){
                second_max=max;
                max=A.get(i);
            } else if (A.get(i) > second_max){
                second_max=A.get(i);
            }
        }

        for(int i = 0; i < A.size() ; i++){
            if(A.get(i)<second_max && A.get(i)!=max){
                arr.add(A.get(i));
            }
        }
        return arr;
    }

}
