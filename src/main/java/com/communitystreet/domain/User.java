package com.communitystreet.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "UserModel")
public class User {
	@ApiModelProperty(value = "学号", dataType = "int64", example = "114514")
	private long stuNumber;
	@ApiModelProperty(value = "邮箱", dataType = "String", example = "72@qq.com")
	private String mailbox;
	@ApiModelProperty(value = "密码", dataType = "String", example = "121312931")
	private String password;
	@ApiModelProperty(value = "id", dataType = "int64", example = "123123")
	private int stuId;
	@ApiModelProperty(value = "学院", dataType = "String", example = "通信学院")
	private String college;
	@ApiModelProperty(value = "手机号", dataType = "int64", example = "13309213377")
	private int phone;
	@ApiModelProperty(value = "用户社团关联", dataType = "int64", example = "1")
	private int USER_COMMUNITY_ID;
	@ApiModelProperty(value = "用户活动关联", dataType = "int64", example = "1")
	private int USER_JOIN_ACTIVITY_ID;
	@ApiModelProperty(value = "积分", dataType = "double	", example = "33.33")
	private double credit;
	@ApiModelProperty(value = "昵称", dataType = "String", example = "wangzisfa")
	private String nickname;
	@ApiModelProperty(value = "姓名", dataType = "String", example = "王子恒")
	private String name;
//	@ApiModelProperty(value = "性别", dataType = "GENDER", example = "M/F")
//	private GENDER gen;
	@ApiModelProperty(value = "国家", dataType = "String", example = "China")
	private String nationality;
//	@ApiModelProperty(value = "用户创建时间", dataType = "Timestamp", example = "2021.3.2")
//	private Timestamp CREATE_TIME;
	@ApiModelProperty(value = "签名", dataType = "String", example = "qianming")
	private String signature;
//	@ApiModelProperty(value = "前端展示日期", dataType = "String", example = "dd-MM-yy")
//	private String date;
	private String gender;


//	public void getDateString() {
//		LocalDateTime date = CREATE_TIME.toLocalDateTime();
//		this.date = date.format(DateTimeFormatter.ofPattern("dd-MM-yy"));
//	}


	public User() {
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	//	public String getDate() {
//		return date;
//	}
//
//	public void setDate(String date) {
//		this.date = date;
//	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public long getStuNumber() {
		return stuNumber;
	}

	public void setStuNumber(long stuNumber) {
		this.stuNumber = stuNumber;
	}

	public String getMailbox() {
		return mailbox;
	}

	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getUSER_COMMUNITY_ID() {
		return USER_COMMUNITY_ID;
	}

	public void setUSER_COMMUNITY_ID(int USER_COMMUNITY_ID) {
		this.USER_COMMUNITY_ID = USER_COMMUNITY_ID;
	}

	public int getUSER_JOIN_ACTIVITY_ID() {
		return USER_JOIN_ACTIVITY_ID;
	}

	public void setUSER_JOIN_ACTIVITY_ID(int USER_JOIN_ACTIVITY_ID) {
		this.USER_JOIN_ACTIVITY_ID = USER_JOIN_ACTIVITY_ID;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


//	public Timestamp getCREATE_TIME() {
//		return CREATE_TIME;
//	}
//
//	public void setCREATE_TIME(Timestamp CREATE_TIME) {
//		this.CREATE_TIME = CREATE_TIME;
//	}

	@Override
	public String toString() {
		return "User{" +
				"stuNumber=" + stuNumber +
				", mailbox='" + mailbox + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}