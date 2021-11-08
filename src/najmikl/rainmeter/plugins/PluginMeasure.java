/* 
 * @author Mohammad Najmi bin Bachok
 * @version 0.0.1
 */
 
package najmikl.rainmeter.plugins;

import najmikl.rainmeter.MeasureTypes;

import java.util.ArrayList;
import java.util.Hashtable;

import najmikl.rainmeter.Action;
import najmikl.rainmeter.Measure;

public final class PluginMeasure extends Measure
{
	public PluginMeasure()
	{
		super();
	}
	
	public void setMeasureType(MeasureTypes measureType)
	{
		m_MeasureType = measureType;
	}
	
	public MeasureTypes getMeasureType()
	{
		return m_MeasureType;
	}

	@Override
	public void setIfAction(Action action, int ifvalue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setIfConditions(ArrayList<Action> actions, int IfConditionMode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void IfMatchActions(ArrayList<Action> actions, int IfMatchMode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Substitute(ArrayList<String> originals, ArrayList<String> substitutes, int RegExpSubstitute) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Substitute(Hashtable<String, String> originals, Hashtable<String, String> substitutes,
			int RegExpSubstitute) {
		// TODO Auto-generated method stub
		
	}
}