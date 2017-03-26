package table;

public class LineRowCreater extends RowCreater {
	
	LineRowCreater(int[] columLens) {
		super(columLens);
	}

	@Override
	String data(int i) {
		return fillBlock(columLens[i]);
	}
	
}