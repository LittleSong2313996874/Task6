package com.ss.pojo;

import java.io.Serializable;
import java.util.UUID;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;


	//private String uuid = UUID.randomUUID().toString().replaceAll("-", "");
	private Integer INTID;
	private String uuid;

	private Long p_personid;

	private Long p_createTime;
	
	private Long p_updateTime;
	
	private String p_Name;

    private String p_qq;
    
    private String p_traintype;
    
    private String p_jointime;

    private String p_graduation;

    private String p_onlineid;

    private String p_dailylink;

    private String p_oath;
    
    private String p_senior;
    
    private String p_source;
    
    private String p_status;

    private  String vocationID;




	public String getVocationID() {
		return vocationID;
	}

	public void setVocationID(String vocationID) {
		this.vocationID = vocationID;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Long getP_personid() {
		return p_personid;
	}

	public void setP_personid(Long p_personid) {
		this.p_personid = p_personid;
	}

	public Integer getINTID() {
		return INTID;
	}

	public void setINTID(Integer INTID) {
		this.INTID = INTID;
	}

	public Long getP_createTime() {
		return p_createTime;
	}

	public void setP_createTime(Long p_createTime) {
		this.p_createTime = p_createTime;
	}

	public Long getP_updateTime() {
		return p_updateTime;
	}

	public void setP_updateTime(Long p_updateTime) {
		this.p_updateTime = p_updateTime;
	}

	public String getP_Name() {
		return p_Name;
	}

	public void setP_Name(String p_Name) {
		this.p_Name = p_Name;
	}

	public String getP_qq() {
		return p_qq;
	}

	public void setP_qq(String p_qq) {
		this.p_qq = p_qq;
	}

	public String getP_traintype() {
		return p_traintype;
	}

	public void setP_traintype(String p_traintype) {
		this.p_traintype = p_traintype;
	}

	public String getP_jointime() {
		return p_jointime;
	}

	public void setP_jointime(String p_jointime) {
		this.p_jointime = p_jointime;
	}

	public String getP_graduation() {
		return p_graduation;
	}

	public void setP_graduation(String p_graduation) {
		this.p_graduation = p_graduation;
	}

	public String getP_onlineid() {
		return p_onlineid;
	}

	public void setP_onlineid(String p_onlineid) {
		this.p_onlineid = p_onlineid;
	}

	public String getP_dailylink() {
		return p_dailylink;
	}

	public void setP_dailylink(String p_dailylink) {
		this.p_dailylink = p_dailylink;
	}

	public String getP_oath() {
		return p_oath;
	}

	public void setP_oath(String p_oath) {
		this.p_oath = p_oath;
	}


	public String getP_senior() {
		return p_senior;
	}

	public void setP_senior(String p_senior) {
		this.p_senior = p_senior;
	}

	public String getP_source() {
		return p_source;
	}

	public void setP_source(String p_source) {
		this.p_source = p_source;
	}

	public String getP_status() {
		return p_status;
	}

	public void setP_status(String p_status) {
		this.p_status = p_status;
	}
    
	@Override
	public String toString() {
		 return "Student{" +

	                "INTID=" + INTID +
				    ", uuid='" + uuid + '\'' +
	                ", 人员ID='" + p_personid + '\'' +
	                ", 姓名='" + p_Name + '\'' +
	                ", 创建时间='" + p_createTime + '\'' +
	                ", 更新时间='" + p_updateTime + '\'' +
	                ", QQ='" + p_qq + '\'' +
	                ", 修真类型=" + p_traintype +
	                ", 预计入学时间='" + p_jointime + '\'' +
	                ", 毕业院校='" + p_graduation + '\'' +
	                ", 线上学号='" + p_onlineid + '\'' +
	                ", 日报链接='" + p_dailylink + '\'' +
	                ", 立愿='" + p_oath + '\'' +
	                ", 师兄='" + p_senior + '\'' +
	                ", 来源='" + p_source + '\'' +
	                ", 状态'" + p_status + '\'' +
	                '}';
		
	}
	
}
