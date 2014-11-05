package koebmand;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;


public class GUIStorage
{
  
  private JFrame jf = new JFrame();
  private	JPanel		topPanel;
  private	JTable		table;
  private	JScrollPane scrollPane;
  private ArrayList<Goods> storList = new ArrayList<>(); 
  private Storage stored = new Storage();
  
  public GUIStorage()
  {
  	
  }
  
  //Makes the GUI for storage.
  public void makeGUI()
  {		
  		 // Set the frame characteristics
      this.setTitle( "Simple Table Application" );
      this.setSize( 300, 200 );
      this.setBackground( Color.GRAY );

      // Create a panel to hold all other components
      topPanel = new JPanel();
      topPanel.setLayout( new BorderLayout() );
      getContentPane().add( topPanel );

      // Create columns names
      String columnNames[] = { "ID", "Item", "Supply number"  };

      // Create some data
      String dataValues[][] =
              {
              };
      
      for (Goods g : storList) {
		dataValues[1][g.getID()] = "" + g.getID(); 
		dataValues[2][g.getID()] = g.getName(); 
		dataValues[3][g.getID()] = "" + g.getQuantity();
	}

      // Create a new table instance
      table = new JTable( dataValues, columnNames );

      // Add the table to a scrolling pane
      scrollPane = new JScrollPane( table );
      topPanel.add( scrollPane, BorderLayout.CENTER );
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
            	String temp;
            	Goods good;
            	temp = JOptionPane.showInputDialog("What vil you add?");
            	for (Goods g : storList) {
					if(g.getName().equalsIgnoreCase(temp))
					{
						good = g;
					}
				}
            	temp = JOptionPane.showInputDialog("How much will you add?");
            	int number = Integer.parseInt(temp);
            	store.addQuantity(good ,number);
            }
        });
        
        
         JButton removeX = new JButton("Remove x");
  	addX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String temp;
            	Goods good;
            	temp = JOptionPane.showInputDialog("What vil you add?");
            	for (Goods g : storList) {
					if(g.getName().equalsIgnoreCase(temp))
					{
						good = g;
					}
				}
            	temp = JOptionPane.showInputDialog("How much will you add?");
            	int number = Integer.parseInt(temp);
//            	store.addQuantity(good ,number);
            }
        });
        
              JButton addNew = new JButton("Add new item");
  	addX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//            	makeANew();
            }
        });
        
        jl.add(addX, BorderLayout.WEST);
        jl.add(removeX, BorderLayout.EAST);
        jl.add(addNew, BorderLayout.CENTER);
        
        return jl;
  }
  
  //Add a new item to the storage.
  private void makeANew(String name, int price, int qauantity)
  {
  	storList.add(new Goods((storList.size() + 1), name, price, quantity));
  }
}
