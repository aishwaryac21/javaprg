   import java.util;
   import java.io;
   
   class usermaincode
   {
   public identifypossiblewords(String input1,String input2)
   {
    int flag1=0;
		input1=input1.toUpperCase();
		input2=input2.toUpperCase();
		String ans="";
		String s[]=input2.split(":");
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==input1.length())
			{
				int flag=0;
			for(int j=0;j<s[i].length();j++)
			{
				if(s[i].charAt(j)==input1.charAt(j)||input1.charAt(j)=='_')
				{
					flag=1;
					continue;
				}
				flag=0;
				break;
			}
			if(flag==1)
			{
				flag1=1;
				ans+=s[i]+":";
			}
			}
		}
		if(flag1==0)
		{
			return "ERROR-009";
		}
		else
		{
		return ans.substring(0,ans.length()-1);
		}
	}
}

  
