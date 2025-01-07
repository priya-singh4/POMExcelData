package POM.SD;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cares.cwds.salesforce.web.utilities.CustomException;
import cares.cwds.salesforce.web.utilities.Webkeywords;
import reportutilities.common.ReportCommon;
import reportutilities.extentmodel.PageDetails;
import reportutilities.model.TestCaseParam;
import testsettings.TestRunSettings;
import cares.cwds.salesforce.common.utilities.Util;
import cares.cwds.salesforce.constants.SD;
import cares.cwds.salesforce.constants.SD;

public class HealthInformation {
private static final Logger logger =LoggerFactory.getLogger(HealthInformation.class.getName());

private WebDriver driver;
ReportCommon exceptionDetails = new ReportCommon();
ReportCommon testStepDetails = new ReportCommon();
Util util = new Util();

String moduleName = ModuleConstants.COMMON;
String screenName = ScreenConstants.HealthInformation;
private static final String FAILED_FORMAT = "Failed ==> {} {} ";

public HealthInformation(){ }
public HealthInformation(WebDriver _driver,TestCaseParam testCaseParam)   {
initializePage(_driver,testCaseParam);
                    		}
public void initializePage(WebDriver _driver,TestCaseParam testCaseParam) throws Exception
{
    driver = _driver;
    PageFactory.initElements(driver, this);
    ReportCommon testStepLogDetails = new ReportCommon();
    testStepLogDetails.logModuleAndScreenDetails(testCaseParam, moduleName, screenName);
}


@FindBy(how = How.XPATH, using = "//*[@id=\"brandBand_2\"]/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-cares_-contact_-page___-contact___-v-i-e-w___-l-m-t___1733751311000/forcegenerated-flexipage_cares_contact_page_contact__view_js___lmt___1733820487000/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-aura-template-wrapper/div/div/div[2]/div[2]/div/div/forcegenerated-flexipageregion_cares_contact_page_center08_contact__view_js/flexipage-component2[2]/slot/lst-dynamic-related-list/article/laf-progressive-container/slot/lst-dynamic-related-list-with-user-prefs/lst-related-list-view-manager/lst-common-list-internal/lst-list-view-manager-header/div/div[1]/div[3]/div/runtime_platform_actions-actions-ribbon/ul/li/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-page-reference/slot/slot/lightning-button/button")
public WebElement newBtn;

@FindBy(how = How.XPATH, using = "//*[@id=\"brandBand_17\"]/div/c-cares-generic-default-record-type-screen/lightning-card/article/div[2]/slot/p/c-cares-custom-radio-group-button/div/fieldset/div/div/div[3]/label/span[1]")
public WebElement hearingRb;

@FindBy(how = How.XPATH, using = "//*[@id=\"brandBand_17\"]/div/c-cares-generic-default-record-type-screen/lightning-card/article/div[3]/slot/div/c-kreator-action-buttons[2]/button/div/div")
public WebElement nextBtn;

@FindBy(how = How.XPATH, using = "//*[@id=\"combobox-button-3532\"]")
public WebElement hearingTypeDD;

@FindBy(how = How.XPATH, using = "//*[@id=\"combobox-button-3532-3-3532\"]/span[2]/span")
public WebElement hearningTypeDDValue;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-3537\"]")
public WebElement mmedicalOfficeInfo;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-3540\"]")
public WebElement diagnoseDate;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-3545\"]")
public WebElement providerName;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-3548\"]")
public WebElement main;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-3548\"]")
public WebElement main;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-3548\"]")
public WebElement providerPhone;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-3554\"]")
public WebElement sourceName;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-3560\"]")
public WebElement dateReported;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-3568\"]")
public WebElement sourceRelationship;

@FindBy(how = How.XPATH, using = "//*[@id=\"combobox-3569\"]")
public WebElement healthNeedDD;

@FindBy(how = How.XPATH, using = "//*[@id=\"uniqueKey1-3569\"]/span/span[2]/span[1]")
public WebElement healthNeedDDValue;

@FindBy(how = How.XPATH, using = "//*[@id=\"1736240851844220-3521\"]/slot/div/div/div/div[10]/c-kreator-input-selection-checkbox/lightning-input/lightning-primitive-input-checkbox/div[1]/span/label/span[1]")
public WebElement hepAlertCB;

@FindBy(how = How.XPATH, using = "//*[@id=\"1736240851844220-3521\"]/slot/div/div/div/div[11]/c-kreator-input-selection-radio/lightning-radio-group/fieldset/div/span[2]/label/span[1]")
public WebElement functionaffectedRB;

@FindBy(how = How.XPATH, using = "//*[@id=\"1736240851844220-3521\"]/slot/div/div/div/div[12]/c-kreator-input-selection-radio/lightning-radio-group/fieldset/div/span[2]/label/span[1]")
public WebElement educationAffectedRB;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-3586\"]")
public WebElement additionalInfo;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-3660\"]")
public WebElement alertDescription;

@FindBy(how = How.XPATH, using = "//*[@id=\"1736240851844220-3521\"]/slot/div/div/div/div[15]/c-kreator-input-selection-checkbox/lightning-input/lightning-primitive-input-checkbox/div[1]/span/label/span[1]")
public WebElement confedentialCB;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-3591\"]")
public WebElement summary;

@FindBy(how = How.XPATH, using = "//*[@id=\"combobox-3592\"]")
public WebElement relatedHealthRecordDD;

@FindBy(how = How.XPATH, using = "//*[@id=\"combobox-3592\"]")
public WebElement relatedHealthRecordDDValue;

@FindBy(how = How.XPATH, using = "//*[@id=\"brandBand_18\"]/div/div/div/div/div[2]/span/c-cares_-generic-l-w-c-container/c-cares_screen-health-info-hearing-imp/div/div/div/div[2]/div[2]/div/div/div[2]/c-kreator-action-buttons/button/div/div")
public WebElement saveBtn;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method Start ===>  HealthInformation///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void HealthInformation(TestCaseParam testCaseParam,String scriptIteration, String pomIteration) throws Exception  {
PageDetails action = new PageDetails();
LocalDateTime startTime= LocalDateTime.now();
action.setPageActionName("HealthInformation");
action.setPageActionDescription("HealthInformation");

try {
Map<String, ArrayList<String>> testCaseDataSD = util.GetScreenTCData(ScreenName, testCaseParam.TestCaseName,TestRunSettings.TestDataPath, TestRunSettings.TestDataMappingFileName ,TestRunSettings.TestDataMappingSheetName_SD,scriptIteration,pomIteration);


String newBtn_TD = TestCaseData_SD.get("newBtn").get(0);
String hearingRb_TD = TestCaseData_SD.get("hearingRb").get(0);
String nextBtn_TD = TestCaseData_SD.get("nextBtn").get(0);
String hearingTypeDD_TD = TestCaseData_SD.get("hearingTypeDD").get(0);
String hearningTypeDDValue_TD = TestCaseData_SD.get("hearningTypeDDValue").get(0);
String mmedicalOfficeInfo_TD = TestCaseData_SD.get("mmedicalOfficeInfo").get(0);
String diagnoseDate_TD = TestCaseData_SD.get("diagnoseDate").get(0);
String providerName_TD = TestCaseData_SD.get("providerName").get(0);
String main_TD = TestCaseData_SD.get("main").get(0);
String main_TD = TestCaseData_SD.get("main").get(0);
String providerPhone_TD = TestCaseData_SD.get("providerPhone").get(0);
String sourceName_TD = TestCaseData_SD.get("sourceName").get(0);
String dateReported_TD = TestCaseData_SD.get("dateReported").get(0);
String sourceRelationship_TD = TestCaseData_SD.get("sourceRelationship").get(0);
String healthNeedDD_TD = TestCaseData_SD.get("healthNeedDD").get(0);
String healthNeedDDValue_TD = TestCaseData_SD.get("healthNeedDDValue").get(0);
String hepAlertCB_TD = TestCaseData_SD.get("hepAlertCB").get(0);
String functionaffectedRB_TD = TestCaseData_SD.get("functionaffectedRB").get(0);
String educationAffectedRB_TD = TestCaseData_SD.get("educationAffectedRB").get(0);
String additionalInfo_TD = TestCaseData_SD.get("additionalInfo").get(0);
String alertDescription_TD = TestCaseData_SD.get("alertDescription").get(0);
String confedentialCB_TD = TestCaseData_SD.get("confedentialCB").get(0);
String summary_TD = TestCaseData_SD.get("summary").get(0);
String relatedHealthRecordDD_TD = TestCaseData_SD.get("relatedHealthRecordDD").get(0);
String relatedHealthRecordDDValue_TD = TestCaseData_SD.get("relatedHealthRecordDDValue").get(0);
String saveBtn_TD = TestCaseData_SD.get("saveBtn").get(0);



Webkeywords.instance().click(driver,  newBtn,newBtn_TD, testCaseParam,action);
Webkeywords.instance().click(driver,  hearingRb,hearingRb_TD, testCaseParam,action);
Webkeywords.instance().click(driver,  nextBtn,nextBtn_TD, testCaseParam,action);
Webkeywords.instance().click(driver,  hearingTypeDD,hearingTypeDD_TD, testCaseParam,action);
Webkeywords.instance().click(driver,  hearningTypeDDValue,hearningTypeDDValue_TD, testCaseParam,action);
Webkeywords.instance().setText(driver,  mmedicalOfficeInfo,mmedicalOfficeInfo_TD, testCaseParam,action);
Webkeywords.instance().click(driver,  diagnoseDate,diagnoseDate_TD, testCaseParam,action);
Webkeywords.instance().setText(driver,  providerName,providerName_TD, testCaseParam,action);
Webkeywords.instance().click(driver,  main,main_TD, testCaseParam,action);
Webkeywords.instance().setText(driver,  main,main_TD, testCaseParam,action);
Webkeywords.instance().setText(driver,  providerPhone,providerPhone_TD, testCaseParam,action);
Webkeywords.instance().setText(driver,  sourceName,sourceName_TD, testCaseParam,action);
Webkeywords.instance().click(driver,  dateReported,dateReported_TD, testCaseParam,action);
Webkeywords.instance().setText(driver,  sourceRelationship,sourceRelationship_TD, testCaseParam,action);
Webkeywords.instance().click(driver,  healthNeedDD,healthNeedDD_TD, testCaseParam,action);
Webkeywords.instance().click(driver,  healthNeedDDValue,healthNeedDDValue_TD, testCaseParam,action);
Webkeywords.instance().click(driver,  hepAlertCB,hepAlertCB_TD, testCaseParam,action);
Webkeywords.instance().click(driver,  functionaffectedRB,functionaffectedRB_TD, testCaseParam,action);
Webkeywords.instance().click(driver,  educationAffectedRB,educationAffectedRB_TD, testCaseParam,action);
Webkeywords.instance().setText(driver,  additionalInfo,additionalInfo_TD, testCaseParam,action);
Webkeywords.instance().setText(driver,  alertDescription,alertDescription_TD, testCaseParam,action);
Webkeywords.instance().click(driver,  confedentialCB,confedentialCB_TD, testCaseParam,action);
Webkeywords.instance().setText(driver,  summary,summary_TD, testCaseParam,action);
Webkeywords.instance().click(driver,  relatedHealthRecordDD,relatedHealthRecordDD_TD, testCaseParam,action);
Webkeywords.instance().click(driver,  relatedHealthRecordDDValue,relatedHealthRecordDDValue_TD, testCaseParam,action);
Webkeywords.instance().click(driver,  saveBtn,saveBtn_TD, testCaseParam,action);



  }
            catch (Exception e)
            {
                logger.error("Failed == " + action.getPageActionDescription);
                exceptionDetails.logExceptionDetails(driver, testCaseParam, action.getPageActionName, action.getPageActionDescription, startTime,e);
                throw e;
            }
 }
}

