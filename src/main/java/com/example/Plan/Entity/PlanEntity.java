package com.example.Plan.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CreditCardPlan")
public class PlanEntity {
	
	@Id
	int planId;
	
	@Column(nullable = false)
	String planName;
	
	@Column(nullable = false)
	Long planAMount;
	
	@Column(nullable = false)
	Long planInstallMent;
	
	@Column(nullable = false)
	int planYear;
	
	
	
	

	public PlanEntity() {
		super();
	}

	public PlanEntity(int planId, String planName, Long planAMount, Long planInstallMent) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.planAMount = planAMount;
		this.planInstallMent = planInstallMent;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Long getPlanAMount() {
		return planAMount;
	}

	public void setPlanAMount(Long planAMount) {
		this.planAMount = planAMount;
	}

	public Long getPlanInstallMent() {
		return planInstallMent;
	}

	public void setPlanInstallMent(Long planInstallMent) {
		this.planInstallMent = planInstallMent;
	}

	@Override
	public String toString() {
		return "PlanEntity [planId=" + planId + ", planName=" + planName + ", planAMount=" + planAMount
				+ ", planInstallMent=" + planInstallMent + "]";
	}
	
	
	
	

}
