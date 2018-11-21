package com.beijiait;

import java.io.IOException;
import java.net.InetAddress;


public class Ping {
	public static void main(String[] args) {
		java.lang.String host = "220.181.57.217";
		int timeOut = 3000;
		try {
			boolean status = InetAddress.getByName(host).isReachable(timeOut);
			System.out.println(status);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}