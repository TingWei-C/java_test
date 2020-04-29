package com.qst.dms.service;

import java.util.Date;
import java.util.Scanner;
import com.qst.dms.entity.Transport;

public class TransportService {
	public Transport inputTransport() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�JID����:");
		int id = scanner.nextInt();
		Date nowDate = new Date();

		System.out.println("�п�J��}:");
		String add = scanner.next();
		int type = Transport.GATHER;
		System.out.println("�п�J�f���g��H:");
		String handler = scanner.next();
		System.out.println("�п�J���f�H:");
		String receiver = scanner.next();
		System.out.println("�п�J���y���A:1 �o�f���A2 �e�f���A3 �wñ��");
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
