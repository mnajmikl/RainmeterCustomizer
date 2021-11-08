/* 
 * @author Mohammad Najmi bin Bachok
 * @version 0.0.1
 */
 
package najmikl.rainmeter;

public enum MeterTypes
{
	STRING("String"),
	IMAGE("Image"),
	HISTOGRAM("Histogram"),
	BAR("Bar"),
	BITMAP("Bitmap"),
	LINE("Line"),
	ROUNDLINE("Roundline"),
	ROTATOR("Rotator"),
	BUTTON("Button"),
	SHAPE("Shape"),
	NOTHING("");
	
	public final String Value;
	
	private MeterTypes(String value)
	{
		this.Value = value;
	}
}