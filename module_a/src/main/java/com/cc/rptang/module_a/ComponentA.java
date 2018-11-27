package com.cc.rptang.module_a;

import com.billy.cc.core.component.CC;
import com.billy.cc.core.component.CCResult;
import com.billy.cc.core.component.CCUtil;
import com.billy.cc.core.component.IComponent;

public class ComponentA implements IComponent {

    @Override
    public String getName() {
        return "ComponentA";
    }

    @Override
    public boolean onCall(CC cc) {

        String actionName = cc.getActionName();
        if(actionName.equals("showMainActivity")){
            openActivity(cc);
        }
        return false;
    }

    private void openActivity(CC cc) {
        CCUtil.navigateTo(cc, MainActivity.class);
        CC.sendCCResult(cc.getCallId(), CCResult.success());
    }
}
