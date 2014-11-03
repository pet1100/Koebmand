package Koebman;

// Imports
import java.awt.*;
import javax.swing.*;

public class SimpleTableExample
        extends 	JFrame
{
    // Instance attributes used in this example
    private	JPanel		topPanel;
    private	JTable		table;
    private	JScrollPane scrollPane;

    // Constructor of main frame
    public SimpleTableExample()
    {
        // Set the frame characteristics
        setTitle( "Simple Table Application" );
        setSize( 300, 200 );
        setBackground( Color.GRAY );

        // Create a panel to hold all other components
        topPanel = new JPanel();
        topPanel.setLayout( new BorderLayout() );
        getContentPane().add( topPanel );

        // Create columns names
        String columnNames[] = { "Peter 1", "Jannik 2", "Markus 3" };

        // Create some data
        String dataValues[][] =
                {
                        { "12", "234", "67" },
                        { "-123", "43", "853" },
                        { "93", "89.2", "109" },
                        { "279", "9033", "3092" }
                };

        // Create a new table instance
        table = new JTable( dataValues, columnNames );

        // Add the table to a scrolling pane
        scrollPane = new JScrollPane( table );
        topPanel.add( scrollPane, BorderLayout.CENTER );
    }

    // Main entry point for this example
    public static void main( String args[] )
    {
        // Create an instance of the test application
        SimpleTableExample mainFrame	= new SimpleTableExample();
        mainFrame.setVisible( true );
    }
    
}

