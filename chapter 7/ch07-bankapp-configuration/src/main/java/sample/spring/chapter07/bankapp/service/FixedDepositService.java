package sample.spring.chapter07.bankapp.service;

import sample.spring.chapter07.bankapp.domain.FixedDepositDetails;


public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
