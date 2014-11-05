package Koebmand;

public class GUIStorage
{
  
  private JFrame jf = new JFrame();
  private JTable jt = new JTabel();
  private ArrayList<Storage> storList = new Arraylist<>(); 
  
  public GUIStorage
  {
  	
  }
  
  //Makes the GUI for storage.
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
  		jt.add(data);
  		jf.add(jt, BorderLayout.CENTER);
  		jf.add(button(), BorderLayout.SOUTH);
		jf.setVisible(true);
		jf.setSize(500, 500);
		jf.setResizable(false);    
  }
  
  //Add buttons to add, remove and make a new item.
  private JLabel button()
  {
  	JLabel jl = new JLabel();
  	Storage store = new Storage();
  	JButton addX = new JButton("Add x");
  	addX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int number;
            	number = JOptionPane.showInputDialog("How much will you add?");
            	store.addQuantity(number);
            }
        });
        
        
         JButton removeX = new JButton("Remove x");
  	addX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int number;
            	number = JOptionPane.showInputDialog("How much will you remove?");
            	store.removeMoreQuantity(number);
            }
        });
        
              JButton addNew = new JButton("Add new item");
  	addX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	makeANew();
            }
        });
        
        jl.add(addX, BorderLayout.WEST);
        jl.add(removeX, BorderLayout.EAST);
        jl.add(addNew, BorderLayout.CENTER);
        
        return jl;
  }
  
  //Add a new item to the storage.
  private void makeANew()
  {
  	storList.add(new Goods((storList.size() + 1), name, price, quantity));
  }
}
