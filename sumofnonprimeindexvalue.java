import java.io.*;
import java.util;
class usermaincode
{
public int sumofnonprimeindexvalue(int[] input1,int input2)
{
    int sum=0;
		if(input2>3)
		{
			sum=input1[0]+input1[1];
			for(int i=4;i<input2;i++)
			{
				for(int j=2;j<=Math.sqrt(i);j++)
				{
					if(i%j==0)
					{
						sum+=input1[i];
						break;
					}
				}
			}
		}
		else
		{
			sum=input1[0]+input1[1];
		}
		return sum;
	}
  }
  /*ip:{10,20,30,40,50,60,70,80,90,100}
  op:340*/
