package com.scheduler.backend.repository;

import java.util.List;

import com.scheduler.backend.model.AbstractEntity;

public interface Repository<T extends AbstractEntity> {

	T save(T entity);
	
	T findById(Long id);
	
	List<T> findAll();
	
	boolean delete(T entity);
}
