package com.sephiroth.boudary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]){
		System.out.println("hello,world.");
		
		//输入注释确认提交
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("输入第一个字符：");
			String str1=br.readLine();
			System.out.print("输入第二个字符：");
			String str2=br.readLine();

			System.out.println("第一个字符："+str1+" 第二个字符："+str2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
