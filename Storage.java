Package Koebmand;

public class Storage
{

  String filename = "StorageData";
  ArrayList<Goods> allGoods = new ArrayList<Goods>();
  
  Storage()
  {
  	allGoods = loadStorage();
  }
  
  //Check and remove an item from the goods list, and return true if done.
  public boolean checkAndRemove(Goods g)
  {
  	boolean done = false;
  	for(Goods gn : allGoods)
  	{
  		if(gn.getID == g.getID)
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
  	return ArrayList<Good>;
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
