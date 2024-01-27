import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstline = br.readLine().split(" ");

        int n = Integer.parseInt(firstline[0]);
        int m = Integer.parseInt(firstline[1]);

        System.out.println(n + " "+ m);
    }
}