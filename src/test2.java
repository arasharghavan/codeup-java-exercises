//import javax.swing.*;
//import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class test2 extends JFrame {
//    public class test2 {


//    public void sayHello(String name){
//        System.out.printf("hello %s",name);
//    }

//public test2(String name){
//    System.out.println(name);
//}

//    private int hour;
//    private int min;
//    private int sec;
//
//    public void time(int h, int m,int s){
//        hour = ((h >= 0 && h <= 24) ? h : 0);
//        min = ((m >= 0 && m <= 60) ? m : 0);
//        sec = ((s >= 0 && s <= 60) ? s : 0);
//    }
//
//    public String military(){
//       return String.format("%02d:%02d:%02d",hour,min,sec);
//    }
//
//    public String clock(){
//        return String.format("%02d:%02d:%02d %s",((hour > 12) ? hour - 12 : hour),min,sec,((hour > 12)? "PM" : "AM"));
//    }

//not done
//    private int hour;
//    private int min;
//    private int sec;
//
//    public test2(){
//        this(0,0,0);
//    }
//    public test2(int h){
//        this (h,0,0);
//    }
//
//    public test2(int h,int m){
//        this(h,m,0);
//    }
//
//    public test2(int h,int m,int s){
//        time(h,m,s);
//    }
//
//    public void time(int h,int m,int s){
//        setHour(h);
//        setMin(m);
//        setSec(s);
//    }


//private JLabel item1;
//
//public test2(){
//    super("the title bar");
//    setLayout(new FlowLayout());
//
//    item1 = new JLabel("hello mio");
//    item1.setToolTipText("on hover");
//    add(item1);
//}

    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField item4;

    public test2(){

        super("the title!");
        setLayout(new FlowLayout());

        item1 = new JTextField(20);
        add(item1);

        item2 = new JTextField("text here");
        add(item2);

        item3 = new JTextField("un editable",20);
        item3.setEditable(false);
        add(item3);

        item4 = new JPasswordField("your password");
        add(item4);

//        ----------------

        thehandler handler = new thehandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        item4.addActionListener(handler);

    }


    private class thehandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String a = "";
            if (event.getSource()==item1 ){
                a= String.format("filed one :%s",event.getActionCommand());
            } else if (event.getSource()==item2){
                a= String.format("filed 2 : %s",event.getActionCommand());
            } else if (event.getSource()==item3){
                a= String.format("filed3: %s",event.getActionCommand());
            }else if (event.getSource()==item4){
                a= String.format("pass : %s",event.getActionCommand());
            }

            JOptionPane.showMessageDialog(null, a);
        }
    }



















}
