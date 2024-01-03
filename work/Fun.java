package work;

class Fun {
    static int a = 10;

    void fun() {

        int b = 10;
        System.out.println(a + " " + b);
        ++a; ++b;
    }

    public static void main(String[] args) {
        Fun f = new Fun();
        f.fun();
        f.fun();

    }

}
