package reflect;

public class ReflectTest01 {
    public static void main(String[] args) {
        try {
            //通过反射机制，获取class，通过class来实例化对象
            Class c = Class.forName("reflect.User");
            Object obj = c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
