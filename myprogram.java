import javax.swing.JFrame;
import javax.swing.JButton;

class myprogram{
    public static void main(String[] args){
        //Setting up the JFrame
        JFrame ApplicationWindow = new JFrame("Florida File Manager");
        //ApplicationWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ApplicationWindow.setSize(1280, 720);
        ApplicationWindow.setResizable(false);
        ApplicationWindow.setLayout(null);
        ApplicationWindow.setVisible(true);

        JButton booty = new JButton("AHHHH");
        //booty.setLocation(30, 30);
        //booty.setSize(400,400);
        booty.setBounds(100, 100, 100, 50);

        ApplicationWindow.add(booty);
    }
}