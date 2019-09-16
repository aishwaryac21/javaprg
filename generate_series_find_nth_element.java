import java.io.*;
import java.util;
class usermaincode
{
  public int genseq(int input1,int input2,int input3,int input4)
  {
    int a=input2-input1;
    int b=input3-input2;
    for(int i=4;i<=input4;i++)
    {
      if(i%2==0)
      {
        input3+=a;
      }
      else
      {
        input3+=b;
      }
    }
    return input3;
  }
}
//ip:1,3,6,17
//op:41(1,3,6,8,11,13,16,18,21,23,26,28,31,33,36,38,41)
