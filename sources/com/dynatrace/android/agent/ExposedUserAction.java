package com.dynatrace.android.agent;

import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes3.dex */
class ExposedUserAction implements ModifiableUserAction {
    private static final String TAG = Global.LOG_PREFIX + "ExposedUserAction";
    private final DTXAutoAction autoAction;

    ExposedUserAction(DTXAutoAction dTXAutoAction) {
        this.autoAction = dTXAutoAction;
    }

    private boolean actionCanTakeEvents() {
        if (isActionClosed()) {
            return false;
        }
        if (!this.autoAction.isGraceTimeOver()) {
            return true;
        }
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "The action cannot be modified since its grace time passed");
        }
        return false;
    }

    private boolean isActionClosed() {
        if (!this.autoAction.isFinalized()) {
            return false;
        }
        if (!Global.DEBUG) {
            return true;
        }
        Utility.zlogD(TAG, "The action cannot be modified since it is already closed");
        return true;
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public void cancel() {
        if (isActionClosed()) {
            return;
        }
        this.autoAction.cancelGracefully();
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public String getActionName() {
        return this.autoAction.getName();
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public void reportError(String str, int i2) {
        if (actionCanTakeEvents()) {
            this.autoAction.reportError(str, i2);
        }
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public void reportError(String str, Throwable th) {
        if (actionCanTakeEvents()) {
            this.autoAction.reportError(str, th);
        }
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public void reportEvent(String str) {
        if (actionCanTakeEvents()) {
            this.autoAction.reportEvent(str);
        }
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public void reportValue(String str, double d2) {
        if (actionCanTakeEvents()) {
            this.autoAction.reportValue(str, d2);
        }
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public void reportValue(String str, int i2) {
        if (actionCanTakeEvents()) {
            this.autoAction.reportValue(str, i2);
        }
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public void reportValue(String str, long j2) {
        if (actionCanTakeEvents()) {
            this.autoAction.reportValue(str, j2);
        }
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public void reportValue(String str, String str2) {
        if (actionCanTakeEvents()) {
            this.autoAction.reportValue(str, str2);
        }
    }

    @Override // com.dynatrace.android.agent.ModifiableUserAction
    public void setActionName(String str) {
        if (str == null || str.isEmpty()) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "The action name cannot be changed to an empty String or null");
            }
        } else {
            if (isActionClosed()) {
                return;
            }
            this.autoAction.modifyName(str);
        }
    }
}
