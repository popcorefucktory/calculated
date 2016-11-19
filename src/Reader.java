import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.util.Scanner;

public class Reader extends JFrame {
    JButton but1, but2;
    JLabel l1, l2, l3, l4, l5;
    JTextField text1, text2, text3;
    Scanner sc = new Scanner(System.in);
    String sc1, sc2;
    int i, k;
    String a, b;
    eHandler handler = new eHandler();

    public Reader(String s) {
        super(s);
        setLayout(new FlowLayout());
        but1 = new JButton("Добавить название");
        but2 = new JButton("Удалить");
        l1 = new JLabel("Введи название книги");
        l2 = new JLabel("Введи автора");
        l3 = new JLabel("Добавь описание");
        l4 = new JLabel("");
        l5 = new JLabel("");
        text1 = new JTextField(10);
        text2 = new JTextField(10);
        text3 = new JTextField(20);
        add(but1);
        add(but2);
        add(l1);
        add(text1);
        add(l2);
        add(text2);
        add(l3);
        add(text3);
        add(l4);
        add(l5);
        but2.addActionListener(handler);
        but1.addActionListener(handler);

    }

    public class eHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == but1) {
                //i = Integer.parseInt(text1.getText());
                //k = Integer.parseInt(text2.getToolTipText());
                //i++;
                //k++;
                sc1 = sc.next();

                System.out.print(a = "Ваша книга называется " + sc1);
                b = "Её написал" + k;
                text1.setText(null);
                text2.setText(null);
                text3.setText(null);
                l4.setText(a);
                l5.setText(b);

            }

            if (e.getSource() == but2) {
                text1.setText(null);
                text2.setText(null);
                text3.setText(null);
                l4.setText(null);
                l5.setText(null);
            }
        }
    }
}
