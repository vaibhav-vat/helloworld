package com.avengersinitiative.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "candidate")
public class Candidate 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "strength")
	Integer strength;
	@Column(name = "batch")
	String batch;
	@Column(name = "email_id")
	String emailId;
	@Column(name = "first_name")
	String firstName;
	@Column(name = "last_name")
	String lastName;
	@Column(name = "gender")
	String gender;
	@Column(name = "super_human_status")
	String superHumanStatus;
	@Column(name = "iron_suit_handle")
	Integer ironSuitHandle;
	@Column(name = "mjollnir_handle")
	Integer mjollnirHandle;
	@Column(name = "ant_suit_handle")
	Integer antSuitHandle;
	@Column(name = "shield_handle")
	Integer shieldHandle;
	@Column(name = "total")
	Integer total;
	@Column(name = "iq")
	Integer iq;
	@Column(name = "space_experience")
	String spaceExperience;
	@Column(name = "country")
	String country;	
	@Column(name = "record_date")
	private String recordDate;
	@Column(name = "birth_date") 
    String birthDate;
	
	
	
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public Candidate() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getStrength() {
		return strength;
	}
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSuperHumanStatus() {
		return superHumanStatus;
	}
	public void setSuperHumanStatus(String superHumanStatus) {
		this.superHumanStatus = superHumanStatus;
	}
	public Integer getIronSuitHandle() {
		return ironSuitHandle;
	}
	public void setIronSuitHandle(Integer ironSuitHandle) {
		this.ironSuitHandle = ironSuitHandle;
	}
	public Integer getMjollnirHandle() {
		return mjollnirHandle;
	}
	public void setMjollnirHandle(Integer mjollnirHandle) {
		this.mjollnirHandle = mjollnirHandle;
	}
	public Integer getAntSuitHandle() {
		return antSuitHandle;
	}
	public void setAntSuitHandle(Integer antSuitHandle) {
		this.antSuitHandle = antSuitHandle;
	}
	public Integer getShieldHandle() {
		return shieldHandle;
	}
	public void setShieldHandle(Integer shieldHandle) {
		this.shieldHandle = shieldHandle;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getIq() {
		return iq;
	}
	public void setIq(Integer iq) {
		this.iq = iq;
	}
	public String getSpaceExperience() {
		return spaceExperience;
	}
	public void setSpaceExperience(String spaceExperience) {
		this.spaceExperience = spaceExperience;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRecordDate() {
		return recordDate;
	}
	public void setRecordDate(String recordDate) {
		this.recordDate = recordDate;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "Candidate [id=" + id + ", strength=" + strength + ", emailId=" + emailId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", gender=" + gender + ", superHumanStatus=" + superHumanStatus
				+ ", ironSuitHandle=" + ironSuitHandle + ", mjollnirHandle=" + mjollnirHandle + ", antSuitHandle="
				+ antSuitHandle + ", shieldHandle=" + shieldHandle + ", total=" + total + ", iq=" + iq
				+ ", spaceExperience=" + spaceExperience + ", country=" + country + ", recordDate=" + recordDate
				+ ", birthDate=" + birthDate + "]";
	}
	
	
	
	
	
	

	
}

// Joins
//@OneToMany( cascade = CascadeType.ALL)
//@JoinColumn( name = "user_id_1_M",referencedColumnName = "id")
//List<Complaint> complaints = new ArrayList<Complaint>();


//Date date = new Date();
//SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
//this.recordDate = formatter.format(date);
