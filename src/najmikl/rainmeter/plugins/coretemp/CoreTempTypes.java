/* 
 * @author Mohammad Najmi bin Bachok
 * @version 0.0.1
 */
 
package najmikl.rainmeter.plugins.coretemp;

public enum CoreTempTypes
{
	CPU("CPU"),
	CPU_CORES("CPUCores");
	
	public final String Value;
	
	private CoreTempTypes(String value)
	{
		this.Value = value;
	}
}