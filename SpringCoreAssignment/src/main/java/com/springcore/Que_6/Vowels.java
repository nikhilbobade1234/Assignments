package com.springcore.Que_6;

public class Vowels{
	String str[];

	public String[] getStr() {
		return str;
	}

	public void setStr(String[] str) {
		this.str = str;
	}
	public void show() {
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
		public void result() {
			
		for(String b:str) {
			String s1=b.replaceAll("[aeiouAEIOU]", "");
			if(b.equals(s1)) {
				System.out.println(b);
			}
			
		}
	}
	

	
		
	}

