

public class GUIStorage
{
  
  private JFrame jf = new JFrame();
  private JTable jt = new JTabel();
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
  		jf.add(tf, BorderLayout.CENTER);
  		jf.add(button(), BorderLayout.SOUTH);
		jf.setVisible(true);
		jf.setSize(500, 500);
		jf.setResizable(false);    
  }
  
  private JLabel button()
  {
  	Storage store = new Storage();
  	JButton addX = new JButton("Add x");
  	addX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int number;
            	number = JOptionPane.showInputDialog("What is your name");
            	store.addQuantity(number);
            }
        });
        
         JButton addX = new JButton("Remove x");
  	addX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int number;
            	number = JOptionPane.showInputDialog("What is your name");
            	store.removeMoreQuantity(number);
            }
        });
        
        this.add(addX, BorderLayout.WEST);
  }
}
