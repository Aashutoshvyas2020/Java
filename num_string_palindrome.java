public class num_string_palindrome{
    public static void main(String[] args) {
        int num = 1221;
        int rev = 0;
        int org = num;
        
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 +digit;
            num = num/10;
        }
        if (rev == org){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}