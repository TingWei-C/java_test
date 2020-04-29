package com.qst.dms.service;

import java.util.Date;
import java.util.Scanner;

import com.qst.dms.entity.LogRec;

public class LogRecService {
	public LogRec inputLog() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入ID標示:");
		int id = scanner.nextInt();
		Date nowDate = new Date();
		System.out.println("請輸入位址:");
		String add = scanner.next();
		int type = LogRec.GATHER;
		System.out.println("請輸入登入使用者名稱:");
		String user = scanner.next();
		System.out.println("請輸入主機IP:");
		String ip = scanner.next();
		System.out.println("請輸入登入狀態:1是登入，0是登出");
		int logType = scanner.nextInt();
		LogRec log = new LogRec(id, nowDate, add, type, user, ip, logType);
		return log;
	}

	public void showLog(LogRec... logRecs) {
		for (LogRec e : logRecs) {
			if(e!=null) {
				System.out.println(e.toString());
			}
		}
	}
}
