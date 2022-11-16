package com.Bank;

import java.util.*;

import com.Bank.DAOImpl.AccountDAOImpl;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AccountDAOImpl account = new AccountDAOImpl();
		System.out.println("\n\n******************WELCOME*****************");
		System.out.println("\nSelect Below Menu To Perfrom The Operation");
		while (true) {
			System.out.println("\n\n1.Create Account");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Check Balance");
			System.out.println("5.Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				account.CreateAccount();
				break;

			case 2:
				account.Deposit();
				break;

			case 3:
				account.Withdraw();
				break;

			case 4:
				account.CurrentBalance();
				break;

			default:
				System.out.println("*****Thank You******");
			}
			if (ch == 5)
				break;
		}
		sc.close();
	}
}
