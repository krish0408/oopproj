package interfaces;

import java.util.Scanner;

public class TestMessagePrinter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter source name : 1. file 2. db 3. newdb ..");
		
		String sourceName = scanner.next();
		
		MessagePrinter messagePrinter = new MessagePrinter();
		
		messagePrinter.printMessage(sourceName);

	}

}

