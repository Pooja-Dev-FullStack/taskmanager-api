package com.springbootapp.taskmanagerapi.taskEntities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tasks")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long taskId;
	
	@Column(nullable=true)
	private String desc;
	
	@Column(nullable=false)
	private String creationDate;
	
	@Column(nullable=false)
	private String targetDate;
	
	@Column(nullable=false)
    @Enumerated(EnumType.STRING)
	private  TaskStatus status = TaskStatus.NotStarted;
    
	@Column(nullable=false)
    private Date taskEndDate;
    
	@Column(nullable=false)
    @Enumerated(EnumType.STRING)
	private  TaskTags tags = TaskTags.Normal;

		public Task(Long taskId, String desc, String creationDate, String targetDate, TaskStatus status, Date taskEndDate,
				TaskTags tags) {
				super();
				this.taskId = taskId;
				this.desc = desc;
				this.creationDate = creationDate;
				this.targetDate = targetDate;
				this.status = status;
				this.taskEndDate = taskEndDate;
				this.tags = tags;
		}

	public Long getTaskId() {
		return taskId;
	}

	public String getDesc() {
		return desc;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public String getTargetDate() {
		return targetDate;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public Date getTaskEndDate() {
		return taskEndDate;
	}

	public TaskTags getTags() {
		return tags;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public void setTargetDate(String targetDate) {
		this.targetDate = targetDate;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public void setTaskEndDate(Date taskEndDate) {
		this.taskEndDate = taskEndDate;
	}

	public void setTags(TaskTags tags) {
		this.tags = tags;
	}
    
}
