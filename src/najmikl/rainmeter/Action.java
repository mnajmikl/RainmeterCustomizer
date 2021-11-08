/**
 * 
 */
package najmikl.rainmeter;

/**
 * 
 *
 */
public class Action
{
	/**
	 * 
	 */
	private ActionTypes m_ActionType;
	private BangsList m_BangLists;
	
	public Action()
	{
		setAction();
	}
	
	public Action(ActionTypes action, BangsList bangscmds)
	{
		setAction(action, bangscmds);
	}
	
	private void setAction()
	{
		m_ActionType = ActionTypes.NOTHING;
		m_BangLists = new BangsList();
	}
	
	private void setAction(ActionTypes action, BangsList bangscmds)
	{
		m_ActionType = action;
		if(bangscmds != null)
			if(bangscmds.getBangsCmdsCount() > 0)
				m_BangLists = bangscmds;
	}
	
	public String getActionType()
	{
		return m_ActionType.Value;
	}
	
	public int getBangsCmdsCount()
	{
		if (m_BangLists != null)
		{
			if (m_BangLists.getBangsCmdsCount() > 0)
				return m_BangLists.getBangsCmdsCount();
		}
		return 0;
	}
}
