package com.qst.dms.dos;

import com.qst.dms.service.LogRecService;
import com.qst.dms.service.TransportService;
import com.qst.dms.entity.LogRec;
import com.qst.dms.entity.Transport;
import java.util.Scanner;

public class EntityDataDemo {

	public static void main(String[] args) {
		System.out.println("請輸入Log資料數量:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		LogRecService logService = new LogRecService();
		LogRec[] logs = new LogRec[num];
		for (int i = 0; i < logs.length; i++) {
			System.out.println("第" + (i + 1) + "筆記錄檔資料獲取:");
			logs[i] = logService.inputLog();
		}
		logService.showLog(logs);

		System.out.println("請輸入物流資料數量:");
		num = scanner.nextInt();
		TransportService transService = new TransportService();
		Transport[] transports = new Transport[num];
		for (int i = 0; i < transports.length; i++) {
			System.out.println("第" + (i + 1) + "筆物流資料獲取:");
			transports[i] = transService.inputTransport();
		}
		transService.showTransport(transports);
	}

}
