/**
 * 
 */
package najmikl.rainmeter;

import java.util.ArrayList;
/**
 *
 */
public final class MeterStyle {

	/**
	 * 
	 */
	private ArrayList<String> m_MeterStyleNames;
	
	public MeterStyle()
	{
		setMeterStyles();
	}
	 
	public MeterStyle(ArrayList<String> meterstylenames)
	{
		setMeterStyles(meterstylenames);
	}
	
	private void setMeterStyles()
	{
		m_MeterStyleNames = new ArrayList<>(1);
		m_MeterStyleNames.add(0, "");
	}
	
	public void setMeterStyles(ArrayList<String> meterstylenames)
	{
		m_MeterStyleNames = new ArrayList<String>(1);
		m_MeterStyleNames.add(0, "");
		if (meterstylenames != null)
		{
			
			if ((meterstylenames.size() > 0) && (!meterstylenames.isEmpty()))
			{
				m_MeterStyleNames.clear();
				m_MeterStyleNames.addAll(meterstylenames);
				meterstylenames.trimToSize();
			}
		}
	}
	
	public String getMeterStyles()
	{
		String meterstylenames = "";
		if (!m_MeterStyleNames.isEmpty())
		{
			if (m_MeterStyleNames.size() == 1)
				meterstylenames += m_MeterStyleNames.get(0);
			if (m_MeterStyleNames.size() > 1)
			{
				meterstylenames = m_MeterStyleNames.get(0) + " | ";
				for (int i = 1; i < (m_MeterStyleNames.size() - 1) ; i++)
					meterstylenames += m_MeterStyleNames.get(i) + " | ";
				meterstylenames += m_MeterStyleNames.get(m_MeterStyleNames.size() - 1);
			}
		}
		return meterstylenames;
	}

}
