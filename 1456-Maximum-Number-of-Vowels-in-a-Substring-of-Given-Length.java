class Solution {
    public int maxVowels(String s, int k) {
        int count=0,max=0;

        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i)))
            count++;
        }
        max=count;

        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            max=Math.max(max,count);
        }
        return max;
    }

    public boolean isVowel(char ch){
        return "aeiou".indexOf(ch) != -1;
    }
}