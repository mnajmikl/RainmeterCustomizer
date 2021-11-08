/* 
 * @author Mohammad Najmi bin Bachok
 * @version 0.0.1
 */
 
package najmikl.rainmeter;

import java.util.ArrayList;
import java.util.Hashtable;

public abstract class Measure
{
	protected MeasureTypes m_MeasureType;
	protected int m_UpdateDivider;
	protected int m_InvertMeasure;
	protected float m_MaxValueDefault;
	protected float m_MinValue;
	protected int m_AverageSizeDefault;
	protected int m_DynamicVariablesDefault;
	protected int m_DisabledDefault;
	protected int m_PausedDefault;
	protected Action m_OnUpdateAction;
	
	protected int IfAboveValue;
	protected int IfBelowValue;
	protected int IfBelowAction;
	protected int IfEqualAction;
	
	public Measure()
	{ 
		setMeasureDefault();
	}
	
	private void setMeasureDefault()
	{
		
	}
	
	public void setMeasureType(MeasureTypes measuretype)
	{
		m_MeasureType = measuretype;
	}
	
	public MeasureTypes getMeasureType()
	{
		return m_MeasureType;
	}
	
	/*
	 * 
	 */
	public abstract void setIfAction(Action action, int ifvalue);
	public abstract void setIfConditions(ArrayList<Action> actions, int IfConditionMode);
	public abstract void IfMatchActions(ArrayList<Action> actions, int IfMatchMode);
	public abstract void Substitute(ArrayList<String> originals, ArrayList<String> substitutes, int RegExpSubstitute);
	public abstract void Substitute(Hashtable<String,String> originals, Hashtable<String,String> substitutes, int RegExpSubstitute);
	
}