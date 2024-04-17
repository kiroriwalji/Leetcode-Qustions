public class Main{
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = 0; 
        int max,min=-324578;
        int n = arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum=sum+ arr[j];
                count++;
                max = sum;
                if(max>min){
                    min = max;
                }
            }
        }
        System.out.println("\n"+count);
        System.out.println("\n"+min+ " max number of subarray !!!");
    }
}
