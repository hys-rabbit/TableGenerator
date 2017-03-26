package table;

public abstract class RowCreater {
	protected String corner = "+";
	protected String block = "-";
	protected StringBuilder row;
	int[] columLens;
	abstract String data(int i);

	RowCreater(int[] columLens) {
		this.columLens = columLens;
	}

	public String create() {
		row = new StringBuilder();
		row.append(corner);
		row.append(block);
		
		for (int i = 0; i < this.columLens.length; i++) {
			if(i > 0){
				row.append(block);
				row.append(corner);
				row.append(block);				
			}
			row.append(data(i));
		}
		
		row.append(block);
		row.append(corner);
		return row.toString();
	}

	protected String fillBlock(int len) {
		StringBuilder sb = new StringBuilder();
		while (len-- > 0) sb.append(block);
		return sb.toString();
	}
}
