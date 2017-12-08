package globals;

import org.openqa.selenium.By;

public class AopLocators {
	
	// Checkbox 'No US persons' for commercial account
	public static final By COMMERCIAL_ACCOUNT_CHECKBOX_NO_US_PERSONS = By.xpath("//label[@for='nusu']");
	
	// Navigation buttons
	public static final By NAVIGATION_BUTTON_OPEN_SINGLE_ACCOUNT = By.id("contentregion_0_introbuttonregion_0_button1");
	public static final By NAVIGATION_BUTTON_OPEN_JOINT_ACCOUNT = By.id("contentregion_0_introbuttonregion_0_button2");
	public static final By NAVIGATION_BUTTON_NEXT_STEP_ONE = By.xpath("(//button[contains(@class,'nextStepButton')])[1]");
	public static final By NAVIGATION_BUTTON_NEXT_STEP_TWO = By.xpath("(//button[contains(@class,'nextStepButton')])[2]");
	public static final By NAVIGATION_BUTTON_NEXT_STEP_THREE = By.xpath("(//button[contains(@class,'nextStepButton')])[3]");
	
	// Personal data
	public static final By PERSONAL_DATA_DROPDOWN_GENDER = By.id("aop_Gender");
	public static final By PERSONAL_DATA_DROPDOWN_GENDER_PARTNER = By.id("aop_Gender_Account2");
	public static final By PERSONAL_DATA_TEXTFIELD_FIRST_NAME = By.id("aop_Firstname");
	public static final By PERSONAL_DATA_TEXTFIELD_FIRST_NAME_PARTNER = By.id("aop_Firstname_Account2");
	public static final By PERSONAL_DATA_TEXTFIELD_LAST_NAME = By.id("aop_LastName");
	public static final By PERSONAL_DATA_TEXTFIELD_LAST_NAME_PARTNER = By.id("aop_LastName_Account2");
	public static final By PERSONAL_DATA_TEXTFIELD_DATE_OF_BIRTH = By.id("aop_BirthDate");
	public static final By PERSONAL_DATA_TEXTFIELD_DATE_OF_BIRTH_PARTNER = By.id("aop_BirthDate_Account2");
	public static final By PERSONAL_DATA_TEXTFIELD_CITY_OF_BIRTH = By.id("aop_BirthCity");
	public static final By PERSONAL_DATA_TEXTFIELD_CITY_OF_BIRTH_PARTNER = By.id("aop_BirthCity_Account2");
	public static final By PERSONAL_DATA_DROPDOWN_COUNTRY_OF_BIRTH = By.id("aop_CountryOfBirth");
	public static final By PERSONAL_DATA_DROPDOWN_COUNTRY_OF_BIRTH_PARTNER = By.id("aop_CountryOfBirth_Account2");
	public static final By PERSONAL_DATA_DROPDOWN_PROFESSION = By.id("aop_Profession");
	public static final By PERSONAL_DATA_DROPDOWN_PROFESSION_PARTNER = By.id("aop_Profession_Account2");
	public static final By PERSONAL_DATA_DROPDOWN_LANGUAGE = By.id("aop_Language");
	public static final By PERSONAL_DATA_DROPDOWN_LANGUAGE_PARTNER = By.id("aop_Language_Account2");
	public static final By PERSONAL_DATA_TEXTFIELD_CITIZEN_SERVICE_NUMBER = By.id("aop_IDCitizenServiceNumber");
	public static final By PERSONAL_DATA_TEXTFIELD_CITIZEN_SERVICE_NUMBER_PARTNER = By.id("aop_IDCitizenServiceNumber_Account2");
		
	// Contact details
	public static final By CONTACT_DETAILS_TEXTFIELD_TELEPHONE = By.id("aop_Telephone");
	public static final By CONTACT_DETAILS_TEXTFIELD_TELEPHONE_PARTNER = By.id("aop_Telephone_Account2");
	public static final By CONTACT_DETAILS_TEXTFIELD_MOBILE_PHONE = By.id("aop_Mobile");
	public static final By CONTACT_DETAILS_TEXTFIELD_MOBILE_PHONE_BE = By.id("aop_MobileNumber"); // for some reason, the BE AOP uses a different ID
	public static final By CONTACT_DETAILS_TEXTFIELD_MOBILE_PHONE_PARTNER = By.id("aop_Mobile_Account2");
	public static final By CONTACT_DETAILS_TEXTFIELD_MOBILE_PHONE_CONFIRM = By.id("aop_MobileConfirm");
	public static final By CONTACT_DETAILS_TEXTFIELD_MOBILE_PHONE_CONFIRM_PARTNER = By.id("aop_MobileConfirm_Account2");
	public static final By CONTACT_DETAILS_TEXTFIELD_EMAIL_ADDRESS = By.id("aop_Email");
	public static final By CONTACT_DETAILS_TEXTFIELD_EMAIL_ADDRESS_PARTNER = By.id("aop_Email_Account2");
	public static final By CONTACT_DETAILS_TEXTFIELD_EMAIL_ADDRESS_CONFIRM = By.id("aop_EmailConfirm");
	public static final By CONTACT_DETAILS_TEXTFIELD_EMAIL_ADDRESS_CONFIRM_PARTNER = By.id("aop_EmailConfirm_Account2");
	public static final By CONTACT_DETAILS_TEXTFIELD_POSTAL_CODE = By.id("aop_PostalCode");
	public static final By CONTACT_DETAILS_TEXTFIELD_STREET = By.id("aop_Street");
	public static final By CONTACT_DETAILS_TEXTFIELD_HOUSENUMBER = By.id("aop_HouseNumber");
	public static final By CONTACT_DETAILS_TEXTFIELD_CITY = By.id("aop_City");
	public static final By CONTACT_DETAILS_BUTTON_UPLOAD_ADDRESS_PROOF_LATER = By.xpath("//label[@for='aop_UploadAddressVerificationNow_right']/parent::div");
	
	// Company data
	public static final By COMPANY_TEXTFIELD_PHONE_NUMBER = By.id("aop_CompanyPhone");
	public static final By COMPANY_DROPDOWN_LEGAL_FORM = By.id("aop_CompanyLegalForm");
	public static final By COMPANY_TEXTFIELD_STATUTARY_NAME = By.id("aop_CompanyStatutaryName");
	public static final By COMPANY_TEXTFIELD_NAME = By.id("aop_CompanyName");
	public static final By COMPANY_TEXTFIELD_COC_NUMBER = By.id("aop_CompanyRegistryNumber");
	public static final By COMPANY_TEXTFIELD_POSTAL_CODE = By.id("aop_CompanyPostalCode");
	public static final By COMPANY_TEXTFIELD_HOUSE_NUMBER = By.id("aop_CompanyHouseNumber");
	
	
	// Identification
	public static final By IDENTIFICATION_DROPDOWN_NATIONALITY = By.id("aop_Nationality");
	public static final By IDENTIFICATION_DROPDOWN_NATIONALITY_PARTNER = By.id("aop_Nationality_Account2");
	public static final By IDENTIFICATION_DROPDOWN_IDENTIFICATION_TYPE = By.id("aop_IDType");
	public static final By IDENTIFICATION_DROPDOWN_IDENTIFICATION_TYPE_PARTNER = By.id("aop_IDType_Account2");
	public static final By IDENTIFICATION_TEXTFIELD_DOCUMENT_NUMBER = By.id("aop_IDDocNumber");
	public static final By IDENTIFICATION_TEXTFIELD_DOCUMENT_NUMBER_PARTNER = By.id("aop_IDDocNumber_Account2");
	public static final By IDENTIFICATION_TEXTFIELD_DOCUMENT_ISSUER = By.id("aop_IDIssuingInstance");
	public static final By IDENTIFICATION_TEXTFIELD_DOCUMENT_ISSUER_PARTNER = By.id("aop_IDIssuingInstance_Account2");
	public static final By IDENTIFICATION_TEXTFIELD_DOCUMENT_ISSUE_DATE = By.id("aop_IDIssuingDate");
	public static final By IDENTIFICATION_TEXTFIELD_DOCUMENT_ISSUE_DATE_PARTNER = By.id("aop_IDIssuingDate_Account2");
	public static final By IDENTIFICATION_TEXTFIELD_DOCUMENT_EXPIRY_DATE = By.id("aop_IDValidDate");
	public static final By IDENTIFICATION_TEXTFIELD_DOCUMENT_EXPIRY_DATE_PARTNER = By.id("aop_IDValidDate_Account2");
	public static final By IDENTIFICATION_BUTTON_SEND_VERIFICATION_LATER = By.xpath("//label[@for='aop_UploadIdentityVerificationNow_right']/parent::div");
	public static final By IDENTIFICATION_BUTTON_SEND_VERIFICATION_LATER_PARTNER = By.xpath("//label[@for='aop_UploadIdentityVerificationNow_Account2_right']/parent::div");
	public static final By IDENTIFICATION_NATIONAL_REGISTRY_NUMBER = By.id("aop_NationalRegistryNumber");
	public static final By IDENTIFICATION_NATIONAL_REGISTRY_NUMBER_PARTNER = By.id("aop_NationalRegistryNumber_Account2");
	public static final By IDENTIFICATION_UPLOAD_DRIVERS_LICENSE_FRONT = By.xpath("//input[@doc-type='IdVerifyDriversLicense_0']");
	public static final By IDENTIFICATION_UPLOAD_DRIVERS_LICENSE_FRONT_PARTNER = By.xpath("//input[@doc-type='IdVerifyDriversLicense_0_Account2']");
	public static final By IDENTIFICATION_UPLOAD_DRIVERS_LICENSE_BACK = By.xpath("//input[@doc-type='IdVerifyDriversLicense_1']");
	public static final By IDENTIFICATION_UPLOAD_DRIVERS_LICENSE_BACK_PARTNER = By.xpath("//input[@doc-type='IdVerifyDriversLicense_1_Account2']");
	public static final By IDENTIFICATION_UPLOAD_PASSPORT = By.xpath("//input[@doc-type='IdVerifyPassport']");
	public static final By IDENTIFICATION_UPLOAD_PASSPORT_PARTNER = By.xpath("//input[@doc-type='IdVerifyPassport_Account2']");
	public static final By IDENTIFICATION_DIV_DRIVERS_LICENSE_FRONT_UPLOAD_COMPLETE = By.xpath("//ng-upload-form[@doc-type='IdVerifyDriversLicense_0']//div[contains(@class,'progress-bar') and contains(@style,'100%')]");
	public static final By IDENTIFICATION_DIV_DRIVERS_LICENSE_FRONT_UPLOAD_COMPLETE_PARTNER = By.xpath("//ng-upload-form[@doc-type='IdVerifyDriversLicense_0_Account2']//div[contains(@class,'progress-bar') and contains(@style,'100%')]");
	public static final By IDENTIFICATION_DIV_DRIVERS_LICENSE_BACK_UPLOAD_COMPLETE = By.xpath("//ng-upload-form[@doc-type='IdVerifyDriversLicense_1']//div[contains(@class,'progress-bar') and contains(@style,'100%')]");
	public static final By IDENTIFICATION_DIV_DRIVERS_LICENSE_BACK_UPLOAD_COMPLETE_PARTNER = By.xpath("//ng-upload-form[@doc-type='IdVerifyDriversLicense_1_Account2']//div[contains(@class,'progress-bar') and contains(@style,'100%')]");
	public static final By IDENTIFICATION_DIV_PASSPORT_UPLOAD_COMPLETE = By.xpath("//ng-upload-form[@doc-type='IdVerifyPassport']//div[contains(@class,'progress-bar') and contains(@style,'100%')]");
	public static final By IDENTIFICATION_DIV_PASSPORT_UPLOAD_COMPLETE_PARTNER = By.xpath("//ng-upload-form[@doc-type='IdVerifyPassport_Account2']//div[contains(@class,'progress-bar') and contains(@style,'100%')]");
	
	// Company director data
	public static final By COMPANY_DIRECTOR_DROPDOWN_GENDER = By.id("aop_Gender_ubo_01");
	public static final By COMPANY_DIRECTOR_TEXTFIELD_FIRST_NAME = By.id("aop_Firstname_ubo_01");
	public static final By COMPANY_DIRECTOR_TEXTFIELD_LAST_NAME = By.id("aop_LastName_ubo_01");
	public static final By COMPANY_DIRECTOR_TEXTFIELD_POSTAL_CODE = By.id("aop_PostalCode_ubo_01");
	public static final By COMPANY_DIRECTOR_TEXTFIELD_HOUSE_NUMBER = By.id("aop_HouseNumber_ubo_01");
	public static final By COMPANY_DIRECTOR_TEXTFIELD_DATE_OF_BIRTH = By.id("aop_BirthDate_ubo_01");
	public static final By COMPANY_DIRECTOR_TEXTFIELD_CITY_OF_BIRTH = By.id("aop_BirthCity_ubo_01");
	public static final By COMPANY_DIRECTOR_DROPDOWN_IDENTIFICATION_TYPE = By.id("aop_IDType_ubo_01");
	public static final By COMPANY_DIRECTOR_TEXTFIELD_IDENTIFICATION_ISSUER = By.id("aop_IDIssuingInstance_ubo_01");
	public static final By COMPANY_DIRECTOR_TEXTFIELD_IDENTIFICATION_ISSUE_DATE = By.id("aop_IDIssuingDate_ubo_01");
	public static final By COMPANY_DIRECTOR_TEXTFIELD_IDENTIFICATION_EXPIRY_DATE = By.id("aop_IDValidDate_ubo_01");
	public static final By COMPANY_DIRECTOR_TEXTFIELD_IDENTIFICATION_DOCUMENT_NUMBER = By.id("aop_IDDocNumber_ubo_01");
	public static final By COMPANY_DIRECTOR_TEXTFIELD_CITIZEN_SERVICE_NUMBER = By.id("aop_IDCitizenServiceNumber_ubo_01");
	public static final By COMPANY_DIRECTOR_CHECKBOX_IS_REPRESENTATIVE = By.xpath("//label[@for='aop_IsRepresentative_ubo_01']");	
	
	// Bank account and Ideal transfer
	public static final By BANK_ACCOUNT_TEXTFIELD_IBAN = By.id("aop_IBAN");
	public static final By BANK_ACCOUNT_CHECKBOX_CONFIRM_IS_ACCOUNT_HOLDER = By.xpath("//label[@for='aop_ConfirmIsAccountHolder']");
	public static final By BANK_ACCOUNT_BUTTON_SELECT_ONE_CENT = By.xpath("//button[contains(text(),'0,01')]");
	public static final By BANK_ACCOUNT_BUTTON_TRANSFER_MONEY = By.xpath("//button[contains(text(),'Boek over')]");
	public static final By BANK_ACCOUNT_BUTTON_CONFIRM_TRANSFER = By.xpath("//input[@value='Confirm Transaction']");
	public static final By BANK_ACCOUNT_DROPDOWN_IDEAL_ISSUERS = By.id("aop_IdealIssuers");
	public static final By BANK_ACCOUNT_TEXTFIELD_ACCOUNT_NAME = By.id("aop_AccountName");
	public static final By BANK_ACCOUNT_TEXTFIELD_ACCOUNT_FULL_NAME = By.id("aop_AccountFullName");
	
	// Tax conditions
	public static final By TAX_CONDITIONS_CHECKBOX_NO_US_RELATIONS = By.xpath("//label[@for='aop_UsTaxResidenceCode']");
	public static final By TAX_CONDITIONS_CHECKBOX_NO_US_RELATIONS_PARTNER = By.xpath("//label[@for='aop_UsTaxResidenceCode_Account2']");
	
	// Account info and security questions
	public static final By ACCOUNT_INFO_TEXTFIELD_USERNAME = By.id("aop_UserID");
	public static final By ACCOUNT_INFO_TEXTFIELD_USERNAME_PARTNER = By.id("aop_UserID_Account2");
	public static final By ACCOUNT_INFO_TEXTFIELD_USERNAME_CONFIRM = By.id("aop_UserIDConfirm");
	public static final By ACCOUNT_INFO_TEXTFIELD_USERNAME_CONFIRM_PARTNER = By.id("aop_UserIDConfirm_Account2");
	public static final By ACCOUNT_INFO_TEXTFIELD_PASSWORD = By.id("aop_Password");
	public static final By ACCOUNT_INFO_TEXTFIELD_PASSWORD_PARTNER = By.id("aop_Password_Account2");
	public static final By ACCOUNT_INFO_TEXTFIELD_PASSWORD_CONFIRM = By.id("aop_PasswordConfirm");
	public static final By ACCOUNT_INFO_TEXTFIELD_PASSWORD_CONFIRM_PARTNER = By.id("aop_PasswordConfirm_Account2");
	public static final By ACCOUNT_INFO_DROPDOWN_PERSONAL_SECURITY_QUESTION = By.id("aop_PSQuestion");
	public static final By ACCOUNT_INFO_DROPDOWN_PERSONAL_SECURITY_QUESTION_PARTNER = By.id("aop_PSQuestion_Account2");
	public static final By ACCOUNT_INFO_TEXTFIELD_PERSONAL_SECURITY_ANSWER = By.id("aop_PSAnswer");
	public static final By ACCOUNT_INFO_TEXTFIELD_PERSONAL_SECURITY_ANSWER_PARTNER = By.id("aop_PSAnswer_Account2");
	
	// Summary
	public static final By SUMMARY_CHECKBOX_TERMS_AND_CONDITIONS = By.xpath("//label[@for='aop_ConditionsAgreed']");
	public static final By SUMMARY_CHECKBOX_FATCA = By.xpath("//label[@for='aop_Fatca']");
	public static final By SUMMARY_CHECKBOX_INVESTMENT_INFO_READ = By.xpath("//label[@for='aop_InvestInfo']");
	public static final By SUMMARY_LINK_CONDITIONS = By.xpath("//a[contains(text(),'Algemene Voorwaarden')]");
	public static final By SUMMARY_BUTTON_CONFIRM_REQUEST = By.xpath("//button[contains(@ng-click,'finalize')]");
		
	// Confirmation
	public static final By CONFIRMATION_TEXT_REQUEST_RECEIVED = By.xpath("(//div[contains(@class,'thankpage')]//h2[@class='slogan'])[1]");	
}