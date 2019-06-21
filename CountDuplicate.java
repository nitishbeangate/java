
public class CountDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr=new int[] {2,4,5,6,7,1,2};
    for(int i=0;i<arr.length;i++)
    {
    	int count=0;
    	for(int j=0;j<arr.length;j++)
    	{
    		if(arr[i]==arr[j])
    		{
    			count++;
    		}
    	}
    	System.out.println(arr[i]+"\tcount is \t"+count);
    }
    
	}

}
