class A {
    void msgA() {
        System.out.println("Message from A");
    }
}

class B extends A {
    void msgB() {
        System.out.println("Message from B");
    }
}

class C extends B {
    void msgC() {
        System.out.println("Message from C");
    }
}

public class multilevel {
    public static void main(String[] args) {
        C obj = new C();
        obj.msgA();
        obj.msgB();
        obj.msgC();
    }
}
