package com.example.project.binaryconversion.service;

import org.springframework.stereotype.Service;
@Service
public class BinaryConversionServiceImpl implements BinaryConversionService{
	
	
	public String binaryConversion(String inputStr) {
		return  Integer.toBinaryString(Integer.parseInt(inputStr));
	}

}
