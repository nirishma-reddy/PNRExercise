import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class Server_1
{
	public static void main(String args[])throws IOException
	{
		DatagramSocket ds = new DatagramSocket(1234);
		byte[] recieve = new byte[65535];
		DatagramPacket DpReceive = null;
		while(true)
		{
			DpRecieve = new DatagramPacket(recieve,recieve.length);
			ds.recieve(DpReceive);
			System.out.println("client:"+data(recieve));
			if(data(recieve).toString().equals("bye"));
			{
				System.out.println("Client sent byee");
				break;
			}
			recieve = new byte[65535];
		}
	}
		public static StringBuilder data(byte[] a)
		{
			if(a== null)
				return null;
			StringBuilder ret = new StringBuilder();
			int i =0;
			while(a[i]! = 0)
			{
				ret.append((char) a[i]);
				i++;
			}
			return ret;
		}
	}
	
/*simple chat (Client) program by using udp.*/
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
public class Client_1
{
	public static void main(String args[])throws IOException
	{
		Scanner sc = new Scanner(System.in);
		DatagramSocket ds = new DatagramSocket();
		InetAddress ip = InetAddress.getLocalhost();
		byte buf[] = null;
		while(true)
		{
			String inp = sc.nextLine();
			buf = inp.getBytes();
			DatagramPacket DpSend = new DatagramPacket(buf,buf.length,ip,1234);
			ds.send(DpSend);
			if(inp.equals("byte"))
				break ;
		}
	}
}
		
