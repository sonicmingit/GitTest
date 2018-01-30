package com.beijiait;

/**
 * 类名: AnnotationTest <br/>
 * 说明: 一个测试注释的类<br/>
 * 修改时间: 2017年9月18日 下午3:31:36 <br/>
 * 
 * @author 北佳软件
 * @version
 */
public class AnnotationTest {
	/** 属性说明 */
	public String sonic = "测试属性";
	/**
	 * 说明:方法说明 <br/>
	 * 
	 * @param num 参数介绍
	 * @return 返回值介绍
	 */
	public String method(int num) {
		String re = "s";
		return re;
	}
	/**
	 * 创建一个 AnnotationTest 实例 .
	 * 
	 * @param sonic
	 */
	public AnnotationTest(String sonic) {
		super();
		this.sonic = sonic;
	}
	/**
	 * 说明:简单描述该方法的实现功能（可选）.
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "AnnotationTest [sonic=" + sonic + "]";
	}
	/**
	 * 创建一个 AnnotationTest 实例 .
	 */
	public AnnotationTest() {
		super();
	}
	/** 
	 * 获取 sonic  
	 * @return  sonic 属性
	 */
	
	public String getSonic() {
		return sonic;
	}
	/** 
	 * 设置 sonic
	 * @param sonic 属性
	 */
	
	public void setSonic(String sonic) {
		this.sonic = sonic;
	}

	
}
