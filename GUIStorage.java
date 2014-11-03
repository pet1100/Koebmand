

public class GUIStorage
{
  
  private JFrame jf = new JFrame();
  private JTable jt = new JTabel();
  String[] columName = { "ID", "Item name", "Supply number" };
  private ArrayList<Storage> storList = new Arraylist<>(); 
  
  public GUIStorage
  {
  	
  }
  
  public void makeGUI()
  {		
  		storList.addAll(stored.getList());
  		for(Storage st : storlist)
  		{
  			
  		}
		jf.setVisible(true);
		jf.setSize(500, 500);
		jf.setResizable(false);    
  }
}
