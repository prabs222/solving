import java.util.*;
public class Main
{
  public static void main (String[]args)
  {

    Scanner sc = new Scanner (System.in);
//              int arr=[];
    int a, b, flag, r, n, n1;
      flag = 0;
      System.out.println ("Enter the lower and the upper limit");
      a = sc.nextInt ();
      b = sc.nextInt ();
    for (int i = a; i <= b; i++)
      {
	n = n1 = i;
	flag = 0;
	while (n1 != 0)
	  {
	    r = n1 % 10;
	    if (r == 0)
	      {
		flag = 1;
		break;
	      }
	    if (n % r == 0)
	      {
		n1 /= 10;
	      }
	    else
	      {
		flag = 1;
		break;
	      }
	  }
	if (flag == 0)
	  {
	    System.out.println (n);
	  }
	else
	  {
	    continue;
	  }
	flag = 0;
      }


  }
}
