package LR_5;

public class Program 
{

	public static void main (String[] args)
	{
		Notebook N = new Notebook("br-150-12s", "HP");
		N.Price(25000);
		N.drawObject();
		
		System.out.println("\n");
		
		Server S = new Server("WDBKWB0160KBK-EEUE", "WD");
        S.Price(97000);
        S.drawObject() ;

        System.out.println("\n");

        PersonalComputer P = new PersonalComputer("Своя", "Olex", "ASRock", 15000, "Samsung", 7500, "MSI GeForge RTX 2060", 42990, "Intel Core I9", 56000, "Kingdom", 4200);
        P.Price(250000);
        P.drawObject();
		
	}
}
