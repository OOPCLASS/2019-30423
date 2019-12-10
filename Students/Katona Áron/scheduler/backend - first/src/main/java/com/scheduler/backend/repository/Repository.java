package com.scheduler.backend.repository;

import java.util.List;

import com.scheduler.backend.model.Entity;

public interface Repository<T extends Entity> {

	T save(T entity);
	
	T findById(Long id);
	
	List<T> findAll();
	
	boolean delete(T entity);
}
