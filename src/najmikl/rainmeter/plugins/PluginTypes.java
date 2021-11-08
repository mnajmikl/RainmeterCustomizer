/* 
 * @author Mohammad Najmi bin Bachok
 * @version 0.0.1
 */
 
package najmikl.rainmeter.plugins;

public enum PluginTypes
{
	/*
	 * For now only Coretemp plugin is in use
	 */
	CORETEMP("CoreTemp"),
	PING("Ping");
	
	public final String Value;
	
	private PluginTypes(String value)
	{
		this.Value = value;
	}
}