class usermaincode
{
public int addsub(int input1,int,input2)
{
    boolean flag=true;
		int res=input1;
		flag=input2==1?false:true;
		for(int i=input1-1;i>=0;i--)
		{
			if(flag)
			{
				res+=i;
				flag=false;
			}
			else
			{
				res-=i;
				flag=true;
			}
		}
		return res;
		
	}
}
/*ip:6,1{6-5+4-3+2-1=3}
op:3
ip:6,2{6+5-4+3-2+1=9}
op:9*/
