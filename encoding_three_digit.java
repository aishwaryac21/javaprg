String f="";
		String m="";
		String l="";
		String op1="";
		String op2="";
		String op3="";
		String op4="";
		String str[]={input1,input2,input3};
		for(int i=0;i<3;i++)
		{
			if(str[i].length()%3==1)
			{
				f=str[i].substring(0,str[i].length()/3);
				m=str[i].substring(str[i].length()/3,str[i].length()-f.length());
				l=str[i].substring(str[i].length()-f.length(),str[i].length());
			}
			else if(str[i].length()%3==0)
			{
				f=str[i].substring(0,str[i].length()/3);
				m=str[i].substring(str[i].length()/3,str[i].length()-f.length());
				l=str[i].substring(str[i].length()-f.length(),str[i].length());
			}
			else if(str[i].length()%3==2)
			{
				f=str[i].substring(0,str[i].length()/3+1);
				m=str[i].substring(str[i].length()/3+1,str[i].length()-f.length());
				l=str[i].substring(str[i].length()-f.length(),str[i].length());
			}
			op1+=f;
			op2+=m;
			op3+=l;
		}
		for(int i=0;i<op3.length();i++)
		{
			if(Character.isUpperCase(op3.charAt(i)))
			{
				op4+=Character.toLowerCase(op3.charAt(i));
			}
			else if(Character.isLowerCase(op3.charAt(i)))
			{
				op4+=Character.toUpperCase(op3.charAt(i));
			}
		}
		Result rs=new Result(op1,op2,op4);
		return rs;

        
    }
}
/* john,johny,janardhan*/
