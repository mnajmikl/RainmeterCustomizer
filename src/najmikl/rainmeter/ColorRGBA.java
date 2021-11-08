/* 
 * @author Mohammad Najmi bin Bachok
 * @version 0.0.1
 */
 
package najmikl.rainmeter;
	
/**
 * Rainmeter RGBA Color class
 */
public final class ColorRGBA extends ColorRGB
{
	private int m_Alpha;
	
	public ColorRGBA()
	{
		super(0, 0, 0, false);
		m_Alpha = 0;
	}
	
	public ColorRGBA(int red, int green, int blue, int alpha, boolean hex)
	{
		this.setColor(red, green, blue, alpha, hex);
	}
	
	private void setColor(int red, int green, int blue, int alpha, boolean hex)
	{
		m_RGBColor = new RGB(red, green, blue);
		m_Alpha = alpha;
		isHex = hex;
	}
	
	@Override
	public String getColor()
	{
		String strRGBA;
		
		if (isHex == true)
			strRGBA = String.format("%02X%02X%02X%02X", 
					m_RGBColor.Red, m_RGBColor.Green, m_RGBColor.Blue, m_Alpha);
		else
			strRGBA = String.format("%d,%d,%d,%d",
					m_RGBColor.Red, m_RGBColor.Green, m_RGBColor.Blue, m_Alpha);
		return strRGBA;
	}
}

