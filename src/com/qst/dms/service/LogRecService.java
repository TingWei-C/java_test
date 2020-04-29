package com.qst.dms.service;

import java.util.Date;
import java.util.Scanner;

import com.qst.dms.entity.LogRec;

public class LogRecService {
	public LogRec inputLog() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�JID�Х�:");
		int id = scanner.nextInt();
		Date nowDate = new Date();
		System.out.println("�п�J��}:");
		String add = scanner.next();
		int type = LogRec.GATHER;
		System.out.println("�п�J�n�J�ϥΪ̦W��:");
		String user = scanner.next();
		System.out.println("�п�J�D��IP:");
		String ip = scanner.next();
		System.out.println("�п�J�n�J���A:1�O�n�J�A0�O�n�X");
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
