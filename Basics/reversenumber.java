public class reversenumber{
    public static void main(String args[]){
        int num = 9847839;
        String res="";
        while(num>0){
            int a = num%10;
            res=res + String.valueOf(a);
            num/=10;
        }
        System.out.println(res);
    }
}