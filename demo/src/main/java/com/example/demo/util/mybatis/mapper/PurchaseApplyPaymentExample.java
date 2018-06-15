package com.example.demo.util.mybatis.mapper;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PurchaseApplyPaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseApplyPaymentExample() {
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

        public Criteria andPKIDIsNull() {
            addCriterion("PKID is null");
            return (Criteria) this;
        }

        public Criteria andPKIDIsNotNull() {
            addCriterion("PKID is not null");
            return (Criteria) this;
        }

        public Criteria andPKIDEqualTo(Integer value) {
            addCriterion("PKID =", value, "PKID");
            return (Criteria) this;
        }

        public Criteria andPKIDNotEqualTo(Integer value) {
            addCriterion("PKID <>", value, "PKID");
            return (Criteria) this;
        }

        public Criteria andPKIDGreaterThan(Integer value) {
            addCriterion("PKID >", value, "PKID");
            return (Criteria) this;
        }

        public Criteria andPKIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("PKID >=", value, "PKID");
            return (Criteria) this;
        }

        public Criteria andPKIDLessThan(Integer value) {
            addCriterion("PKID <", value, "PKID");
            return (Criteria) this;
        }

        public Criteria andPKIDLessThanOrEqualTo(Integer value) {
            addCriterion("PKID <=", value, "PKID");
            return (Criteria) this;
        }

        public Criteria andPKIDIn(List<Integer> values) {
            addCriterion("PKID in", values, "PKID");
            return (Criteria) this;
        }

        public Criteria andPKIDNotIn(List<Integer> values) {
            addCriterion("PKID not in", values, "PKID");
            return (Criteria) this;
        }

        public Criteria andPKIDBetween(Integer value1, Integer value2) {
            addCriterion("PKID between", value1, value2, "PKID");
            return (Criteria) this;
        }

        public Criteria andPKIDNotBetween(Integer value1, Integer value2) {
            addCriterion("PKID not between", value1, value2, "PKID");
            return (Criteria) this;
        }

        public Criteria andBillNoIsNull() {
            addCriterion("BillNo is null");
            return (Criteria) this;
        }

        public Criteria andBillNoIsNotNull() {
            addCriterion("BillNo is not null");
            return (Criteria) this;
        }

        public Criteria andBillNoEqualTo(String value) {
            addCriterion("BillNo =", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotEqualTo(String value) {
            addCriterion("BillNo <>", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThan(String value) {
            addCriterion("BillNo >", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("BillNo >=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThan(String value) {
            addCriterion("BillNo <", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThanOrEqualTo(String value) {
            addCriterion("BillNo <=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLike(String value) {
            addCriterion("BillNo like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotLike(String value) {
            addCriterion("BillNo not like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoIn(List<String> values) {
            addCriterion("BillNo in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotIn(List<String> values) {
            addCriterion("BillNo not in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoBetween(String value1, String value2) {
            addCriterion("BillNo between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotBetween(String value1, String value2) {
            addCriterion("BillNo not between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andPoiIdIsNull() {
            addCriterion("PoiId is null");
            return (Criteria) this;
        }

        public Criteria andPoiIdIsNotNull() {
            addCriterion("PoiId is not null");
            return (Criteria) this;
        }

        public Criteria andPoiIdEqualTo(Integer value) {
            addCriterion("PoiId =", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotEqualTo(Integer value) {
            addCriterion("PoiId <>", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdGreaterThan(Integer value) {
            addCriterion("PoiId >", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PoiId >=", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdLessThan(Integer value) {
            addCriterion("PoiId <", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdLessThanOrEqualTo(Integer value) {
            addCriterion("PoiId <=", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdIn(List<Integer> values) {
            addCriterion("PoiId in", values, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotIn(List<Integer> values) {
            addCriterion("PoiId not in", values, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdBetween(Integer value1, Integer value2) {
            addCriterion("PoiId between", value1, value2, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PoiId not between", value1, value2, "poiId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("ProductName is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("ProductName is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("ProductName =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("ProductName <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("ProductName >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("ProductName >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("ProductName <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("ProductName <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("ProductName like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("ProductName not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("ProductName in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("ProductName not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("ProductName between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("ProductName not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andPayerIsNull() {
            addCriterion("Payer is null");
            return (Criteria) this;
        }

        public Criteria andPayerIsNotNull() {
            addCriterion("Payer is not null");
            return (Criteria) this;
        }

        public Criteria andPayerEqualTo(String value) {
            addCriterion("Payer =", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotEqualTo(String value) {
            addCriterion("Payer <>", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThan(String value) {
            addCriterion("Payer >", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThanOrEqualTo(String value) {
            addCriterion("Payer >=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThan(String value) {
            addCriterion("Payer <", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThanOrEqualTo(String value) {
            addCriterion("Payer <=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLike(String value) {
            addCriterion("Payer like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotLike(String value) {
            addCriterion("Payer not like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerIn(List<String> values) {
            addCriterion("Payer in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotIn(List<String> values) {
            addCriterion("Payer not in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerBetween(String value1, String value2) {
            addCriterion("Payer between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotBetween(String value1, String value2) {
            addCriterion("Payer not between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNull() {
            addCriterion("Payee is null");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNotNull() {
            addCriterion("Payee is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeEqualTo(String value) {
            addCriterion("Payee =", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotEqualTo(String value) {
            addCriterion("Payee <>", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThan(String value) {
            addCriterion("Payee >", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThanOrEqualTo(String value) {
            addCriterion("Payee >=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThan(String value) {
            addCriterion("Payee <", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThanOrEqualTo(String value) {
            addCriterion("Payee <=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLike(String value) {
            addCriterion("Payee like", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotLike(String value) {
            addCriterion("Payee not like", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeIn(List<String> values) {
            addCriterion("Payee in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotIn(List<String> values) {
            addCriterion("Payee not in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeBetween(String value1, String value2) {
            addCriterion("Payee between", value1, value2, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotBetween(String value1, String value2) {
            addCriterion("Payee not between", value1, value2, "payee");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("Account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("Account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("Account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("Account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("Account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("Account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("Account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("Account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("Account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("Account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("Account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("Account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("Account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("Account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("Bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("Bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("Bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("Bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("Bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("Bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("Bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("Bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("Bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("Bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("Bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("Bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("Bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("Bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("Amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("Amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("Amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("Amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("Amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("Amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("Amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("Amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountIsNull() {
            addCriterion("FreightAmount is null");
            return (Criteria) this;
        }

        public Criteria andFreightAmountIsNotNull() {
            addCriterion("FreightAmount is not null");
            return (Criteria) this;
        }

        public Criteria andFreightAmountEqualTo(BigDecimal value) {
            addCriterion("FreightAmount =", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountNotEqualTo(BigDecimal value) {
            addCriterion("FreightAmount <>", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountGreaterThan(BigDecimal value) {
            addCriterion("FreightAmount >", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FreightAmount >=", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountLessThan(BigDecimal value) {
            addCriterion("FreightAmount <", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FreightAmount <=", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountIn(List<BigDecimal> values) {
            addCriterion("FreightAmount in", values, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountNotIn(List<BigDecimal> values) {
            addCriterion("FreightAmount not in", values, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FreightAmount between", value1, value2, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FreightAmount not between", value1, value2, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andIsPlainInvoiceIsNull() {
            addCriterion("IsPlainInvoice is null");
            return (Criteria) this;
        }

        public Criteria andIsPlainInvoiceIsNotNull() {
            addCriterion("IsPlainInvoice is not null");
            return (Criteria) this;
        }

        public Criteria andIsPlainInvoiceEqualTo(Boolean value) {
            addCriterion("IsPlainInvoice =", value, "isPlainInvoice");
            return (Criteria) this;
        }

        public Criteria andIsPlainInvoiceNotEqualTo(Boolean value) {
            addCriterion("IsPlainInvoice <>", value, "isPlainInvoice");
            return (Criteria) this;
        }

        public Criteria andIsPlainInvoiceGreaterThan(Boolean value) {
            addCriterion("IsPlainInvoice >", value, "isPlainInvoice");
            return (Criteria) this;
        }

        public Criteria andIsPlainInvoiceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsPlainInvoice >=", value, "isPlainInvoice");
            return (Criteria) this;
        }

        public Criteria andIsPlainInvoiceLessThan(Boolean value) {
            addCriterion("IsPlainInvoice <", value, "isPlainInvoice");
            return (Criteria) this;
        }

        public Criteria andIsPlainInvoiceLessThanOrEqualTo(Boolean value) {
            addCriterion("IsPlainInvoice <=", value, "isPlainInvoice");
            return (Criteria) this;
        }

        public Criteria andIsPlainInvoiceIn(List<Boolean> values) {
            addCriterion("IsPlainInvoice in", values, "isPlainInvoice");
            return (Criteria) this;
        }

        public Criteria andIsPlainInvoiceNotIn(List<Boolean> values) {
            addCriterion("IsPlainInvoice not in", values, "isPlainInvoice");
            return (Criteria) this;
        }

        public Criteria andIsPlainInvoiceBetween(Boolean value1, Boolean value2) {
            addCriterion("IsPlainInvoice between", value1, value2, "isPlainInvoice");
            return (Criteria) this;
        }

        public Criteria andIsPlainInvoiceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsPlainInvoice not between", value1, value2, "isPlainInvoice");
            return (Criteria) this;
        }

        public Criteria andIs17TaxInvoiceIsNull() {
            addCriterion("Is17TaxInvoice is null");
            return (Criteria) this;
        }

        public Criteria andIs17TaxInvoiceIsNotNull() {
            addCriterion("Is17TaxInvoice is not null");
            return (Criteria) this;
        }

        public Criteria andIs17TaxInvoiceEqualTo(Boolean value) {
            addCriterion("Is17TaxInvoice =", value, "is17TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs17TaxInvoiceNotEqualTo(Boolean value) {
            addCriterion("Is17TaxInvoice <>", value, "is17TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs17TaxInvoiceGreaterThan(Boolean value) {
            addCriterion("Is17TaxInvoice >", value, "is17TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs17TaxInvoiceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Is17TaxInvoice >=", value, "is17TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs17TaxInvoiceLessThan(Boolean value) {
            addCriterion("Is17TaxInvoice <", value, "is17TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs17TaxInvoiceLessThanOrEqualTo(Boolean value) {
            addCriterion("Is17TaxInvoice <=", value, "is17TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs17TaxInvoiceIn(List<Boolean> values) {
            addCriterion("Is17TaxInvoice in", values, "is17TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs17TaxInvoiceNotIn(List<Boolean> values) {
            addCriterion("Is17TaxInvoice not in", values, "is17TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs17TaxInvoiceBetween(Boolean value1, Boolean value2) {
            addCriterion("Is17TaxInvoice between", value1, value2, "is17TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs17TaxInvoiceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Is17TaxInvoice not between", value1, value2, "is17TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs6TaxInvoiceIsNull() {
            addCriterion("Is6TaxInvoice is null");
            return (Criteria) this;
        }

        public Criteria andIs6TaxInvoiceIsNotNull() {
            addCriterion("Is6TaxInvoice is not null");
            return (Criteria) this;
        }

        public Criteria andIs6TaxInvoiceEqualTo(Boolean value) {
            addCriterion("Is6TaxInvoice =", value, "is6TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs6TaxInvoiceNotEqualTo(Boolean value) {
            addCriterion("Is6TaxInvoice <>", value, "is6TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs6TaxInvoiceGreaterThan(Boolean value) {
            addCriterion("Is6TaxInvoice >", value, "is6TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs6TaxInvoiceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Is6TaxInvoice >=", value, "is6TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs6TaxInvoiceLessThan(Boolean value) {
            addCriterion("Is6TaxInvoice <", value, "is6TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs6TaxInvoiceLessThanOrEqualTo(Boolean value) {
            addCriterion("Is6TaxInvoice <=", value, "is6TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs6TaxInvoiceIn(List<Boolean> values) {
            addCriterion("Is6TaxInvoice in", values, "is6TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs6TaxInvoiceNotIn(List<Boolean> values) {
            addCriterion("Is6TaxInvoice not in", values, "is6TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs6TaxInvoiceBetween(Boolean value1, Boolean value2) {
            addCriterion("Is6TaxInvoice between", value1, value2, "is6TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIs6TaxInvoiceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Is6TaxInvoice not between", value1, value2, "is6TaxInvoice");
            return (Criteria) this;
        }

        public Criteria andIsOtherInvoiceIsNull() {
            addCriterion("IsOtherInvoice is null");
            return (Criteria) this;
        }

        public Criteria andIsOtherInvoiceIsNotNull() {
            addCriterion("IsOtherInvoice is not null");
            return (Criteria) this;
        }

        public Criteria andIsOtherInvoiceEqualTo(Boolean value) {
            addCriterion("IsOtherInvoice =", value, "isOtherInvoice");
            return (Criteria) this;
        }

        public Criteria andIsOtherInvoiceNotEqualTo(Boolean value) {
            addCriterion("IsOtherInvoice <>", value, "isOtherInvoice");
            return (Criteria) this;
        }

        public Criteria andIsOtherInvoiceGreaterThan(Boolean value) {
            addCriterion("IsOtherInvoice >", value, "isOtherInvoice");
            return (Criteria) this;
        }

        public Criteria andIsOtherInvoiceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsOtherInvoice >=", value, "isOtherInvoice");
            return (Criteria) this;
        }

        public Criteria andIsOtherInvoiceLessThan(Boolean value) {
            addCriterion("IsOtherInvoice <", value, "isOtherInvoice");
            return (Criteria) this;
        }

        public Criteria andIsOtherInvoiceLessThanOrEqualTo(Boolean value) {
            addCriterion("IsOtherInvoice <=", value, "isOtherInvoice");
            return (Criteria) this;
        }

        public Criteria andIsOtherInvoiceIn(List<Boolean> values) {
            addCriterion("IsOtherInvoice in", values, "isOtherInvoice");
            return (Criteria) this;
        }

        public Criteria andIsOtherInvoiceNotIn(List<Boolean> values) {
            addCriterion("IsOtherInvoice not in", values, "isOtherInvoice");
            return (Criteria) this;
        }

        public Criteria andIsOtherInvoiceBetween(Boolean value1, Boolean value2) {
            addCriterion("IsOtherInvoice between", value1, value2, "isOtherInvoice");
            return (Criteria) this;
        }

        public Criteria andIsOtherInvoiceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsOtherInvoice not between", value1, value2, "isOtherInvoice");
            return (Criteria) this;
        }

        public Criteria andIsTakedInvoiceIsNull() {
            addCriterion("IsTakedInvoice is null");
            return (Criteria) this;
        }

        public Criteria andIsTakedInvoiceIsNotNull() {
            addCriterion("IsTakedInvoice is not null");
            return (Criteria) this;
        }

        public Criteria andIsTakedInvoiceEqualTo(Boolean value) {
            addCriterion("IsTakedInvoice =", value, "isTakedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsTakedInvoiceNotEqualTo(Boolean value) {
            addCriterion("IsTakedInvoice <>", value, "isTakedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsTakedInvoiceGreaterThan(Boolean value) {
            addCriterion("IsTakedInvoice >", value, "isTakedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsTakedInvoiceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsTakedInvoice >=", value, "isTakedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsTakedInvoiceLessThan(Boolean value) {
            addCriterion("IsTakedInvoice <", value, "isTakedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsTakedInvoiceLessThanOrEqualTo(Boolean value) {
            addCriterion("IsTakedInvoice <=", value, "isTakedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsTakedInvoiceIn(List<Boolean> values) {
            addCriterion("IsTakedInvoice in", values, "isTakedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsTakedInvoiceNotIn(List<Boolean> values) {
            addCriterion("IsTakedInvoice not in", values, "isTakedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsTakedInvoiceBetween(Boolean value1, Boolean value2) {
            addCriterion("IsTakedInvoice between", value1, value2, "isTakedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsTakedInvoiceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsTakedInvoice not between", value1, value2, "isTakedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsGoodsArrivalIsNull() {
            addCriterion("IsGoodsArrival is null");
            return (Criteria) this;
        }

        public Criteria andIsGoodsArrivalIsNotNull() {
            addCriterion("IsGoodsArrival is not null");
            return (Criteria) this;
        }

        public Criteria andIsGoodsArrivalEqualTo(Boolean value) {
            addCriterion("IsGoodsArrival =", value, "isGoodsArrival");
            return (Criteria) this;
        }

        public Criteria andIsGoodsArrivalNotEqualTo(Boolean value) {
            addCriterion("IsGoodsArrival <>", value, "isGoodsArrival");
            return (Criteria) this;
        }

        public Criteria andIsGoodsArrivalGreaterThan(Boolean value) {
            addCriterion("IsGoodsArrival >", value, "isGoodsArrival");
            return (Criteria) this;
        }

        public Criteria andIsGoodsArrivalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsGoodsArrival >=", value, "isGoodsArrival");
            return (Criteria) this;
        }

        public Criteria andIsGoodsArrivalLessThan(Boolean value) {
            addCriterion("IsGoodsArrival <", value, "isGoodsArrival");
            return (Criteria) this;
        }

        public Criteria andIsGoodsArrivalLessThanOrEqualTo(Boolean value) {
            addCriterion("IsGoodsArrival <=", value, "isGoodsArrival");
            return (Criteria) this;
        }

        public Criteria andIsGoodsArrivalIn(List<Boolean> values) {
            addCriterion("IsGoodsArrival in", values, "isGoodsArrival");
            return (Criteria) this;
        }

        public Criteria andIsGoodsArrivalNotIn(List<Boolean> values) {
            addCriterion("IsGoodsArrival not in", values, "isGoodsArrival");
            return (Criteria) this;
        }

        public Criteria andIsGoodsArrivalBetween(Boolean value1, Boolean value2) {
            addCriterion("IsGoodsArrival between", value1, value2, "isGoodsArrival");
            return (Criteria) this;
        }

        public Criteria andIsGoodsArrivalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsGoodsArrival not between", value1, value2, "isGoodsArrival");
            return (Criteria) this;
        }

        public Criteria andChineseSumAmountIsNull() {
            addCriterion("ChineseSumAmount is null");
            return (Criteria) this;
        }

        public Criteria andChineseSumAmountIsNotNull() {
            addCriterion("ChineseSumAmount is not null");
            return (Criteria) this;
        }

        public Criteria andChineseSumAmountEqualTo(String value) {
            addCriterion("ChineseSumAmount =", value, "chineseSumAmount");
            return (Criteria) this;
        }

        public Criteria andChineseSumAmountNotEqualTo(String value) {
            addCriterion("ChineseSumAmount <>", value, "chineseSumAmount");
            return (Criteria) this;
        }

        public Criteria andChineseSumAmountGreaterThan(String value) {
            addCriterion("ChineseSumAmount >", value, "chineseSumAmount");
            return (Criteria) this;
        }

        public Criteria andChineseSumAmountGreaterThanOrEqualTo(String value) {
            addCriterion("ChineseSumAmount >=", value, "chineseSumAmount");
            return (Criteria) this;
        }

        public Criteria andChineseSumAmountLessThan(String value) {
            addCriterion("ChineseSumAmount <", value, "chineseSumAmount");
            return (Criteria) this;
        }

        public Criteria andChineseSumAmountLessThanOrEqualTo(String value) {
            addCriterion("ChineseSumAmount <=", value, "chineseSumAmount");
            return (Criteria) this;
        }

        public Criteria andChineseSumAmountLike(String value) {
            addCriterion("ChineseSumAmount like", value, "chineseSumAmount");
            return (Criteria) this;
        }

        public Criteria andChineseSumAmountNotLike(String value) {
            addCriterion("ChineseSumAmount not like", value, "chineseSumAmount");
            return (Criteria) this;
        }

        public Criteria andChineseSumAmountIn(List<String> values) {
            addCriterion("ChineseSumAmount in", values, "chineseSumAmount");
            return (Criteria) this;
        }

        public Criteria andChineseSumAmountNotIn(List<String> values) {
            addCriterion("ChineseSumAmount not in", values, "chineseSumAmount");
            return (Criteria) this;
        }

        public Criteria andChineseSumAmountBetween(String value1, String value2) {
            addCriterion("ChineseSumAmount between", value1, value2, "chineseSumAmount");
            return (Criteria) this;
        }

        public Criteria andChineseSumAmountNotBetween(String value1, String value2) {
            addCriterion("ChineseSumAmount not between", value1, value2, "chineseSumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountIsNull() {
            addCriterion("SumAmount is null");
            return (Criteria) this;
        }

        public Criteria andSumAmountIsNotNull() {
            addCriterion("SumAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSumAmountEqualTo(BigDecimal value) {
            addCriterion("SumAmount =", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountNotEqualTo(BigDecimal value) {
            addCriterion("SumAmount <>", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountGreaterThan(BigDecimal value) {
            addCriterion("SumAmount >", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SumAmount >=", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountLessThan(BigDecimal value) {
            addCriterion("SumAmount <", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SumAmount <=", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountIn(List<BigDecimal> values) {
            addCriterion("SumAmount in", values, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountNotIn(List<BigDecimal> values) {
            addCriterion("SumAmount not in", values, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumAmount between", value1, value2, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumAmount not between", value1, value2, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNull() {
            addCriterion("BatchNo is null");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNotNull() {
            addCriterion("BatchNo is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNoEqualTo(Integer value) {
            addCriterion("BatchNo =", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotEqualTo(Integer value) {
            addCriterion("BatchNo <>", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThan(Integer value) {
            addCriterion("BatchNo >", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("BatchNo >=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThan(Integer value) {
            addCriterion("BatchNo <", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThanOrEqualTo(Integer value) {
            addCriterion("BatchNo <=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoIn(List<Integer> values) {
            addCriterion("BatchNo in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotIn(List<Integer> values) {
            addCriterion("BatchNo not in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoBetween(Integer value1, Integer value2) {
            addCriterion("BatchNo between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotBetween(Integer value1, Integer value2) {
            addCriterion("BatchNo not between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("AuditStatus is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("AuditStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Integer value) {
            addCriterion("AuditStatus =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Integer value) {
            addCriterion("AuditStatus <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Integer value) {
            addCriterion("AuditStatus >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("AuditStatus >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Integer value) {
            addCriterion("AuditStatus <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Integer value) {
            addCriterion("AuditStatus <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Integer> values) {
            addCriterion("AuditStatus in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Integer> values) {
            addCriterion("AuditStatus not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Integer value1, Integer value2) {
            addCriterion("AuditStatus between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("AuditStatus not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("Creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("Creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("Creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("Creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("Creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("Creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("Creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("Creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("Creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("Creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("Creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("Creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("Creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("Creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("CreatedDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("CreatedDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(LocalDateTime value) {
            addCriterion("CreatedDate =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(LocalDateTime value) {
            addCriterion("CreatedDate <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(LocalDateTime value) {
            addCriterion("CreatedDate >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("CreatedDate >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(LocalDateTime value) {
            addCriterion("CreatedDate <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("CreatedDate <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<LocalDateTime> values) {
            addCriterion("CreatedDate in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<LocalDateTime> values) {
            addCriterion("CreatedDate not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("CreatedDate between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("CreatedDate not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("ModifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("ModifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(LocalDateTime value) {
            addCriterion("ModifyDate =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(LocalDateTime value) {
            addCriterion("ModifyDate <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(LocalDateTime value) {
            addCriterion("ModifyDate >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("ModifyDate >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(LocalDateTime value) {
            addCriterion("ModifyDate <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("ModifyDate <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<LocalDateTime> values) {
            addCriterion("ModifyDate in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<LocalDateTime> values) {
            addCriterion("ModifyDate not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("ModifyDate between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("ModifyDate not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("Modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("Modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("Modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("Modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("Modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("Modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("Modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("Modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("Modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("Modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("Modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("Modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("Modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("Modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("Reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("Reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("Reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("Reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("Reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("Reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("Reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("Reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("Reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("Reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("Reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("Reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("Reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("Reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andVoucherUrlIsNull() {
            addCriterion("VoucherUrl is null");
            return (Criteria) this;
        }

        public Criteria andVoucherUrlIsNotNull() {
            addCriterion("VoucherUrl is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherUrlEqualTo(String value) {
            addCriterion("VoucherUrl =", value, "voucherUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherUrlNotEqualTo(String value) {
            addCriterion("VoucherUrl <>", value, "voucherUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherUrlGreaterThan(String value) {
            addCriterion("VoucherUrl >", value, "voucherUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherUrlGreaterThanOrEqualTo(String value) {
            addCriterion("VoucherUrl >=", value, "voucherUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherUrlLessThan(String value) {
            addCriterion("VoucherUrl <", value, "voucherUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherUrlLessThanOrEqualTo(String value) {
            addCriterion("VoucherUrl <=", value, "voucherUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherUrlLike(String value) {
            addCriterion("VoucherUrl like", value, "voucherUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherUrlNotLike(String value) {
            addCriterion("VoucherUrl not like", value, "voucherUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherUrlIn(List<String> values) {
            addCriterion("VoucherUrl in", values, "voucherUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherUrlNotIn(List<String> values) {
            addCriterion("VoucherUrl not in", values, "voucherUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherUrlBetween(String value1, String value2) {
            addCriterion("VoucherUrl between", value1, value2, "voucherUrl");
            return (Criteria) this;
        }

        public Criteria andVoucherUrlNotBetween(String value1, String value2) {
            addCriterion("VoucherUrl not between", value1, value2, "voucherUrl");
            return (Criteria) this;
        }

        public Criteria andPaidByIsNull() {
            addCriterion("PaidBy is null");
            return (Criteria) this;
        }

        public Criteria andPaidByIsNotNull() {
            addCriterion("PaidBy is not null");
            return (Criteria) this;
        }

        public Criteria andPaidByEqualTo(String value) {
            addCriterion("PaidBy =", value, "paidBy");
            return (Criteria) this;
        }

        public Criteria andPaidByNotEqualTo(String value) {
            addCriterion("PaidBy <>", value, "paidBy");
            return (Criteria) this;
        }

        public Criteria andPaidByGreaterThan(String value) {
            addCriterion("PaidBy >", value, "paidBy");
            return (Criteria) this;
        }

        public Criteria andPaidByGreaterThanOrEqualTo(String value) {
            addCriterion("PaidBy >=", value, "paidBy");
            return (Criteria) this;
        }

        public Criteria andPaidByLessThan(String value) {
            addCriterion("PaidBy <", value, "paidBy");
            return (Criteria) this;
        }

        public Criteria andPaidByLessThanOrEqualTo(String value) {
            addCriterion("PaidBy <=", value, "paidBy");
            return (Criteria) this;
        }

        public Criteria andPaidByLike(String value) {
            addCriterion("PaidBy like", value, "paidBy");
            return (Criteria) this;
        }

        public Criteria andPaidByNotLike(String value) {
            addCriterion("PaidBy not like", value, "paidBy");
            return (Criteria) this;
        }

        public Criteria andPaidByIn(List<String> values) {
            addCriterion("PaidBy in", values, "paidBy");
            return (Criteria) this;
        }

        public Criteria andPaidByNotIn(List<String> values) {
            addCriterion("PaidBy not in", values, "paidBy");
            return (Criteria) this;
        }

        public Criteria andPaidByBetween(String value1, String value2) {
            addCriterion("PaidBy between", value1, value2, "paidBy");
            return (Criteria) this;
        }

        public Criteria andPaidByNotBetween(String value1, String value2) {
            addCriterion("PaidBy not between", value1, value2, "paidBy");
            return (Criteria) this;
        }

        public Criteria andPaidDateIsNull() {
            addCriterion("PaidDate is null");
            return (Criteria) this;
        }

        public Criteria andPaidDateIsNotNull() {
            addCriterion("PaidDate is not null");
            return (Criteria) this;
        }

        public Criteria andPaidDateEqualTo(LocalDateTime value) {
            addCriterion("PaidDate =", value, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateNotEqualTo(LocalDateTime value) {
            addCriterion("PaidDate <>", value, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateGreaterThan(LocalDateTime value) {
            addCriterion("PaidDate >", value, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("PaidDate >=", value, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateLessThan(LocalDateTime value) {
            addCriterion("PaidDate <", value, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("PaidDate <=", value, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateIn(List<LocalDateTime> values) {
            addCriterion("PaidDate in", values, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateNotIn(List<LocalDateTime> values) {
            addCriterion("PaidDate not in", values, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("PaidDate between", value1, value2, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("PaidDate not between", value1, value2, "paidDate");
            return (Criteria) this;
        }

        public Criteria andDownloadsIsNull() {
            addCriterion("Downloads is null");
            return (Criteria) this;
        }

        public Criteria andDownloadsIsNotNull() {
            addCriterion("Downloads is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadsEqualTo(Integer value) {
            addCriterion("Downloads =", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotEqualTo(Integer value) {
            addCriterion("Downloads <>", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsGreaterThan(Integer value) {
            addCriterion("Downloads >", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsGreaterThanOrEqualTo(Integer value) {
            addCriterion("Downloads >=", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsLessThan(Integer value) {
            addCriterion("Downloads <", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsLessThanOrEqualTo(Integer value) {
            addCriterion("Downloads <=", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsIn(List<Integer> values) {
            addCriterion("Downloads in", values, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotIn(List<Integer> values) {
            addCriterion("Downloads not in", values, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsBetween(Integer value1, Integer value2) {
            addCriterion("Downloads between", value1, value2, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotBetween(Integer value1, Integer value2) {
            addCriterion("Downloads not between", value1, value2, "downloads");
            return (Criteria) this;
        }

        public Criteria andPrintCountIsNull() {
            addCriterion("PrintCount is null");
            return (Criteria) this;
        }

        public Criteria andPrintCountIsNotNull() {
            addCriterion("PrintCount is not null");
            return (Criteria) this;
        }

        public Criteria andPrintCountEqualTo(Integer value) {
            addCriterion("PrintCount =", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountNotEqualTo(Integer value) {
            addCriterion("PrintCount <>", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountGreaterThan(Integer value) {
            addCriterion("PrintCount >", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PrintCount >=", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountLessThan(Integer value) {
            addCriterion("PrintCount <", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountLessThanOrEqualTo(Integer value) {
            addCriterion("PrintCount <=", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountIn(List<Integer> values) {
            addCriterion("PrintCount in", values, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountNotIn(List<Integer> values) {
            addCriterion("PrintCount not in", values, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountBetween(Integer value1, Integer value2) {
            addCriterion("PrintCount between", value1, value2, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountNotBetween(Integer value1, Integer value2) {
            addCriterion("PrintCount not between", value1, value2, "printCount");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNull() {
            addCriterion("IsNew is null");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNotNull() {
            addCriterion("IsNew is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewEqualTo(Boolean value) {
            addCriterion("IsNew =", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotEqualTo(Boolean value) {
            addCriterion("IsNew <>", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThan(Boolean value) {
            addCriterion("IsNew >", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsNew >=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThan(Boolean value) {
            addCriterion("IsNew <", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThanOrEqualTo(Boolean value) {
            addCriterion("IsNew <=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewIn(List<Boolean> values) {
            addCriterion("IsNew in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotIn(List<Boolean> values) {
            addCriterion("IsNew not in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewBetween(Boolean value1, Boolean value2) {
            addCriterion("IsNew between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsNew not between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andSumBalanceIsNull() {
            addCriterion("SumBalance is null");
            return (Criteria) this;
        }

        public Criteria andSumBalanceIsNotNull() {
            addCriterion("SumBalance is not null");
            return (Criteria) this;
        }

        public Criteria andSumBalanceEqualTo(BigDecimal value) {
            addCriterion("SumBalance =", value, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andSumBalanceNotEqualTo(BigDecimal value) {
            addCriterion("SumBalance <>", value, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andSumBalanceGreaterThan(BigDecimal value) {
            addCriterion("SumBalance >", value, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andSumBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SumBalance >=", value, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andSumBalanceLessThan(BigDecimal value) {
            addCriterion("SumBalance <", value, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andSumBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SumBalance <=", value, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andSumBalanceIn(List<BigDecimal> values) {
            addCriterion("SumBalance in", values, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andSumBalanceNotIn(List<BigDecimal> values) {
            addCriterion("SumBalance not in", values, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andSumBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumBalance between", value1, value2, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andSumBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumBalance not between", value1, value2, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andDeductiblelIsNull() {
            addCriterion("Deductiblel is null");
            return (Criteria) this;
        }

        public Criteria andDeductiblelIsNotNull() {
            addCriterion("Deductiblel is not null");
            return (Criteria) this;
        }

        public Criteria andDeductiblelEqualTo(BigDecimal value) {
            addCriterion("Deductiblel =", value, "deductiblel");
            return (Criteria) this;
        }

        public Criteria andDeductiblelNotEqualTo(BigDecimal value) {
            addCriterion("Deductiblel <>", value, "deductiblel");
            return (Criteria) this;
        }

        public Criteria andDeductiblelGreaterThan(BigDecimal value) {
            addCriterion("Deductiblel >", value, "deductiblel");
            return (Criteria) this;
        }

        public Criteria andDeductiblelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Deductiblel >=", value, "deductiblel");
            return (Criteria) this;
        }

        public Criteria andDeductiblelLessThan(BigDecimal value) {
            addCriterion("Deductiblel <", value, "deductiblel");
            return (Criteria) this;
        }

        public Criteria andDeductiblelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Deductiblel <=", value, "deductiblel");
            return (Criteria) this;
        }

        public Criteria andDeductiblelIn(List<BigDecimal> values) {
            addCriterion("Deductiblel in", values, "deductiblel");
            return (Criteria) this;
        }

        public Criteria andDeductiblelNotIn(List<BigDecimal> values) {
            addCriterion("Deductiblel not in", values, "deductiblel");
            return (Criteria) this;
        }

        public Criteria andDeductiblelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Deductiblel between", value1, value2, "deductiblel");
            return (Criteria) this;
        }

        public Criteria andDeductiblelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Deductiblel not between", value1, value2, "deductiblel");
            return (Criteria) this;
        }

        public Criteria andHxMoneyIsNull() {
            addCriterion("HxMoney is null");
            return (Criteria) this;
        }

        public Criteria andHxMoneyIsNotNull() {
            addCriterion("HxMoney is not null");
            return (Criteria) this;
        }

        public Criteria andHxMoneyEqualTo(Integer value) {
            addCriterion("HxMoney =", value, "hxMoney");
            return (Criteria) this;
        }

        public Criteria andHxMoneyNotEqualTo(Integer value) {
            addCriterion("HxMoney <>", value, "hxMoney");
            return (Criteria) this;
        }

        public Criteria andHxMoneyGreaterThan(Integer value) {
            addCriterion("HxMoney >", value, "hxMoney");
            return (Criteria) this;
        }

        public Criteria andHxMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("HxMoney >=", value, "hxMoney");
            return (Criteria) this;
        }

        public Criteria andHxMoneyLessThan(Integer value) {
            addCriterion("HxMoney <", value, "hxMoney");
            return (Criteria) this;
        }

        public Criteria andHxMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("HxMoney <=", value, "hxMoney");
            return (Criteria) this;
        }

        public Criteria andHxMoneyIn(List<Integer> values) {
            addCriterion("HxMoney in", values, "hxMoney");
            return (Criteria) this;
        }

        public Criteria andHxMoneyNotIn(List<Integer> values) {
            addCriterion("HxMoney not in", values, "hxMoney");
            return (Criteria) this;
        }

        public Criteria andHxMoneyBetween(Integer value1, Integer value2) {
            addCriterion("HxMoney between", value1, value2, "hxMoney");
            return (Criteria) this;
        }

        public Criteria andHxMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("HxMoney not between", value1, value2, "hxMoney");
            return (Criteria) this;
        }

        public Criteria andVendorIdIsNull() {
            addCriterion("VendorId is null");
            return (Criteria) this;
        }

        public Criteria andVendorIdIsNotNull() {
            addCriterion("VendorId is not null");
            return (Criteria) this;
        }

        public Criteria andVendorIdEqualTo(Integer value) {
            addCriterion("VendorId =", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdNotEqualTo(Integer value) {
            addCriterion("VendorId <>", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdGreaterThan(Integer value) {
            addCriterion("VendorId >", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("VendorId >=", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdLessThan(Integer value) {
            addCriterion("VendorId <", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdLessThanOrEqualTo(Integer value) {
            addCriterion("VendorId <=", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdIn(List<Integer> values) {
            addCriterion("VendorId in", values, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdNotIn(List<Integer> values) {
            addCriterion("VendorId not in", values, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdBetween(Integer value1, Integer value2) {
            addCriterion("VendorId between", value1, value2, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("VendorId not between", value1, value2, "vendorId");
            return (Criteria) this;
        }

        public Criteria andIsDiKouIsNull() {
            addCriterion("IsDiKou is null");
            return (Criteria) this;
        }

        public Criteria andIsDiKouIsNotNull() {
            addCriterion("IsDiKou is not null");
            return (Criteria) this;
        }

        public Criteria andIsDiKouEqualTo(Boolean value) {
            addCriterion("IsDiKou =", value, "isDiKou");
            return (Criteria) this;
        }

        public Criteria andIsDiKouNotEqualTo(Boolean value) {
            addCriterion("IsDiKou <>", value, "isDiKou");
            return (Criteria) this;
        }

        public Criteria andIsDiKouGreaterThan(Boolean value) {
            addCriterion("IsDiKou >", value, "isDiKou");
            return (Criteria) this;
        }

        public Criteria andIsDiKouGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsDiKou >=", value, "isDiKou");
            return (Criteria) this;
        }

        public Criteria andIsDiKouLessThan(Boolean value) {
            addCriterion("IsDiKou <", value, "isDiKou");
            return (Criteria) this;
        }

        public Criteria andIsDiKouLessThanOrEqualTo(Boolean value) {
            addCriterion("IsDiKou <=", value, "isDiKou");
            return (Criteria) this;
        }

        public Criteria andIsDiKouIn(List<Boolean> values) {
            addCriterion("IsDiKou in", values, "isDiKou");
            return (Criteria) this;
        }

        public Criteria andIsDiKouNotIn(List<Boolean> values) {
            addCriterion("IsDiKou not in", values, "isDiKou");
            return (Criteria) this;
        }

        public Criteria andIsDiKouBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDiKou between", value1, value2, "isDiKou");
            return (Criteria) this;
        }

        public Criteria andIsDiKouNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDiKou not between", value1, value2, "isDiKou");
            return (Criteria) this;
        }

        public Criteria andRebateAmountIsNull() {
            addCriterion("RebateAmount is null");
            return (Criteria) this;
        }

        public Criteria andRebateAmountIsNotNull() {
            addCriterion("RebateAmount is not null");
            return (Criteria) this;
        }

        public Criteria andRebateAmountEqualTo(BigDecimal value) {
            addCriterion("RebateAmount =", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("RebateAmount <>", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("RebateAmount >", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RebateAmount >=", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountLessThan(BigDecimal value) {
            addCriterion("RebateAmount <", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RebateAmount <=", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountIn(List<BigDecimal> values) {
            addCriterion("RebateAmount in", values, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("RebateAmount not in", values, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RebateAmount between", value1, value2, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RebateAmount not between", value1, value2, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andNetAdvanceIsNull() {
            addCriterion("NetAdvance is null");
            return (Criteria) this;
        }

        public Criteria andNetAdvanceIsNotNull() {
            addCriterion("NetAdvance is not null");
            return (Criteria) this;
        }

        public Criteria andNetAdvanceEqualTo(BigDecimal value) {
            addCriterion("NetAdvance =", value, "netAdvance");
            return (Criteria) this;
        }

        public Criteria andNetAdvanceNotEqualTo(BigDecimal value) {
            addCriterion("NetAdvance <>", value, "netAdvance");
            return (Criteria) this;
        }

        public Criteria andNetAdvanceGreaterThan(BigDecimal value) {
            addCriterion("NetAdvance >", value, "netAdvance");
            return (Criteria) this;
        }

        public Criteria andNetAdvanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NetAdvance >=", value, "netAdvance");
            return (Criteria) this;
        }

        public Criteria andNetAdvanceLessThan(BigDecimal value) {
            addCriterion("NetAdvance <", value, "netAdvance");
            return (Criteria) this;
        }

        public Criteria andNetAdvanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NetAdvance <=", value, "netAdvance");
            return (Criteria) this;
        }

        public Criteria andNetAdvanceIn(List<BigDecimal> values) {
            addCriterion("NetAdvance in", values, "netAdvance");
            return (Criteria) this;
        }

        public Criteria andNetAdvanceNotIn(List<BigDecimal> values) {
            addCriterion("NetAdvance not in", values, "netAdvance");
            return (Criteria) this;
        }

        public Criteria andNetAdvanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NetAdvance between", value1, value2, "netAdvance");
            return (Criteria) this;
        }

        public Criteria andNetAdvanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NetAdvance not between", value1, value2, "netAdvance");
            return (Criteria) this;
        }

        public Criteria andRedPayableAmountIsNull() {
            addCriterion("RedPayableAmount is null");
            return (Criteria) this;
        }

        public Criteria andRedPayableAmountIsNotNull() {
            addCriterion("RedPayableAmount is not null");
            return (Criteria) this;
        }

        public Criteria andRedPayableAmountEqualTo(BigDecimal value) {
            addCriterion("RedPayableAmount =", value, "redPayableAmount");
            return (Criteria) this;
        }

        public Criteria andRedPayableAmountNotEqualTo(BigDecimal value) {
            addCriterion("RedPayableAmount <>", value, "redPayableAmount");
            return (Criteria) this;
        }

        public Criteria andRedPayableAmountGreaterThan(BigDecimal value) {
            addCriterion("RedPayableAmount >", value, "redPayableAmount");
            return (Criteria) this;
        }

        public Criteria andRedPayableAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RedPayableAmount >=", value, "redPayableAmount");
            return (Criteria) this;
        }

        public Criteria andRedPayableAmountLessThan(BigDecimal value) {
            addCriterion("RedPayableAmount <", value, "redPayableAmount");
            return (Criteria) this;
        }

        public Criteria andRedPayableAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RedPayableAmount <=", value, "redPayableAmount");
            return (Criteria) this;
        }

        public Criteria andRedPayableAmountIn(List<BigDecimal> values) {
            addCriterion("RedPayableAmount in", values, "redPayableAmount");
            return (Criteria) this;
        }

        public Criteria andRedPayableAmountNotIn(List<BigDecimal> values) {
            addCriterion("RedPayableAmount not in", values, "redPayableAmount");
            return (Criteria) this;
        }

        public Criteria andRedPayableAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RedPayableAmount between", value1, value2, "redPayableAmount");
            return (Criteria) this;
        }

        public Criteria andRedPayableAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RedPayableAmount not between", value1, value2, "redPayableAmount");
            return (Criteria) this;
        }

        public Criteria andOldBillNoIsNull() {
            addCriterion("OldBillNo is null");
            return (Criteria) this;
        }

        public Criteria andOldBillNoIsNotNull() {
            addCriterion("OldBillNo is not null");
            return (Criteria) this;
        }

        public Criteria andOldBillNoEqualTo(Integer value) {
            addCriterion("OldBillNo =", value, "oldBillNo");
            return (Criteria) this;
        }

        public Criteria andOldBillNoNotEqualTo(Integer value) {
            addCriterion("OldBillNo <>", value, "oldBillNo");
            return (Criteria) this;
        }

        public Criteria andOldBillNoGreaterThan(Integer value) {
            addCriterion("OldBillNo >", value, "oldBillNo");
            return (Criteria) this;
        }

        public Criteria andOldBillNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("OldBillNo >=", value, "oldBillNo");
            return (Criteria) this;
        }

        public Criteria andOldBillNoLessThan(Integer value) {
            addCriterion("OldBillNo <", value, "oldBillNo");
            return (Criteria) this;
        }

        public Criteria andOldBillNoLessThanOrEqualTo(Integer value) {
            addCriterion("OldBillNo <=", value, "oldBillNo");
            return (Criteria) this;
        }

        public Criteria andOldBillNoIn(List<Integer> values) {
            addCriterion("OldBillNo in", values, "oldBillNo");
            return (Criteria) this;
        }

        public Criteria andOldBillNoNotIn(List<Integer> values) {
            addCriterion("OldBillNo not in", values, "oldBillNo");
            return (Criteria) this;
        }

        public Criteria andOldBillNoBetween(Integer value1, Integer value2) {
            addCriterion("OldBillNo between", value1, value2, "oldBillNo");
            return (Criteria) this;
        }

        public Criteria andOldBillNoNotBetween(Integer value1, Integer value2) {
            addCriterion("OldBillNo not between", value1, value2, "oldBillNo");
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