package table;

import java.util.LinkedList;
import java.util.List;

public class TableGenerator {

	public static List<String> generate(String[][] dataArray) {
		List<String> result = new LinkedList<>();
		int[] lenArray = new int[dataArray[0].length];
		for(int i = 0; i < dataArray.length; i++){
			for(int j = 0; j < dataArray[i].length; j++){
				if(lenArray[j] < dataArray[i][j].length()){
					lenArray[j] = dataArray[i][j].length();
				}
			}
		}
		
		LineRowCreater lrc = new LineRowCreater(lenArray);
		DataRowCreater drc = new DataRowCreater(lenArray);
		
		result.add(lrc.create());
		for(int i = 0; i < dataArray.length; i++){
			drc.data = dataArray[i];
			result.add(drc.create());
			if(i == 0) result.add(lrc.create());
		}
		result.add(lrc.create());
		
		return result;
	}
	
}
