import java.util.Arrays;
import java.util.Random;

/**
 * @author Admin
 */
public class TestArray {
    /**
     * Method for calculating the sum of string elements
     * @param N - number of rows
     * @param M - number of columns
     * @return res
     */
    public static String Matrix(byte N, byte M){
        byte[][] arr = new byte[N][M];
        Random random = new Random();
        String res = "";
        for(byte[] row:arr)
            Arrays.fill(row, (byte) (random.nextInt(10)+1));
        for(byte[] row:arr)
            System.out.println(Arrays.toString(row));
        System.out.println();
        byte[][] arr2 = new byte[N][M+1];
        byte i = 0;
        for(byte[] row:arr){
            arr2[i] = Arrays.copyOf(row, M+1);
            i++;
        }
        for(i = 0; i < N; i++)
            arr2[i][M] = (byte) (M*arr2[i][M-1]);
        
        for(byte[] rowend:arr2){
            res += "\n" + Arrays.toString(rowend);
        }
        return res;
    }
}

