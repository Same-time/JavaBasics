
import java.math.BigDecimal;
import java.math.BigInteger;

public class Test {
	public static void main(String[] args) throws Exception {
		function();
		function_1();
	}

	/*BigDecimal����
	 * public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)
	 * 
	 * ������
	 * divisor - �� BigDecimal Ҫ���Ե�ֵ�� 
	 * scale - Ҫ���ص� BigDecimal �̵ı�ȡ�
	 * roundingMode - ҪӦ�õ�����ģʽ�� 
	 * ROUND_UP, ROUND_DOWN, ROUND_CEILING, 
	 * ROUND_FLOOR, ROUND_HALF_UP, ROUND_HALF_DOWN,
	 * ROUND_HALF_EVEN, ROUND_UNNECESSARY
	 * 
	 */

	public static void function_1() {
		BigDecimal b = new BigDecimal("1.301");
		BigDecimal b1 = new BigDecimal("101");
		BigDecimal bdc = b.divide(b1,2,BigDecimal.ROUND_HALF_UP);
		System.out.println(bdc);
	}

	/*
	 * BigDecimal + - * ����
	 */

	public static void function() {
		BigInteger b = new BigInteger("4568946468464684686468464646844684644446846846846846464");
		System.out.println(b);
		BigInteger b1 = new BigInteger("123468464684686468464646844684644446846846846846464");
		System.out.println(b1);

		// ������� b+b1
		BigInteger jia = b.add(b1);
		System.out.println(jia);

		// ������� b-b1
		BigInteger jian = b.subtract(b1);
		System.out.println(jian);

		// �������b*b1
		BigInteger cheng = b.multiply(b1);
		System.out.println(cheng);

		// �������
		BigInteger chu = b.divide(b1);
		System.out.println(chu);

	}

}
