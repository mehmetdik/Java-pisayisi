
public class PiSayisi {

	public static void main(String[] args)
	{
		double pi=0,count=0,i=1,j=3;
		for (;;) 
		{
			
					
					pi=pi+(4/i-4/j); //pi sayısının yaklaşan değerini hesaplar
					count=count+1;
					System.out.println(pi);
					if (pi>= 3.14159)
					{
						System.out.println("Adım sayısı="+count*4);
						break;
					}
					
					
					
					i+=4;
					j+=4;
			

		}	

	}

}
