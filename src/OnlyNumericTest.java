/**
 * 
 */

/**
 * @author Vinicius_B_Rosa
 *
 */
public class OnlyNumericTest {

	public static void main(String args[]){
		String test = "FR4800501";
		
		String converted = returnOnlyNumeric(test);
		
		System.out.println(test);
		System.out.println(converted);
		
		System.out.println();
		
		String test2 = "4800501";
		
		String converted2 = returnOnlyNumeric(test2);
		System.out.println(test2);
		System.out.println(converted2);
	}
	
	private static String returnOnlyNumeric(String value){
		return value.replaceAll("\\D+","");
	}
}
