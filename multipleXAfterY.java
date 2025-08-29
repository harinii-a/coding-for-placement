public class multipleXAfterY {
    public static void main(String[] args) {
        
    
    int x = 4;
    int y = 57;
    int a = 1;
    while(true){
        int val = x*a;
        if(val>y) {
            System.out.println(val);
            break;
        }
        else{
            a++;
        }
    }
    }
}
