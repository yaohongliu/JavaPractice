package ArrayExample;
//linear search
public class search {

	public static void main(String[] args) {
		int arr[] = {12,33,11,2,14,23};
		boolean b = false;
		int searchEle=2;
		
		for(int i = 0; i <arr.length; i++) {
			if(arr[i]==searchEle) {
				b = true;
				break;
			}
		}
			if(b)
				System.out.println(searchEle+" found");
			else 
				System.out.println(searchEle+" not found");
			
			b = false;
			searchEle =121;
			for(int i = 0; i <arr.length; i++) {
				if(arr[i]==searchEle) {
					b = true;
					System.out.println(searchEle +" found");
				}
			}
			if(!b)
				System.out.println(searchEle +" not found");
		}
	}


