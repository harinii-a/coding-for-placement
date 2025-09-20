// import java.util.HashMap;

// public class anagram {
//     public static boolean validAnagram(String s1,String s2){
//         HashMap<Character,Integer> map = new HashMap<>();
//         if(s1.length()!=s2.length()) return false;
//         for(int i=0;i<s1.length();i++){
//             map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
//         }
//         for(int i=0;i<s2.length();i++){
//             if(map.containsKey(s2.charAt(i))){
//                 map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
//             }
//             else{
//                 return false;
//             }
//         }
//         for(int i : map.values()){
//             if(i!=0) return false;
//         }
//         return true;

//     }
//     public static void main(String args[]){
//         String s1 = "anagram";
//         String s2 ="nagaram";
//         System.out.println(validAnagram(s1, s2));

//     }
// }


import java.util.*;
public class anagram{
    public static void main(String args[]){
        String s1 = "nagaram";
        String s2="anpgram";
        int arr[] = new int[26];
        if(s1.length()!=s2.length()){
            System.out.println("false");
        }
        else{ 
            for(int i=0;i<s1.length();i++){
                arr[s1.charAt(i)-'a']++;
                arr[s2.charAt(i)-'a']--;

        }
    }
    int a=0;
    for(int i:arr){
        if(i!=0){
            System.out.println("false");
            a++;
            break;
        }
    }
    if(a==0){
        System.out.println("true");
    }
    }
}