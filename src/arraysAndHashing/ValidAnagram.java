package arraysAndHashing;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
    public static boolean isAnagram(String t, String s){
        char[] tt=t.toCharArray();
        char[] ss=s.toCharArray();
        Arrays.sort(tt);
        Arrays.sort(ss);
//        if(tt.length!= ss.length){
//            return false;
//        }
//        for(int i=0;i<tt.length;i++){
//            if(tt[i]!=ss[i]){
//                return false;
//            }
//        }
//        return true;
        return Arrays.equals(tt,ss);
    }
}
