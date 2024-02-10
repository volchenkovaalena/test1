public class Main {
    public static void main ( String[] args ) {
        int[] test = {2, 3, 4, 5, 7, 8, 1, 4, 6, 8};
        test2 ( test );
    }

    public static int[] test2 ( int [] test ) {
        for ( int i = 1; i < test.length; i++ )
            if ( test[i] % 2 == 0 ) {
                test[i] = test[i] + 1;}

                int test2 [] = {test[2], test[3], test [4], test[5], test[6]};
                for (int b = 0; b <test2.length; b++)
                    System.out.println ( test2[b] );
        return test2;
    }
}