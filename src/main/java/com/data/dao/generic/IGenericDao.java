package com.data.dao.generic;

public interface IGenericDao<T> {
	int count();

	T find(int id);

	void insert(T t) throws Exception;

	void update(T t) throws Exception;

	void delete(int id) throws Exception;
}
