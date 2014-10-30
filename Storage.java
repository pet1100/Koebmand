Package Koebmand;

public class Storage
{

  String filename = "StorageData";
  ArrayList<Goods> allGoods = new ArrayList<Goods>();
  
  Storage()
  {
  	allGoods = loadStorage();
  }
  
  private ArrayList<Goods> loadStorage()
  {
    ArrayList<Goods> goodsList = new ArrayList<Goods>();
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
