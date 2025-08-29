public class nextValAfterUppercase {
    public static void main(String[] args) {
        char c = 'j';
        if(c == 'z' || c == 'Z'){
            System.out.println("A");
        }
        else{
            int num = Character.toLowerCase(c) + 1;
            System.out.println(Character.toUpperCase((char)num));
        }
    }
}
