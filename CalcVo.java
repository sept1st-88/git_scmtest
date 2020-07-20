package tg.test.util;

public class CalcVo {
	
	private int startNum = 0;
	private int inputCnt = 0;
	
	public CalcVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CalcVo(int startNum, int inputCnt) {
		super();
		this.startNum = startNum;
		this.inputCnt = inputCnt;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getInputCnt() {
		return inputCnt;
	}

	public void setInputCnt(int inputCnt) {
		this.inputCnt = inputCnt;
	}

	@Override
	public String toString() {
		return "CalcVo [startNum=" + startNum + ", inputCnt=" + inputCnt + "]";
	}

}
