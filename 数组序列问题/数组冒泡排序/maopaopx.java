
//ð���������������Ԫ�ػ�λ��
//java.lang.ArrayIndexOutOfBoundsException: ����Խ�籨�����
public class maopaopx {

	public static void main(String[] args) {

		int [] arr={1,8,9,6,3,-5,2};
		//����ð�����򷽷�
		bubbleSort(arr);
		//ѭ�����
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+",");
		}
	}
	
	public static void bubbleSort(int [] arr) {
		for(int i =0;i<arr.length-1;i++){
			for(int j= 0;j<arr.length-i-1;j++){
				if(arr[j] > arr[j+1])
				{
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
