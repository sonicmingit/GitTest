package com.beijiait;

/**
 * bulider创建实体类
 * @author haoyiming  
 * @date 2017年9月12日 下午5:04:39
 */
public class BuilderClass {
	// 创建私有最终属性,不赋值
	private final int a;
	private final int b;
	private final int c;

	/**
	 * 创建一个内部类,用来赋值和实例化
	 */
	static class Builder {
		// 为属性赋初值,实例化不赋值的情况下
		private int a = 0;
		private int b = 0;
		private int c = 0;

		// 为每个属性创建赋值方法,返回本对象可以继续赋值
		public Builder A(int var) {
			a = var;
			return this;
		}

		public Builder B(int var) {
			b = var;
			return this;
		}

		public Builder C(int var) {
			c = var;
			return this;
		}

		// 用来实例化的方法,直接返回实例对象
		public BuilderClass build() {
			return new BuilderClass(this);
		}

	}

	// 私有构造方法,传入内部类赋值
	private BuilderClass(Builder b) {
		this.a = b.a;
		this.b = b.b;
		this.c = b.c;
	}

	@Override
	public String toString() {
		return "BuilderClass [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
		// 调用类的静态方法builder给需要的属性赋值并最终调用实例化方法
		BuilderClass bc = new BuilderClass.Builder().A(1).B(2).build();
		System.out.println(bc);
	}
}
