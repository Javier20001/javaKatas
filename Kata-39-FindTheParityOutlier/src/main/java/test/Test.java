package test;

import modelo.FindTheParityOutlier;

public class Test {
    public static void main(String[] args) {
        FindTheParityOutlier f1 = new FindTheParityOutlier();
        int[] exampleTest1 = { 2, 6, 8, -10, 3 };
        int[] exampleTest2 = { 206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781 };
        int[] exampleTest3 = { Integer.MAX_VALUE, 0, 1 };
        System.out.println(f1.find(exampleTest2));
    }
}
