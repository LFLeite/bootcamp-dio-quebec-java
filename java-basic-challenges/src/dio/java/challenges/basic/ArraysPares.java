package dio.java.challenges.basic;

import java.io.*;
import java.util.*;

public class ArraysPares {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // Lê a linha de entrada

        while (st.hasMoreTokens()) {
            int value = Integer.parseInt(st.nextToken().replace(",", ""));
            if (value%2 == 0)
                System.out.println(value);
        }
    }
}