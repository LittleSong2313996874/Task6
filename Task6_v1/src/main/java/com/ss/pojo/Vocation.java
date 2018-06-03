package com.ss.pojo;

public class Vocation {

	private Integer id;
	private String NAME;
	private String summary;
	private Integer threshold;
	private Integer	Difficulty_Level;
	private String growth_cycle;
	private Integer Rareness;
	private String salary_first;
	private String salary_second;
	private String salary_third;
	private String basic_knowledge;
	private Integer number;
	private String field;

	private Long createAt;
    private Long updateAt;
@Override
    public String toString() {
        return "(" + id + "," + NAME +","+summary+ "," + threshold + "," +  Difficulty_Level+ "," +growth_cycle+
         "," +Rareness+ ","+salary_first+ ","+salary_second+ ","+salary_third+ ","+basic_knowledge+ ","+field+ ","+number+ ")";

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

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Integer getThreshold() {
		return threshold;
	}

	public void setThreshold(Integer threshold) {
		this.threshold = threshold;
	}

	public Integer getDifficulty_Level() {
		return Difficulty_Level;
	}

	public void setDifficulty_Level(Integer difficulty_Level) {
		Difficulty_Level = difficulty_Level;
	}

	public String getGrowth_cycle() {
		return growth_cycle;
	}

	public void setGrowth_cycle(String growth_cycle) {
		this.growth_cycle = growth_cycle;
	}

	public Integer getRareness() {
		return Rareness;
	}

	public void setRareness(Integer rareness) {
		Rareness = rareness;
	}

	public String getSalary_first() {
		return salary_first;
	}

	public void setSalary_first(String salary_first) {
		this.salary_first = salary_first;
	}

	public String getSalary_second() {
		return salary_second;
	}

	public void setSalary_second(String salary_second) {
		this.salary_second = salary_second;
	}

	public String getSalary_third() {
		return salary_third;
	}

	public void setSalary_third(String salary_third) {
		this.salary_third = salary_third;
	}

	public String getBasic_knowledge() {
		return basic_knowledge;
	}

	public void setBasic_knowledge(String basic_knowledge) {
		this.basic_knowledge = basic_knowledge;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Long getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}

	public Long getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Long updateAt) {
		this.updateAt = updateAt;
	}
}
