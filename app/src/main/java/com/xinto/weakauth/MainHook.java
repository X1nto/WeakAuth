package com.xinto.weakauth;

import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;

public class MainHook implements IXposedHookZygoteInit {

    @Override
    public void initZygote(StartupParam startupParam) {
        XposedHelpers.findAndHookMethod(
            "com.android.internal.widget.LockPatternUtils.StrongAuthTracker",
            null,
            "getStrongAuthForUser",
            int.class,
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) {
                    param.setResult(0x0);
                }
            }
        );

        XposedHelpers.findAndHookMethod(
            "com.android.keyguard.KeyguardUpdateMonitor",
            null,
            "isUnlockingWithBiometricAllowed",
            boolean.class,
            new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) {
                    param.setResult(true);
                }
            }
        );
    }
}
