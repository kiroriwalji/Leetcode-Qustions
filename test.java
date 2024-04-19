public class test{
    public static void main(String[] args) {
        int stock[] = {7,1,5,3,6,4};
        int buy = stock[0];
        int n = stock.length;
        int p = 0;

        for(int i = 1;i<n;i++){
            if(stock[i]<buy){
                buy = stock[i];
            }
            else if(stock[i]-buy > p){
                p = stock[i]-buy;
            }
        }

       System.out.println(p+" ");
    }
}