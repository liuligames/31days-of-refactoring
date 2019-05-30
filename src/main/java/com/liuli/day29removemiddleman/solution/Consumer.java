package com.liuli.day29removemiddleman.solution;

public class Consumer {
	private AccountDataProvider accountDataProvider;

	public Consumer(AccountDataProvider accountDataProvider) {
		this.accountDataProvider = accountDataProvider;
	}

	public Account get(int id) {
		return accountDataProvider.getAccount(id);
	}
}
