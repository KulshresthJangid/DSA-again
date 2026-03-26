public class ReverseAnCharArray {

    public static void main(String[] args) {
        char[] something = {'s', 't', 'r', 'i', 'n'};

        reverseString(something);
    }

    public static void reverseString(char[] s) {
        if(s.length == 1) {
            return;
        }
        int i = s.length -1;
        int j = 0;
        while(j!=s.length/2) {
            char a = s[j];
            s[j] = s[i];
            s[i] = a;
            j++;
            i--;
        }
    }
}
