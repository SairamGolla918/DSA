import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args)
    {
        int arr[] = {5,2,-2,6,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));   
    }

    static void selection(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)                    //i=0; last = 6-0-1 => 5; maxIndex = 1 ; swap(arr,0,5)
        {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }

    }

    static void swap(int arr[],int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =temp;
    }

    static int getMaxIndex(int arr[],int start,int end)     //1st call => {-1,3,1,-99,2,0}; start = 0; end = 5 ; 
    {
        int max = start;                                    //1st max = 0;
        for (int i = start; i <= end; i++)                  //i = 0; i <= 5 ; i++ ; ||  max = 1 [3] ;
        {
            
            if(arr[max]<arr[i])
            {
                max = i;
            }
            
        } 
        return max;

    }
}
