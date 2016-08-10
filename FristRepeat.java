# FirstRepeating
public class FristRepeat {

	public static void main(String[] args) {
		int a[]=new int[]{2,2,1,3};
		String s[]=new String[a.length];
		for(int i=0;i<a.length;i++){
			s[i]=""+a[i];
			
			
		}
		String b;int count=0;int count1=0;String s2 = null;
		for(int i=0;i<s.length;i++){
			
			b=s[i];
			
			for(int j=i+1;j<s.length;j++){
				
			if(s[j].contains(b)){
				
					
					count=1;
					
					
				
			}
			if(count==1){
				System.out.println(s[j]);
				System.exit(count);
			}
			
			
				
			}
			
			
		}
	}

}
