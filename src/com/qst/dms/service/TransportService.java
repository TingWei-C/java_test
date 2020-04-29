package com.qst.dms.service;

import java.util.Date;
import java.util.Scanner;
import com.qst.dms.entity.Transport;

public class TransportService {
	public Transport inputTransport() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入ID標識:");
		int id = scanner.nextInt();
		Date nowDate = new Date();

		System.out.println("請輸入位址:");
		String add = scanner.next();
		int type = Transport.GATHER;
		System.out.println("請輸入貨物經手人:");
		String handler = scanner.next();
		System.out.println("請輸入收貨人:");
		String receiver = scanner.next();
		System.out.println("請輸入物流狀態:1 發貨中，2 送貨中，3 已簽收");
		int transportType = scanner.nextInt();
		Transport trans = new Transport(id, nowDate, add, type, handler, receiver, transportType);
		return trans;
	}

	public void showTransport(Transport... transports) {
		for (Transport e : transports) {
			if (e != null) {
				System.out.println(e.toString());
			}
		}
	}
}
