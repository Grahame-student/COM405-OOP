package com.gui;

import javax.swing.*;
import java.awt.*;

public class FrmMain extends JFrame
{
    private GridBagConstraints constraints;
    private JLabel lblTitle;
    private JLabel lblStudentName;
    private JLabel lblStudentId;
    private JTextField txtStudentName;
    private JTextField txtStudentId;
    private JButton btnAdd;
    private JButton btnRemove;

    public FrmMain()
    {
        constraints = new GridBagConstraints();

        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
        layoutComponents();
    }

    private void initComponents()
    {
        lblTitle = new JLabel("Room Management System");
        lblStudentName = new JLabel("Student Name");
        lblStudentId = new JLabel("Student ID");

        txtStudentName = new JTextField();
        txtStudentId = new JTextField();

        btnAdd = new JButton("Add");
        btnRemove = new JButton("Remove");
    }

    private void layoutComponents()
    {
        addComponent(lblTitle, 0, 0, 2, GridBagConstraints.HORIZONTAL);
        addComponent(lblStudentId, 0, 1, 1, GridBagConstraints.HORIZONTAL);
        addComponent(lblStudentName, 0, 2, 1, GridBagConstraints.HORIZONTAL);

        addComponent(txtStudentId, 1, 1, 1, GridBagConstraints.HORIZONTAL);
        addComponent(txtStudentName, 1, 2, 1, GridBagConstraints.HORIZONTAL);

        addComponent(btnAdd, 0, 3, 1, GridBagConstraints.HORIZONTAL);
        addComponent(btnRemove, 1, 3, 1, GridBagConstraints.HORIZONTAL);
    }

    private void addComponent(JComponent pComponent, int pX, int pY, int pWidth, int pConstraint)
    {
        constraints.gridx = pX;
        constraints.gridy = pY;
        constraints.gridwidth = pWidth;
        constraints.fill = pConstraint;

        this.add(pComponent, constraints);
    }
}
