/* 
 * @author Mohammad Najmi bin Bachok
 * @version 0.0.1
 */

package najmikl.customizer;

import javax.swing.*;

@SuppressWarnings("serial")
public class CustomizerFrame extends JFrame
{
	/**
	 * 
	 */
	private JTextArea Text1;
	private JScrollPane Text1Scroll;
	
	public CustomizerFrame()
	{
		InitComponent();
	}
	
	private void InitComponent()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(640,480);
		
		Text1 = new JTextArea();
		this.getContentPane().add(Text1);
		
		Text1Scroll = new JScrollPane (Text1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		this.add(Text1Scroll);
		
		this.setVisible(true);
		this.setTitle("Your Generated Rainmeter CoreTemp Plugin");
		
		Text1.setText("Text here");
	}
	
	public void setSettingsText(String pluginText)
	{
		if (this.Text1 != null)
			this.Text1.setText(pluginText);
	}
	
	public void clearSettingsText()
	{
		if (this.Text1 != null)
			this.Text1.setText("");
	}
}