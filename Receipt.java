Package Koebmand;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt
{
  private int ID;
  private String date;
  private Goods newGoods;
  private boolean close; //If close is true, print bon.
  private String fileName = "Bon";
  String timeStamp = new SimpleDateFormat("HH:mm dd/MM-yyyy ").format(Calendar.getInstance().getTime());
  private Goods vare = new Goods();
  private ArrayList<Goods> receipt = new ArrayList<Goods> ();
  
  public void addGoods()
  {
  vare.addQuantity(1);
  }
  
  public void removeGoods()
  {
  vare.removeQuantity();
  }
  
  public void close()
  {
  	int totalCost = 0;
  	for(Goods g : receipt)
  	{
  		totalCost += g.getPrice();
  	}
 	System.out.println("You have to pay " + totalCost());
    System.out.println(timeStamp);
  }

  public ArrayList<Goods> getReceipt()
  {
  	return receipt;
  }
  
  public void addToReceipt(Goods g)
  {
  	receipt.add(g);
  }

  
   private ArrayList<Goods> loadStorage()
  {
    ArrayList<Goods> bonList = new ArrayList<Goods>();
		try {
			FileInputStream fileIn = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(fileIn);

			try {
				goodsList = (ArrayList<Goods>) in.readObject();
			}
			catch (Exception e) {

			}

			in.close();
			fileIn.close();
		}
		catch (IOException i) {

		}
		return bonList;
  }
  
  private void saveStorage(ArrayList<Goods> bonList)
  {
    FileOutputStream fileOut = null;
		ObjectOutputStream out = null;
		try {
			File bonFile = new File(fileName);
			bonFile.createNewFile();
			fileOut = new FileOutputStream(fileName, false);
			out = new ObjectOutputStream(fileOut);

			out.writeObject(bonList);
			out.close();
			fileOut.close();
			System.out.println("Succes");
		}
		catch (Exception e) {
			System.out.println("Failed saving bon");
		}
  }
  
}
