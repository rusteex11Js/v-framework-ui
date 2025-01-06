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

    public void
    setFirstName(BaseDTO dto) throws InterruptedException {
        utils.waitAndSetText(ElementType.XPATH,firstName,dto.getRegister().getFirstName(), WaitType.VISIBLE,15);
        Thread.sleep(1000L);
    }







}
