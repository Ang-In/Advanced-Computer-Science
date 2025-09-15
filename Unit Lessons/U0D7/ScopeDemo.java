public class ScopeDemo {
    private String world = "World"; // instance variable, it's global

    public static void main(String[] args) {
        ScopeDemo demo = new ScopeDemo();
        System.out.println(demo.method2());
    }

    public String method2() {
        var hello = "hello";
        String goodbye;

        if (true) {
            goodbye = "goodbye";
        }

        System.out.println(goodbye);

        return hello;
    }

    public String method1() {
        return method2() + world;
    }
}
