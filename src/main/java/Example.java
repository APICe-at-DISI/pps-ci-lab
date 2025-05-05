public class Example {
    private final int a;

    public Example(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}

class exampleTest {
    public static void main(String[] args) {
        Example example = new Example(8);
        System.out.println(example.getA());
    }
}