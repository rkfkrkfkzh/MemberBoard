package board.service;

import java.util.List;

import board.dao.Dao;
import board.dao.DaoImpl;
import model.Board;

public class ServiceImpl implements Service {

	private Dao dao;

	public ServiceImpl() {
		dao = new DaoImpl();
	}

	@Override
	public void writeBoard(Board b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Board getBoard(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editBoard(Board b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delBoard(int num) {
		// TODO Auto-generated method stub
		
	}

	
}
