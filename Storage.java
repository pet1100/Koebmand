Package Koebmand;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Storage
{

  String filename = "StorageData";
  ArrayList<Goods> allGoods = new ArrayList<Goods>();
  
  Storage()
  {
  	allGoods = loadStorage();
  }
  
  public void addGoods(int ID, int moreGoods)
  {
  	for(Goods g : allGoods)
  	{
  		if(g.getID() == ID)
  		{
  			g.addQuantity(moreGoods);
  			break;
  		}
  	}
  }
  
  //Check and remove an item from the goods list, and return true if done.
  public boolean checkAndRemove(Goods g)
  {
  	boolean done = false;
  	for(Goods gn : allGoods)
  	{
  		if(gn.getID() == g.getID())
  		{
  			gn.remove();
  			done = true;
  			break;
  		}
  	}
  	return done;
  }
  
  
  private ArrayList<Goods> getList()
  {
  	return allGoods;
  }
  private ArrayList<Goods> loadStorage()
  {
    ArrayList<Goods> goodsList = new ArrayList<Goods>();
		try {
			FileInputStream fileIn = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(fileIn);

			try {
				goodsList = (ArrayList<Goods>) in.readObject();
				System.out.println ("Succes");
			}
			catch (Exception e) {
				System.out.println("Failed!");

			}

			in.close();
			fileIn.close();
		}
		catch (IOException i) {

		}
		return goodsList;
  }
  
  private void saveStorage(ArrayList<Goods> storageList)
  {
    FileOutputStream fileOut = null;
		ObjectOutputStream out = null;
		try {
			File storagefile = new File(filename);
			storagefile.createNewFile();
			fileOut = new FileOutputStream(filename, false);
			out = new ObjectOutputStream(fileOut);

			out.writeObject(storageList);
			out.close();
			fileOut.close();
			System.out.println("Succes");
		}
		catch (Exception e) {
			System.out.println("Failed saving");
		}
  }

}
