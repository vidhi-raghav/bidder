package com.task.bidder.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "job")

public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 16384)
    private String description;

    @Column(length = 16384)
    private String requirements;

    @Column(name = "poster_name")
    private String posterName;

    @Column(name = "contact_info")
    private String contactInfo;

    @Column(name = "publication_date")
    private Date publicationDate;

//    @OneToMany(mappedBy = "job")
//    private List<Bid> bids;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public String getPosterName() {
		return posterName;
	}

	public void setPosterName(String posterName) {
		this.posterName = posterName;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

//	public List<Bid> getBids() {
//		return bids;
//	}
//
//	public void setBids(List<Bid> bids) {
//		this.bids = bids;
//	}
    
    

}
