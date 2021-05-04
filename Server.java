/*areaof the circle Server side program.*/
import java.io.*;
import java.net.*;
class Server
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss = new ServerSocket(1064);
			Socket s = ss.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str = br.readLine();
			double r = Double.parseDouble(str);
			double area = 3.14*r*r;
			System.out.println(area);
			PrintStream ps = new PrintStream(s.getOutputStream());
			ps.println(String.valueOf(area));
			br.close();ps.close();s.close();ss.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

/*areaof the circle client side program.*/

class Client
{
	public static void main(String args[])throws IOException
	{
			Socket s = new Socket("localhost",1064);
			System.out.println("Enter the radius :");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintStream ps = new PrintStream(s.getOutputStream());
			ps.println(br.readLine());
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str = br.readLine();
			System.out.println("Area of the Circle is:");
			br.close();ps.close();
	}
}

			
			
			

