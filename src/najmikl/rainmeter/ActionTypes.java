/**
 * 
 */
package najmikl.rainmeter;

/**
 * 
 */
public enum ActionTypes
{
	/**
	 * Action options enumerations
	 * Usage: 
	 * On any Meter
	 * [Rainmeter] section of a skin
	 */
	LeftMouseDownAction("LeftMouseDownAction"),
	RightMouseDownAction("RightMouseDownAction"),
	MiddleMouseDownAction("MiddleMouseDownAction"),
	
	LeftMouseUpAction("LeftMouseUpAction"),
	RightMouseUpAction("RightMouseUpAction"),
	MiddleMouseUpAction("MiddleMouseUpAction"),
	
	LeftMouseDoubleClickAction("LeftMouseDoubleClickAction"),
	RightMouseDoubleClickAction("RightMouseDoubleClickAction"),
	MiddleMouseDoubleClickAction("MiddleMouseDoubleClickAction"),

	MouseOverAction("MouseOverAction"),
	MouseLeaveAction("MouseLeaveAction"),

	MouseScrollDownAction("MouseScrollDownAction"),
	MouseScrollUpAction("MouseScrollUpAction"),
	MouseScrollLeftAction("MouseScrollLeftAction"),
	MouseScrollRightAction("MouseScrollRightAction"),
	
	IfAboveAction("IfAboveAction"),
	IfBelowAction("IfBelowAction"),
	IfEqualAction("IfEqualAction"),
	
	IfTrueAction("IfTrueAction"),
	IfFalseAction("IfFalseAction"),
	
	IfMatchAction("IfMatchAction"),
	IfNotMatchAction("IfNotMatchAction"),
	
	NOTHING("");
	
	/**
	 * Extra buttons actions for mouse with more than 3 button (LMR) input
	 */
	//X1MouseDownAction
	//X2MouseDownAction,
	//X1MouseUpAction,
	//X2MouseUpAction,
	//X1MouseDoubleClickAction,
	//X2MouseDoubleClickAction,
	
	public final String Value;
	
	private ActionTypes(String value) {
		this.Value = value;
	}

}
