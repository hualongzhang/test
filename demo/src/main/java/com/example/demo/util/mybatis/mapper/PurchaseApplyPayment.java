package com.example.demo.util.mybatis.mapper;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PurchaseApplyPayment {
    private Integer PKID;

    private String billNo;

    private Integer poiId;

    private String productName;

    private String payer;

    private String payee;

    private String account;

    private String bank;

    private BigDecimal amount;

    private BigDecimal freightAmount;

    private Boolean isPlainInvoice;

    private Boolean is17TaxInvoice;

    private Boolean is6TaxInvoice;

    private Boolean isOtherInvoice;

    private Boolean isTakedInvoice;

    private Boolean isGoodsArrival;

    private String chineseSumAmount;

    private BigDecimal sumAmount;

    private Integer batchNo;

    private Integer auditStatus;

    private String creator;

    private LocalDateTime createdDate;

    private LocalDateTime modifyDate;

    private String modifier;

    private String reason;

    private String voucherUrl;

    private String paidBy;

    private LocalDateTime paidDate;

    private Integer downloads;

    private Integer printCount;

    private String remark;

    private Boolean isNew;

    private BigDecimal sumBalance;

    private BigDecimal deductiblel;

    private Integer hxMoney;

    private Integer vendorId;

    private Boolean isDiKou;

    private BigDecimal rebateAmount;

    private BigDecimal netAdvance;

    private BigDecimal redPayableAmount;

    private Integer oldBillNo;

    public Integer getPKID() {
        return PKID;
    }

    public void setPKID(Integer PKID) {
        this.PKID = PKID;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public Integer getPoiId() {
        return poiId;
    }

    public void setPoiId(Integer poiId) {
        this.poiId = poiId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer == null ? null : payer.trim();
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee == null ? null : payee.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }

    public Boolean getIsPlainInvoice() {
        return isPlainInvoice;
    }

    public void setIsPlainInvoice(Boolean isPlainInvoice) {
        this.isPlainInvoice = isPlainInvoice;
    }

    public Boolean getIs17TaxInvoice() {
        return is17TaxInvoice;
    }

    public void setIs17TaxInvoice(Boolean is17TaxInvoice) {
        this.is17TaxInvoice = is17TaxInvoice;
    }

    public Boolean getIs6TaxInvoice() {
        return is6TaxInvoice;
    }

    public void setIs6TaxInvoice(Boolean is6TaxInvoice) {
        this.is6TaxInvoice = is6TaxInvoice;
    }

    public Boolean getIsOtherInvoice() {
        return isOtherInvoice;
    }

    public void setIsOtherInvoice(Boolean isOtherInvoice) {
        this.isOtherInvoice = isOtherInvoice;
    }

    public Boolean getIsTakedInvoice() {
        return isTakedInvoice;
    }

    public void setIsTakedInvoice(Boolean isTakedInvoice) {
        this.isTakedInvoice = isTakedInvoice;
    }

    public Boolean getIsGoodsArrival() {
        return isGoodsArrival;
    }

    public void setIsGoodsArrival(Boolean isGoodsArrival) {
        this.isGoodsArrival = isGoodsArrival;
    }

    public String getChineseSumAmount() {
        return chineseSumAmount;
    }

    public void setChineseSumAmount(String chineseSumAmount) {
        this.chineseSumAmount = chineseSumAmount == null ? null : chineseSumAmount.trim();
    }

    public BigDecimal getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(BigDecimal sumAmount) {
        this.sumAmount = sumAmount;
    }

    public Integer getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(Integer batchNo) {
        this.batchNo = batchNo;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(LocalDateTime modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getVoucherUrl() {
        return voucherUrl;
    }

    public void setVoucherUrl(String voucherUrl) {
        this.voucherUrl = voucherUrl == null ? null : voucherUrl.trim();
    }

    public String getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(String paidBy) {
        this.paidBy = paidBy == null ? null : paidBy.trim();
    }

    public LocalDateTime getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(LocalDateTime paidDate) {
        this.paidDate = paidDate;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public Integer getPrintCount() {
        return printCount;
    }

    public void setPrintCount(Integer printCount) {
        this.printCount = printCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public BigDecimal getSumBalance() {
        return sumBalance;
    }

    public void setSumBalance(BigDecimal sumBalance) {
        this.sumBalance = sumBalance;
    }

    public BigDecimal getDeductiblel() {
        return deductiblel;
    }

    public void setDeductiblel(BigDecimal deductiblel) {
        this.deductiblel = deductiblel;
    }

    public Integer getHxMoney() {
        return hxMoney;
    }

    public void setHxMoney(Integer hxMoney) {
        this.hxMoney = hxMoney;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public Boolean getIsDiKou() {
        return isDiKou;
    }

    public void setIsDiKou(Boolean isDiKou) {
        this.isDiKou = isDiKou;
    }

    public BigDecimal getRebateAmount() {
        return rebateAmount;
    }

    public void setRebateAmount(BigDecimal rebateAmount) {
        this.rebateAmount = rebateAmount;
    }

    public BigDecimal getNetAdvance() {
        return netAdvance;
    }

    public void setNetAdvance(BigDecimal netAdvance) {
        this.netAdvance = netAdvance;
    }

    public BigDecimal getRedPayableAmount() {
        return redPayableAmount;
    }

    public void setRedPayableAmount(BigDecimal redPayableAmount) {
        this.redPayableAmount = redPayableAmount;
    }

    public Integer getOldBillNo() {
        return oldBillNo;
    }

    public void setOldBillNo(Integer oldBillNo) {
        this.oldBillNo = oldBillNo;
    }
}