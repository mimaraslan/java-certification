package _005_imports;

import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.sort;

public class ListHelper {
	
	public List<String> copyAndSortList(List<String> original) {
		List<String> list = new ArrayList<String>(original);
		sort(list);
		return list;
	}
}