public class FirstNotRepeatingChar {
    public static void main(String[] args) {
        int[] hash = new int[256];
        for (int i = 0; i < 256; i++) {
            System.out.println(hash[i]);
        }
    }
    public static int FirstNotRepeatingChar(String str){
        int[] hash = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char c_temp = str.charAt(i);
            hash[c_temp]++;
        }

        for (int i = 0; i < str.length(); i++) {
            char c_temp = str.charAt(i);
            if(hash[c_temp]==1){
                return i;
            }
        }
        return -1;
    }
}
