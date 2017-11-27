package com.yrs.util.test;

/**
 * 测试Integer双等号
 *
 * @author ByrsH
 * @create 2017-11-20 23:19
 **/

public class TInteger {
    public static void main(String [] args){
        Integer a1 = 127;
        Integer a2 = 127;
        Integer a3 = new Integer(127);
        System.out.println("a1 == a2: " + (a1 == a2));
        System.out.println("a1 == a3: " + (a1 == a3));

        Integer b1 = 128;
        Integer b2 = 128;
        Integer b3 = new Integer(128);
        System.out.println("b1 == b2: " + (b1 == b2));
        System.out.println("b1 == b3: " + (b1 == b3));

        Boolean c1 = true;
        Boolean c2 = true;
        Boolean c3 = new Boolean(true);
        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("c1 == c3: " + (c1.equals(c3)));

        Character d1 = 'a';
        Character d2 = 'a';
        Character d3 = new Character('a');
        System.out.println("d1 == d2: " + (d1 == d2));
        System.out.println("d1 == d3: " + (d1 == d3));

        Byte e1 = 127;
        Byte e2 = 127;
        Byte e3 = new Byte((byte) 129);
        System.out.println("e1 == e2: " + (e1 == e2));
        System.out.println("e1 == e3: " + (e1 == e3));

        Short f1 = 127;
        Short f2 = 127;
        Short f3 = new Short((short) 127);
        System.out.println("f1 == f2: " + (f1 == f2));
        System.out.println("f1 == f3: " + (f1 == f3));

        Long g1 = 127L;
        Long g2 = 127L;
        Long g3 = new Long(127);
        System.out.println("g1 == g2: " + (g1 == g2));
        System.out.println("g1 == g3: " + (g1 == g3));

        Float h1 = 127f;
        Float h2 = 127f;
        Float h3 = new Float(127);
        System.out.println("h1 == h2: " + (h1 == h2));
        System.out.println("h1 == h3: " + (h1 == h3));

        Double i1 = 127d;
        Double i2 = 127d;
        Double i3 = new Double(127);
        System.out.println("i1 == i2: " + (i1 == i2));
        System.out.println("i1 == i3: " + (i1 == i3));

    }
}
