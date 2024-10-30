package com.example.service;

import java.security.SecureRandom;

public class OTPGeneratorService {
	public String generateOTP(int length) {
		StringBuilder otp = new StringBuilder(length);
		SecureRandom rom = new SecureRandom();
		// Random rom = new Random();
		for (int i = 0; i < length; i++) {
			otp.append(rom.nextInt(10));
		}
		return otp.toString();

	}

}
