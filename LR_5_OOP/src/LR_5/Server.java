package LR_5;

public class Server implements IVisual
{
	private String Models;
    private int Prices;
    private String Names;
    
    public void Price(int pPrice)
    {
        Prices = pPrice;
    }
    public void drawObject()
    {
        System.out.print("   -----------------\n" +
                		 "   | _____________ |\n" +
                		 "   | _____________ |\n" +
                		 "   | _____________ |\n" +
                		 "   | _____________ |\n" +
                		 "   -----------------\n");
        System.out.print(Name());
        System.out.print(Model());
    }
    
	public String Name() {
		return "?????? " + Names + "\n";
	}
	
	public String Model() {
		if (Prices % 10 == 1)
        {
            return "?????? " + Models + ": " + Prices + " ?????";
        }
        else if (Prices % 10 <= 2 && Prices % 10 >= 4)
        {
            return "?????? " + Models + ": " + Prices + " ?????";
        }
        else return "?????? " + Models + ": " + Prices + " ??????";
	}
	
	public Server(String pModel, String pName)
	{
		Models = pModel;
        Names = pName;
	}
}
