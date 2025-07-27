import javax.swing.*;
class ramp{
    public static void main(String[]args){
        JFrame frame=new JFrame("Main Frame");
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        JLabel l1=new JLabel("click the button");
        l1.setBounds(120,80,100,20);
        frame.add(l1);
        // JButton b1=new JButton("click-me");
        // b1.setBounds(120,100,100,50);
        // frame.add(b1);
        // JTextField t1=new JTextField("click");
        // t1.setBounds(100, 100, 100, 30);
        // frame.add(t1);
        // JPasswordField p1=new JPasswordField("password");
        // p1.setBounds(100, 150, 100, 30);
        // frame.add(p1);
        //TextArea

        // Tables.....,.,w.
        // String columns[]={"ID","Name","Salary"};
        // String data[][]={{"101","sumanth","50000"},
        //                  {"102","rakesh","30000"},
        //                  {"103","vineetha","40000"}};
        // JTable t=new JTable(data,columns);
        // t.setBounds(30, 50, 200, 60);
        // frame.add(t);

        // combox radio checkbox
        JCheckBox c1=new JCheckBox("c++");
        c1.setBounds(50,60,60,30);
        frame.add(c1);
        JCheckBox c2=new JCheckBox("python");
        c2.setBounds(50,90,100,30);
        frame.add(c2);
        String d[]={"c++","python","javascript"};
        JComboBox comboBox1=new JComboBox(d);
        comboBox1.setBounds(50,100,100,70);
        frame.add(comboBox1);





                     


    }
}