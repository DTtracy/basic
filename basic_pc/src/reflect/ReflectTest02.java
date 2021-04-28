package reflect;

public class ReflectTest02 {
    public static void main(String[] args) {
        String path = Thread.currentThread().getContextClassLoader().getResource("reflect/ReflectTest02.class").getPath();
        System.out.println(path);

    }
}
