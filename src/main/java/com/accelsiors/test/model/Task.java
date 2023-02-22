package com.accelsiors.test.model;

import java.util.Date;

/**
 * Task entities
 * @author ZoltanS
 *
 */
public class Task {

	private Integer id;
	private Date date;
	private double duration;
	private String comment;
	
	private Activity activity;
	
	public Task() {
		
	}
	
	public Task( Integer id, Date date, double duration, Activity activity, String comment ) {
		this.id = id;
		this.date = date;
		this.duration = duration;
		this.activity = activity;
		this.comment = comment;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	
	

	@Override
	public String toString() {
		return "Task [id=" + id + ", date=" + date + ", duration=" + duration + ", comment=" + comment + ", activity="
				+ activity + "]";
	}

}
