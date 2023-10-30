public class upperandlowercase {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 
		String f=sc.nextLine();  
		int j=0;
		for(char a:f.toCharArray())  //length finding... 
		{ 
			j++;
			
		}  
		char k[]=new char[j];
		for(int i=0;i<j;i++)
		{ 
			k[i]=f.charAt(i);
			int a=(int)k[i];
			a=a^32;
			System.out.print((char)a);
			
		
	}

} 
}  

INPUT:
ZOlo

OUTPUT:
zoLO