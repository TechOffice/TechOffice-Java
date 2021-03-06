package com.techoffice.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Appl {
	
	static int port = 1010;
	static ServerSocket serverSocket;
	static {
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException{
		System.out.println("Server is running on " + port);
		while(true){
			Socket socket = serverSocket.accept();
			System.out.println("Someone is connecting to the server");
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
//			InputStreamReader r;
			PrintWriter writer = new PrintWriter(os);
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String line = "";
			while((line = reader.readLine()) != null){
				System.out.println(line);
			}
			writer.println("This is a Server Socket Test");
			Thread.sleep(10000);
			System.out.println("close");
			socket.close();
		}
	}
}
