import java.util.*;
class emoji{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String emot = in.nextLine();
		if(emot.equalsIgnoreCase("semangat")){
			//String a = "\(^_^)/";
			System.out.printf("%s%c%s\n","semangat ",92,"(^_^)/");
		}
		else if(emot.equalsIgnoreCase("sebel")){
			String a = ">.<";
			System.out.println(emot+" "+a+'"');
		}
		else if(emot.equalsIgnoreCase("bingung")){
			System.out.println(emot+" (' ')?");
		}
	}
}