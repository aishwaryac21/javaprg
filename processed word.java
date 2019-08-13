import java.util.Arrays;
public class Strings
{
	public static void main(String[] args) 
	{
		String a="Today is a nice day";
		int c=41;
		String s1="";
		String s2="";
		String  b[]=a.split(" ");
		int l1=c%10;
		int l2=c/10;
		s1=b[l1-1];
		s2=b[l2-1];
		String t1="";
		String t2="";
		String ans1="";
		String v1="";
		String v2="";
		String ans2="";
		if(s1.length()%2==0)
		{
			int m=s1.length()/2;
			t1=s1.substring(0, m);
			
			t2=s1.substring(m);
			StringBuffer sb=new StringBuffer(t1);
			ans1+=sb.reverse().toString()+t2;
			
		}
		else
		{
			int n=s1.length()/2;
			v1=s1.substring(0, n+1);
			v2=s1.substring(n);
			StringBuffer bs=new StringBuffer(v1);
			ans2=bs.reverse().toString()+v2;
		}
		//System.out.println(ans1+" "+ans2);
		if(s2.length()%2==0)
		{
			int m=s2.length()/2;
			t1=s2.substring(0, m);
			
			t2=s2.substring(m);
			StringBuffer sb=new StringBuffer(t1);
			ans1+=sb.reverse().toString()+t2;
			
		}
		else
		{
			int n=s2.length()/2;
			v1=s2.substring(0, n+1);
			v2=s2.substring(n);
			StringBuffer bs=new StringBuffer(v1);
			ans2=bs.reverse().toString()+v2;
		}
		System.out.println(ans1+" "+ans2);
		
		
	}

}
/*ip:Today is a nice day
     41
op:ince doTday     
