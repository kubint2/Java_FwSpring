package org.o7planning.sbjsp.utils;

public class Constant {
    
	public static enum IMPORT_MODE {
		MERGE("MERGE"), UPDATE("UPDATE"), REPLACE("REPLACE"), DELETE("DELETE");

		private final String value;

		IMPORT_MODE(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}
    
    public static enum MODE {
        EDIT("Edit"), NEW("New");

        private final String value;

        MODE(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
    public static enum LOG_MODULE {
        
        LOGIN("Login"), 
        APPROVAL("Approval"), 
        AP_INVOICE("AP Invoice"), 
        PAYROLL("Payroll"), 
        PAYMENT_ORDER("Payment Order"), 
        AR_INVOICE("AR Invoice"),
        BANK_STATEMENT("Bank Statement"),
        COLLECTION_MANAGEMENT("Collection Management"),
        MANAGEMENT_USER("User Management"),
        MANAGEMENT_SUBSIDIARY("Subsidiary Management"),
        APPROVAL_TYPE_MASTER("Approval Type Master"),
        ACCOUNT_MASTER("Account Master"),
        BANK_MASTER("Bank Master"),
        BANK_ACCOUNT_MASTER("Bank Account Master"),
        BUSINESS_TYPE_MASTER("Business Type Master"),
        CURRENCY_MASTER("Currency Master"),
        CLAIM_TYPE_MASTER("Claim Type Master"),
        GST_MASTER("GST Master"),
        PAYEE_TYPE_MASTER("Payee Type Master"),
        PAYEE_MASTER("Payee Master"),
        PROJECT_MASTER("Project Master"),
        DIVISION_MASTER("Division Master"),
        REIMBURSEMENT("Reimbursement"),
        PROJECT_ALLOCATION("Project allocation"),
        PROJECT_PAYMENT("Project payment"),
        EMPLOYEE_MASTER("Employee Master");
    	
        private final String value;

        LOG_MODULE(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static final String DDMMYYYY = "dd/MM/yyyy";
    
    public static final String MMDDYYYY = "MM/dd/yyyy";
    
    public static final String MDYYYY = "M/d/yyyy";
    
    public static final String MMMYYYY = "mmm/yyyy";
    
    public static final String MMYYYY = "mm/yyyy";
    
    public static final String MMM_YYYY = "MMM yyyy";
    
    /**
     * PAID
     */
    public static final String API_PAID = "001";
    
    /**
     * NOT PAID
     */
    public static final String API_NOT_PAID = "002";
    
    /**
     * PARTIAL PAID
     */
    public static final String API_PARTIAL_PAID = "003";
    
    /**
     * CANCELLED PAID
     */
    public static final String API_CANCELLED = "004";
    
    
    /**
     * PROCESSED
     */
    public static final String PAY_PROCESSED = "001";
    
    /**
     * PROCESSING
     */
    public static final String PAY_PROCESSING = "002";
    
    /**
     * CANCELLED
     */
    public static final String PAY_CANCELLED = "003";
    
    /**
     * session attribute user login
     */
    public static final String SESSSION_NAME_USER_LOGIN = "SESSSION_NAME_USER_LOGIN";
    public static final String SESSSION_NAME_USER_NAME = "username";
    public static final String SESSSION_NAME_USER_FIRST_NAME = "firstname";
    public static final String SESSSION_NAME_USER_LAST_NAME = "lastname";
    public static final String SESSSION_NAME_AUTHORITIES = "authorities";
    public static final String SESSSION_NAME_SUBSIDIARIES = "subsidiaries";
    public static final String SESSSION_NAME_CURRENT_SUBSIDIARY = "currentSubsidiary";
    
    public static final String SESSSION_NAME_TENANT_ID = "tenant_id";
    
    /**
     * 
     */
    public static final String PREFIX_DB_NAME = "cashflow_";
    
    /**
     * DEFAULT TENANT ID
     */
    public static final String DEFAULT_TENANT_ID = "__000__";
    
    /**
     * Create table
     */
    public static final String CONFIG_CODE_CREATE_TABLE = "001";
    
    /**
     * Create function
     */
    public static final String CONFIG_CODE_CREATE_FUNCTION = "002";
    

    /**
     * Initial system value
     */
    public static final String CONFIG_CODE_INIT_SYSTEM_VALUE = "003";
    
    /**
     * Create view
     */
    public static final String CONFIG_CODE_CREATE_VIEW = "004";
    
    
    /**
     * Scheduler refresh view.
     */
    public static final String SCHEDULER_REFESH_VIEW = "001";
    
    /**
     * APINVOICE
     */
    public static final String PREFIX_API = "API";
    
    /**
     * PAYMENT
     */
    public static final String PREFIX_PAY = "PAY";
    
    /**
     * APPROVAL
     */
    public static final String PREFIX_APR = "APR";
    
    /**
     * ARINVOICE
     */
    public static final String PREFIX_ARI = "ARI";
    
    public static final String APR_APPROVAL = "001";
    public static final String APR_WAITING = "002";
    /**
     * NUM_PER_PAGE
     */
    public static final Integer ROW_PER_PAGE = 10;
    
    /**
     * fomat file
     */
    public static final String XLSX = ".xlsx";
    
    public static final String XLS = ".xls";

    /**
     * BANK STATEMENT SESSION 
     */
    public static final String BSM_BANK_NAME = "BSM_BANK_NAME";
    public static final String BSM_BANK_CODE = "BSM_BANK_CODE";
    public static final String BSM_BANK_ACC_CODE = "BSM_BANK_ACC_CODE";
    public static final String BSM_TRANSACTION_FROM = "BSM_TRANSACTION_FROM";
    public static final String BSM_TRANSACTION_TO = "BSM_TRANSACTION_TO";
    public static final String BSM_CURRENCY_CODE = "BSM_CURRENCY_CODE";
    public static final String BSM_TRANSACTION_DATE_FILTER = "BSM_TRANSACTION_DATE_FILTER";
    /**
     * Content type excel
     */
    
    public static final String CONTENT_TYPE_EXCEL = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    
    /**
     * Content type log
     */
    public static final String CONTENT_TYPE_LOG = "application/octet-stream";

	/**
     * PASSWORD PATTERN OF USER ACCOUNT
     */
    public static final String PASSWORD_PATTERN = "^(?:(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])(?=.*\\W)).{8,}$" + 
    		"";
    
    /**
     * Export
     */
    public static final String EXPORT = "EXPORT";
    
    /**
     * Approval classification type
     */
    public static final String APPROVAL_CLASS_AP = "001";
    
    /**
     * PAID
     */
    public static final String ARI_RECEIVED = "001";
    
    /**
     * NOT PAID
     */
    public static final String ARI_NOT_RECEIVED = "002";
    
    /**
     * PARTIAL PAID
     */
    public static final String ARI_PARTIAL_RECEIVED = "003";
    
    /**
     * 
     */
    public static final String APPROVAL_CLASS_AP_INVOICE = "001";
    
    /**
     * 
     */
    public static final String APPROVAL_CLASS_AR_INVOICE = "002";
    public static final String TOKEN_SEPERATOR = "##cashflow##";
    
    /**
     * system role type
     */
    public static enum ROLE_TYPE {
        ADMIN("ADM"), MANAGER("MAN"),  MEMBER("MEM");

        private final String value;

        ROLE_TYPE(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    /**
     * 
    */
    public static final String STRING_COMMA = ",";
    public static final String PAYMENT_ORDER_APINVOICE = "0";
    public static final String PAYMENT_ORDER_PAYROLL = "1";
    public static final String PAYMENT_ORDER_REIMBURSEMENT = "2";
    /**
     * PAYROLL
     */
    public static final String PREFIX_PR = "PR";
    /**
     * LOGIN ERROR CODE SESSION
     */
    public static final String SESSSION_LOGIN_ERROR_CODE = "SESSSION_LOGIN_ERROR_CODE";
    /**
     * CLAIM TYPE REIMBURSEMENT
     */
    public static final String CLAIM_TYPE_REIMBURSEMENT = "CL003";
    /**
     * CLAIM TYPE PAYROLL
     */
    public static final String CLAIM_TYPE_PAYROLL = "CL002";
    /**
     * project allocation session
     */
    public static final String PA_MONTH_FROM = "PA_MONTH_FROM";
    public static final String PA_MONTH_TO = "PA_MONTH_TO";
    public static final String PA_EMPLOYEE_CODE = "PA_EMPLOYEE_CODE";
}
