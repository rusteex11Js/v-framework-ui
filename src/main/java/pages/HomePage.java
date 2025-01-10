package pages;

import base.PageBase;
import constant.ElementType;
import constant.WaitType;
import dto.BaseDTO;
import utils.FunctionalUtils;

import static utils.FunctionalUtils.getFunctionalUtilsInstance;

public class HomePage extends PageBase {
    private FunctionalUtils utils = getFunctionalUtilsInstance();
    private String firstName = "//input[@ng-model='FirstName']";

    /**
    String xmlCode = "<book>\n" +
            "\n" +
            "<title> Learning Amazon Web Services </title>\n" +
            "\n" +
            "<author> Mark Wilkins </author>\n" +
            "\n" +
            "</book>";
    String jsonCode = "{\"result\":true, \"count\":42}";
        test.info(MarkupHelper.createCodeBlock(xmlCode, CodeLanguage.XML));
        test.info(MarkupHelper.createCodeBlock(jsonCode,CodeLanguage.JSON));
     */
    public void
    setFirstName(BaseDTO dto) throws InterruptedException {
        utils.waitAndSetText(ElementType.XPATH,firstName,dto.getRegister().getFirstName(), WaitType.VISIBLE,15);
        Thread.sleep(1000L);
    }







}
