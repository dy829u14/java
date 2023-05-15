package day18.quiz;

import java.util.ArrayList;
import java.util.List;

import day17.exam01.Board;

public class BoardDao {
	//List<Board> 리턴래주는 메소드 getBoardList
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<>();
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목1","내용1"));
		return list;
	}
		
	
	
	
	
}
