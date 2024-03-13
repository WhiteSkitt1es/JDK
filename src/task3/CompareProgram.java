package task3;

public class CompareProgram {
    public static void main(String[] args) {
        Object[] array1;
        Object[] array2;
        Object[] array3;
        boolean volBoolean1 = true;
        boolean volBoolean2 = false;
        char volChar1 = 1;
        char volChar2 = 25;
        byte volByte1 = 127;
        byte volByte2 = -127;
        short volShort1 = 222;
        short volShort2 = 555;
        int volInt1 = 0;
        int volInt2 = 1;
        double volDouble1 = 0.5;
        double volDouble2 = - 1.1;
        String volString1 = "Yes";
        String volString2 = "No";
        array1 = new Object[]{ volBoolean1, volChar1, volByte1, volShort1, volInt1, volDouble1, volString1};
        array2 = new Object[]{ volBoolean2, volChar2, volByte2, volShort2, volInt2, volDouble2, volString2};
        array3 = new Object[]{ volBoolean2, volChar2, volByte2, volShort2, volInt2, volDouble2, volDouble2};
        System.out.println(compareArrays(array1, array2));
        System.out.println(compareArrays(array1, array3));
    }

    private static <T1, T2> boolean compareArrays(T1[] t1, T2[] t2) {
        if (t1.length != t2.length) return false;
        for (int i = 0; i < t1.length; i++) {
            if(!t1[i].getClass().equals(t2[i].getClass()))
                return false;
        }
        return true;
    }
}
