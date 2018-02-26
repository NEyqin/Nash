import javax.swing.*;    
public class StudentTable {    
    JFrame f;    
    StudentTable(){    
    f=new JFrame();    
    String data[][]={ {"Abu","Sun","60%"},    
                          {"Ali","Moon","78%"},    
                          {"Ahmad","Rainbow","70%"}};    
    String column[]={"StuName","Class","Marks"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
}     
public static void main(String[] args) {    
    new StudentTable();    
}    
}