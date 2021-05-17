package com.imooc.miaosha.result;

public class CodeMsg {
	
	private int code;
	private String msg;
	
	//common error code
	public static CodeMsg SUCCESS = new CodeMsg(0, "success");
	public static CodeMsg SERVER_ERROR = new CodeMsg(500100, "internal server error");
	public static CodeMsg BIND_ERROR = new CodeMsg(500101, "illegal input：%s");
	public static CodeMsg REQUEST_ILLEGAL = new CodeMsg(500102, "illegal request");
	public static CodeMsg ACCESS_LIMIT_REACHED= new CodeMsg(500104, "frequenly access");
	//log in 5002XX
	public static CodeMsg SESSION_ERROR = new CodeMsg(500210, "Session doesn't exist or expired");
	public static CodeMsg PASSWORD_EMPTY = new CodeMsg(500211, "password can not be empty");
	public static CodeMsg MOBILE_EMPTY = new CodeMsg(500212, "phone number can not be empty");
	public static CodeMsg MOBILE_ERROR = new CodeMsg(500213, "wrong phonr number format");
	public static CodeMsg MOBILE_NOT_EXIST = new CodeMsg(500214, "phone number not exist");
	public static CodeMsg PASSWORD_ERROR = new CodeMsg(500215, "password error");
	public static CodeMsg USER_EXIST = new CodeMsg(500216, "user exists");
	
	
	//goods 5003XX
	
	
	//order 5004XX
	public static CodeMsg ORDER_NOT_EXIST = new CodeMsg(500400, "order does not exist");
	
	//limit order 5005XX
	public static CodeMsg MIAO_SHA_OVER = new CodeMsg(500500, "limit order period ended");
	public static CodeMsg REPEATE_MIAOSHA = new CodeMsg(500501, "submit order multiple times");
	public static CodeMsg MIAOSHA_FAIL = new CodeMsg(500502, "limit order fail");
	
	
	private CodeMsg( ) {
	}
			
	private CodeMsg( int code,String msg ) {
		this.code = code;
		this.msg = msg;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public CodeMsg fillArgs(Object... args) {
		int code = this.code;
		String message = String.format(this.msg, args);
		return new CodeMsg(code, message);
	}

	@Override
	public String toString() {
		return "CodeMsg [code=" + code + ", msg=" + msg + "]";
	}
	
	
}
