/* 
 * @author Mohammad Najmi bin Bachok
 * @version 0.0.1
 */
 
package najmikl.rainmeter;

import java.util.ArrayList;

public final class StringMeter extends Meter
{
	public StringMeter()
	{
		m_MeterType = MeterTypes.STRING;
	}
	
	public MeterTypes getMeterType()
	{
		return m_MeterType;
	}

	@Override
	public void setMeasures(ArrayList<Measure> measures) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getMeasureNames() {
		// TODO Auto-generated method stub
		return null;
	}
}
