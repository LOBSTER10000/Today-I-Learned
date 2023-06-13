package test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardDao {
	
	public List<Board> getBoardList() {
		
		List<Board> list = new ArrayList<Board>();
		
				
		for(int i = 0 ; i<3; i++) {
			
			list.add(new Board("제목"+(i+1), "내용"+(i+1)));
		}
		return list;
	}
}
