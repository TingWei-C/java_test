package com.qst.dms.entity;

import java.util.Date;

public class Transport extends DataBase {
	private String handler;
	private String receiver;
	private int transportType;

	public static final int SENDDING = 1;
	public static final int TRANSPORTING = 2;
	public static final int RECEIVER = 3;

	public String getHandler() {
		return handler;
	}

	public void setHandler(String handler) {
		this.handler = handler;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public int getTransportType() {
		return transportType;
	}

	public void setTransportType(int transportType) {
		this.transportType = transportType;
	}

	public Transport() {

	}

	public Transport(int id, Date time, String add, int type, String handler, String recevier, int transportType) {
		super(id, time, add, type);
		this.handler = handler;
		this.receiver = recevier;
		this.transportType = transportType;
	}

	public String toString() {
		return this.getId() + "," + this.getTime() + "," + this.getAdd() + "," + this.getType() + "," + handler + ","
				+ receiver + "," + transportType;
	}

}
