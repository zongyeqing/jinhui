package com.jinhui.vo;

public enum RecordType {
	
	CONVERSATION(1),MESSAGE(2),TRAFFIC(3);
	
	RecordType(Integer type){
		this.type=type;
	}
	
	private Integer type;

}
