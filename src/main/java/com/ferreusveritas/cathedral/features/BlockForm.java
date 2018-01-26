package com.ferreusveritas.cathedral.features;

public enum BlockForm {
	
	BLOCK("block"),
	GLASS("glass"),
	PANE("pane"),
	BARS("bars"),
	STAIRS("stairs"),
	SLAB("slab"),
	DOOR("door"),
	LIGHT("light"),
	RAILING("railing"),
	CHAIN("chain"),
	SHINGLES("shingles"),
	GARGOYLE("gargoyle"),
	CATWALK("catwalk");
	
	private String name;
	
	private BlockForm(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
