class Test {
    int _x;

    public Test() {
    }

    public Test(int x) {
        _x = x;
    }

    public int getX() {
        return _x;
    }

    public void setX(int x) {
        _x = x;
    }
}

class Test2 {
    int _y;

    public Test2() {

    }

    public Test2(int x) {
        _y = x;
    }

    public int getY() {
        return _y;
    }

    public void setY(int x) {
        _y = x;
    }
}

class Stuff<T> {
    private T _thing;

    public Stuff() {
        _thing = null;
    }

    public Stuff(T t) {
        _thing = t;
    }

    public T getThing() {
        return _thing;
    }

    public void setThing(T t) {
        _thing = t;
    }

    public void print() {
        if (_thing != null) {
            //NO WAY to print contents of _thing.
            System.out.println("Type: " + _thing.getClass().getName() + ", value: " + _thing);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test(1);
        Test t2 = new Test(2);
        // Does not instantiate Test object. Calling n argument constructor of Stuff object.
        Stuff<Test> s = new Stuff<Test>();
        s.print();
        s.setThing(new Test(5));
        s.print();
        System.out.println(s.getThing().getX());
    }
}
