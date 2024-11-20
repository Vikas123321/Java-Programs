import java.security.PublicKey;

public class MethodLoadingExample {
    int a,b,c,d;
    public static void main(String[] args) {
        MethodLoadingExample ml= new MethodLoadingExample();
        ml.add(19,34);
        ml.add(12,67,2);
        ml.add(1,3,4,5);
    }
    public void add(int a, int b){
       this.a=a;
       this.b=b;
        System.out.println(a + b);
    }
    public void add(int a,int b,int c ){
        this.a=a;
        this.b=b;
        
        this.c=c;
        System.out.println(a + b + c);
    }
    public void add(int a, int b,int c, int d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        System.out.println(a + b + c +d);

    }
}
