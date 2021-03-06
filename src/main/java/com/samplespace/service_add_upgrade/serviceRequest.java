package com.samplespace.service_add_upgrade;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class serviceRequest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Customer Id")
	private java.lang.String custId;
	@org.kie.api.definition.type.Label("Service Id")
	private java.lang.String servId;
	@org.kie.api.definition.type.Label("Credit Approved")
	private java.lang.Boolean creditApproved;
	@org.kie.api.definition.type.Label("Contractive Active")
	private java.lang.Boolean contractActive;
	@org.kie.api.definition.type.Label("Account Balance ")
	private java.lang.Integer accBal;
	@org.kie.api.definition.type.Label("Service Type")
	private java.lang.String servType;

	public serviceRequest() {
	}

	public java.lang.String getCustId() {
		return this.custId;
	}

	public void setCustId(java.lang.String custId) {
		this.custId = custId;
	}

	public java.lang.String getServId() {
		return this.servId;
	}

	public void setServId(java.lang.String servId) {
		this.servId = servId;
	}

	public java.lang.Boolean getCreditApproved() {
		return this.creditApproved;
	}

	public void setCreditApproved(java.lang.Boolean creditApproved) {
		this.creditApproved = creditApproved;
	}

	public java.lang.Boolean getContractActive() {
		return this.contractActive;
	}

	public void setContractActive(java.lang.Boolean contractActive) {
		this.contractActive = contractActive;
	}

	public java.lang.Integer getAccBal() {
		return this.accBal;
	}

	public void setAccBal(java.lang.Integer accBal) {
		this.accBal = accBal;
	}

	public java.lang.String getServType() {
		return this.servType;
	}

	public void setServType(java.lang.String servType) {
		this.servType = servType;
	}

	public serviceRequest(java.lang.String custId, java.lang.String servId,
			java.lang.Boolean creditApproved, java.lang.Boolean contractActive,
			java.lang.Integer accBal, java.lang.String servType) {
		this.custId = custId;
		this.servId = servId;
		this.creditApproved = creditApproved;
		this.contractActive = contractActive;
		this.accBal = accBal;
		this.servType = servType;
	}

}