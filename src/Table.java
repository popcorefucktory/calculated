import javax.swing.*;
import java.awt.*;

/**
 * Created by right on 09.11.2016.
 */
public class Table {
    public static void main (String args[]){
        Reader re = new Reader("addbook");
        re.setVisible(true);
        re.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        re.setSize(700,600);
        re.setResizable(false);

    }
}
