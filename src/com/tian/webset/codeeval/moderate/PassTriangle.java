package com.tian.webset.codeeval.moderate;

//https://www.codeeval.com/open_challenges/89/
public class PassTriangle {

	public static boolean isAdjacent(Point p1,Point p2){
		
		return false;
	} 
	
	public static 
	class Point{
		public Point(int x,int y) {
			this(x,y,0);
		}
		public Point(int v) {
			this(0, 0, v);
		}
		public Point(){}
		public Point(int x,int y,int v){
			this.v = v;
			this.x = x;
			this.y = y;
		}
		private int x;
		private int y;
		private int v;
		public int getV() {
			return v;
		}
		public void setV(int v) {
			this.v = v;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
	}
}
