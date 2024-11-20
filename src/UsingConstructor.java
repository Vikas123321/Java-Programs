public class UsingConstructor {
        String a, b;

        UsingConstructor(String a, String b) {
            this.a = a;
            this.b = b;
        }

        public static void main(String[] args) {
            UsingConstructor u1 = new UsingConstructor("Vikas", "Valmiki");
            u1.printName();
        }

        public void printName() {
            System.out.println(a + b);
        }
    }


