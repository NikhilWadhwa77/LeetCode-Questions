import java.util.*;

class Solution {
    public int numberOfBeams(String[] bank) {

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0;  i < bank.length; i++){
            int count = 0;
            for(int j  = 0; j < bank[i].length(); j++){
                if(bank[i].charAt(j) == '1'){
                    count++;
                }
            }
            if(count != 0){
                arr.add(count);
            }
        }

        int res = 0;

        for(int i = 0; i < arr.size()-1; i++){
            res = res + (arr.get(i) * arr.get(i+1));
        }

        return res;

    }
}
