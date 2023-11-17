import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String io = "";
        int cnt = 0;
        int N = Integer.parseInt(bf.readLine());
        bf.readLine();
        String s = bf.readLine();

        for (int i = 0; i < N; i++) {
            io += "IO";
        }
        io += "I";

        while (true) {
            int pos = s.indexOf(io);
            if (pos == -1) break;
            s = s.substring(pos + 2);
            cnt++;
        }

        System.out.println(cnt);
    }
}