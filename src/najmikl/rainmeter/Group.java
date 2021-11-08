/**
 * 
 */
package najmikl.rainmeter;

import java.util.ArrayList;

/**
 *
 */
public final class Group
{
	protected ArrayList<String> m_GroupNames;
	
	public Group()
	{
		setGroupName();
	}
	
	public Group(ArrayList<String> groupnames)
	{
		setGroupName(groupnames);
	}
	
	private void setGroupName()
	{
		m_GroupNames = new ArrayList<String>(1);
	}
	
	public void setGroupName(ArrayList<String> groupnames)
	{
		m_GroupNames = new ArrayList<String>(1);
		m_GroupNames.add(0, "");
		if (groupnames != null)
		{
			if ((groupnames.size() > 0) && (!groupnames.isEmpty()))
			m_GroupNames.clear();
			m_GroupNames.addAll(groupnames);
			m_GroupNames.trimToSize();
		}
	}
	
	public String getGroupName()
	{
		String groupnames = "";
		if (!m_GroupNames.isEmpty())
		{
			if (m_GroupNames.size() == 1)
				groupnames += m_GroupNames.get(0);
			if (m_GroupNames.size() > 1)
			{
				groupnames = m_GroupNames.get(0) + " | ";
				for (int i = 1; i < (m_GroupNames.size() - 1) ; i++)
					groupnames += m_GroupNames.get(i) + " | ";
				groupnames += m_GroupNames.get(m_GroupNames.size() - 1);
			}
		}
		return groupnames;
	}
}
