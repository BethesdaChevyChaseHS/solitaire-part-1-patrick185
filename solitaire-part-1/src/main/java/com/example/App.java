package com.example;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) { 
      //add your code here!
      JFrame frame = new JFrame();
      frame.setLayout(new BorderLayout());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(800, 600);
      
      // Top Panel (NORTH) with game title
      JPanel topPanel = new JPanel();
      JLabel titleLabel = new JLabel("Solitaire");  // Replace "Your Name" with your actual name
      topPanel.add(titleLabel);
      frame.add(topPanel, BorderLayout.NORTH);
      
      // Left Panel (WEST) for "Pile" area
      JPanel leftPanel = new JPanel();
      leftPanel.setBorder(BorderFactory.createTitledBorder("Pile"));
      frame.add(leftPanel, BorderLayout.WEST);
      
      // Main Play Area (CENTER) with seven stacks
      JPanel playArea = new JPanel(new GridLayout(1, 7));
      for (int i = 1; i <= 7; i++) {
          JPanel stack = new JPanel();
          stack.setBorder(BorderFactory.createTitledBorder("Stack " + i));
          playArea.add(stack);
      }
      frame.add(playArea, BorderLayout.CENTER);
      
      // Bottom Panel (SOUTH) for additional info or text
      JPanel bottomPanel = new JPanel();
      JLabel infoLabel = new JLabel("Additional Information");
      bottomPanel.add(infoLabel);
      frame.add(bottomPanel, BorderLayout.SOUTH);
      
      // Make frame visible
      frame.setVisible(true);


      
    }
}