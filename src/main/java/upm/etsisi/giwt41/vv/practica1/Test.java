package upm.etsisi.giwt41.vv.practica1;

public class Test {

    public static void main(String[] args) {
        //Ejercicio A) BubbleSort
        TestA1();
        TestA2();
        TestA3();

        //Ejercicio B) Goldbach
        TestB1();
        TestB2();
        TestB3();
        TestB4();
        TestB5();
        TestB6();
        TestB7();
        TestB8();
        
        //Ejercicio C) Stack
        TestC1();
        TestC2();
        TestC3();
        TestC4();
        TestC5();
        TestC6();
        TestC7();
        TestC8();
        TestC9();
        TestC10();
        TestC11();
        TestC12();
        TestC13();
        TestC14();
    }

    //Ejercicio A) BubbleSort
    public static void TestA1() {
        Comparable[] v = new Comparable[6];
        v[0] = 4;
        v[1] = 2;
        v[2] = 1;
        v[3] = 0;
        v[4] = 3;
        v[5] = 0;
        BubbleSort.BS(v, v.length);
    }

    public static void TestA2() {
        Comparable[] v = new Comparable[2];
        v[0] = 5;
        v[1] = 2;
        BubbleSort.BS(v, v.length);
    }

    public static void TestA3() {
        TestA1();
    }

    //Ejercicio B) Goldbach
    public static void TestB1() {
        Goldbach.checkGoldbach(6);
        Goldbach.checkGoldbach(22);
        Goldbach.checkGoldbach(26);
        Goldbach.checkGoldbach(48);
        Goldbach.checkGoldbach(52);
    }

    public static void TestB2() {
        Boolean testnegativo = Goldbach.isPrime(-5);
        Boolean test0 = Goldbach.isPrime(0);
        Boolean test1 = Goldbach.isPrime(1);
        Boolean test2 = Goldbach.isPrime(2);
        Boolean test10 = Goldbach.isPrime(10);
        Boolean test25 = Goldbach.isPrime(25);
        Boolean test49 = Goldbach.isPrime(49);
    }

    public static void TestB3() {
        Boolean testnegativo = Goldbach.isPrime(-5);
        Boolean test0 = Goldbach.isPrime(0);
        Boolean test1 = Goldbach.isPrime(1);
    }

    public static void TestB4() {
        Boolean test2 = Goldbach.isPrime(2);
        Boolean test10 = Goldbach.isPrime(10);
        Boolean test25 = Goldbach.isPrime(25);
        Boolean test49 = Goldbach.isPrime(49);
        Boolean test71 = Goldbach.isPrime(71);
    }

    public static void TestB5() {
        TestB1();
    }

    public static void TestB6() {
        Boolean test6 = Goldbach.checkGoldbach(15);
        Boolean test22 = Goldbach.checkGoldbach(99);
    }

    public static void TestB7() {
        Boolean test15 = Goldbach.checkGoldbach(15);
        Boolean test99 = Goldbach.checkGoldbach(99);
    }

    public static void TestB8() {
        Boolean test6 = Goldbach.checkGoldbach(6);
        Boolean test8 = Goldbach.checkGoldbach(8);
        Boolean test15 = Goldbach.checkGoldbach(15);
        Boolean test22 = Goldbach.checkGoldbach(22);
        Boolean test52 = Goldbach.checkGoldbach(52);
    }

    //Ejercicio C) Stac
    public static void TestC1() {
        Stack miPila = new Stack();
        miPila.push(5);
    }

    public static void TestC2() {
        Stack miPila = new Stack();
    }

    public static void TestC3() {
        Stack miPila = new Stack();
        miPila.push(5);
        miPila.push(8);
    }

    public static void TestC4() {
        Stack miPila = new Stack();
        miPila.push(1);
        miPila.push(2);
        miPila.push(3);
        miPila.push(4);
        miPila.push(5);
        miPila.push(6);
    }

    public static void TestC5() {
        TestC4();
    }

    public static void TestC6() {
        Stack miPila = new Stack();
        miPila.push(1);
        miPila.push(2);
        miPila.push(3);
        miPila.push(4);
        int res = miPila.pull();
    }

    public static void TestC7() {
        TestC6();
    }

    public static void TestC8() {
        Stack miPila = new Stack();
        int res = miPila.pull();
    }

    public static void TestC9() {
        TestC8();
    }

    public static void TestC10() {
        Stack miPila = new Stack();
        int tam1 = miPila.getSize();
        miPila.push(52);
        miPila.push(17);
        int tam2 = miPila.getSize();
    }

    public static void TestC11() {
        Stack miPila = new Stack();
        miPila.push(1);
        miPila.push(2);
        miPila.push(3);
        miPila.push(4);
        miPila.push(5);
        Integer[] res = miPila.pull(5);
    }

    public static void TestC12() {
        Stack miPila = new Stack();
        miPila.push(1);
        miPila.push(2);
        miPila.push(3);
        miPila.push(4);
        miPila.push(5);
        Integer[] res = miPila.pull(3);
    }

    public static void TestC13() {
        Stack miPila = new Stack();
        miPila.push(1);
        miPila.push(2);
        Integer[] res = miPila.pull(4);
    }

    public static void TestC14() {
        Stack miPila1 = new Stack();
        miPila1.push(1);
        miPila1.push(2);
        miPila1.push(3);
        Stack miPila2 = miPila1.copyStack();
    }
}
