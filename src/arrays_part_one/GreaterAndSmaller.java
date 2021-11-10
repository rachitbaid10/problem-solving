package arrays_part_one;

import java.util.ArrayList;

public class GreaterAndSmaller {

    public int solve(ArrayList<Integer> A) {

        int count = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < A.size() ; i++){
            if(A.get(i)<min){
                min=A.get(i);
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < A.size() ; i++){
            if(A.get(i)>max){
                max=A.get(i);
            }
        }

        for(int i = 0 ; i < A.size() ; i++){
            if(A.get(i) > min && A.get(i) < max){
                count++;
            }
        }

        return count;

    }

}
