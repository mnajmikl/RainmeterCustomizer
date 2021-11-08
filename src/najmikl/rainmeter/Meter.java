/* 
 * @author Mohammad Najmi bin Bachok
 * @version 0.0.1
 */
 
package najmikl.rainmeter;

import java.util.ArrayList;

public abstract class Meter
{
	// protected Measures MeterMeasures[];
	protected MeterTypes m_MeterType;
	protected ArrayList<Measure> m_Measures;
	protected String m_Container;
	
	protected String ToolTipText;
	protected String ToolTipTitle;
	protected String ToolTipIcon;
	protected int ToolTipHidden;
	
	protected String ImagePath;
	protected String ImageCrop;
	protected int Greyscale;
	protected ColorRGB ImageTint;
	protected int ImageAlpha;
	protected String ImageFlipDefault;
	protected float ImageRotateDefaultWidth;
	protected float ImageRotateDefaultHeight;
	protected int UseExifOrientationDefault;
	
	/**
	 * {@summary Set hasColorMatrix to true to override ImageTint and ImageAlpha from the meter settings}
	 */
	protected boolean hasColorMatrix;
	protected int[] ColorMatrix1;
	protected int[] ColorMatrix2;
	protected int[] ColorMatrix3;
	protected int[] ColorMatrix4;
	protected int[] ColorMatrix5;
	
	public Meter()
	{
		m_MeterType = MeterTypes.NOTHING;
		m_Measures = new ArrayList<Measure>(1);
		m_Container = "";
	}
	
	public MeterTypes getMeterType()
	{
		return m_MeterType;
	}
	
	/**
	 * For now, there is only one Measure for a Meter
	 */
	public abstract void setMeasures(ArrayList<Measure> measures);
	public abstract String getMeasureNames();
}