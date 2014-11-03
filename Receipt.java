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
    System.out.println(timeStamp);
  }
  
   private ArrayList<Goods> loadStorage()
  {
    ArrayList<Goods> bonList = new ArrayList<Goods>();
		try {
			FileInputStream fileIn = new FileInputStream(filename);
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
			File bonFile = new File(filename);
			bonFile.createNewFile();
			fileOut = new FileOutputStream(filename, false);
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
