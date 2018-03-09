import java.net.InetAddress;

public class IP_address {
	public static void main(String args[]) throws Exception
    {
        InetAddress IP = InetAddress.getLocalHost();
        System.out.println("IP address := " + IP.getHostAddress());
        NetConnect one = new NetConnect();
        one.NetConnect();
    }
 
}