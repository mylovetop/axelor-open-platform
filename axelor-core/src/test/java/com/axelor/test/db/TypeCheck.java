/**
 * Copyright (c) 2012-2014 Axelor. All Rights Reserved.
 *
 * The contents of this file are subject to the Common Public
 * Attribution License Version 1.0 (the “License”); you may not use
 * this file except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://license.axelor.com/.
 *
 * The License is based on the Mozilla Public License Version 1.1 but
 * Sections 14 and 15 have been added to cover use of software over a
 * computer network and provide for limited attribution for the
 * Original Developer. In addition, Exhibit A has been modified to be
 * consistent with Exhibit B.
 *
 * Software distributed under the License is distributed on an “AS IS”
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
 * the License for the specific language governing rights and limitations
 * under the License.
 *
 * The Original Code is part of "Axelor Business Suite", developed by
 * Axelor exclusively.
 *
 * The Original Developer is the Initial Developer. The Initial Developer of
 * the Original Code is Axelor.
 *
 * All portions of the code written by Axelor are
 * Copyright (c) 2012-2014 Axelor. All Rights Reserved.
 */
package com.axelor.test.db;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import com.axelor.db.JpaModel;

@Entity
@Table(name = "CONTACT_TYPE_CHECK")
public class TypeCheck extends JpaModel {

	private Boolean boolValue;

	private Long longValue;

	private Integer intValue;

	private Double doubleValue;

	private boolean boolValue2;

	private long longValue2;

	private int intValue2;

	private double doubleValue2;
	
	@Digits(integer = 20, fraction = 10)
	private BigDecimal decimalValue1;
	
	private BigDecimal decimalValue2;
	
	private DateTime dateTime1;
	
	private DateTime dateTime2;
	
	private LocalDate localDate1;
	
	private LocalDate localDate2;
	
	public Boolean getBoolValue() {
		return boolValue;
	}

	public void setBoolValue(Boolean boolValue) {
		this.boolValue = boolValue;
	}

	public Long getLongValue() {
		return longValue;
	}

	public void setLongValue(Long longValue) {
		this.longValue = longValue;
	}

	public Integer getIntValue() {
		return intValue;
	}

	public void setIntValue(Integer intValue) {
		this.intValue = intValue;
	}

	public Double getDoubleValue() {
		return doubleValue;
	}

	public void setDoubleValue(Double doubleValue) {
		this.doubleValue = doubleValue;
	}

	public boolean isBoolValue2() {
		return boolValue2;
	}

	public void setBoolValue2(boolean boolValue2) {
		this.boolValue2 = boolValue2;
	}

	public long getLongValue2() {
		return longValue2;
	}

	public void setLongValue2(long longValue2) {
		this.longValue2 = longValue2;
	}

	public int getIntValue2() {
		return intValue2;
	}

	public void setIntValue2(int intValue2) {
		this.intValue2 = intValue2;
	}

	public double getDoubleValue2() {
		return doubleValue2;
	}

	public void setDoubleValue2(double doubleValue2) {
		this.doubleValue2 = doubleValue2;
	}

	public BigDecimal getDecimalValue1() {
		return decimalValue1;
	}

	public void setDecimalValue1(BigDecimal decimalValue1) {
		this.decimalValue1 = decimalValue1;
	}

	public BigDecimal getDecimalValue2() {
		return decimalValue2;
	}

	public void setDecimalValue2(BigDecimal decimalValue2) {
		this.decimalValue2 = decimalValue2;
	}

	public DateTime getDateTime1() {
		return dateTime1;
	}

	public void setDateTime1(DateTime dateTime1) {
		this.dateTime1 = dateTime1;
	}

	public DateTime getDateTime2() {
		return dateTime2;
	}

	public void setDateTime2(DateTime dateTime2) {
		this.dateTime2 = dateTime2;
	}

	public LocalDate getLocalDate1() {
		return localDate1;
	}

	public void setLocalDate1(LocalDate localDate1) {
		this.localDate1 = localDate1;
	}

	public LocalDate getLocalDate2() {
		return localDate2;
	}

	public void setLocalDate2(LocalDate localDate2) {
		this.localDate2 = localDate2;
	}
}
