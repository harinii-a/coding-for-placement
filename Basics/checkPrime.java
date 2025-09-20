import java.lang.Math;
public class checkPrime {
    public static boolean checkPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        
        for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
        }
        return true;
    }
    public static void main(String args[]){
        int val = 6;
        System.out.println(checkPrime(val));
    }
    
}
