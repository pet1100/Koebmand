

public class GUIStorage
{
  
  private JFrame jf = new JFrame();
  private Storage stored = new Storage();
  private ArrayList<Storage> storList = new Arraylist<>(); 
  
  public GUIStorage
  {
  	
  }
  
  public void makeGUI()
  {		
  		storList.addAll(stored.getList());
		jf.setVisible(true);
		jf.setSize(500, 500);
		jf.setResizable(false);    
  }
}
