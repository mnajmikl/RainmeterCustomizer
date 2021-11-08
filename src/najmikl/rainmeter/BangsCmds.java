/**
 * 
 */
package najmikl.rainmeter;

/**
 * 
 *
 */
public enum BangsCmds
{
	Refresh("!Refresh", 0),
	Redraw("!Redraw", 0),
	Update("!Update", 0),
	Hide("!Hide", 0),
	Show("!Show", 0),
	Toggle("!Toggle", 0),
	HideFade("!HideFade", 0),
	ShowFade("!ShowFade", 0),
	ToggleFade("!ToggleFade", 0),
	FadeDuration("!FadeDuration", 0),
	HideMeter("!HideMeter", 0),
	ShowMeter("!ShowMeter", 0),
	ToggleMeter("!ToggleMeter", 0),
	MoveMeter("!MoveMeter", 0),
	UpdateMeter("!UpdateMeter", 0),
	DisableMouseAction("!DisableMouseAction", 0),
	ClearMouseAction("!ClearMouseAction", 0),
	EnableMouseAction("!EnableMouseAction", 0),
	ToggleMouseAction("!ToggleMouseAction", 0),
	DisableMeasure("!DisableMeasure", 0),
	EnableMeasure("!EnableMeasure", 0),
	ToggleMeasure("!ToggleMeasure", 0),
	PauseMeasure("!PauseMeasure", 0),
	UnpauseMeasure("!UnpauseMeasure", 0),
	TogglePauseMeasure("!TogglePauseMeasure", 0),
	UpdateMeasure("!UpdateMeasure", 0),
	CommandMeasure("!CommandMeasure", 0),
	PluginBang("!PluginBang", 0),
	ShowBlur("!ShowBlur", 0),
	HideBlur("!HideBlur", 0),
	ToggleBlur("!ToggleBlur", 0),
	AddBlur("!AddBlur", 0),
	RemoveBlur("!RemoveBlur", 0),
	Move("!Move", 0),
	SetAnchor("!SetAnchor", 0),
	ZPos("!ZPos", 0),
	ChangeZPos("!ChangeZPos", 0),
	ClickThrough("!ClickThrough", 0),
	Draggable("!Draggable", 0),
	SnapEdges("!SnapEdges", 0),
	KeepOnScreen("!KeepOnScreen", 0),
	AutoSelectScreen("!AutoSelectScreen", 0),
	SetTransparency("!SetTransparency", 0),
	SetVariable("!SetVariable", 0),
	SetOption("!SetOption", 0),
	SkinCustomMenu("!SkinCustomMenu", 0),
	ActivateConfig("!ActivateConfig", 0),
	DeactivateConfig("!DeactivateConfig", 0),
	ToggleConfig("!ToggleConfig", 0),
	WriteKeyValue("!WriteKeyValue", 0),
	LoadLayout("!LoadLayout", 0),
	SetClip("!SetClip", 0),
	SetWallpaper("!SetWallpaper", 0),
	About("!About", 0),
	Manage("!Manage", 0),
	SkinMenu("!SkinMenu", 0),
	TrayMenu("!TrayMenu", 0),
	ResetStats("!ResetStats", 0),
	Log("!Log", 0),
	RefreshApp("!RefreshApp", 0),
	Quit("!Quit", 0),
	EditSkin("!EditSkin", 0),
	LsBoxHook("!LsBoxHook", 0),
	SetWindowPosition("!SetWindowPosition", 0),
	PlayLoop("PlayLoop", 0),
	PlayStop("PlayStop", 0),
	NOTHING("", 0);
	
	public final String Value;
	public final int ArgsCount;
	
	private BangsCmds(String value, int argscount)
	{
		this.Value = value;
		ArgsCount = argscount;
	}
}
