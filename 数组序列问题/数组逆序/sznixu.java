

public class sznixu {

	public static void main(String[] args) {
		
		int [] arr={1,2,3,4,5,6,7,8};
		//���������ź���
		nx(arr);
		//���ñ�������
		printarr(arr);

	}
		//������
	  public static void nx(int [] arr) {
		for(int min =0,max=arr.length-1; min<max ;min++,max--){
			int temp=arr[min];
			arr[min]=arr[max];
			arr[max]=temp;
		}
	}
	  
	  //��������
	  public static void printarr(int [] arr) {
		  for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]);
			}
	}
}
