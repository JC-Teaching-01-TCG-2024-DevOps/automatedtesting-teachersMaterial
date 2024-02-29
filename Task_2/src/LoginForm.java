import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;  

public class LoginForm extends JFrame implements ActionListener  
{  
    JButton btnSubmit;  
    JPanel newPanel;  
    JLabel userLabel, passLabel;  
    final JTextField  tfUsername, tfPassword;  
      
    LoginForm()  
    {     
        userLabel = new JLabel();  
        userLabel.setText("Username");
        tfUsername = new JTextField(15);
  
        passLabel = new JLabel();
        passLabel.setText("Password");
        tfPassword = new JPasswordField(15);
          
        btnSubmit = new JButton("SUBMIT");
        btnSubmit.addActionListener(this);
          
        newPanel = new JPanel(new GridLayout(3, 1,5,5));  
        newPanel.add(userLabel);
        newPanel.add(tfUsername);
        newPanel.add(passLabel);
        newPanel.add(tfPassword);
        newPanel.add(btnSubmit);
        add(newPanel, BorderLayout.CENTER);  
          
        setTitle("Login Form");
        setSize(300,100);
        setMinimumSize(new Dimension(300, 100));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }  
      
    public void actionPerformed(ActionEvent ae)
    {  
        String userValue = tfUsername.getText();
        String passValue = tfPassword.getText();
  
        if (userValue.equals("test1@gmail.com") && passValue.equals("test")) {  //if authentic, navigate user to a new page  
            System.out.println("OK");

        }  
        else{  
              System.out.println("Please enter valid username and password");  
        }  
    }  
}  

class LoginFormDemo  
{  
    public static void main(String arg[])  
    {  
        try  
        {  
            LoginForm form = new LoginForm();
            form.setVisible(true);
        }  
        catch(Exception e)  
        {     
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  
    }  
}  