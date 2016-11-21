package com.nsn.sep.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="SEP_USER")

public class Sep_user {
		@Column
		private int                    USERID;
		@Column
	    private String                 GUID;
		@Column
		private String                 USERNAME;
		@Column
		private String                 PASSWORD;
		@Column
		private String                 SECURITYQUESTION;
		@Column
		private String                 SECURITYANSWER;
		@Column
		private int                    ROLEID;
		@Column 
		private String                 REGION;
		@Column
		private String                 SUBREGION;
		@Column
		private String                 COUNTRY;
		@Column
		private String                 MARKETCITY;
		@Column
		private String                 STATEPROVINCE;
		@Column
		private String 				   SUPPLIERID;
		@Column
		private String                 STATUS;
		@Column
		private String                 FIRSTNAME;
		@Column
		private String                 LASTNAME;
		@Column
		private String                 EMAIL;
		@Column
		private String                 MOBILE;
		@Column
		private String                 PHONE;
		@Column
		private String 				   TITLE;
		@Column
		private String                 CREATEDATE;
		@Column
		private String                 MODIFYDATE;
		@Column
		private String                 LASTLOGONDATE;
		@Column
		private int                 CREATEDBY;
		@Column
		private String                 COMPANY;
		@Column
		private String 				   PROJECT;
		@Column
		private String                 REQFIRSTNAME;
		@Column
		private String                 REQLASTNAME;
		@Column
		private String                 REQEMAIL;
		@Column
		private String                 REQTITLE;
		@Column
		private String                 REQCOMPANY;
		@Column
		private String                 REQCOUNTRY;
		@Column
		private String                 REQREASON;
		@Column
		private String                 SPONSOR;
		@Column
		private String                 SPONSOREMAIL;
		@Column
		private String                 SPONSORPHONE;
		@Column
		private String                 PHOTO;
		@Column
		private String 				   QUIZSTATUS;
		@Column
		private String                 USERPHOTO;
		@Column
		private String                 COMMENTS;
		@Column
		private String 				   PWDCHANGEDATE;
		@Column
		private String                 EMAILSEND;
		@Column
		private String                 PWDEXPDATE;
		@Column
		private String                 ROLEDESCRIPTION;
		@Column
		private String                 PROJECTKEYUSER;
		public int getUSERID() {
			return USERID;
		}
		public void setUSERID(int uSERID) {
			USERID = uSERID;
		}
		public String getGUID() {
			return GUID;
		}
		public void setGUID(String gUID) {
			GUID = gUID;
		}
		public String getUSERNAME() {
			return USERNAME;
		}
		public void setUSERNAME(String uSERNAME) {
			USERNAME = uSERNAME;
		}
		public String getPASSWORD() {
			return PASSWORD;
		}
		public void setPASSWORD(String pASSWORD) {
			PASSWORD = pASSWORD;
		}
		public String getSECURITYQUESTION() {
			return SECURITYQUESTION;
		}
		public void setSECURITYQUESTION(String sECURITYQUESTION) {
			SECURITYQUESTION = sECURITYQUESTION;
		}
		public String getSECURITYANSWER() {
			return SECURITYANSWER;
		}
		public void setSECURITYANSWER(String sECURITYANSWER) {
			SECURITYANSWER = sECURITYANSWER;
		}
		public int getROLEID() {
			return ROLEID;
		}
		public void setROLEID(int rOLEID) {
			ROLEID = rOLEID;
		}
		public String getREGION() {
			return REGION;
		}
		public void setREGION(String rEGION) {
			REGION = rEGION;
		}
		public String getSUBREGION() {
			return SUBREGION;
		}
		public void setSUBREGION(String sUBREGION) {
			SUBREGION = sUBREGION;
		}
		public String getCOUNTRY() {
			return COUNTRY;
		}
		public void setCOUNTRY(String cOUNTRY) {
			COUNTRY = cOUNTRY;
		}
		public String getMARKETCITY() {
			return MARKETCITY;
		}
		public void setMARKETCITY(String mARKETCITY) {
			MARKETCITY = mARKETCITY;
		}
		public String getSTATEPROVINCE() {
			return STATEPROVINCE;
		}
		public void setSTATEPROVINCE(String sTATEPROVINCE) {
			STATEPROVINCE = sTATEPROVINCE;
		}
		public String getSUPPLIERID() {
			return SUPPLIERID;
		}
		public void setSUPPLIERID(String sUPPLIERID) {
			SUPPLIERID = sUPPLIERID;
		}
		public String getSTATUS() {
			return STATUS;
		}
		public void setSTATUS(String sTATUS) {
			STATUS = sTATUS;
		}
		public String getFIRSTNAME() {
			return FIRSTNAME;
		}
		public void setFIRSTNAME(String fIRSTNAME) {
			FIRSTNAME = fIRSTNAME;
		}
		public String getLASTNAME() {
			return LASTNAME;
		}
		public void setLASTNAME(String lASTNAME) {
			LASTNAME = lASTNAME;
		}
		public String getEMAIL() {
			return EMAIL;
		}
		public void setEMAIL(String eMAIL) {
			EMAIL = eMAIL;
		}
		public String getMOBILE() {
			return MOBILE;
		}
		public void setMOBILE(String mOBILE) {
			MOBILE = mOBILE;
		}
		public String getPHONE() {
			return PHONE;
		}
		public void setPHONE(String pHONE) {
			PHONE = pHONE;
		}
		public String getTITLE() {
			return TITLE;
		}
		public void setTITLE(String tITLE) {
			TITLE = tITLE;
		}
		public String getCREATEDATE() {
			return CREATEDATE;
		}
		public void setCREATEDATE(String cREATEDATE) {
			CREATEDATE = cREATEDATE;
		}
		public String getMODIFYDATE() {
			return MODIFYDATE;
		}
		public void setMODIFYDATE(String mODIFYDATE) {
			MODIFYDATE = mODIFYDATE;
		}
		public String getLASTLOGONDATE() {
			return LASTLOGONDATE;
		}
		public void setLASTLOGONDATE(String lASTLOGONDATE) {
			LASTLOGONDATE = lASTLOGONDATE;
		}
		public int getCREATEDBY() {
			return CREATEDBY;
		}
		public void setCREATEDBY(int cREATEDBY) {
			CREATEDBY = cREATEDBY;
		}
		public String getCOMPANY() {
			return COMPANY;
		}
		public void setCOMPANY(String cOMPANY) {
			COMPANY = cOMPANY;
		}
		public String getPROJECT() {
			return PROJECT;
		}
		public void setPROJECT(String pROJECT) {
			PROJECT = pROJECT;
		}
		public String getREQFIRSTNAME() {
			return REQFIRSTNAME;
		}
		public void setREQFIRSTNAME(String rEQFIRSTNAME) {
			REQFIRSTNAME = rEQFIRSTNAME;
		}
		public String getREQLASTNAME() {
			return REQLASTNAME;
		}
		public void setREQLASTNAME(String rEQLASTNAME) {
			REQLASTNAME = rEQLASTNAME;
		}
		public String getREQEMAIL() {
			return REQEMAIL;
		}
		public void setREQEMAIL(String rEQEMAIL) {
			REQEMAIL = rEQEMAIL;
		}
		public String getREQTITLE() {
			return REQTITLE;
		}
		public void setREQTITLE(String rEQTITLE) {
			REQTITLE = rEQTITLE;
		}
		public String getREQCOMPANY() {
			return REQCOMPANY;
		}
		public void setREQCOMPANY(String rEQCOMPANY) {
			REQCOMPANY = rEQCOMPANY;
		}
		public String getREQCOUNTRY() {
			return REQCOUNTRY;
		}
		public void setREQCOUNTRY(String rEQCOUNTRY) {
			REQCOUNTRY = rEQCOUNTRY;
		}
		public String getREQREASON() {
			return REQREASON;
		}
		public void setREQREASON(String rEQREASON) {
			REQREASON = rEQREASON;
		}
		public String getSPONSOR() {
			return SPONSOR;
		}
		public void setSPONSOR(String sPONSOR) {
			SPONSOR = sPONSOR;
		}
		public String getSPONSOREMAIL() {
			return SPONSOREMAIL;
		}
		public void setSPONSOREMAIL(String sPONSOREMAIL) {
			SPONSOREMAIL = sPONSOREMAIL;
		}
		public String getSPONSORPHONE() {
			return SPONSORPHONE;
		}
		public void setSPONSORPHONE(String sPONSORPHONE) {
			SPONSORPHONE = sPONSORPHONE;
		}
		public String getPHOTO() {
			return PHOTO;
		}
		public void setPHOTO(String pHOTO) {
			PHOTO = pHOTO;
		}
		public String getQUIZSTATUS() {
			return QUIZSTATUS;
		}
		public void setQUIZSTATUS(String qUIZSTATUS) {
			QUIZSTATUS = qUIZSTATUS;
		}
		public String getUSERPHOTO() {
			return USERPHOTO;
		}
		public void setUSERPHOTO(String uSERPHOTO) {
			USERPHOTO = uSERPHOTO;
		}
		public String getCOMMENTS() {
			return COMMENTS;
		}
		public void setCOMMENTS(String cOMMENTS) {
			COMMENTS = cOMMENTS;
		}
		public String getPWDCHANGEDATE() {
			return PWDCHANGEDATE;
		}
		public void setPWDCHANGEDATE(String pWDCHANGEDATE) {
			PWDCHANGEDATE = pWDCHANGEDATE;
		}
		public String getEMAILSEND() {
			return EMAILSEND;
		}
		public void setEMAILSEND(String eMAILSEND) {
			EMAILSEND = eMAILSEND;
		}
		public String getPWDEXPDATE() {
			return PWDEXPDATE;
		}
		public void setPWDEXPDATE(String pWDEXPDATE) {
			PWDEXPDATE = pWDEXPDATE;
		}
		public String getROLEDESCRIPTION() {
			return ROLEDESCRIPTION;
		}
		public void setROLEDESCRIPTION(String rOLEDESCRIPTION) {
			ROLEDESCRIPTION = rOLEDESCRIPTION;
		}
		public String getPROJECTKEYUSER() {
			return PROJECTKEYUSER;
		}
		public void setPROJECTKEYUSER(String pROJECTKEYUSER) {
			PROJECTKEYUSER = pROJECTKEYUSER;
		}
	    
}
