import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;

class cityJFrame extends JFrame implements ListSelectionListener{
    private JLabel findMt;
    private JList<String> lst;
    private JPanel cityPane;
    private JTextArea txtShow;
    private JScrollPane jsp;
    private JScrollPane jsp2;
    private JScrollPane scrollPane;
    private String[] city = {"台北", "宜蘭", "桃園", "台中", "南投"};
    private String s="";
    cityJFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("找各地名山");
        setBounds(0,0, 800, 600);
        setLayout(null);

        findMt = new JLabel("找各地名山:");
        findMt.setBounds(50, 10, 30, 30);
        //add(findMt);
        

        //list
        lst = new JList(city);
        lst.setVisibleRowCount(4);
        lst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add( new JScrollPane( lst ) );
        jsp=new JScrollPane(lst,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp.setBounds(60,10,30,30);
        //add(jsp);
        cityPane = new JPanel();
        add(cityPane);

        cityPane.setBounds(0, 100, 150, 150);
        cityPane.add(findMt);
        cityPane.add(jsp);
        
        lst.addListSelectionListener(this); //事件傾聽

        //textArea
        String str = "可選取地名...";
        txtShow = new JTextArea(str);
        txtShow.setLineWrap(true); //文字自動換行
        jsp2 = new JScrollPane(txtShow, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp2.setBounds(30, 300, 200, 100);
        add(jsp2);

        setVisible(true);
    }

    @Override
    public void valueChanged(ListSelectionEvent e){    
            if(lst.getSelectedValuesList().contains("台北")){
                s=s+"名山 : 台北山\n";
            }
            if(lst.getSelectedValuesList().contains("宜蘭")){
                s=s+"名山 : 宜蘭山\n";
            }
            if(lst.getSelectedValuesList().contains("桃園")){
                s=s+"名山 : 桃園山\n";
            }
            if(lst.getSelectedValuesList().contains("台中")){
                s=s+"名山 : 台中山\n";
            }
            if(lst.getSelectedValuesList().contains("南投")){
                s=s+"名山 : 南投山\n";
            }
            txtShow.setText(s);
            s="";
    }
}

public class Week8_homework_mountain{
    public static void main(String[] args) {
        cityJFrame cj = new cityJFrame();
    }
}

