public class EqualExample {

    private int x;
    private int y;
    private int z;

    public EqualExample(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        super.equals(o);
        System.out.println("1");
        if (this == o) return true;
        System.out.println("2");
        if (o == null || getClass() != o.getClass()) return false;

        EqualExample that = (EqualExample) o;

        if (x != that.x) return false;
        if (y != that.y) return false;
        return z == that.z;
    }

    public static void main(String[] args) {
//        EqualExample e1 = new EqualExample(1, 1, 1);
//        EqualExample e2 = new EqualExample(1, 1, 1);
//        System.out.println(e1.equals(e2)); // true
        String s = new String();
        Integer s1 = new Integer(1);
        Integer s2 = new Integer(1);
        System.out.println(s1.equals(s2));
    }
}