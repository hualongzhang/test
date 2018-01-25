package com.example.demo.entity.two;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tbl_fushu_log database table.
 * 
 */
@Entity
@Table(name="tbl_fushu_log")
@NamedQuery(name="TblFushuLog.findAll", query="SELECT t FROM TblFushuLog t")
public class TblFushuLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TXT_NO")
	private long txtNo;

	@Column(name="APP_NO")
	private String appNo;

	@Column(name="CRT_TIME")
	private Timestamp crtTime;

	@Column(name="ID_NO")
	private String idNo;

	@Column(name="OPEN_ID")
	private String openId;

	@Column(name="TASK_ID")
	private String taskId;

	@Lob
	@Column(name="TXT_RESPONSE")
	private String txtResponse;

	@Column(name="TXT_STATUS")
	private String txtStatus;

	@Column(name="TXT_TYPE")
	private String txtType;

	@Column(name="UPD_TIME")
	private Timestamp updTime;

	public TblFushuLog() {
	}

	public long getTxtNo() {
		return this.txtNo;
	}

	public void setTxtNo(long txtNo) {
		this.txtNo = txtNo;
	}

	public String getAppNo() {
		return this.appNo;
	}

	public void setAppNo(String appNo) {
		this.appNo = appNo;
	}

	public Timestamp getCrtTime() {
		return this.crtTime;
	}

	public void setCrtTime(Timestamp crtTime) {
		this.crtTime = crtTime;
	}

	public String getIdNo() {
		return this.idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getOpenId() {
		return this.openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTxtResponse() {
		return this.txtResponse;
	}

	public void setTxtResponse(String txtResponse) {
		this.txtResponse = txtResponse;
	}

	public String getTxtStatus() {
		return this.txtStatus;
	}

	public void setTxtStatus(String txtStatus) {
		this.txtStatus = txtStatus;
	}

	public String getTxtType() {
		return this.txtType;
	}

	public void setTxtType(String txtType) {
		this.txtType = txtType;
	}

	public Timestamp getUpdTime() {
		return this.updTime;
	}

	public void setUpdTime(Timestamp updTime) {
		this.updTime = updTime;
	}

}