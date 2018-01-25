package com.example.demo.entity.one;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TEST_ZCOMENT")
public class Customer implements Serializable {
    
	@Id
	private String ID;

    private String NAME;

    private String PARENTID;

    private static final long serialVersionUID = 1L;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getPARENTID() {
        return PARENTID;
    }

    public void setPARENTID(String PARENTID) {
        this.PARENTID = PARENTID == null ? null : PARENTID.trim();
    }

	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", NAME=" + NAME + ", PARENTID="
				+ PARENTID + "]";
	}  
    
}