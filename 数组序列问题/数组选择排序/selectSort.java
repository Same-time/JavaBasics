//ѡ�����������ÿ��Ԫ�ض�Ҫ���бȽ�

public class selectSort {

	public static void main(String[] args) {
		int [] arr = {0,5,2,4,3,1};
		
		//�����������򷽷�
		selects(arr);
		//ѭ�����
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]);
		}

	}
	//����ѡ������
	public static void  selects(int [] arr) {
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				//�ж�
				if(arr[i]>arr[j]){
					//��λ��
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
