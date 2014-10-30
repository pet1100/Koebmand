Package Koebmand;

public class Storage
{

  String filename = "StorageData";
  
  Storage()
  {
  }
  
  private loadStorage()
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
  
  private saveStorage()
  {
    FileOutputStream fileOut = null;
		ObjectOutputStream out = null;
		try {
			File storagefile = new File(filename);
			storagefile.createNewFile();
			fileOut = new FileOutputStream(filename, false);
			out = new ObjectOutputStream(fileOut);

			out.writeObject(movies);
			out.close();
			fileOut.close();
			System.out.println("Succes");
		}
		catch (Exception e) {
			System.out.println("Failed saving");
		}
  }

}
