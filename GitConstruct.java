package tg.test;

import tg.test.util.CalcVo;

public class GitConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalcVo calcVo = new CalcVo();
		Calc calc = new Calc();
		
		calcVo.setStartNum(1);
		calcVo.setInputCnt(2);
		
		calc.add(calcVo);
		
	}

}
