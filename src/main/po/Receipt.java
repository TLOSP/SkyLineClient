package main.po;

import main.vo.ReceiptVO;

public class Receipt extends Message {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	public void convert(ReceiptVO vo){
		
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
