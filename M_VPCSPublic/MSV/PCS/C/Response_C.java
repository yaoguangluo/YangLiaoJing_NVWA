package MSV.PCS.C;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import MS.VPC.SH.SleeperHall;
public class Response_C {
	public static void main(String[] args){

	}

	@SuppressWarnings("unused")
	private static void error404(Socket socket, SleeperHall sleeperHall
			, Integer sId) throws IOException {
		PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);
		pw.println("HTTP/1.1 404 OK\n\n"); 
		pw.flush();
		pw.close();
		socket.close();
		sleeperHall.removeThreadById(sId);
		return;
	}

	@SuppressWarnings("unused")
	private static void error500(Socket socket, SleeperHall sleeperHall
			, Integer sId) throws IOException {
		PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);
		pw.println("HTTP/1.1 500 OK\n\n"); 
		pw.flush();
		pw.close();
		socket.close();
		sleeperHall.removeThreadById(sId);
		return;
	}
}