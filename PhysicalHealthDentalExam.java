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


@FindBy(how = How.XPATH, using = "//*[@id=\"brandBand_4\"]/div/c-cares-generic-default-record-type-screen/lightning-card/article/div[2]/slot/p/c-cares-custom-radio-group-button/div/fieldset/div/div/div[2]/label/span[1]")
public WebElement DentalExam;

@FindBy(how = How.XPATH, using = "//*[@id=\"brandBand_4\"]/div/c-cares-generic-default-record-type-screen/lightning-card/article/div[3]/slot/div/c-kreator-action-buttons[2]/button")
public WebElement Next;

@FindBy(how = How.XPATH, using = "//*[@id=\"combobox-button-1206\"]")
public WebElement DentalExamTypeDD;

@FindBy(how = How.XPATH, using = "//*[@id=\"combobox-button-1206-1-1206\"]/span[2]/span")
public WebElement DentalExamTypeDdValue;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-1211\"]")
public WebElement ExamDate;

@FindBy(how = How.XPATH, using = "//*[@id=\"1736167448234166-1195\"]/slot/div/div/div/div[2]/c-kreator-input-date/lightning-input/lightning-datepicker/div[1]/div/lightning-calendar/div/lightning-focus-trap/slot/button")
public WebElement todayDate;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-1216\"]")
public WebElement diagnosedCondition;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-1219\"]")
public WebElement treatmentReceived;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-1222\"]")
public WebElement providerName;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-1225\"]")
public WebElement main;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-1225\"]")
public WebElement main;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-1225\"]")
public WebElement providerPhone;

@FindBy(how = How.XPATH, using = "//*[@id=\"combobox-button-1228\"]")
public WebElement referralNeededDD;

@FindBy(how = How.XPATH, using = "//*[@id=\"combobox-button-1228-2-1228\"]/span[2]")
public WebElement referralNeededDdValue;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-1236\"]")
public WebElement dateReported;

@FindBy(how = How.XPATH, using = "//*[@id=\"1736167448234166-1195\"]/slot/div/div/div/div[8]/c-kreator-input-date/lightning-input/lightning-datepicker/div[1]/div/lightning-calendar/div/lightning-focus-trap/slot/button")
public WebElement todayDate;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-1241\"]")
public WebElement nextScheduledDate;

@FindBy(how = How.XPATH, using = "//*[@id=\"1736167448234166-1195\"]/slot/div/div/div/div[9]/c-kreator-input-date/lightning-input/lightning-datepicker/div[1]/div/lightning-calendar/div/lightning-focus-trap/slot/button")
public WebElement todayDateSelect;

@FindBy(how = How.XPATH, using = "//*[@id=\"combobox-1244\"]")
public WebElement healthNeedDD;

@FindBy(how = How.XPATH, using = "//*[@id=\"uniqueKey1-1244\"]/span/span[2]/span[1]")
public WebElement healthNeedDDValue;

@FindBy(how = How.XPATH, using = "//*[@id=\"1736167448234166-1195\"]/slot/div/div/div/div[11]/c-kreator-input-selection-checkbox/lightning-input/lightning-primitive-input-checkbox/div[1]/span/label/span[1]")
public WebElement confidentialCb;

@FindBy(how = How.XPATH, using = "//*[@id=\"1736167448234166-1195\"]/slot/div/div/div/div[12]/c-kreator-input-selection-checkbox/lightning-input/lightning-primitive-input-checkbox/div[1]/span/label/span[1]")
public WebElement hepCb;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-1254\"]")
public WebElement summary;

@FindBy(how = How.XPATH, using = "//*[@id=\"combobox-1255\"]")
public WebElement relatedHealthRecord;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-1268\"]")
public WebElement additionalInfo;

@FindBy(how = How.XPATH, using = "//*[@id=\"input-1342\"]")
public WebElement hepDesciption;

@FindBy(how = How.XPATH, using = "//*[@id=\"brandBand_5\"]/div/div/div/div/div[2]/span/c-cares_-generic-l-w-c-container/c-cares_screen-health-info-dental-exams/div/div/div/div[2]/div/div[2]/div/div/div[2]/c-kreator-action-buttons/button/div/div")
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


String DentalExam = testCaseDataSD.get("DentalExam").get(0);
String Next = testCaseDataSD.get("Next").get(0);
String DentalExamTypeDD = testCaseDataSD.get("DentalExamTypeDD").get(0);
String DentalExamTypeDdValue = testCaseDataSD.get("DentalExamTypeDdValue").get(0);
String ExamDate = testCaseDataSD.get("ExamDate").get(0);
String todayDate = testCaseDataSD.get("todayDate").get(0);
String diagnosedCondition = testCaseDataSD.get("diagnosedCondition").get(0);
String treatmentReceived = testCaseDataSD.get("treatmentReceived").get(0);
String providerName = testCaseDataSD.get("providerName").get(0);
String main = testCaseDataSD.get("main").get(0);
String main = testCaseDataSD.get("main").get(0);
String providerPhone = testCaseDataSD.get("providerPhone").get(0);
String referralNeededDD = testCaseDataSD.get("referralNeededDD").get(0);
String referralNeededDdValue = testCaseDataSD.get("referralNeededDdValue").get(0);
String dateReported = testCaseDataSD.get("dateReported").get(0);
String todayDate = testCaseDataSD.get("todayDate").get(0);
String nextScheduledDate = testCaseDataSD.get("nextScheduledDate").get(0);
String todayDateSelect = testCaseDataSD.get("todayDateSelect").get(0);
String healthNeedDD = testCaseDataSD.get("healthNeedDD").get(0);
String healthNeedDDValue = testCaseDataSD.get("healthNeedDDValue").get(0);
String confidentialCb = testCaseDataSD.get("confidentialCb").get(0);
String hepCb = testCaseDataSD.get("hepCb").get(0);
String summary = testCaseDataSD.get("summary").get(0);
String relatedHealthRecord = testCaseDataSD.get("relatedHealthRecord").get(0);
String additionalInfo = testCaseDataSD.get("additionalInfo").get(0);
String hepDesciption = testCaseDataSD.get("hepDesciption").get(0);
String saveBtn = testCaseDataSD.get("saveBtn").get(0);



Webkeywords.instance().click(driver,  DentalExam,TestData, testCaseParam,action);(testCaseParam,DentalExam);
Webkeywords.instance().click(driver,  Next,TestData, testCaseParam,action);(testCaseParam,Next);
Webkeywords.instance().click(driver,  DentalExamTypeDD,TestData, testCaseParam,action);(testCaseParam,DentalExamTypeDD);
Webkeywords.instance().click(driver,  DentalExamTypeDdValue,TestData, testCaseParam,action);(testCaseParam,DentalExamTypeDdValue);
Webkeywords.instance().click(driver,  ExamDate,TestData, testCaseParam,action);(testCaseParam,ExamDate);
Webkeywords.instance().click(driver,  todayDate,TestData, testCaseParam,action);(testCaseParam,todayDate);
Webkeywords.instance().setText(driver,  diagnosedCondition,TestData, testCaseParam,action);(testCaseParam,diagnosedCondition);
Webkeywords.instance().setText(driver,  treatmentReceived,TestData, testCaseParam,action);(testCaseParam,treatmentReceived);
Webkeywords.instance().setText(driver,  providerName,TestData, testCaseParam,action);(testCaseParam,providerName);
Webkeywords.instance().click(driver,  main,TestData, testCaseParam,action);(testCaseParam,main);
Webkeywords.instance().setText(driver,  main,TestData, testCaseParam,action);(testCaseParam,main);
Webkeywords.instance().setText(driver,  providerPhone,TestData, testCaseParam,action);(testCaseParam,providerPhone);
Webkeywords.instance().click(driver,  referralNeededDD,TestData, testCaseParam,action);(testCaseParam,referralNeededDD);
Webkeywords.instance().click(driver,  referralNeededDdValue,TestData, testCaseParam,action);(testCaseParam,referralNeededDdValue);
Webkeywords.instance().click(driver,  dateReported,TestData, testCaseParam,action);(testCaseParam,dateReported);
Webkeywords.instance().click(driver,  todayDate,TestData, testCaseParam,action);(testCaseParam,todayDate);
Webkeywords.instance().click(driver,  nextScheduledDate,TestData, testCaseParam,action);(testCaseParam,nextScheduledDate);
Webkeywords.instance().click(driver,  todayDateSelect,TestData, testCaseParam,action);(testCaseParam,todayDateSelect);
Webkeywords.instance().click(driver,  healthNeedDD,TestData, testCaseParam,action);(testCaseParam,healthNeedDD);
Webkeywords.instance().click(driver,  healthNeedDDValue,TestData, testCaseParam,action);(testCaseParam,healthNeedDDValue);
Webkeywords.instance().click(driver,  confidentialCb,TestData, testCaseParam,action);(testCaseParam,confidentialCb);
Webkeywords.instance().click(driver,  hepCb,TestData, testCaseParam,action);(testCaseParam,hepCb);
Webkeywords.instance().setText(driver,  summary,TestData, testCaseParam,action);(testCaseParam,summary);
Webkeywords.instance().click(driver,  relatedHealthRecord,TestData, testCaseParam,action);(testCaseParam,relatedHealthRecord);
Webkeywords.instance().setText(driver,  additionalInfo,TestData, testCaseParam,action);(testCaseParam,additionalInfo);
Webkeywords.instance().setText(driver,  hepDesciption,TestData, testCaseParam,action);(testCaseParam,hepDesciption);
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

