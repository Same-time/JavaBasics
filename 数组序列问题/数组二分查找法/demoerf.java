

public class demoerf {

	public static void main(String[] args) {
		
		int [] arr={2,4,5,8,9,10,12,16,19};
		//���ö��ֲ��ҷ�
	 int index =erfenfa(arr,5);
		System.out.println(index);
		

	}
	//�������� min mid max
	//�۰����� min <= max
	//Ԫ�� > �м����� Сָ�� = �м�+1
	//Ԫ�� < �м�����  ��ָ�� = �м�-1
	//Ԫ�� == �м�����  �ҵ�Ԫ�أ�����ѭ��
	public static int erfenfa(int [] arr,int key) {
		int min=0;
		int max=arr.length-1;
		int mid =0;
		while(min<=max){
			//�����м�����
			mid = (min+max)/2;
			//���м��������бȽ�
			if(key>arr[mid]){
				min=mid+1;
			}else if (key<arr[mid]) {
				max =mid-1;
			}else {
				//�ҵ�Ԫ��
				return mid;
			}
		}
		return -1;
		
	}

}
