package com.scheduler.backend.model;

import java.io.Serializable;
import java.util.Objects;

public abstract class Entity implements Serializable {

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Entity)) return false;
		Entity entity = (Entity) o;
		return Objects.equals(getId(), entity.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
}
