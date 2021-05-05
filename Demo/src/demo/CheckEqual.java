package demo;

import java.util.ArrayList;
import java.util.List;

public class CheckEqual {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,1};
		int arr2[]= {2,2,1};
		List<Integer> a1=new ArrayList<Integer>();
		List<Integer> a2=new ArrayList<Integer>();
		
		if(arr1.length==arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				a1.add(arr1[i]);
				a2.add(arr2[i]);
				
			}
			
			//System.out.println(a1);
			//System.out.println(a2.containsAll(a1));
			int match=0;
			for(Integer tmp:a1) {
				if(a2.contains(tmp)) {
					a2.remove(tmp);
					match++;
				}
			}
			
			if(a1.size()==match) {
				System.out.println("Same array");
				
			}else 
			
			{
				
				System.out.println("Not Same");
				
			}
			
			
		}else {
			System.out.println("Not Same");
		}
		
		
		/*int match=0;
		
		if(arr1.length==arr2.length) {
			
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1.length;j++) {
					if(arr1[i]==arr2[j]) {
						match++;
						
					}
				}
			}
			
		}else {
			System.out.println("Not Same");
		}
		
		if(match==arr1.length) {
			System.out.println("Same array");
		}*/
		

	}

}
