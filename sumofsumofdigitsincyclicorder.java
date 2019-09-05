import java.io.*;
import java.util;
class usermaincode
{
  public int sumofsumofdigits(int input1)
  {
  String s=String.valueOf(input1);
  int sum=0;
  for(int i=0;i<s,length();i++)
  {
    for(int j=i;j<s.length();j++)
    {
      sum+=(int)s.charAt(j)-'0';
    }
  }
  return sum;
  }
 }
 //ip:582109
 //op:85   {  (5+8+2+1+0+9)+(8+2+1+0+9)+(2+1+0+9)+(1+0+9)+(0+9)+(9)=25+20+12+10+9+9=85}
