/* 
 * @author Mohammad Najmi bin Bachok
 * @version 0.0.1
 */
 
package najmikl.rainmeter.plugins.coretemp;

public enum CoreTempCPUValues
{
	CPU_NAME("CpuName"),
	CPU_SPEED("CpuSpeed"),
	BUS_MULTIPLIER("BusMultiplier"),
	BUS_SPEED("BusSpeed"),
	MAX_TEMPERATURE("MaxTemperature"),
	POWER("Power"),
	TDP("Tdp"),
	VID("Vid");
	
	public final String Value;
	
	private CoreTempCPUValues(String value)
	{
		this.Value = value;
	}
}