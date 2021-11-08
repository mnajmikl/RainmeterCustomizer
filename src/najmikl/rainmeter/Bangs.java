/**
 * 
 */
package najmikl.rainmeter;

import java.util.ArrayList;

/**
 * Abstract class for Bangs
 * Bangs are for Meter, Measure, Skin, Variable and Options, and their groups
 */
public abstract class Bangs
{
	protected BangsCmds m_BangsCmd;
	protected ArrayList<String> m_Parameters;

	public Bangs()
	{
		m_BangsCmd = BangsCmds.NOTHING;
		m_Parameters = new ArrayList<String>(1);
		m_Parameters.add(0, "");
	}
	public Bangs(BangsCmds bangscommand)
	{
		m_BangsCmd = bangscommand;
	}
	
	public abstract void setBangsCmd(BangsCmds cmd);
	public abstract String getBangsCmds();
	public abstract void setBangsParameters(ArrayList<String> parameters);
	public abstract String getBangsParameters();
}
