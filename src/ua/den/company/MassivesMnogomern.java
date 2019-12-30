package ua.den.company;

public class MassivesMnogomern {
    public static void main(String[] args) {
        char [][] array = new char[3][3];
        for (int i = 0; i < array.length; i++)
            array[i] = new char[3];
        array[0][0] = 'C';
        System.out.println(array[0][0]);
        //float [] array = new float[] {{12.23f, 546.890f}, {12.23f, 546.890f}};

    }
}
