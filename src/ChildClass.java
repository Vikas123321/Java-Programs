public class ChildClass extends ParentClass {
    public void add(int a , int b){
        System.out.println("child");
        System.out.println(a + b);
        super.add(30,20);
    }
}
