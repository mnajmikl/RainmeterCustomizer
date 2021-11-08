/* 
 * @author Mohammad Najmi bin Bachok
 * @version 0.0.1
 */
 
package najmikl.rainmeter;

public enum MeasureTypes
{
	/**
	 */
	CPU("CPU"),
	MediaKey("MediaKey"),
	Memory("Memory"),
	NetIn("NetIn"),
	NetOut("NetOut"),
	NetTotal("NetTotal"),
	NowPlaying("NowPlaying"),
	PhysicalMemory("PhysicalMemory"),
	SwapMemory("SwapMemory"),
	FreeDiskSpace("FreeDiskSpace"),
	Uptime("Uptime"),
	Time("Time"),
	Plugin("Plugin"),
	Process("Process"),
	RecycleManager("RecycleManager"),
	Registry("Registry"),
	Calc("Calc"),
	Script("Script"),
	String("String"),
	SysInfo("SysInfo"),
	Loop("Loop"),
	WebParser("WebParser"),
	NOTHING("");
	
	public final String Value;
	
	private MeasureTypes(String value)
	{
		this.Value = value;
	}
}