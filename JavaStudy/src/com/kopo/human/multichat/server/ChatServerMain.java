package com.kopo.human.multichat.server;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServerMain {
	Socket socket;
	ServerSocket serverSocket;
	static ChatControl cct = new ChatControl();	
	public void startServer(){
		try{
			serverSocket = new ServerSocket(54545);			
			while(true){
				socket=serverSocket.accept();
				ChatThread ct=new ChatThread(socket);
				cct.addChatThread(ct);
				ct.start();	
//				new Thread(ct).start();  chatThread�� �θ� Runnable �϶�
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ChatServerMain csm = new ChatServerMain();
		csm.startServer();		
	}

}
