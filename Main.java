package github.course.poll;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) 
	{
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your name"));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old");
		
		double Height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "you are " + Height + " centimeters tall");
		
		
		
		
		
	}

}
