/* 
 * @author Mohammad Najmi bin Bachok
 * @version 0.0.1
 */

package najmikl.rainmeter;

/**
 * Global [Rainmeter] section in Rainmeter.ini (the application settings itself)
 * @see najmikl.rainmeter.skins.RainmeterSkinSettings for skin's [Rainmeter] section
 */
public final class RainmeterGlobalSettings
{
	private String m_SkinPath;
	private String m_ConfigEditor;
	private int m_TrayIcon;
	private int m_Logging;
	private int m_Debug;
	private int m_DisableVersionCheck;
	private int m_DisableAutoUpdate;
	private int m_DisableDragging;
	private int m_DesktopWorkAreaType;
	private int m_NumberOfMonitor;
	private ColorRGB m_SelectedColor;
	
	/** 
	 * TODO: 
	 * Define an Action class separately
	 * Actions in this global settings: TrayExecuteM, TrayExecuteR, TrayExecuteDM, TrayExecuteDR
	 */
	// private Action TrayExecuteM, TrayExecuteR, TrayExecuteDM, TrayExecuteDR;
	
	
	/**
	 * Set default values to [Rainmeter] global options
	 */
	public RainmeterGlobalSettings()
	{
		setDefaultGlobalSettings();
	}
	
	class DesktopWorkArea
	{
		int monitorNumber;
		DesktopWorkArea(int numberofmonitor)
		{
			//Default number of monitor must be 1
			monitorNumber = 1;
			if (numberofmonitor > 1)
				monitorNumber = numberofmonitor;
		}
		
		String createMonitorDesktopArea()
		{
			String monitorDesktopArea = "";
			if (monitorNumber == 1)
				monitorDesktopArea = String.format("DesktopWorkArea=X,Y,W,H%n");
			if (monitorNumber > 1)
			{
				for (int i = 0; i < monitorNumber; i++)
					monitorDesktopArea += String.format("DesktopWorkArea@%d=X,Y,W,H%n", i);
			}
			return monitorDesktopArea;
		}
	}
	
	private void setDefaultGlobalSettings()
	{
		//Set skins folder path default to current directory 
		m_SkinPath = "..";
		//Set Windows notepad.exe as default text editor
		m_ConfigEditor = "notepad.exe";
		m_TrayIcon = 1;
		m_Logging = 0;
		m_Debug = 0;
		m_DisableVersionCheck = 0;
		m_DisableAutoUpdate = 0;
		m_DisableDragging = 0;
		m_DesktopWorkAreaType = 0;
		m_NumberOfMonitor = 1;
		m_SelectedColor = new ColorRGBA(255, 0, 0, 90, false);
	}
	
	public void setGlobalSettings(String skinpath, String configeditor, int trayicon, int logging, int debug,
									int disablevercheck, int disableupdate, int disabledrag, int desktoparetype,
									int noofmonitor, ColorRGB color)
	{
		//Set skins folder path default to current directory 
		m_SkinPath = skinpath;
		//Set Windows notepad.exe as default text editor
		m_ConfigEditor = configeditor;
		m_TrayIcon = trayicon;
		m_Logging = logging;
		m_Debug = debug;
		m_DisableVersionCheck = disablevercheck;
		m_DisableAutoUpdate = disableupdate;
		m_DisableDragging = disabledrag;
		m_DesktopWorkAreaType = desktoparetype;
		m_NumberOfMonitor = noofmonitor;
		if (color != null) 
			m_SelectedColor = color;
	}
	
	public String getAllGlobalSettings()
	{
		String globalsettings = String.format("[Rainmeter]%n");
		globalsettings += String.format("SkinPath=%s%n", m_SkinPath);
		globalsettings += String.format("ConfigEditor=%s%n", m_ConfigEditor);
		globalsettings += String.format("TrayIcon=%d%n",m_TrayIcon);
		globalsettings += String.format("Logging=%d%n", m_Logging);
		globalsettings += String.format("Debug=%d%n", m_Debug);
		globalsettings += String.format("DisableVersionCheck=%d%n", m_DisableVersionCheck);
		globalsettings += String.format("DisableAutoUpdate=%d%n", m_DisableAutoUpdate);
		globalsettings += String.format("DisableDragging=%d%n", m_DisableDragging);
		globalsettings += String.format("DesktopWorkAreaType=%d%n", m_DesktopWorkAreaType);
		globalsettings += new DesktopWorkArea(m_NumberOfMonitor).createMonitorDesktopArea();
		globalsettings += String.format("SelectedColor=%s%n", m_SelectedColor.getColor());
	
		return globalsettings;
	}
}
