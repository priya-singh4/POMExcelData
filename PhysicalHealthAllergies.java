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

public class ScreeningDetails {
private static final Logger logger =LoggerFactory.getLogger(ScreeningDetails.class.getName());

private WebDriver driver;
ReportCommon exceptionDetails = new ReportCommon();
ReportCommon testStepDetails = new ReportCommon();
Util util = new Util();

String moduleName = ModuleConstants.COMMON;
String screenName = ScreenConstants.ScreeningDetails;
private static final String FAILED_FORMAT = "Failed ==> {} {} ";

public ScreeningDetails(){ }
public ScreeningDetails(WebDriver _driver,TestCaseParam testCaseParam)   {
initializePage(_driver,testCaseParam);
                    		}
public void initializePage(WebDriver _driver,TestCaseParam testCaseParam) throws Exception
{
    driver = _driver;
    PageFactory.initElements(driver, this);
    ReportCommon testStepLogDetails = new ReportCommon();
    testStepLogDetails.logModuleAndScreenDetails(testCaseParam, moduleName, screenName);
}


@FindBy(how = How.XPATH, using = "//*[@id=\"brandBand_23\"]/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-cares_-contact_-page___-contact___-v-i-e-w___-l-m-t___1734703443000/forcegenerated-flexipage_cares_contact_page_contact__view_js___lmt___1733820487000/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-aura-template-wrapper/div/div/div[2]/div[2]/div/div/forcegenerated-flexipageregion_cares_contact_page_center08_contact__view_js/flexipage-component2[2]/slot/lst-dynamic-related-list/article/laf-progressive-container/slot/lst-dynamic-related-list-with-user-prefs/lst-related-list-view-manager/lst-common-list-internal/lst-list-view-manager-header/div/div[1]/div[3]/div/runtime_platform_actions-actions-ribbon/ul/li/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-page-reference/slot/slot/lightning-button/button")
public WebElement newBtn;

@FindBy(how = How.XPATH, using = "//*[@id=\"brandBand_24\"]/div/c-cares-generic-default-record-type-screen/lightning-card/article/div[2]/slot/p/c-cares-custom-radio-group-button/div/fieldset/div/div/div[1]/label/span[1]")
public WebElement allergiesRB;

@FindBy(how = How.XPATH, using = "//*[@id=\"brandBand_24\"]/div/c-cares-generic-default-record-type-screen/lightning-card/article/div[3]/slot/div/c-kreator-action-buttons[2]/button/div/div")
public WebElement nextBtn;

@FindBy(how = How.XPATH, using = "//*[@id=\"combobox-button-15083\"]")
public WebElement allergyTypeDD;

@FindBy(how = How.XPATH, using = "//*[@id=\"combobox-button-15083-4-15083\"]/span[2]")
public WebElement allergyTypeDDValue;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-15088\"]")
public WebElement dateofDiagnosis;

@FindBy(how = How.XPATH, using = "//*[@id=\"173616511302940-15072\"]/slot/div/div/div/div[2]/c-kreator-input-date/lightning-input/lightning-datepicker/div[1]/div/lightning-calendar/div/lightning-focus-trap/slot/button")
public WebElement todayDateSelect;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-15093\"]")
public WebElement providerName;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-15096\"]")
public WebElement providerPhone;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-15099\"]")
public WebElement eplPen;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-15102\"]")
public WebElement medicalOfficeInfo;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-15108\"]")
public WebElement sourceName;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-15114\"]")
public WebElement sourceRelationship;

@FindBy(how = How.XPATH, using = "//*[@id=\"combobox-15115\"]")
public WebElement healthNeedDD;

@FindBy(how = How.XPATH, using = "//*[@id=\"uniqueKey1-15115\"]/span/span[2]/span[1]")
public WebElement healthNeedDDValue;

@FindBy(how = How.XPATH, using = "//*[@id=\"173616511302940-15072\"]/slot/div/div/div/div[10]/c-kreator-input-selection-checkbox/lightning-input/lightning-primitive-input-checkbox/div[1]/span/label/span[1]")
public WebElement hepAlertCB;

@FindBy(how = How.XPATH, using = "//*[@id=\"173616511302940-15072\"]/slot/div/div/div/div[11]/c-kreator-input-selection-checkbox/lightning-input/lightning-primitive-input-checkbox/div[1]/span/label/span[1]")
public WebElement confedentialCB;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-15125\"]")
public WebElement summary;

@FindBy(how = How.XPATH, using = "//*[@id=\"combobox-15126\"]")
public WebElement relatedHealthRecordDD;

@FindBy(how = How.XPATH, using = "//*[@id=\"combobox-15126\"]")
public WebElement relatedHealthRecordDDValue;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-15140\"]")
public WebElement treatmentPlan;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-15212\"]")
public WebElement hepAlertDescription;

@FindBy(how = How.XPATH, using = "//*[@id=\"brandBand_25\"]/div/div/div/div/div[2]/span/c-cares_-generic-l-w-c-container/c-cares_screen-health-info-allergy/div/div/div/div[2]/div/div[2]/div/div/div[2]/c-kreator-action-buttons/button/div/div")
public WebElement saveBtn;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method Start ===>  ScreeningDetails///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void ScreeningDetails(TestCaseParam testCaseParam,String scriptIteration, String pomIteration) throws Exception  {
PageDetails action = new PageDetails();
LocalDateTime startTime= LocalDateTime.now();
action.setPageActionName("ScreeningDetails");
action.setPageActionDescription("ScreeningDetails");

try {
Map<String, ArrayList<String>> testCaseDataSD = util.GetScreenTCData(ScreenName, testCaseParam.TestCaseName,TestRunSettings.TestDataPath, TestRunSettings.TestDataMappingFileName ,TestRunSettings.TestDataMappingSheetName_SD,scriptIteration,pomIteration);


String newBtn = testCaseDataSD.get("newBtn").get(0);
String allergiesRB = testCaseDataSD.get("allergiesRB").get(0);
String nextBtn = testCaseDataSD.get("nextBtn").get(0);
String allergyTypeDD = testCaseDataSD.get("allergyTypeDD").get(0);
String allergyTypeDDValue = testCaseDataSD.get("allergyTypeDDValue").get(0);
String dateofDiagnosis = testCaseDataSD.get("dateofDiagnosis").get(0);
String todayDateSelect = testCaseDataSD.get("todayDateSelect").get(0);
String providerName = testCaseDataSD.get("providerName").get(0);
String providerPhone = testCaseDataSD.get("providerPhone").get(0);
String eplPen = testCaseDataSD.get("eplPen").get(0);
String medicalOfficeInfo = testCaseDataSD.get("medicalOfficeInfo").get(0);
String sourceName = testCaseDataSD.get("sourceName").get(0);
String sourceRelationship = testCaseDataSD.get("sourceRelationship").get(0);
String healthNeedDD = testCaseDataSD.get("healthNeedDD").get(0);
String healthNeedDDValue = testCaseDataSD.get("healthNeedDDValue").get(0);
String hepAlertCB = testCaseDataSD.get("hepAlertCB").get(0);
String confedentialCB = testCaseDataSD.get("confedentialCB").get(0);
String summary = testCaseDataSD.get("summary").get(0);
String relatedHealthRecordDD = testCaseDataSD.get("relatedHealthRecordDD").get(0);
String relatedHealthRecordDDValue = testCaseDataSD.get("relatedHealthRecordDDValue").get(0);
String treatmentPlan = testCaseDataSD.get("treatmentPlan").get(0);
String hepAlertDescription = testCaseDataSD.get("hepAlertDescription").get(0);
String saveBtn = testCaseDataSD.get("saveBtn").get(0);



Webkeywords.instance().click(driver,  newBtn,TestData, testCaseParam,action);(testCaseParam,newBtn);
Webkeywords.instance().click(driver,  allergiesRB,TestData, testCaseParam,action);(testCaseParam,allergiesRB);
Webkeywords.instance().click(driver,  nextBtn,TestData, testCaseParam,action);(testCaseParam,nextBtn);
Webkeywords.instance().click(driver,  allergyTypeDD,TestData, testCaseParam,action);(testCaseParam,allergyTypeDD);
Webkeywords.instance().click(driver,  allergyTypeDDValue,TestData, testCaseParam,action);(testCaseParam,allergyTypeDDValue);
Webkeywords.instance().click(driver,  dateofDiagnosis,TestData, testCaseParam,action);(testCaseParam,dateofDiagnosis);
Webkeywords.instance().click(driver,  todayDateSelect,TestData, testCaseParam,action);(testCaseParam,todayDateSelect);
Webkeywords.instance().setText(driver,  providerName,TestData, testCaseParam,action);(testCaseParam,providerName);
Webkeywords.instance().setText(driver,  providerPhone,TestData, testCaseParam,action);(testCaseParam,providerPhone);
Webkeywords.instance().setText(driver,  eplPen,TestData, testCaseParam,action);(testCaseParam,eplPen);
Webkeywords.instance().setText(driver,  medicalOfficeInfo,TestData, testCaseParam,action);(testCaseParam,medicalOfficeInfo);
Webkeywords.instance().setText(driver,  sourceName,TestData, testCaseParam,action);(testCaseParam,sourceName);
Webkeywords.instance().setText(driver,  sourceRelationship,TestData, testCaseParam,action);(testCaseParam,sourceRelationship);
Webkeywords.instance().click(driver,  healthNeedDD,TestData, testCaseParam,action);(testCaseParam,healthNeedDD);
Webkeywords.instance().click(driver,  healthNeedDDValue,TestData, testCaseParam,action);(testCaseParam,healthNeedDDValue);
Webkeywords.instance().click(driver,  hepAlertCB,TestData, testCaseParam,action);(testCaseParam,hepAlertCB);
Webkeywords.instance().click(driver,  confedentialCB,TestData, testCaseParam,action);(testCaseParam,confedentialCB);
Webkeywords.instance().setText(driver,  summary,TestData, testCaseParam,action);(testCaseParam,summary);
Webkeywords.instance().click(driver,  relatedHealthRecordDD,TestData, testCaseParam,action);(testCaseParam,relatedHealthRecordDD);
Webkeywords.instance().click(driver,  relatedHealthRecordDDValue,TestData, testCaseParam,action);(testCaseParam,relatedHealthRecordDDValue);
Webkeywords.instance().setText(driver,  treatmentPlan,TestData, testCaseParam,action);(testCaseParam,treatmentPlan);
Webkeywords.instance().setText(driver,  hepAlertDescription,TestData, testCaseParam,action);(testCaseParam,hepAlertDescription);
Webkeywords.instance().click(driver,  saveBtn,TestData, testCaseParam,action);(testCaseParam,saveBtn);



  }
            catch (Exception e)
            {
                logger.error("Failed == " + action.getPageActionDescription);
                exceptionDetails.logExceptionDetails(driver, testCaseParam, action.getPageActionName, action.getPageActionDescription, startTime,e);
                throw e;
            }
 }
}

