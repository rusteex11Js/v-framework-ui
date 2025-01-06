package base;

import utils.ActionsUtils;
import utils.ElementUtils;
import utils.ReportUtils;
import utils.WaitUtils;

public class UtilityBase {

    private static volatile UtilityBase utilsInstance;
    private UtilityBase(){ }
    public static UtilityBase getUtilsInstance(){
        if(utilsInstance == null){
            synchronized (UtilityBase.class){
                if (utilsInstance == null){
                    utilsInstance = new UtilityBase();
                }
            }
        }
        return utilsInstance;
    }

    private ElementUtils elementUtils;
    public ElementUtils getElementUtils() {
        if(elementUtils == null){
            elementUtils = new ElementUtils();
        }
        return elementUtils;
    }

    private WaitUtils waitUtils;
    public WaitUtils getWaitUtils(){
        if (waitUtils == null){
            waitUtils = new WaitUtils();
        }
        return waitUtils;
    }


    private ActionsUtils actionsUtils;
    public ActionsUtils getActionsUtils(){
        if (actionsUtils == null){
            actionsUtils = new ActionsUtils();
        }
        return actionsUtils;
    }

    private ReportUtils reportUtils;

    public ReportUtils getReportUtils(){
        if (reportUtils == null){
            reportUtils = new ReportUtils();
        }
        return reportUtils;
    }


}
