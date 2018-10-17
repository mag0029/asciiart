package com.mgiraud.asciiart.alphabets;

public abstract class DefaultAlphabet {
	
	private int h;
	private int w;
	private String[] datas;
	


	public DefaultAlphabet(int h, int w, String[] datas) {
		// TODO Auto-generated constructor stub
		this.h= h;
		this.w = w;
		this.datas = datas;
	}



	public int getH() {
		return h;
	}



	public int getW() {
		return w;
	}



	public String[] getDatas() {
		return datas;
	}
	
	
}
