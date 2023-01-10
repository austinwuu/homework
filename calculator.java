import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.StringTokenizer;


class MyJFrame extends JFrame implements ActionListener{
    private JPanel contentPane;
    private JButton btn1=new JButton();
    private JButton btn2=new JButton();
    private JButton btn3=new JButton();
    private JButton btn4=new JButton();
    private JButton btn5=new JButton();
    private JButton btn6=new JButton();
    private JButton btn7=new JButton();
    private JButton btn8=new JButton();
    private JButton btn9=new JButton();
    private JButton btn0=new JButton();
    private JButton btnac=new JButton();
    private JButton btnreverse=new JButton();
    private JButton btnpercent=new JButton();
    private JButton btndivision=new JButton();
    private JButton btnmulti=new JButton();
    private JButton btnsub=new JButton();
    private JButton btnadd=new JButton();
    private JButton btnans=new JButton();
    private JButton btnspot=new JButton();
    private JLabel lab=new JLabel();
    private String ans="";
    private int log=0;

    MyJFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("計算機");
        setBounds(100,100,500,500);
        setLayout(null);

        contentPane=new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);


        btnac=new JButton("AC");
        btnac.setBounds(50,70,100,70);
        btnac.addActionListener(this);
        contentPane.add(btnac);
        btnreverse=new JButton("+/-");
        btnreverse.setBounds(150,70,100,70);
        btnreverse.addActionListener(this);
        contentPane.add(btnreverse);
        btnpercent=new JButton("%");
        btnpercent.setBounds(250,70,100,70);
        btnpercent.addActionListener(this);
        contentPane.add(btnpercent);
        btndivision=new JButton("/");
        btndivision.setBounds(350,70,100,70);
        btndivision.addActionListener(this);
        contentPane.add(btndivision);
        btnmulti=new JButton("*");
        btnmulti.setBounds(350,140,100,70);
        btnmulti.addActionListener(this);
        contentPane.add(btnmulti);
        btnsub=new JButton("-");
        btnsub.setBounds(350,210,100,70);
        btnsub.addActionListener(this);
        contentPane.add(btnsub);
        btnadd=new JButton("+");
        btnadd.setBounds(350,280,100,70);
        btnadd.addActionListener(this);
        contentPane.add(btnadd);
        btnans=new JButton("=");
        btnans.setBounds(350,350,100,70);
        btnans.addActionListener(this);
        contentPane.add(btnans);
        btnspot=new JButton(".");
        btnspot.setBounds(250,350,100,70);
        btnspot.addActionListener(this);
        contentPane.add(btnspot);

        btn7=new JButton("7");
        btn7.setBounds(50,140,100,70);
        btn7.addActionListener(this);
/*         btn1.setBorderPainted(false);
        btn1.setOpaque(true);
        btn1.setBackground(Color.LIGHT_GRAY); */
        contentPane.add(btn7);
        btn8=new JButton("8");
        btn8.setBounds(150,140,100,70);
        btn8.addActionListener(this);
        contentPane.add(btn8);
        btn9=new JButton("9");
        btn9.setBounds(250,140,100,70);
        btn9.addActionListener(this);
        contentPane.add(btn9);
        btn4=new JButton("4");
        btn4.setBounds(50,210,100,70);
        btn4.addActionListener(this);
        contentPane.add(btn4);
        btn5=new JButton("5");
        btn5.setBounds(150,210,100,70);
        btn5.addActionListener(this);
        contentPane.add(btn5);
        btn6=new JButton("6");
        btn6.setBounds(250,210,100,70);
        btn6.addActionListener(this);
        contentPane.add(btn6);
        btn1=new JButton("1");
        btn1.setBounds(50,280,100,70);
        btn1.addActionListener(this);
        contentPane.add(btn1);
        btn2=new JButton("2");
        btn2.setBounds(150,280,100,70);
        btn2.addActionListener(this);
        contentPane.add(btn2);
        btn3=new JButton("3");
        btn3.setBounds(250,280,100,70);
        btn3.addActionListener(this);
        contentPane.add(btn3);
        btn0=new JButton("0");
        btn0.setBounds(50,350,200,70);
        btn0.addActionListener(this);
        contentPane.add(btn0);

        lab=new JLabel("0");
        add(lab);
        lab.setBounds(50,10,400,50);
        lab.setBorder(BorderFactory.createLineBorder(Color.BLACK));
 



        setVisible(true);  

    }

    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==btnac){
            ans="";
        }else{
            if(e.getSource()==btn1){
                ans+="1";
            }
            if(e.getSource()==btn2){
                ans+="2";
            }
            if(e.getSource()==btn3){
                ans+="3";
            }
            if(e.getSource()==btn4){
                ans+="4";
            }
            if(e.getSource()==btn5){
                ans+="5";
            }
            if(e.getSource()==btn6){
                ans+="6";
            }
            if(e.getSource()==btn7){
                ans+="7";
            }
            if(e.getSource()==btn8){
                ans+="8";
            }
            if(e.getSource()==btn9){
                ans+="9";
            }
            if(e.getSource()==btn0){
                ans+="0";
            }
            if(e.getSource()==btnadd){
                ans+="+";
                log=1;
            }
            if(e.getSource()==btnsub){
                ans+="-";
                log=2;
            }
            if(e.getSource()==btnmulti){
                ans+="*";
                log=3;
            }
            if(e.getSource()==btndivision){
                ans+="/";
                log=4;
            }
            if(e.getSource()==btnspot){
                ans+=".";
            }
        }
        if(e.getSource()==btnans){
            StringTokenizer number=new StringTokenizer(ans, "+-*/");
            String[] Sa=new String[2];
            int i=0;
            
            while(number.hasMoreElements()){  
                Sa[i]=number.nextToken();
                i++;
            }
            Double front=Double.parseDouble(Sa[0]);
            Double back=Double.parseDouble(Sa[1]);
            Double intans=0.0;
            if(log==1){
                intans=front+back;
            }
            if(log==2){
                intans=front-back;
            }
            if(log==3){
                intans=front*back;
            }
            if(log==4){
                intans=front/back;
            }
            ans=Double.toString(intans);
        }
        if(e.getSource()==btnreverse){
            Double intans=Double.parseDouble(ans);
            intans*=-1;
            ans=Double.toString(intans);
        }
        if(e.getSource()==btnpercent){
            Double intans=Double.parseDouble(ans);
            intans=intans/100;
            ans=Double.toString(intans);
        }

/*         if(ans!=null){
            Double intans=Double.parseDouble(ans);
            if(e.getSource()==btnreverse){
                intans=intans*-1;
            }
            if(e.getSource()==btnpercent){
                intans=intans/100;
            }
            ans=Double.toString(intans);
        } */

        
        lab.setText(ans);
    }


    /* 圓角邊框public class RoundBorder implements Border {
        private Color color;
    
        public RoundBorder(Color color) {// 有參數的構造方法
            this.color = color;
        }
    
        public RoundBorder() {// 無參構造方法
            this.color = Color.BLACK;
            // 如果實例化時，沒有傳值
            // 默認是黑色邊框
        }
    
        public Insets getBorderInsets(Component c) {
            return new Insets(0, 0, 0, 0);
        }
    
        public boolean isBorderOpaque() {
            return false;
        }
    
        // 實現Border（父類）方法
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width,
                int height) {
            g.setColor(color);
            g.drawRoundRect(0, 0, c.getWidth() - 1, c.getHeight() - 1, 15, 15);
        }
    } */


    

}

public class calculator {
    public static void main(String[] args) throws Exception{
        MyJFrame f1=new MyJFrame();
    }
}