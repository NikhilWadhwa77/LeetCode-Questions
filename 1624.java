// Largest Substring between two equal characters
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {

        int maxLength = -1;

        for(int i = 0; i < s.length(); i++){
            if(s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i))){
                int temp = s.lastIndexOf(s.charAt(i)) - s.indexOf(s.charAt(i)) - 1;
                maxLength = Math.max(maxLength,temp);
            }
        }

        return maxLength;
    }
}
