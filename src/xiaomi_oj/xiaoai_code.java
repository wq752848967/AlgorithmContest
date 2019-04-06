package xiaomi_oj;

import java.util.Scanner;

public class xiaoai_code {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line;
        while (scan.hasNextLine()) {
            line = scan.nextLine().trim();
            // please write your code here
            String[] input = line.split(" ");
            String result = "";
            int A=Integer.parseInt(input[0]);
            int B=Integer.parseInt(input[1]);
            int C=Integer.parseInt(input[2]);
            int D=Integer.parseInt(input[3]);
            int mod = Integer.parseInt(input[4]);
            int n = Integer.parseInt(input[5]);
            int pre = A;
            int cur = B;
            int next = 0;
            int addSection = (int)Math.pow(C,D);
            int finalSection = A*B;
            for (int j=3;j<=n;j++){
                next = pre*cur*addSection;
                pre = cur;
                cur = next;
                finalSection*=next;
                finalSection = finalSection%mod;
            }
            result = finalSection+"";
            for (int i=0;i<9-result.length();i++){
                System.out.print("0");
            }
            System.out.println(finalSection);
            // System.out.println("answer");
        }

    }
    public static String getGn(){
        String result = "";


        return result;
    }

}
