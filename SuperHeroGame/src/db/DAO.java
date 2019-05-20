package db;

import java.util.List;

import business.SuperHeroes;

public interface DAO<T> {

	T get(String code);
	List<T> getAll();
	boolean add (T t);
	boolean update (T t);
	boolean delete (T t);
	
}
