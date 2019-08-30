package kim.gwon.su.method;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXB;

public class Board {
	int id;
	String title;
	String content;
	User writer;
	java.util.Date wdate;
	java.util.Date udate;
	
	public boolean insert(Board board) {
		System.out.println("insert!!");
		return true;
	}
	
	public boolean edit(Board board) {
		System.out.println("edit");
		return false;
	}
	
	public Board getBoard(int id) {
		Board result = new Board();
		return result;
	}
	
	public List<Board>getList(){
		List<Board>result = new ArrayList<Board>();
		return result;
		
	}

}
