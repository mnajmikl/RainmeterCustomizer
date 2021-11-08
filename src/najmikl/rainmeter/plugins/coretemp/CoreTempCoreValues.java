/* 
 * @author Mohammad Najmi bin Bachok
 * @version 0.0.1
 */
 
package najmikl.rainmeter.plugins.coretemp;

public enum CoreTempCoreValues
{
	CORE_BUS_MULTIPLIER("CoreBusMultiplier"),
	CORE_SPEED("CoreSpeed"),
	LOAD("Load"),
	TEMPERATURE("Temperature"),
	TJ_MAX("TjMax");
	
	public final String Value;
	
	private CoreTempCoreValues(String value)
	{
		this.Value = value;
	}
}
