package VerticalMenuBar;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.KeyEvent;


import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class VerticalMenuBarDemo {

  public static void main(final String args[]) {
	  JFrame frame = new JFrame("MenuBar Demo");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JMenuBar menuBar = new JMenuBar();
      menuBar.setLayout(new GridLayout(0,1));
      JMenu fileMenu = new JMenu("File");
      fileMenu.setMnemonic(KeyEvent.VK_F);
      menuBar.add(fileMenu);
      JMenuItem menuItem1 = new JMenuItem("New", KeyEvent.VK_N);
      fileMenu.add(menuItem1);
      JMenuItem menuItem2 = new JMenuItem("Open File", KeyEvent.VK_O);
      fileMenu.add(menuItem2);
      JMenu editMenu = new JMenu("Edit");
      editMenu.setMnemonic(KeyEvent.VK_E);
      menuBar.add(editMenu);
      JMenuItem menuItem3 = new JMenuItem("Cut", KeyEvent.VK_C);
      editMenu.add(menuItem3);
      JMenu sourceMenu = new JMenu("Source");
      sourceMenu.setMnemonic(KeyEvent.VK_S);
      menuBar.add(sourceMenu);
      JMenu refactorMenu = new JMenu("Refactor");
      refactorMenu.setMnemonic(KeyEvent.VK_R);
      menuBar.add(refactorMenu);
      JMenu navigateMenu = new JMenu("Navigate");
      navigateMenu.setMnemonic(KeyEvent.VK_A);
      menuBar.add(navigateMenu);
      menuBar.revalidate();
      frame.setJMenuBar(menuBar);
      frame.setSize(550, 350);
      frame.setVisible(true);
  }
}