/**
 * 
 */
package najmikl.rainmeter;

import java.util.ArrayList;

public class BangsList
{
	private ArrayList<Bangs> m_BangCommands;
	/**
	 * 
	 */
	public BangsList()
	{
		m_BangCommands = new ArrayList<Bangs>(1);
	}
	
	public BangsList(int noOfBangs)
	{
		m_BangCommands = new ArrayList<Bangs>(noOfBangs);
	}

	public void setBangsCommands(ArrayList<Bangs> bangscmds)
	{
		if ((bangscmds != null))
		{
			m_BangCommands.clear();
			m_BangCommands.addAll(bangscmds);
			m_BangCommands.trimToSize();
		}
	}
	
	public int getBangsCmdsCount()
	{
		if ((m_BangCommands != null))
			if (m_BangCommands.size() > 0)
				return m_BangCommands.size();
		return 0;
	}
}
