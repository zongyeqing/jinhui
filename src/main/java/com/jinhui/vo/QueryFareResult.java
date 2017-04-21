package com.jinhui.vo;

import com.jinhui.po.Pack;
import com.jinhui.po.Summary;

public class QueryFareResult {
	private Pack myPackage;
	private Summary mySummary;
	public Pack getMyPackage() {
		return myPackage;
	}
	public void setMyPackage(Pack myPackage) {
		this.myPackage = myPackage;
	}
	public Summary getMySummary() {
		return mySummary;
	}
	public void setMySummary(Summary mySummary) {
		this.mySummary = mySummary;
	}
	
}
