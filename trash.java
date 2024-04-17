public class trash{
    public static void MergeSort(int arr[],int s,int e){
        int mid = e- (e+s)/2;

        int len1 = mid-s+1;
        int len2 = e-mid;

        int n1[] = new int[len1];
        int n2[] = new int[len2];
        
        int k =s;
        if(s>=e){
            return;
        }

        for(int i=0;i<len1;i++){
            n1[i]=arr[k++];
        }
        
        k= mid+1;
        for(int i=0;i<len2;i++){
            n2[i]=arr[k++];
        }
        int i1=0,i2=0;
        while(i1<len1 && i2<len2){
            if(n1[i1]<n2[i2]){
                arr[k++] = n1[i1];

            }
            else{
                arr[k++] = n2[i2];
            }
        }
        while(i1<len1 ){
            arr[k++] = n1[i1];
 
        }
        while(i2<len2){
            arr[k++] = n2[i2];

        }

    }
    public static void main(String[] args){
        int arr[] = {38,27,43,10};
        int n=  arr.length;
        int s = 0;
        int e = n-1;
        System.out.println("Origianl array : "); 
        for(int i=0;i<=arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        MergeSort(arr,s,e);
        System.out.println();
        System.out.println("Sorted array : "); 
        for(int i=0;i<=arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
