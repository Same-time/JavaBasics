
/**
 * 
 * @author qwer
 * 
 *         ������ʽ��صķ��� 
 *         1.ƥ��
 *          boolean matches(String ����Ĺ���) "qwer".matches("[q]")
 *         ƥ��ɹ�����true 
 *         2.���и� 
 *         String[] split(String ����Ĺ���) "qwer".split("q")
 *         ʹ�ù����ַ��������и� 
 *         3.���滻 
 *         String replaceAll( String �������,String �ַ���)
 *         "abc0123".repalceAll("[\\d]","#")
 * 
 */

public class Msrdemo{
	public static void main(String[] args) {
		repa();

	}
	
	public static void repa() {
		String str = "HEllo123465asdasdadsad54565441";
		System.out.println(str.replaceAll("[0-9]+", "#"));
	}
	
	public static void qiege_1() {
		String str= "111.22.3.44";
		String[] strArr =str.split("\\.");
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i]);
		}
	}
	
	public static void qiege() {
		String str= "11--22---33-----44";
		String[] strArr =str.split("-+");
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i]);
		}
	}
	
	public static void checkNum(String string) {
		System.out.println(string.matches("1[34578][0-9]{9}"));
	}

	public static void check() {
		String qq = "123456";
		boolean b = qq.matches("[1-9][0-9]{4,9}");
		System.out.println(b);
	}


}
