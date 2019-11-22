package com.ustglobal.jpawithibernate.onetoonemapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Data
@Entity
@Table
public class Voter_Card 
{
	@Id
	@Column
    private int vid;
	@Column
    private String vname;
	
	@Exclude
	@OneToOne(mappedBy="voterCard")
	private Person person;
	
}
