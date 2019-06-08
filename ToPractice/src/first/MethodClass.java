package first;

import java.util.ArrayList;
import java.util.ListIterator;

public class MethodClass {
	
	public static void howToCreateLists() {
		TrialForList fi1 = new TrialForList(1, 2, "vic");
		TrialForList fi2 = new TrialForList(2, 4, "kochi");
		
		ArrayList<TrialForList> listP = new ArrayList<>();
		listP.add(fi1);
		listP.add(fi2);
		listP.add(new TrialForList(5, 3, "tpb"));
		ListIterator<TrialForList> itMe = listP.listIterator();
		
		
		while (itMe.hasNext()) {
			//type type = (type) itMe.nextElement();
			TrialForList temp = itMe.next();
			System.out.println(temp.name);
			System.out.println(temp.x);
			System.out.println(temp.y);
			
		}
	}

}
