
import java.net.*;
import java.util.*;

public class NetConnect  {
	void NetConnect() {
		boolean connectivity;
		try {
			URL url = new URL("http://www.google.com/");
			URLConnection conn = url.openConnection();
			conn.connect();
			connectivity = true;
			System.out.println("connection: Yes");
		} catch (Exception e) {
			connectivity = false;
			System.out.println("connection: No");
		}

	}
}