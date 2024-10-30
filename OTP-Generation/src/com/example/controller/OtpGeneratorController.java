package com.example.controller;

import com.example.service.OTPGeneratorService;

public class OtpGeneratorController {
	public static void main(String[] args) {
		int otpLength = 6; // Specify the length of the OTP

		OTPGeneratorService serv = new OTPGeneratorService();
		String otp = serv.generateOTP(otpLength);
		System.out.println("Your OTP is: " + otp);
	}

}
