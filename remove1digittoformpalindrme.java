import java.io.*;
import java.util.*;

class usermaincode
{
public int remove1digittoformpalindrome(int input1)
{
    int out=0;
		String str=String.valueOf(input1);
		StringBuffer sb1=new StringBuffer(str);
		String s=sb1.reverse().toString();
		if(str.equals(s))
		{
			out= -1;
		}
		else
		{
		for(int i=0;i<str.length();i++)
		{
			String temp=str;
			str=str.replaceFirst(Character.toString(str.charAt(i)),"");
			StringBuffer sb=new StringBuffer(str);
			String str1=sb.reverse().toString();
			if(str.equals(str1))
			{
				out=temp.charAt(i)-'0';
				break;
			}
			str=temp;
		}
		}
		return out;
	}
}
/*ip:12332
op:1
ip:123321
op:-1*/
