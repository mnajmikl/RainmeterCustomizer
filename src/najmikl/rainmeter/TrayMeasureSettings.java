/**
 * 
 */
package najmikl.rainmeter;

/**
 * [TrayMeasure] section in Rainmeter.ini (the application settings itself)
 * Measure for the notification area icon 
 */
public class TrayMeasureSettings 
{
	
	enum TrayMeterTypes
	{
		HISTOGRAM ("Histogram"),
		BITMAP("Bitmap");
		
		final String Value;
		
		private TrayMeterTypes(String value)
		{
			this.Value = value;
		}
	}
	
	private MeasureTypes m_MeasureType;
	private String m_MeasureParamaters;
	private TrayMeterTypes m_TrayMeter;
	private ColorRGB m_TrayColor1;
	private ColorRGB m_TrayColor2;
	private String m_TrayBitmap;
	
	/**
	 * 
	 */
	
	public TrayMeasureSettings()
	{
		setTrayMeasureSettings();
	}
	
	public TrayMeasureSettings(MeasureTypes measuretype, int traymeter, String measureparams, 
								ColorRGB traycolor1, ColorRGB traycolor2, String traybitmap)
	{
		setTrayMeasureSettings(measuretype, traymeter, measureparams, traycolor1, traycolor2, traybitmap);
	}
	
	private void setTrayMeasureSettings()
	{
		m_MeasureType = MeasureTypes.NOTHING;
		m_MeasureParamaters = "";
		m_TrayMeter = TrayMeterTypes.HISTOGRAM;
		m_TrayColor1 = new ColorRGB(0, 100, 0, false);
		m_TrayColor2 = new ColorRGB(0, 255, 0, false);
		m_TrayBitmap = "";	
	}
	
	public void setTrayMeasureSettings(MeasureTypes measuretype, int traymeter, String measureparams,
										ColorRGB traycolor1, ColorRGB traycolor2, String traybitmap)
	{
		m_MeasureType = measuretype;
		m_MeasureParamaters = measureparams;
		m_TrayMeter = TrayMeterTypes.HISTOGRAM;
		m_TrayColor1 = new ColorRGB(0, 100, 0, false);
		m_TrayColor2 = new ColorRGB(0, 255, 0, false);
		m_TrayMeter = TrayMeterTypes.HISTOGRAM;
		
		if (traymeter == 1)
			m_TrayMeter = TrayMeterTypes.BITMAP;
		if (traycolor1 != null)
			m_TrayColor1 = traycolor1;
		if (traycolor2 != null)
			m_TrayColor2 = traycolor2;
		
		m_TrayBitmap = traybitmap;	
	}
	
	public String getAllTrayMeasureSettings()
	{
		String traymeasuresettings = "";
		return traymeasuresettings;
	}

}
