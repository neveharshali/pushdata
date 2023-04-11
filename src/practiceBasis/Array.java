package practiceBasis;

public class Array {

	public static void main(String[] args) {
		int arr[]= {3,4,5,6,7,8};
		int length=arr.length,nextterm=0;
		int a=0;
		//System.out.println(length);
		int i=0;
		while(i<=length-2) {
			int b=arr[i];
			nextterm=a+b;
			i++;
			System.out.print(" "+nextterm);
			a=b;
		}
		System.out.print(" "+arr[length-1]);

	}

}
