package com.sephiroth.boudary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]){
		System.out.println("hello,world.");
		
		//����ע��ȷ���ύ
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("�����һ���ַ���");
			String str1=br.readLine();
			System.out.print("����ڶ����ַ���");
			String str2=br.readLine();

			System.out.println("��һ���ַ���"+str1+" �ڶ����ַ���"+str2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
