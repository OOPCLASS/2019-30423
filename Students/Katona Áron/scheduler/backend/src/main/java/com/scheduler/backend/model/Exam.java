package com.scheduler.backend.model;

import java.util.Date;
import java.util.Objects;

public class Exam extends Entity {

	private Date from;
	private Date to;

	public Exam() {
	}

	public Exam(Date from, Date to) {
		this.from = from;
		this.to = to;
	}

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getTo() {
		return to;
	}

	public void setTo(Date to) {
		this.to = to;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Exam)) return false;
		Exam exam = (Exam) o;
		return Objects.equals(getFrom(), exam.getFrom()) &&
				Objects.equals(getTo(), exam.getTo());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getFrom(), getTo());
	}
}
