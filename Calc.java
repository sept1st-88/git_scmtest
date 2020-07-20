package tg.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import tg.test.util.CalcVo;

public class Calc {
	
	public void add(CalcVo calcVo) {
		Scanner scan = new Scanner(System.in);
		
		int startNum = calcVo.getStartNum();
		int inputCnt = calcVo.getInputCnt();
				
		int[] inputTempArr = new int[inputCnt];
		int[] userInputArr = new int[inputCnt];
		int[] resultNumArr = new int[inputCnt];
		
		try {
			
			//사용자 입력 (시작 할 숫자 보다 큰지 확인 후 입력 받는다)
			for (int i = 0; i < inputCnt; i++) {
				inputTempArr[i] = scan.nextInt();
				
				if(inputTempArr[i] <= startNum) {
					System.out.println(startNum + "보다 큰 숫자 또는 정수만 입력해주세요.");
					i--;
				} else {
					userInputArr[i] = inputTempArr[i];
				}
			}
			
			//계산
			for (int i = 0; i < inputCnt; i++) {
				for (int j = startNum; j <= userInputArr[i]; j++) {
					resultNumArr[i] += j;
				}
			}
			
			//출력
			for (int i = 0; i < resultNumArr.length; i++) {
				System.out.println(startNum + "~" + userInputArr[i] 
						+ " 사이의 정수: " + resultNumArr[i]);			
			}
			
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("정수만 입력하셔야 합니다. 다시 실행해주세요.");
		}
		
	}

}
