package OP.SM.AOP.MEC.SIQ.VQS.DSU.exceptions;

public enum ErrorCodeEnum {
	ER1001("error."),
	ER1002("invalid key.")
	;

	private String msg;

	private ErrorCodeEnum(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}

	public void I_Msg(String msg) {
		this.msg = msg;
	}

	
}
