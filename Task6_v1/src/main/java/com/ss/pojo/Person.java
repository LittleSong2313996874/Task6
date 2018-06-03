package com.ss.pojo;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1l;

	private Integer id;
	private String NAME;
	private String gender;
	private Integer age;
	private String graduation;
	private String senior;
    private Long create_at;
    private Long update_at;

    public Long getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Long create_at) {
        this.create_at = create_at;
    }

    public Long getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Long update_at) {
        this.update_at = update_at;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public String getSenior() {
		return senior;
	}

	public void setSenior(String senior) {
		this.senior = senior;
	}


	@Override
    public String toString() {
        return "(" + id + "," + NAME +","+gender+ "," + age + "," +  graduation+ "," +senior+ "," +create_at+ "," +update_at+ ")";
        
    }
	
	
}
