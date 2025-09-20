
public class doubleOddDigit {
    public static void main(String args[]){
        int val = 574016;
        String val1 = String.valueOf(val);
        char[] arr = val1.toCharArray();
        int re[] = new int[val1.length()];
        for(int i=0;i< val1.length();i++){
            int temp = Character.getNumericValue(arr[i]);
            if(temp%2!=0){
                re[i] = temp*2;
            }
            else{
                re[i] = temp;
            }
        }

        for(int i: re){
            System.out.print(i);
        }

    }
    
}


// public class doubleOddDigit {
//     public static void main(String[] args) {
//         int num = 1908657;
//        // int p =1;
//        // int total = 0;
//          StringBuilder re = new StringBuilder();

//         while(num>0){
//             int val = num%10;
//             if(val%2!=0){
//                 val*=2;
//             }

//             re.insert(0, val);
//            // p*=10;
//             num/=10;
//         }
                             
//         System.out.println(re);
//     }
    
// }
