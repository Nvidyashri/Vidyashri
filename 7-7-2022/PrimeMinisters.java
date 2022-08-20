class PrimeMinisters
{

public static void main(String[] args)
{
	String primeMinisters[]={"Lal Bahadur Shastri","Murarji Desai","Indira Ghandi",
	"Rajiv Gandhi","V.P.Singh","P.V.Narasimha Rao","Atal Bihari Vajpaye","H.D.Devegouda","Manaohan Singh","Narendr Modi"};
	for(int a=0;a<primeMinisters.length;a++)
	{ 
		System.out.println(primeMinisters[a]+"\n");
	}
	primeMinisters[4]="NA";
	primeMinisters[7]="NA";
	primeMinisters[9]="NA";
	System.out.println("After Re-assigning Index 4,7,9\n");
	for(int a=0;a<primeMinisters.length;a++)
	{
		System.out.println(primeMinisters[a]+"\n");
	}
}
}