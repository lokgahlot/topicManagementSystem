package com.lionbank.util;

import java.security.*;

import com.lionbank.exception.RegistrationFailureException;

public class PasswordSecurity {
	public String shaEncrpytPassword(String input) throws RegistrationFailureException {
		String password = null;
		try {

			MessageDigest md = MessageDigest.getInstance("SHA1");
			byte[] output = md.digest();
			md.update(input.getBytes());
			output = md.digest();
			password = bytesToHex(output);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RegistrationFailureException();
		}

		return password;
	}

	public static String bytesToHex(byte[] b) {
		char hexDigit[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		StringBuffer buf = new StringBuffer();
		for (int j = 0; j < b.length; j++) {
			buf.append(hexDigit[(b[j] >> 4) & 0x0f]);
			buf.append(hexDigit[b[j] & 0x0f]);
		}
		return buf.toString();
	}

}
