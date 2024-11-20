public class RevreseOfStringProgram {
    public static void main(String[] args) {
        String s = "Vikas",rev= "";
        char c;
        for(int i = 0; i< s.length();i++ ){
            c = s.charAt(i);
            rev = c + rev;
        }
        System.out.println(rev);
    }
}

