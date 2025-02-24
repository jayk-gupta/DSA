package OOPS.AccessModifier;

public class ObjectExample {

    int num;
    float gpa;

    public ObjectExample(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectExample)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectExample a = new ObjectExample(5, 43.455f);
        ObjectExample b = new ObjectExample(5, 12.4f);
//      checks if pointing to the same object
        if (a == b) {
            System.out.println("a object equals b object");
        }
//      checking only for value
        if (a.equals(b)) {
            System.out.println("a object equals b object");
        }
        System.out.println(a.hashCode());
//        get data about classes
        System.out.println(a.getClass());
    }

}
