

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
  		String[] columName = { "ID", "Item", "Supply number" };
  		String[] dataLine = new String[]();
  		Object[][] data = new Object[][];
  		storList.addAll(stored.getList());
  		for(Storage st : storlist)
  		{
  			dataLine.removeAll();
  			dataLine.add(st.getID().toString());
  			dataLine.add(st.getName);
  			dataLine.add(st.getQuantity().toString());
  			data.add(dataLine);
  		}
  		tf.add(data);
  		jf.add(tf);
		jf.setVisible(true);
		jf.setSize(500, 500);
		jf.setResizable(false);    
  }
}
