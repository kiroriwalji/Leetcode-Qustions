public class palindrome {
    public static void ispalindrome(int n)
    {
        if(n<0 || (n!=0 && n%10 ==0)){
            System.out.println(false);
            return;
        }
        int k = 0;
        while (n > 0) {
            k = k * 10 + n % 10;
            n = n / 10;
        }
        if (n == k) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
     
    }
    
    public static void main(String[] args){
        int n = 121;
        ispalindrome(n);
}
}
