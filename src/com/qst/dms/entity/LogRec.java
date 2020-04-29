package com.qst.dms.entity;

import java.util.Date;

public class LogRec extends DataBase {
	private String user;
	private String ip;
	private int logType;
	public static final int LOG_IN = 1;
	public static final int LOG_OUT = 0;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getLogType() {
		return logType;
	}

	public void setLogType(int logType) {
		this.logType = logType;
	}

	public LogRec() {

	}

	public LogRec(int id, Date time, String add, int type, String user, String ip, int logType) {
		super(id, time, add, type);
		this.user = user;
		this.ip = ip;
		this.logType = logType;
	}

	public String toString() {
		return this.getId() + "," + this.getTime() + "," + this.getAdd() + "," + this.getType() + "," + user + "," + ip
				+ "," + logType;
	}
}
