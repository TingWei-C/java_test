package com.qst.chapter05.innerclass;

public class Cow {
	private double weigth;

	public Cow() {

	}

	public Cow(double weigth) {
		this.weigth = weigth;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	private class CowLeg {
		private double length;
		private String color;

		public CowLeg() {

		}

		public CowLeg(double length, String color) {
			this.length = length;
			this.color = color;
		}

		public double getLength() {
			return length;
		}

		public void setLength(double length) {
			this.length = length;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public void info() {
			System.out.println("目前牛腿顏色是:" + color + ", 高:" + length);
			System.out.println("本牛腿所在乳牛重:" + weigth);
		}

	}

	public void test() {
		CowLeg cl = new CowLeg(1.12,"黑白相間");
		cl.info();
	}

	public static void main(String[] args) {
		Cow cow = new Cow(378.9);
		cow.test();
	}

}
