public class GUIReceipt
{
  private JFrame jf = new JFrame();
  private JTable jt = new JTabel();
  private Receipt rt = new Receipt();
  
  public GUIReceipt()
  {
  	
  }
  
  //Make the GUI for receipt.
  public void makeGUI()
  {		
  		String[] columName = { "ID", "Item", "Quantity", "Price" };
  		String[] dataLine = new String[]();
  		Object[][] data = new Object[][];
  		storList.addAll(stored.getList());
  		for(Goods st : rt.getReceipt()) //Adds text to StringArray
  		{
  			dataLine.removeAll();
  			dataLine.add(st.getID().toString());
  			dataLine.add(st.getName);
  			dataLine.add(st.getQuantity().toString());
  			dataLine.add((st.getQuantity()+st.getPrice()).toString());
  			data.add(dataLine);
  		}
  		jt.add(data);
  		jf.add(jt);
		jf.setVisible(true);
		jf.setSize(500, 500);
		jf.setResizable(false);    
 }
    
}
