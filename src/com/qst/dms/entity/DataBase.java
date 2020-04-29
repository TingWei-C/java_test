package com.qst.dms.entity;

import java.util.Date;

public class DataBase {
	private int id;
	private Date time;
	private String add;
	private int type;

	public static final int GATHER = 1;
	public static final int MATCH = 2;
	public static final int RECORD = 3;
	public static final int SEND = 4;
	public static final int RECIVE = 5;
	public static final int WRITE = 6;
	public static final int SAVE = 7;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime() {
		this.time = time;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public DataBase() {

	}

	public DataBase(int id, Date time, String add, int type) {
		this.id = id;
		this.time = time;
		this.add = add;
		this.type = type;
	}

	public String toString() {
		return id + "," + time + "," + add + "," + type;
	}

}
