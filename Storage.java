package Koebman;

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
  ArrayList<Goods> allGoods = new ArrayList<>();
  
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
  			g.addGoods(moreGoods);
  			break;
  		}
  	}
  }
  
  //Check and remove an item from the goods list, and return true if done.
  public boolean checkAndRemove(Goods g, int removeQuantity)
  {
  	boolean done = false;
  	for(Goods gn : allGoods)
  	{
  		if(gn.getID() == g.getID())
  		{
  			gn.removeGoods(1);;
  			done = true;
  			break;
  		}
  	}
  	return done;
  }
  
  
  public ArrayList<Goods> getList()
  {
  	return allGoods;
  }
  
  //Updates the ID for all goods.
  private void updateID()
  {
  	int ID = 1;
  	for(Goods g : allGoods)
  	{
  		g.setID(ID);
  		ID++;
  	}
  }
  
  //Add a new item to the store
  private void makeGoods(String Name, int Price, int quantity)
  {
  	updateID();
  	allGoods.add(new Goods((allGoods.size()+1) ,Name ,Price ,quantity));
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
