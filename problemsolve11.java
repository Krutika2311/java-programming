import java.util.*;

class problemsolve11
{
  
  public static void main(String[] args) 
  {
    Scanner obj=new Scanner(System.in);
   
    System.out.println("enter string");
    String s=obj.nextLine();
    System.out.println("lemgth of string"+s.length());
    

    String s1=s.trim().replaceAll("[ ]{2,}", " ");
    
    String arr[]=s1.split(" ");
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }
     
    System.out.println("numbers of words"+arr.length);
    int imax=0;
    String output=null;
    for(int i=0;i<arr.length;i++)
    {
     
        if(arr[i].length() > imax)
        {
           imax=arr[i].length();
           output=arr[i];
        }
   
    }
    System.out.println("largest words : "+output);

  }
}