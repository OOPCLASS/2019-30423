package com.scheduler.backend.transformer;

import java.sql.ResultSet;
import java.util.List;

public interface Transformer<T> {

	T toModel(ResultSet resultSet);
	
	List<T> toModelList(ResultSet resultSet);
}
