import javax.swing.*;
import java.awt.event.*;

public class MyBlog implements ActionListener {
	protected JButton btnLogin;

	public MyBlog(){
	}

	// this is to implement interface ActionListener
	public void actionPerformed(ActionEvent event){
		System.out.println(event.getSource());
		System.out.println(event.getActionCommand());
	}

	public void init(){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// username and password
		JTextField txtUsername = new JTextField();
		JPasswordField txtPassword = new JPasswordField();
		txtUsername.setBounds(0,0, 100,20);
		txtPassword.setBounds(0, 30, 100,20);

		frame.add(txtUsername);
		frame.add(txtPassword);
		
		// button
		this.btnLogin = new JButton("Login");
		btnLogin.setBounds(0, 60, 100,20);
		frame.add(this.btnLogin);

		// button event
		btnLogin.addActionListener(this);

		// display window
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args){
		new MyBlog().init();
	}
}
