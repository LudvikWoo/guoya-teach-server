package com.example.wuling.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserStudentEnrollExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserStudentEnrollExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andEnrollIdIsNull() {
            addCriterion("enroll_id is null");
            return (Criteria) this;
        }

        public Criteria andEnrollIdIsNotNull() {
            addCriterion("enroll_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollIdEqualTo(Integer value) {
            addCriterion("enroll_id =", value, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdNotEqualTo(Integer value) {
            addCriterion("enroll_id <>", value, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdGreaterThan(Integer value) {
            addCriterion("enroll_id >", value, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("enroll_id >=", value, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdLessThan(Integer value) {
            addCriterion("enroll_id <", value, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdLessThanOrEqualTo(Integer value) {
            addCriterion("enroll_id <=", value, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdIn(List<Integer> values) {
            addCriterion("enroll_id in", values, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdNotIn(List<Integer> values) {
            addCriterion("enroll_id not in", values, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdBetween(Integer value1, Integer value2) {
            addCriterion("enroll_id between", value1, value2, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdNotBetween(Integer value1, Integer value2) {
            addCriterion("enroll_id not between", value1, value2, "enrollId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andEnrollDateIsNull() {
            addCriterion("enroll_date is null");
            return (Criteria) this;
        }

        public Criteria andEnrollDateIsNotNull() {
            addCriterion("enroll_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollDateEqualTo(Date value) {
            addCriterion("enroll_date =", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateNotEqualTo(Date value) {
            addCriterion("enroll_date <>", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateGreaterThan(Date value) {
            addCriterion("enroll_date >", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateGreaterThanOrEqualTo(Date value) {
            addCriterion("enroll_date >=", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateLessThan(Date value) {
            addCriterion("enroll_date <", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateLessThanOrEqualTo(Date value) {
            addCriterion("enroll_date <=", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateIn(List<Date> values) {
            addCriterion("enroll_date in", values, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateNotIn(List<Date> values) {
            addCriterion("enroll_date not in", values, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateBetween(Date value1, Date value2) {
            addCriterion("enroll_date between", value1, value2, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateNotBetween(Date value1, Date value2) {
            addCriterion("enroll_date not between", value1, value2, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andCertIsNull() {
            addCriterion("cert is null");
            return (Criteria) this;
        }

        public Criteria andCertIsNotNull() {
            addCriterion("cert is not null");
            return (Criteria) this;
        }

        public Criteria andCertEqualTo(String value) {
            addCriterion("cert =", value, "cert");
            return (Criteria) this;
        }

        public Criteria andCertNotEqualTo(String value) {
            addCriterion("cert <>", value, "cert");
            return (Criteria) this;
        }

        public Criteria andCertGreaterThan(String value) {
            addCriterion("cert >", value, "cert");
            return (Criteria) this;
        }

        public Criteria andCertGreaterThanOrEqualTo(String value) {
            addCriterion("cert >=", value, "cert");
            return (Criteria) this;
        }

        public Criteria andCertLessThan(String value) {
            addCriterion("cert <", value, "cert");
            return (Criteria) this;
        }

        public Criteria andCertLessThanOrEqualTo(String value) {
            addCriterion("cert <=", value, "cert");
            return (Criteria) this;
        }

        public Criteria andCertLike(String value) {
            addCriterion("cert like", value, "cert");
            return (Criteria) this;
        }

        public Criteria andCertNotLike(String value) {
            addCriterion("cert not like", value, "cert");
            return (Criteria) this;
        }

        public Criteria andCertIn(List<String> values) {
            addCriterion("cert in", values, "cert");
            return (Criteria) this;
        }

        public Criteria andCertNotIn(List<String> values) {
            addCriterion("cert not in", values, "cert");
            return (Criteria) this;
        }

        public Criteria andCertBetween(String value1, String value2) {
            addCriterion("cert between", value1, value2, "cert");
            return (Criteria) this;
        }

        public Criteria andCertNotBetween(String value1, String value2) {
            addCriterion("cert not between", value1, value2, "cert");
            return (Criteria) this;
        }

        public Criteria andFeePayedIsNull() {
            addCriterion("fee_payed is null");
            return (Criteria) this;
        }

        public Criteria andFeePayedIsNotNull() {
            addCriterion("fee_payed is not null");
            return (Criteria) this;
        }

        public Criteria andFeePayedEqualTo(Integer value) {
            addCriterion("fee_payed =", value, "feePayed");
            return (Criteria) this;
        }

        public Criteria andFeePayedNotEqualTo(Integer value) {
            addCriterion("fee_payed <>", value, "feePayed");
            return (Criteria) this;
        }

        public Criteria andFeePayedGreaterThan(Integer value) {
            addCriterion("fee_payed >", value, "feePayed");
            return (Criteria) this;
        }

        public Criteria andFeePayedGreaterThanOrEqualTo(Integer value) {
            addCriterion("fee_payed >=", value, "feePayed");
            return (Criteria) this;
        }

        public Criteria andFeePayedLessThan(Integer value) {
            addCriterion("fee_payed <", value, "feePayed");
            return (Criteria) this;
        }

        public Criteria andFeePayedLessThanOrEqualTo(Integer value) {
            addCriterion("fee_payed <=", value, "feePayed");
            return (Criteria) this;
        }

        public Criteria andFeePayedIn(List<Integer> values) {
            addCriterion("fee_payed in", values, "feePayed");
            return (Criteria) this;
        }

        public Criteria andFeePayedNotIn(List<Integer> values) {
            addCriterion("fee_payed not in", values, "feePayed");
            return (Criteria) this;
        }

        public Criteria andFeePayedBetween(Integer value1, Integer value2) {
            addCriterion("fee_payed between", value1, value2, "feePayed");
            return (Criteria) this;
        }

        public Criteria andFeePayedNotBetween(Integer value1, Integer value2) {
            addCriterion("fee_payed not between", value1, value2, "feePayed");
            return (Criteria) this;
        }

        public Criteria andFeeUnpayedIsNull() {
            addCriterion("fee_unpayed is null");
            return (Criteria) this;
        }

        public Criteria andFeeUnpayedIsNotNull() {
            addCriterion("fee_unpayed is not null");
            return (Criteria) this;
        }

        public Criteria andFeeUnpayedEqualTo(Integer value) {
            addCriterion("fee_unpayed =", value, "feeUnpayed");
            return (Criteria) this;
        }

        public Criteria andFeeUnpayedNotEqualTo(Integer value) {
            addCriterion("fee_unpayed <>", value, "feeUnpayed");
            return (Criteria) this;
        }

        public Criteria andFeeUnpayedGreaterThan(Integer value) {
            addCriterion("fee_unpayed >", value, "feeUnpayed");
            return (Criteria) this;
        }

        public Criteria andFeeUnpayedGreaterThanOrEqualTo(Integer value) {
            addCriterion("fee_unpayed >=", value, "feeUnpayed");
            return (Criteria) this;
        }

        public Criteria andFeeUnpayedLessThan(Integer value) {
            addCriterion("fee_unpayed <", value, "feeUnpayed");
            return (Criteria) this;
        }

        public Criteria andFeeUnpayedLessThanOrEqualTo(Integer value) {
            addCriterion("fee_unpayed <=", value, "feeUnpayed");
            return (Criteria) this;
        }

        public Criteria andFeeUnpayedIn(List<Integer> values) {
            addCriterion("fee_unpayed in", values, "feeUnpayed");
            return (Criteria) this;
        }

        public Criteria andFeeUnpayedNotIn(List<Integer> values) {
            addCriterion("fee_unpayed not in", values, "feeUnpayed");
            return (Criteria) this;
        }

        public Criteria andFeeUnpayedBetween(Integer value1, Integer value2) {
            addCriterion("fee_unpayed between", value1, value2, "feeUnpayed");
            return (Criteria) this;
        }

        public Criteria andFeeUnpayedNotBetween(Integer value1, Integer value2) {
            addCriterion("fee_unpayed not between", value1, value2, "feeUnpayed");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(Integer value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(Integer value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(Integer value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(Integer value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(Integer value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(Integer value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<Integer> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<Integer> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(Integer value1, Integer value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(Integer value1, Integer value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNull() {
            addCriterion("insurance is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNotNull() {
            addCriterion("insurance is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEqualTo(Integer value) {
            addCriterion("insurance =", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotEqualTo(Integer value) {
            addCriterion("insurance <>", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThan(Integer value) {
            addCriterion("insurance >", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThanOrEqualTo(Integer value) {
            addCriterion("insurance >=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThan(Integer value) {
            addCriterion("insurance <", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThanOrEqualTo(Integer value) {
            addCriterion("insurance <=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceIn(List<Integer> values) {
            addCriterion("insurance in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotIn(List<Integer> values) {
            addCriterion("insurance not in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceBetween(Integer value1, Integer value2) {
            addCriterion("insurance between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotBetween(Integer value1, Integer value2) {
            addCriterion("insurance not between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andComputorIsNull() {
            addCriterion("computor is null");
            return (Criteria) this;
        }

        public Criteria andComputorIsNotNull() {
            addCriterion("computor is not null");
            return (Criteria) this;
        }

        public Criteria andComputorEqualTo(Integer value) {
            addCriterion("computor =", value, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorNotEqualTo(Integer value) {
            addCriterion("computor <>", value, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorGreaterThan(Integer value) {
            addCriterion("computor >", value, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorGreaterThanOrEqualTo(Integer value) {
            addCriterion("computor >=", value, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorLessThan(Integer value) {
            addCriterion("computor <", value, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorLessThanOrEqualTo(Integer value) {
            addCriterion("computor <=", value, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorIn(List<Integer> values) {
            addCriterion("computor in", values, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorNotIn(List<Integer> values) {
            addCriterion("computor not in", values, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorBetween(Integer value1, Integer value2) {
            addCriterion("computor between", value1, value2, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorNotBetween(Integer value1, Integer value2) {
            addCriterion("computor not between", value1, value2, "computor");
            return (Criteria) this;
        }

        public Criteria andBoardIsNull() {
            addCriterion("board is null");
            return (Criteria) this;
        }

        public Criteria andBoardIsNotNull() {
            addCriterion("board is not null");
            return (Criteria) this;
        }

        public Criteria andBoardEqualTo(Integer value) {
            addCriterion("board =", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardNotEqualTo(Integer value) {
            addCriterion("board <>", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardGreaterThan(Integer value) {
            addCriterion("board >", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardGreaterThanOrEqualTo(Integer value) {
            addCriterion("board >=", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardLessThan(Integer value) {
            addCriterion("board <", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardLessThanOrEqualTo(Integer value) {
            addCriterion("board <=", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardIn(List<Integer> values) {
            addCriterion("board in", values, "board");
            return (Criteria) this;
        }

        public Criteria andBoardNotIn(List<Integer> values) {
            addCriterion("board not in", values, "board");
            return (Criteria) this;
        }

        public Criteria andBoardBetween(Integer value1, Integer value2) {
            addCriterion("board between", value1, value2, "board");
            return (Criteria) this;
        }

        public Criteria andBoardNotBetween(Integer value1, Integer value2) {
            addCriterion("board not between", value1, value2, "board");
            return (Criteria) this;
        }

        public Criteria andBuyEduIsNull() {
            addCriterion("buy_edu is null");
            return (Criteria) this;
        }

        public Criteria andBuyEduIsNotNull() {
            addCriterion("buy_edu is not null");
            return (Criteria) this;
        }

        public Criteria andBuyEduEqualTo(Integer value) {
            addCriterion("buy_edu =", value, "buyEdu");
            return (Criteria) this;
        }

        public Criteria andBuyEduNotEqualTo(Integer value) {
            addCriterion("buy_edu <>", value, "buyEdu");
            return (Criteria) this;
        }

        public Criteria andBuyEduGreaterThan(Integer value) {
            addCriterion("buy_edu >", value, "buyEdu");
            return (Criteria) this;
        }

        public Criteria andBuyEduGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_edu >=", value, "buyEdu");
            return (Criteria) this;
        }

        public Criteria andBuyEduLessThan(Integer value) {
            addCriterion("buy_edu <", value, "buyEdu");
            return (Criteria) this;
        }

        public Criteria andBuyEduLessThanOrEqualTo(Integer value) {
            addCriterion("buy_edu <=", value, "buyEdu");
            return (Criteria) this;
        }

        public Criteria andBuyEduIn(List<Integer> values) {
            addCriterion("buy_edu in", values, "buyEdu");
            return (Criteria) this;
        }

        public Criteria andBuyEduNotIn(List<Integer> values) {
            addCriterion("buy_edu not in", values, "buyEdu");
            return (Criteria) this;
        }

        public Criteria andBuyEduBetween(Integer value1, Integer value2) {
            addCriterion("buy_edu between", value1, value2, "buyEdu");
            return (Criteria) this;
        }

        public Criteria andBuyEduNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_edu not between", value1, value2, "buyEdu");
            return (Criteria) this;
        }

        public Criteria andIntroduceCstIdIsNull() {
            addCriterion("introduce_cst_id is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceCstIdIsNotNull() {
            addCriterion("introduce_cst_id is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceCstIdEqualTo(Integer value) {
            addCriterion("introduce_cst_id =", value, "introduceCstId");
            return (Criteria) this;
        }

        public Criteria andIntroduceCstIdNotEqualTo(Integer value) {
            addCriterion("introduce_cst_id <>", value, "introduceCstId");
            return (Criteria) this;
        }

        public Criteria andIntroduceCstIdGreaterThan(Integer value) {
            addCriterion("introduce_cst_id >", value, "introduceCstId");
            return (Criteria) this;
        }

        public Criteria andIntroduceCstIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("introduce_cst_id >=", value, "introduceCstId");
            return (Criteria) this;
        }

        public Criteria andIntroduceCstIdLessThan(Integer value) {
            addCriterion("introduce_cst_id <", value, "introduceCstId");
            return (Criteria) this;
        }

        public Criteria andIntroduceCstIdLessThanOrEqualTo(Integer value) {
            addCriterion("introduce_cst_id <=", value, "introduceCstId");
            return (Criteria) this;
        }

        public Criteria andIntroduceCstIdIn(List<Integer> values) {
            addCriterion("introduce_cst_id in", values, "introduceCstId");
            return (Criteria) this;
        }

        public Criteria andIntroduceCstIdNotIn(List<Integer> values) {
            addCriterion("introduce_cst_id not in", values, "introduceCstId");
            return (Criteria) this;
        }

        public Criteria andIntroduceCstIdBetween(Integer value1, Integer value2) {
            addCriterion("introduce_cst_id between", value1, value2, "introduceCstId");
            return (Criteria) this;
        }

        public Criteria andIntroduceCstIdNotBetween(Integer value1, Integer value2) {
            addCriterion("introduce_cst_id not between", value1, value2, "introduceCstId");
            return (Criteria) this;
        }

        public Criteria andIntroduceFeeIsNull() {
            addCriterion("introduce_fee is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceFeeIsNotNull() {
            addCriterion("introduce_fee is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceFeeEqualTo(Integer value) {
            addCriterion("introduce_fee =", value, "introduceFee");
            return (Criteria) this;
        }

        public Criteria andIntroduceFeeNotEqualTo(Integer value) {
            addCriterion("introduce_fee <>", value, "introduceFee");
            return (Criteria) this;
        }

        public Criteria andIntroduceFeeGreaterThan(Integer value) {
            addCriterion("introduce_fee >", value, "introduceFee");
            return (Criteria) this;
        }

        public Criteria andIntroduceFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("introduce_fee >=", value, "introduceFee");
            return (Criteria) this;
        }

        public Criteria andIntroduceFeeLessThan(Integer value) {
            addCriterion("introduce_fee <", value, "introduceFee");
            return (Criteria) this;
        }

        public Criteria andIntroduceFeeLessThanOrEqualTo(Integer value) {
            addCriterion("introduce_fee <=", value, "introduceFee");
            return (Criteria) this;
        }

        public Criteria andIntroduceFeeIn(List<Integer> values) {
            addCriterion("introduce_fee in", values, "introduceFee");
            return (Criteria) this;
        }

        public Criteria andIntroduceFeeNotIn(List<Integer> values) {
            addCriterion("introduce_fee not in", values, "introduceFee");
            return (Criteria) this;
        }

        public Criteria andIntroduceFeeBetween(Integer value1, Integer value2) {
            addCriterion("introduce_fee between", value1, value2, "introduceFee");
            return (Criteria) this;
        }

        public Criteria andIntroduceFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("introduce_fee not between", value1, value2, "introduceFee");
            return (Criteria) this;
        }

        public Criteria andChargeCstIdIsNull() {
            addCriterion("charge_cst_id is null");
            return (Criteria) this;
        }

        public Criteria andChargeCstIdIsNotNull() {
            addCriterion("charge_cst_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargeCstIdEqualTo(Integer value) {
            addCriterion("charge_cst_id =", value, "chargeCstId");
            return (Criteria) this;
        }

        public Criteria andChargeCstIdNotEqualTo(Integer value) {
            addCriterion("charge_cst_id <>", value, "chargeCstId");
            return (Criteria) this;
        }

        public Criteria andChargeCstIdGreaterThan(Integer value) {
            addCriterion("charge_cst_id >", value, "chargeCstId");
            return (Criteria) this;
        }

        public Criteria andChargeCstIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_cst_id >=", value, "chargeCstId");
            return (Criteria) this;
        }

        public Criteria andChargeCstIdLessThan(Integer value) {
            addCriterion("charge_cst_id <", value, "chargeCstId");
            return (Criteria) this;
        }

        public Criteria andChargeCstIdLessThanOrEqualTo(Integer value) {
            addCriterion("charge_cst_id <=", value, "chargeCstId");
            return (Criteria) this;
        }

        public Criteria andChargeCstIdIn(List<Integer> values) {
            addCriterion("charge_cst_id in", values, "chargeCstId");
            return (Criteria) this;
        }

        public Criteria andChargeCstIdNotIn(List<Integer> values) {
            addCriterion("charge_cst_id not in", values, "chargeCstId");
            return (Criteria) this;
        }

        public Criteria andChargeCstIdBetween(Integer value1, Integer value2) {
            addCriterion("charge_cst_id between", value1, value2, "chargeCstId");
            return (Criteria) this;
        }

        public Criteria andChargeCstIdNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_cst_id not between", value1, value2, "chargeCstId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdIsNull() {
            addCriterion("operator_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdIsNotNull() {
            addCriterion("operator_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdEqualTo(Integer value) {
            addCriterion("operator_user_id =", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotEqualTo(Integer value) {
            addCriterion("operator_user_id <>", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdGreaterThan(Integer value) {
            addCriterion("operator_user_id >", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator_user_id >=", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdLessThan(Integer value) {
            addCriterion("operator_user_id <", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("operator_user_id <=", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdIn(List<Integer> values) {
            addCriterion("operator_user_id in", values, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotIn(List<Integer> values) {
            addCriterion("operator_user_id not in", values, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdBetween(Integer value1, Integer value2) {
            addCriterion("operator_user_id between", value1, value2, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operator_user_id not between", value1, value2, "operatorUserId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}