
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class encodeMain {
	private static final JFrame frame = new JFrame();
	private static JPanel panel = new JPanel();
	private static JTextField nameField = new JTextField(20);
	private static JButton button1 = new JButton();
	private static JTextArea inputValue = new JTextArea();
	// Encode Text Areas
	private static JTextArea encodeValue = new JTextArea();
	private static JTextArea fullEncodeValue = new JTextArea();
	// Decode TextAres
	private static JTextArea decryptValue = new JTextArea();
	private static JTextArea outputValue = new JTextArea();
	
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String args[]){
		display();
    }
	
	/**
	 * Display function for setting up the button, text field and text areas.
	 */
	private static void display(){
		// Set up the panel to be used in the frame.
		frame.add(panel);
		
		// add values to panel.
		panel.add(nameField);
		panel.add(button1);
		button1.setText("Encode");
		// Set the JTextAreas
		setTextAreas();
		
		frame.setVisible(true);
		frame.setSize(600,400); 

		// If button is pressed
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buttonPressed();
        	}
		});
	}
	
	private static void buttonPressed() {
		// original value
		inputValue.setText("Original Text: " + nameField.getText()); 
		inputValue.setVisible(true);
		
		// encode
		String encodedText = encode.encodeText(nameField.getText());
		encodeValue.setText("Convert to Numbers: " + encodedText); 
		encodeValue.setVisible(true);
		encodedText = extraEncode.extraEncodeEquation(encodedText);
		fullEncodeValue.setText("Simple Multiplication: " + encodedText); 
		fullEncodeValue.setVisible(true);
		
		// decode
		String decryptedText = extraEncode.extraDecodeEquation(encodedText);
		decryptValue.setText("Simple Divide (Original Numbers): " + decryptedText); 
		decryptValue.setVisible(true);
		decryptedText = decode.decryptText(decryptedText);
		outputValue.setText("Convert Back to Text: " + decryptedText); 
		outputValue.setVisible(true);
	}
	
	/**
	 * Set up the values for the textArea's.
	 */
	private static void setTextAreas(){
		panel.add(inputValue);
		// setBounds isn't really the best choice for this, but it works for the option of a quick UI. 
		inputValue.setBounds(0, 0, 500, 5);
		inputValue.setVisible(false);
		inputValue.setEditable(false);
		inputValue.setLineWrap(true);
		
		panel.add(encodeValue);
		encodeValue.setBounds(0, 0, 500, 5);
		encodeValue.setVisible(false);
		encodeValue.setEditable(false);
		encodeValue.setLineWrap(true);
		
		panel.add(fullEncodeValue);
		fullEncodeValue.setBounds(0, 0, 500, 5);
		fullEncodeValue.setVisible(false);
		fullEncodeValue.setEditable(false);
		fullEncodeValue.setLineWrap(true);
		
		panel.add(decryptValue);
		decryptValue.setBounds(0, 0, 500, 5);
		decryptValue.setVisible(false);
		decryptValue.setEditable(false);
		decryptValue.setLineWrap(true);
		
		panel.add(outputValue);
		// setBounds isn't really the best choice for this, but it works for the option of a quick UI. 
		outputValue.setBounds(0, 0, 500, 5);
		outputValue.setVisible(false);
		outputValue.setEditable(false);
		outputValue.setLineWrap(true);
		
	}
	
}
