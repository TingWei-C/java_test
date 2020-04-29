package com.qst.dms.dos;

import com.qst.dms.service.LogRecService;
import com.qst.dms.service.TransportService;
import com.qst.dms.entity.LogRec;
import com.qst.dms.entity.Transport;
import java.util.Scanner;

public class EntityDataDemo {

	public static void main(String[] args) {
		System.out.println("�п�JLog��Ƽƶq:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		LogRecService logService = new LogRecService();
		LogRec[] logs = new LogRec[num];
		for (int i = 0; i < logs.length; i++) {
			System.out.println("��" + (i + 1) + "���O���ɸ�����:");
			logs[i] = logService.inputLog();
		}
		logService.showLog(logs);

		System.out.println("�п�J���y��Ƽƶq:");
		num = scanner.nextInt();
		TransportService transService = new TransportService();
		Transport[] transports = new Transport[num];
		for (int i = 0; i < transports.length; i++) {
			System.out.println("��" + (i + 1) + "�����y������:");
			transports[i] = transService.inputTransport();
		}
		transService.showTransport(transports);
	}

}
