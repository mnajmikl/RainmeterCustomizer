/* 
 * @author Mohammad Najmi bin Bachok
 * @version 0.0.1
 */
 
package najmikl.rainmeter;

public class ColorRGB
{
	protected RGB m_RGBColor;
	protected boolean isHex;

	class RGB
	{
		int Red;
		int Green;
		int Blue;
		
		RGB(int red, int green, int blue)
		{
			Red = red;
			Green = green;
			Blue = blue;
		}
	}

	public ColorRGB()
	{
		setColor(0, 0, 0, false);
	}

	public ColorRGB(int red, int green, int blue, boolean hex)
	{
		setColor(red, green, blue, hex);
	}
	
	private void setColor(int red, int green, int blue, boolean hex)
	{
		m_RGBColor = new RGB(red, green, blue);
		isHex = hex;
	}
	
	public String getColor()
	{
		String strRGB;
		
		if (isHex == true)
			strRGB = String.format("%02X%02X%02X", 
					m_RGBColor.Red, m_RGBColor.Green, m_RGBColor.Blue);
		else
			strRGB = String.format("%d,%d,%d",
					m_RGBColor.Red, m_RGBColor.Green, m_RGBColor.Blue);
		return strRGB;
	}
}