package com.kopo.human.multichat.client;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener,Runnable{
	private JTextField chatField;	
	private JTextArea chatContent;
	private BufferedReader chatIn;
	private PrintWriter chatOut;
	private String nickName;
	private boolean flag=false;
	private Socket socket;
	
	public ChatClient(String nickName) {
		super(nickName);
		this.nickName=nickName;
		//창을 닫을 때 실행
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				stop();
				System.exit(0);
			}			
		});
		design();	
		initNetwork();
		new Thread(this).start();
	}
	
	public void design() {
		Container ca = this.getContentPane();
		JPanel southPanel = new JPanel();
		chatField= new JTextField(20);
		chatField.addActionListener(this);
		JButton	jb = new JButton("보내기");
		jb.addActionListener(this);
		
		southPanel.add(chatField);
		southPanel.add(jb);
		chatContent = new JTextArea();
		chatContent.setLineWrap(true);
		chatContent.setEditable(false);
		
		ca.add(southPanel, BorderLayout.SOUTH);
		ca.add(new JScrollPane(chatContent), BorderLayout.CENTER);
	}
	
	public void initNetwork(){
		try {
			socket = new Socket("172.16.144.19", 54545);
			chatIn=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			chatOut =new PrintWriter(socket.getOutputStream() ,true);
			sendMessage("["+nickName+"]님이 입장했습니다");
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}	

	@Override
	public void run() {
		try {
			while(!flag){
				String msg = chatIn.readLine();				
				if(msg != null && !msg.equals("")){
					chatContent.append( msg +"\n");
					chatContent.setCaretPosition(chatContent.getText().length());					
				}else{
					stop();
				}				
			}
			chatIn.close();
			chatOut.close();
			socket.close();			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String message=chatField.getText();
		if(!message.equals("")) {
			sendMessage("["+nickName+"]"+message);
			chatField.setText("");
		}
	}
	
	public void sendMessage(String message) {
		chatOut.println(message);
	}
	
	public void stop(){
		sendMessage("[" + nickName + "]:님이 퇴장합니다" );
		flag=true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
