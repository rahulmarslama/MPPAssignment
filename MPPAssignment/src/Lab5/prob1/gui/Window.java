package Lab5.prob1.gui;

import javax.swing.*;

public abstract class Window extends JFrame
{
    JPanel topPanel;
    JPanel bottomPanel;
    JButton button;
    JTextField isbnField;
    JTextField titleField;
    JTextField priceField;
    static final long serialVersionUID = 1L;


    public String getTitleValue() {
        return titleField.getText();
    }
    public String getPriceValue() {
        return priceField.getText();
    }
}
