package najmikl.rainmeter;

public enum BangGroupCmds
{
	RefreshGroup("RefreshGroup", 1),
	UpdateGroup("UpdateGroup", 1),
	RedrawGroup("RedrawGroup", 1),
	HideGroup("HideGroup", 1),
	ShowGroup("ShowGroup", 1),
	ToggleGroup("ToggleGroup", 1),
	HideFadeGroup("HideFadeGroup", 1),
	ShowFade("ShowFadeGroup", 1),
	ShowFadeGroup("ToggleFadeGroup", 1),
	ZPosGroup("ZPosGroup", 1),
	ClickThroughGroup("ClickThroughGroup", 1),
	DraggableGroup("DraggableGroup", 1),
	SnapEdgesGroup("SnapEdgesGroup", 1),
	FadeDurationGroup("FadeDurationGroup", 1),
	KeepOnScreenGroup("KeepOnScreenGroup", 1),
	AutoSelectScreenGroup("AutoSelectScreenGroup", 1),
	SetTransparencyGroup("SetTransparencyGroup", 1),
	SetVariableGroup("SetVariableGroup", 1),
	DisableMouseActionSkinGroup("DisableMouseActionSkinGroup", 1),
	ClearMouseActionSkinGroup("ClearMouseActionSkinGroup", 1),
	EnableMouseActionSkinGroup("EnableMouseActionSkinGroup", 1),
	ToggleMouseActionSkinGroup("ToggleMouseActionSkinGroup", 1),
	SetOptionGroup("!SetOptionGroup", 1),
	HideMeterGroup("!HideMeterGroup", 1),
	ShowMeterGroup("!ShowMeterGroup", 1),
	ToggleMeterGroup("!ToggleMeterGroup", 1),
	UpdateMeterGroup("!UpdateMeterGroup", 1),
	DisableMouseActionGroup("!DisableMouseActionGroup", 1),
	ClearMouseActionGroup("!ClearMouseActionGroup", 1),
	EnableMouseActionGroup("!EnableMouseActionGroup", 1),
	ToggleMouseActionGroup("!ToggleMouseActionGroup", 1),
	DisableMeasureGroup("!DisableMeasureGroup", 1),
	EnableMeasureGroup("!EnableMeasureGroup", 1),
	ToggleMeasureGroup("!ToggleMeasureGroup", 1),
	PauseMeasureGroup("!PauseMeasureGroup", 1),
	UnpauseMeasureGroup("!UnpauseMeasureGroup", 1),
	TogglePauseMeasureGroup("!TogglePauseMeasureGroup", 1),
	UpdateMeasureGroup("!UpdateMeasureGroup", 1),
	DeactivateConfigGroup("!DeactivateConfigGroup", 1);
	
	public final String Value;
	public final int ArgsCount;
	
	private BangGroupCmds(String value, int argscount)
	{
		this.Value = value;
		ArgsCount = argscount;
	}

}
