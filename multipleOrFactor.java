public class multipleOrFactor {
    public static boolean isFactor(int a,int b){
        if (b%a ==0) return true;
        else return false;
    }
    public static boolean isMultiple(int a,int b){
        if(a%b==0) return true;
        else return false;
    }
    public static void main(String[] args) {
        //a is multiple of b
        int a = 12;
        int b=6;
        System.out.println(isFactor(a, b));
        System.out.println(isMultiple(a, b));

    }
}
