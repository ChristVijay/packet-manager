package io.mosip.registration.processor.virus.scanner.job.decrypter.constant;

public class PacketDecryptionFailureExceptionConstant {

	public final String errorCode;
	public final String errorMessage;

	PacketDecryptionFailureExceptionConstant(String string1, String string2) {
		this.errorCode = string1;
		this.errorMessage = string2;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
