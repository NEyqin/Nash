import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableCreatingDemo {
  public static void main(String args[]) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Object rowData[][] = { { "Shikin", 22, "IT " },
        { "Nurul", 21, "Science" } };
   
    Object columnNames[] = { "Name", "Age", "Course" };
    JTable table = new JTable(rowData, columnNames);

   
    JScrollPane scrollPane = new JScrollPane(table);
    frame.add(scrollPane, BorderLayout.CENTER);
    frame.setSize(300, 150);
    frame.setVisible(true);

  }
}



