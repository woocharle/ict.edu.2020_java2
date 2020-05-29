package com.ict.edu;

import java.io.IOException;
import java.net.Socket;

public class Ex03 implements Runnable{
	Socket s = null;
	public Ex03() {
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		try {
			s = new Socket("203.236.220.86", 7777);
			System.out.println("Client 수고하셨습니다.");
			
		} catch (Exception e) {
			
		} finally {
			try {
				s.close();
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
	
}
