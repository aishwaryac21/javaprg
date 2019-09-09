import java.util;
import java.io.*;

class usermaincode
{
public useridgenerstion(String input1,String input2,int input3,int input4)
{
    int a=input1.length();
		int b=input2.length();
		String out="";
		if(a>b)
		{
			out+=input2.charAt(b-1)+input1;
		}
		else if(a<b)
		{
			out+=input1.charAt(a-1)+input2;
		}
		else if(a==b)
		{
			String s[]=new String[]{input1,input2};
			Arrays.sort(s);
			out+=s[0].charAt(s[0].length()-1)+s[1];
		}
		String out1="";
		for(int i=0;i<out.length();i++)
		{
			if(Character.isUpperCase(out.charAt(i)))
			{
				out1+=Character.toLowerCase(out.charAt(i));
			}
			else
			{
				out1+=Character.toUpperCase(out.charAt(i));
			}
		}
		String pin=String.valueOf(input3);
		out1+=pin.charAt(input4-1);
		out1+=pin.charAt(pin.length()-input4);
		return out1;
	}
}
//ip:
  Rajiv
  Roy
  560037
  6
//op:YrAJIV75  
//ip:
  Manoj
  Kumar
  567327
  2
//op:RmANOJ62  
