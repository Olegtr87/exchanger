package by.epam.training.java.vasilevsky.exchanger;

import java.util.Date;

public class Course extends AbstractModel {

	private Integer buyCourse;
	private Integer sellCourse;
	private Date dateCourse;
	private Currency currency;

	public Integer getBuyCourse() {
		return buyCourse;
	}

	public void setBuyCourse(Integer buyCourse) {
		this.buyCourse = buyCourse;
	}

	public Integer getSellCourse() {
		return sellCourse;
	}

	public void setSellCourse(Integer sellCourse) {
		this.sellCourse = sellCourse;
	}

	public Date getDateCourse() {
		return dateCourse;
	}

	public void setDateCourse(Date dateCourse) {
		this.dateCourse = dateCourse;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

}
