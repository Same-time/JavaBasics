package com.test;

import java.util.Scanner;

public class demosxh {
	public static void main(String[] args){
		System.out.println("������һ������1-9����ӡ�˷���");
		Scanner scanner= new Scanner(System.in);
		int n =scanner.nextInt();
		
		print99(n);
		
	}
	
	public static void print99(int n) {
		//ѭ��
			for(int i=1;i<=n;i++){
				for(int j=1;j<=i;j++){
					System.out.print(j+"*"+i+"="+i*j+"  ");
					}
				//����
				System.out.println();
				}
	}
}
