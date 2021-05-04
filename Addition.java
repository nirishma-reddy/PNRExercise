import java.io.*;
class Addition{
	public static void main(String [] args) throws Exception
	{
		int a,b,c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the two numbers");
		a= Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c =a+b;
		System.out.println("\n Sum of two numbers is:"+c);
	}
}