public class reverseLast2Digits {
    public static void main(String[] args) {
        int num = 82374;
        int a = num%10;
        int copy = num;
        copy = copy/10;
        int b = copy%10;
        int rem = num/100;
        StringBuilder sb = new StringBuilder();
        //sb.insert(0,rem);
        sb.insert(0,b);
        sb.insert(0,a);
        sb.insert(0,rem);
        System.out.println(sb);
    }
    
}
