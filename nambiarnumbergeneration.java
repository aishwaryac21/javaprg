/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    	String input1="9597766402";
		int count = input1.length();
		int index=0;
	
		int a=0;
		String ans1="";
		int ans=0;
		while(count>0)
		{
			ans=input1.charAt(index)-'0';
			int flag = 0;
			int flag1 =0;
			int count1=0;
			for(int i=index+1;i<input1.length();i++)
			{
			
				count1+=1;
				if(ans%2==0)
				{
					if(flag1==1)
					{
						index=i;
						a=0;
						break;
					}
				
					ans +=input1.charAt(i)-'0';
					flag=1;
				}
				else
				{
					if(flag==1)
					{
						index = i;
						a=0;
						break;
					}
				
					ans +=input1.charAt(i)-'0';
					flag1=1;
					
				}a=1;
			}
			if(count1==0) count1=1;
			if(a==1)count1+=1;
			ans1 += String.valueOf(ans);
			count -= count1;
			System.out.println(count);
		}
		System.out.println(ans1);
	}
}

//ip:9797886254
//op:1610294
