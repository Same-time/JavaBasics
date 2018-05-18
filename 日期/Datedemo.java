

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *	string => Date �ַ���ת����
 *	Date => string ����ת�ַ���
 */

public class Datedemo{
	public static void main(String[] args) throws Exception {
			function();
			function1();
	}
	
	/*
	 * 	���ַ���ת��Ϊ���ڶ��� 
	 *	Date parse��string s��
	 *	���裺
	 *	1.����simpleDateformat����
	 *		����������ָ������ģʽ
	 *	2.������󣬵��÷���parse������string ת��Ϊdate
	 */
	public static void function1() throws Exception {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse("1996-01-01 12:54:00");
		System.out.println(date);
	}
	
	/*
	 * �����ڸ�ʽ��
	 * ���裺
	 * 	1.����simpleDateformat����
	 * ���๹�췽���У�д���ַ��������ڸ�ʽ���Լ����壩
	 * 2.simpleDateformat���÷���format�����ڽ��и�ʽ��
	 * 	string format(Date date) �������ڶ��󣬷����ַ���
	 *����ģʽ��
	 *	yyyy ���
	 *	MM  �·�
	 *	dd ���е�����
	 *	HH	0-23Сʱ
	 *	mm	Сʱ�еķ�����
	 *	ss  ��
	 */
	public static void function() {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String date =sdf.format(new Date());
		System.out.println(date);
	}
}
