package table;

public class DataRowCreater extends RowCreater {
	String[] data;
	DataRowCreater(int[] columLens) {
		super(columLens);
		super.corner = "|";
		super.block = " ";
	}

	@Override
	String data(int i) {
		return data[i] + fillBlock(columLens[i] - data[i].length());
	}
}