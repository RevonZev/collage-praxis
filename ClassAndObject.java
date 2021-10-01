class ClassAndObject {
    public void test() {
        System.out.println("Test");
    }

    public static void main(String args[]) {
        // 2.1 Pengenalan Java dan Kelas
        ClassAndObject test1 = new ClassAndObject();
        ClassAndObject test2;
        test2 = new ClassAndObject();
        test1.test();
        test2.test();
    }
}