public class LogicalOperators 
{
    public static void main (String[]args)
{
  int a=10;
  int b=5;
  int c=5;
  boolean result=a>b && a==b && b>c && b==c && c>b ;
  System.out.println(result);
  System.out.println(a==b && b==c && b<c); 
  System.out.println(a==b || a>b || a<b || b==c);
  System.out.println(!true);

}
}
