package com.beijiait;


public class String转换 {
	
	/**
	 * 下载字符转换 <br/>
	 * 
	 * @param content
	 *            要转换的内容
	 * @return 转换后的内容
	 */
	public static String reString(String content) {
		content = content.replaceAll(" ", "&#32;");
		content = content.replaceAll("\"", "&#34;");
		content = content.replaceAll("'", "&#39;");
		return content;
		}
	public static void main(String[] args) {
		String a = "dsa dsa 'asd 'asd dsa sad\" ";
		System.out.println(reString(a));
		System.out.println("&#40;");
		String b ="汉字";
		System.out.println(b.length());

	}

}
