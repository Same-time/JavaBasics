
/*
 * 
 * 	  this�ؼ��֣�
 *		 ���ֳ�Ա�����;ֲ�����ͬ�������
 *		this.��Ա����
 */

public class Person {
	
	//˽�б��� ����Ҫ�ṩset��get����
	private int age;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	//����age��˽�У�ֻ���ṩ�������������ʹ��
	public void setAge(int age) {
		this.age=age;
	}
	
	public void put() {
		System.out.println(name+"...."+age);
	}
	
}
