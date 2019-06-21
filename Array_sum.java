public class Array_sum
{
public static void main(String[] args)  throws NumberFormatException {
 String[] str=new String[]{"10","10","Rajani","Odisha","90"};
 int sum=0;

    for(int i=0;i<str.length;i++)
    {
        // below program raise exception try catch use to handle it
        try {

            //convert string value to int and ignore character
       sum+=Integer.parseInt(str[i]);
    }   
  catch (Exception e) {
      // it will force compiler to continue the loop
     continue;
     //TODO: handle exception
 }
}
 System.out.println(sum);

}
}
