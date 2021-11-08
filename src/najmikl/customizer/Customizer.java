/* 
 * @author Mohammad Najmi bin Bachok
 * @version 0.0.1
 */
 
package najmikl.customizer;

import java.util.ArrayList;

import najmikl.rainmeter.*;
import najmikl.rainmeter.plugins.coretemp.*;

public final class Customizer
{
	public static void main(String args[])
	{	
		String settingsText = "";
		
		CustomizerFrame MainFrame = new CustomizerFrame();
		MainFrame.setTitle("Rainmeter CoreTemp Plugin Generator version 1.0");
		
		//ColorRGBA c1 = new ColorRGBA(0, 222, 255, 80, true);
		//ColorRGB c2 = new ColorRGB(0, 222, 255, false);
		
		RainmeterGlobalSettings globalsettings = new RainmeterGlobalSettings();
		globalsettings.setGlobalSettings("..","notepad++.exe", 0, 0, 0, 0, 0, 0, 0, 2, new ColorRGBA(255,255,0,40, true));

		for (CoreTempCPUValues ctcpuval : CoreTempCPUValues.values())
			settingsText += String.format("%s%n", ctcpuval.Value);
		
		//settingsText += String.format("%s%n%s",c1.getColor(), c2.getColor());
		settingsText += globalsettings.getAllGlobalSettings();
		
		ArrayList<String> cmds = new ArrayList<String>(1);
		cmds.add("GroupA");
		cmds.add("GroupB");
		cmds.add("GroupC");
		cmds.add("GroupD");
		
		Group group1 = new Group(cmds);
		cmds.remove(0);
		MeterStyle meterstyle1 = new MeterStyle(cmds);
		
		settingsText += group1.getGroupName();
		settingsText += "\n" + meterstyle1.getMeterStyles();
		
		MainFrame.setSettingsText(settingsText);
		
		Comment comment1 = new Comment("Test comment\n\tTest\n");
		System.out.println(comment1.getComment());
	}
}