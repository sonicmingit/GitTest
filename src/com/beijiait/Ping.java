package com.beijiait;

import java.io.IOException;
import java.net.InetAddress;

/**
 * 一个ping的方法
 * @author haoyiming  
 * @date 2017年9月12日 下午5:05:39
 */
public class Ping {
	/**
	 * ping一个网址
	 * @param args 啥都不是
	 */
	public static void main(String[] args) {
		String host = "220.181.57.217";
		int timeOut = 3000;
		try {
			boolean status = InetAddress.getByName(host).isReachable(timeOut);
			System.out.println(status);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}