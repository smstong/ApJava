import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloSwing implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("click");
	}
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("Click");
		btn.setBounds(150,200,220,50);
		btn.addActionListener(new HelloSwing());
		frame.add(btn);

		JTextField name = new JTextField();
		name.setBounds(10, 50, 200,25);
		frame.add(name);

		JPasswordField pass = new JPasswordField();
		pass.setBounds(10, 100, 200,25);
		frame.add(pass);

		frame.setSize(500,600);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}

