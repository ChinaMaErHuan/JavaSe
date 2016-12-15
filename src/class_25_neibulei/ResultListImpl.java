package class_25_neibulei;

import java.util.ArrayList;
import java.util.List;

public class ResultListImpl implements IResultList{

	@Override
	public List<String> queryList() {
		List<String> list = new ArrayList<String>();
		list.add("maerhuan");
		list.add("mahuan");
		list.add("keke");
		list.add("haha");
		return list;
	}

}
