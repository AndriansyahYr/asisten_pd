    import java.util.*;
    import java.lang.*;
     
    class test
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    		boolean find = false;
    		Scanner input = new Scanner (System.in);
                int i = 0;
                do {
                    i = input.nextInt();
                    if (i != 42){
                    	find = true;
                        System.out.println(i);
                    } else {
                        break;
                    }
                } while (find);
    	}
    } 