
public class demosxh {
	public static void main(String[] args){
		//�������
		int bai = 0;
		int shi = 0;
		int ge = 0;
		//ѭ��
		for(int i = 100; i< 1000; i++){
			//��i�����ж�
			//��ȡ��λ
			bai = i/100;
			//��ȡʮλ
			shi = i/10%10;
			//��ȡ��λ
			ge = i%10;
			
			if(bai*bai*bai+shi*shi*shi+ge*ge*ge==i){
				//���ˮ�ɻ���
				System.out.println(i);
			}
		}
		
	}
}
