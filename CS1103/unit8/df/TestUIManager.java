package unit8;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;
import java.util.Vector;

public class TestUIManager extends JFrame implements ActionListener{
	
	public static void main(String args[]) {
		TestUIManager frame = new TestUIManager();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 450, 300);
	    frame.setTitle("Tile");
	    frame.setVisible(true);
	}
	
	TestUIManager(){
		JButton btn1 = new JButton("Metal");
	    JButton btn2 = new JButton("CDE/Motif");
	    
	    btn1.addActionListener(this);
	    btn1.setActionCommand("javax.swing.plaf.metal.MetalLookAndFeel");
	    btn2.addActionListener(this);
	    btn2.setActionCommand("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

	    JPanel buttonPanel = new JPanel();
	    buttonPanel.add(btn1);
	    buttonPanel.add(btn2);
	    
	    String[] listData = {"Blue", "Green", "Red", "Whit", "Black", "Yellow"};
	    JList list = new JList(listData);
	    JScrollPane scrollPane1 = new JScrollPane();
	    scrollPane1.getViewport().setView(list);
	    scrollPane1.setPreferredSize(new Dimension(200, 80));
	    
	    JPanel listPanel = new JPanel();
	    listPanel.add(scrollPane1);

	    JCheckBox checkBox1 = new JCheckBox("JCheckBox1");
	    JCheckBox checkBox2 = new JCheckBox("JCheckBox2", true);
	    
	    JPanel checkPanel = new JPanel();
	    checkPanel.add(checkBox1);
	    checkPanel.add(checkBox2);
	    
	    Vector<String> vector = new Vector<String>();
	    for (int i = 0 ; i < 10 ; i++){
	      StringBuffer sb = new StringBuffer();
	      sb.append("JTree Node");
	      sb.append(i);
	      vector.add(new String(sb));
	    }

	    JTree tree = new JTree(vector);
	    tree.setRootVisible(true);
	    JScrollPane scrollPane2 = new JScrollPane();
	    scrollPane2.getViewport().setView(tree);
	    scrollPane2.setPreferredSize(new Dimension(200, 80));

	    JPanel treePanel = new JPanel();
	    treePanel.add(scrollPane2);

	    JPanel p = new JPanel();
	    p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
	    p.add(listPanel);
	    p.add(checkPanel);
	    p.add(treePanel);

	    getContentPane().add(p, BorderLayout.CENTER);
	    getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String lafClassName = e.getActionCommand();
		
		try {
			 UIManager.setLookAndFeel(lafClassName);
		     SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception ex) {
			System.out.println("Look and Feel setting ERROR");
		}
	}
}
