public class Main {
    public static void main(String args[]) {
        int arr1[]={1,2,3,4,5,3,4,8};
        int arr2[]={6,2,7,3,1,9};
        int n=Math.max(arr1.length,arr2.length);
         int[] arr3 = new int[n];
         int[] arr4 = new int[n];
        if(n==arr1.length)
        { int i=0;
            
            for( i=0;i<arr2.length;i++)
            {
                arr3[i]=arr2[i];
            }
            while(i<n)
            {
                arr3[i]=0;
                i++;
            }
                 for(int j=0;j<n;j++)
        {
        
            System.out.print(Math.abs(arr3[j]-arr1[j]));
        }
            
        }
         if(n==arr2.length)
        {int i=0;
           
            for(i=0;i<arr1.length;i++)
            {
                arr4[i]=arr1[i];
            }
            while(i<n)
            {
                arr4[i]=0;
                i++;
            }
            for(int j=0;j<n;j++)
        {
        
            System.out.print(Math.abs(arr4[j]-arr2[j]));
        }
            
        }
  
    }
}
