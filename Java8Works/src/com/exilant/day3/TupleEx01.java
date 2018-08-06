package com.exilant.day3;

import java.util.ArrayList;
import java.util.List;

class  MyTuple<A,B,C>{
	private A aa;
	private B bb;
	private C cc;
	
	
	public A getAa() {
		return aa;
	}
	public void setAa(A aa) {
		this.aa = aa;
	}
	public B getBb() {
		return bb;
	}
	public MyTuple(A aa, B bb, C cc) {
		super();
		this.aa = aa;
		this.bb = bb;
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "MyTuple [aa=" + aa + ", bb=" + bb + ", cc=" + cc + "]";
	}
	public void setBb(B bb) {
		this.bb = bb;
	}
	public C getCc() {
		return cc;
	}
	public void setCc(C cc) {
		this.cc = cc;
	}
}


class Emp{
	
}
class Dept{
	
}
class SomeThing{
	
}

public class TupleEx01 {
	public static MyTuple<Integer,String,Boolean> newTuple(){
		return new MyTuple(100,"Hello",true);
	}
	
	public static MyTuple<Emp,Dept,SomeThing> newCustomTupleuple(){
		return new MyTuple(new Emp(),new Dept(),new SomeThing());
	}
	
	public static void main(String[] args) {
		MyTuple<Integer,String,Boolean> tuple1 = newTuple();
		System.out.println("Integer Value:" + tuple1.getAa());
		System.out.println("Integer Value:" + tuple1.getBb());
		System.out.println("Integer Value:" + tuple1.getCc());
		
		List<MyTuple<Integer,String,Boolean>> myList = new ArrayList<MyTuple<Integer,String,Boolean>>();
	}

}
