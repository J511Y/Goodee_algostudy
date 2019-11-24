package programmers;
import java.util.*;
public class prgmers_42883 {
	public static String solution(String number, int k) {
		Stack<Integer> stack = new Stack<>();
		for(char c : number.toCharArray()) {
			int x = c - '0';
			while(k > 0 && stack.size() > 0 && x > stack.peek()) {
				stack.pop();
				k--;
			}
			stack.push(x);
		}
		StringBuffer sb = new StringBuffer();
		stack.forEach(s->sb.append(s));
        while(k-- > 0) sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
	public static void main(String[] args) {
		System.out.println(solution("21111111", 3)); 	// 21111
		System.out.println(solution("1924", 2));	 	// 94
		System.out.println(solution("1231234", 3));		// 3234
		System.out.println(solution("4177252841", 4));	// 775841
	}
}
/*
 * 큰 수 만들기
문제 설명
어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.

예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.

문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다. number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.

제한 조건
number는 1자리 이상, 1,000,000자리 이하인 숫자입니다.
k는 1 이상 number의 자릿수 미만인 자연수입니다.
입출력 예
number	k	return
1924	2	94
1231234	3	3234
4177252841	4	775841
*/
