package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class shop {

	public static void main(String[] args) {
		//�������ϣ��洢��Ʒ����
		ArrayList<Fitem> array = new ArrayList<Fitem>();
		//������Ʒ��ʼ��
		init(array);
		while (true) {
			//���ò˵�����
			mainMenu();
			//�����û�ѡ�񷽷�
			int choose =choose();
			switch (choose) {
			case 1:
				//���ò鿴��Ʒ;
				showf(array);
				break;
			case 2:
				//���������Ʒ;
				inputf(array);
				break;
			case 3:
				//����ɾ����Ʒ;
				dele(array);
				break;
			case 4:
				//�����޸���Ʒ;
				alterf(array);
				break;
			case 5:
				//�����˳�ϵͳ;
				return;

			default:
				System.out.println("���ܲ�����");
				break;
			}
			
		}
		
	}
	//��Ʒ���޸Ĺ���
	public static void alterf(ArrayList<Fitem> array) {
		System.out.println("��ӭʹ���޸Ĺ���");
		System.out.println("�������Ʒ���");
		Scanner sc = new Scanner(System.in);
		int id= sc.nextInt();
		//����
		for (int i = 0; i < array.size(); i++) {
			Fitem f= array.get(i);
			if (f.ID==id) {
				System.out.println("��������Ʒ���");
				f.ID=sc.nextInt();
				System.out.println("�������µ���Ʒ����");
				f.name=sc.next();
				System.out.println("�������µ���Ʒ�۸�");
				f.price=sc.nextDouble();
				System.out.println("��Ʒ�޸ĳɹ�");
				return ;
			}
		}
		System.out.println("�����Ų�����");
	}
	
	//ɾ����Ʒ����
	public static void dele(ArrayList<Fitem> array) {
		System.out.println("��ӭʹ��ɾ������");
		System.out.println("������Ҫɾ����Ʒ�ı��");
		Scanner sc =new Scanner(System.in);
		int id = sc.nextInt();
		//��������
		for (int i = 0; i < array.size(); i++) {
			//��ȡÿ��fitem�ı���
			Fitem f = array.get(i);
			//�ж�
			if(f.ID==id){
				//�Ƴ����ϵ�Ԫ��  ʹ�ü��ϵķ��� remove()ʵ�֣�
				array.remove(i);
				System.out.println("ɾ���ɹ�");
				//��������
				return ;
			}
		}
		System.out.println("�޸���Ʒ���");
	}
	
	
	//�����Ʒ���ܣ�
	public static void inputf(ArrayList<Fitem> array) {
		System.out.println("��ӭʹ����Ʒ��ӹ���");
		//��������
		Scanner sc= new Scanner(System.in);
		System.out.println("�����Ʒ���");
		int id =sc.nextInt();
		System.out.println("��������Ʒ����");
		String name =sc.next();
		System.out.println("��������Ʒ�۸�");
		double price =sc.nextDouble();
		//�����¶���
		Fitem f=new Fitem();
		//��ֵ
		f.ID=id;
		f.name=name;
		f.price=price;
		//���ؽ�����
		array.add(f);
	}
	
	//�����嵥�Ĺ��ܣ���������
	public static void showf(ArrayList<Fitem> array) {
		System.out.println("*********��Ʒ�б�*********");
		System.out.println("��Ʒ���    ��Ʒ����    ��Ʒ����");
		for (int i = 0; i < array.size(); i++) {
			//���ϵ�get���� ��ȡ����
			Fitem fitem =array.get(i);
			//��ӡ���
			System.out.println(fitem.ID+"      "+fitem.name+"      "+fitem.price);
		}
	}
	
	//���巽����ʵ���û��ļ�������
	public static int  choose() {
		Scanner sc= new Scanner(System.in);
		return sc.nextInt();
	}
	
	//���巽���ǣ�ʵ�����˵�
		public static void mainMenu() {
			System.out.println("�̵����ϵͳ");
			System.out.println("1.�鿴��Ʒ 2.�����Ʒ 3.ɾ����Ʒ 4.�޸���Ʒ  5.�˳�ϵͳ");
			System.out.println("��������Ҫ�����Ĺ������");
		}
	
	
	//���巽����ʵ����Ʒ���ݵĳ�ʼ��
		public static void init(ArrayList<Fitem> array) {
			Fitem f1	= new Fitem();
			f1.ID=0001;
			f1.name="ƻ��";
			f1.price=12.7;
			
			Fitem f2	= new Fitem();
			f2.ID=0002;
			f2.name="�㽶";
			f2.price=16.7;
			
			Fitem f3	= new Fitem();
			f3.ID=0003;
			f3.name="ѩ��";
			f3.price=15.8;
			
			//�����ڼ�����
			array.add(f1);
			array.add(f2);
			array.add(f3);
				
			}

}
