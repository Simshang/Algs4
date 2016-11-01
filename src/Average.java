import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Shang on 2016/5/31.
 * Using Crel + d to end
 */
public class Average {
    public static void main(String[] args){
        double sum = 0.0;
        int cnt = 0;
        while (!StdIn.isEmpty())
        {
            sum += StdIn.readDouble();
            cnt++;
        }
        double avg = sum/cnt;
        StdOut.printf("average is %.5f\n", avg);
    }
}

