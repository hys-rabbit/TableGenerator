
import java.util.ArrayList;
import java.util.List;

import table.TableGenerator;

public class TableTest {

	public static void main(String[] args) {
		List<String[]> list = new ArrayList<>();
		// ヘッダ
		list.add(new String[]{"Name", "Age", "Email", "Job"});
		// データ
		list.add(new String[]{"Kaneda", "17", "akira@gmail.com", "engineer"});
		list.add(new String[]{"Yamagata", "28", "takashi@gmail.com", "programer"});
		list.add(new String[]{"Kai", "9", "masaru@gmail.com", "designer"});
		String[][] data = list.toArray(new String[0][]);
		
		TableGenerator.generate(data).forEach(System.out::println);
	}

}
