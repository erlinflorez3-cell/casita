package io.cobrowse;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.npmdavi.davinotification.Constant;
import io.cobrowse.CobrowseAccessibilityService;
import io.cobrowse.PanGestureRecognizer;
import io.sentry.protocol.SentryThread;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
class ControlInjectorAccessibility extends BroadcastReceiver implements CobrowseAccessibilityService.AccessibilityInjector {
    private static final String REMOTE_CONTROL_INTENT = "io.cobrowse.REMOTE_CONTROL";
    private static final String SESSION_ENDED_INTENT = "io.cobrowse.SESSION_ENDED";
    private static Touch initialTouch = null;
    private static final PanGestureRecognizer panRecognizer = new PanGestureRecognizer();
    private static Touch previousTouch = null;
    private final boolean acceptMediaProjectionPrompt;
    private boolean isAwaitingMediaProjectionLayoutChange;
    private final TypedPasswordsStorage passwords;
    private final AccessibilityService service;
    private GestureDescription.StrokeDescription strokeDescription;

    /* JADX INFO: renamed from: io.cobrowse.ControlInjectorAccessibility$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$cobrowse$PanGestureRecognizer$Direction;

        static {
            int[] iArr = new int[PanGestureRecognizer.Direction.values().length];
            $SwitchMap$io$cobrowse$PanGestureRecognizer$Direction = iArr;
            try {
                iArr[PanGestureRecognizer.Direction.Up.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$cobrowse$PanGestureRecognizer$Direction[PanGestureRecognizer.Direction.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$cobrowse$PanGestureRecognizer$Direction[PanGestureRecognizer.Direction.Down.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$cobrowse$PanGestureRecognizer$Direction[PanGestureRecognizer.Direction.Right.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static final class TypedPasswordsStorage {
        private final Map<String, String> previouslyTypedValues;

        private TypedPasswordsStorage() {
            this.previouslyTypedValues = new HashMap();
        }

        /* synthetic */ TypedPasswordsStorage(AnonymousClass1 anonymousClass1) {
            this();
        }

        private static String getId(AccessibilityNodeInfo accessibilityNodeInfo) {
            String uniqueId = Build.VERSION.SDK_INT >= 33 ? accessibilityNodeInfo.getUniqueId() : null;
            if (uniqueId == null || uniqueId.equals("")) {
                uniqueId = accessibilityNodeInfo.getViewIdResourceName();
            }
            return (uniqueId == null || uniqueId.equals("")) ? String.valueOf(accessibilityNodeInfo.hashCode()) : uniqueId;
        }

        public void clear() {
            this.previouslyTypedValues.clear();
        }

        public CharSequence guessNewValue(AccessibilityNodeInfo accessibilityNodeInfo, String str, String str2) {
            String id = getId(accessibilityNodeInfo);
            String str3 = this.previouslyTypedValues.get(id);
            if (str3 == null) {
                str3 = "";
            }
            CharSequence textFromNode = ControlInjectorAccessibility.getTextFromNode(accessibilityNodeInfo);
            if (str.equals(ReactEditTextInputConnectionWrapper.BACKSPACE_KEY_VALUE)) {
                str2 = (str3.length() == textFromNode.length() && str3.length() > 1) ? str3.substring(0, str3.length() - 1) : "";
            } else {
                if (str2.length() != 1) {
                    return str3;
                }
                if (str3.length() == textFromNode.length()) {
                    str2 = str3 + str2;
                }
            }
            this.previouslyTypedValues.put(id, str2);
            return str2;
        }
    }

    ControlInjectorAccessibility(AccessibilityService accessibilityService) throws Throwable {
        this.service = accessibilityService;
        CompatibilityUtils.registerBroadcastReceiver(accessibilityService, this, new IntentFilter(REMOTE_CONTROL_INTENT));
        CompatibilityUtils.registerBroadcastReceiver(accessibilityService, this, new IntentFilter(SESSION_ENDED_INTENT));
        this.acceptMediaProjectionPrompt = accessibilityService.getResources().getBoolean(R.bool.cobrowse_automatically_accept_media_projection_prompt);
        this.passwords = new TypedPasswordsStorage(null);
    }

    private void acceptMediaProjectionPermissionActivity(AccessibilityNodeInfo accessibilityNodeInfo) throws Throwable {
        if (accessibilityNodeInfo == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 35) {
            acceptMediaProjectionPermissionActivityV34Partial(accessibilityNodeInfo);
            return;
        }
        if (!acceptMediaProjectionPermissionActivityV21(accessibilityNodeInfo) && Build.VERSION.SDK_INT >= 34) {
            if (this.isAwaitingMediaProjectionLayoutChange) {
                acceptMediaProjectionPermissionActivityV34Partial(accessibilityNodeInfo);
            } else {
                if (acceptMediaProjectionPermissionActivityV34Partial(accessibilityNodeInfo)) {
                    return;
                }
                acceptMediaProjectionPermissionActivityV34(accessibilityNodeInfo);
            }
        }
    }

    private boolean acceptMediaProjectionPermissionActivityV21(AccessibilityNodeInfo accessibilityNodeInfo) {
        AccessibilityNodeInfo accessibilityNodeInfoFindMediaProjectionStartButton = findMediaProjectionStartButton(accessibilityNodeInfo, findMediaProjectionActionTextV21(this.service));
        if (accessibilityNodeInfoFindMediaProjectionStartButton == null) {
            return false;
        }
        accessibilityNodeInfoFindMediaProjectionStartButton.performAction(16);
        return true;
    }

    private boolean acceptMediaProjectionPermissionActivityV34(AccessibilityNodeInfo accessibilityNodeInfo) throws Throwable {
        AccessibilityNodeInfo accessibilityNodeInfoFindNode;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        final String strFindMediaProjectionCancelText = findMediaProjectionCancelText(this.service);
        if (strFindMediaProjectionCancelText == null || (accessibilityNodeInfoFindNode = findNode(accessibilityNodeInfo, new Predicate() { // from class: io.cobrowse.ControlInjectorAccessibility$$ExternalSyntheticLambda3
            @Override // io.cobrowse.Predicate
            public final boolean test(Object obj) {
                return ControlInjectorAccessibility.lambda$acceptMediaProjectionPermissionActivityV34$6(strFindMediaProjectionCancelText, (AccessibilityNodeInfo) obj);
            }
        })) == null) {
            return false;
        }
        Rect rect = new Rect();
        accessibilityNodeInfoFindNode.getBoundsInScreen(rect);
        if (rect.left <= 0 || rect.top <= 0) {
            return false;
        }
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getWindow().getBoundsInScreen(rect2);
        if (rect2.isEmpty()) {
            return false;
        }
        if (rect.left < (rect2.right + rect2.left) / 2) {
            i2 = rect.top;
            i3 = rect.bottom;
            i4 = (rect2.right - (rect.left - rect2.left)) - (rect.right - rect.left);
            i5 = rect.right;
            i6 = rect.left;
        } else {
            i2 = rect.top;
            i3 = rect.bottom;
            i4 = rect2.left + (rect2.right - rect.right);
            i5 = rect.right;
            i6 = rect.left;
        }
        int i7 = ((((i5 - i6) + i4) - i4) / 2) + i4;
        int i8 = i2 + ((i3 - i2) / 2);
        gestureV26(i7, i8, i7, i8, 1, 0);
        gestureV26(i7, i8, i7, i8, 1, 1);
        return true;
    }

    private boolean acceptMediaProjectionPermissionActivityV34Partial(AccessibilityNodeInfo accessibilityNodeInfo) {
        AccessibilityNodeInfo accessibilityNodeInfoFindNode = findNode(accessibilityNodeInfo, new Predicate() { // from class: io.cobrowse.ControlInjectorAccessibility$$ExternalSyntheticLambda0
            @Override // io.cobrowse.Predicate
            public final boolean test(Object obj) {
                return ControlInjectorAccessibility.lambda$acceptMediaProjectionPermissionActivityV34Partial$3((AccessibilityNodeInfo) obj);
            }
        });
        AccessibilityNodeInfo accessibilityNodeInfoFindNode2 = findNode(accessibilityNodeInfo, new Predicate() { // from class: io.cobrowse.ControlInjectorAccessibility$$ExternalSyntheticLambda1
            @Override // io.cobrowse.Predicate
            public final boolean test(Object obj) {
                return ControlInjectorAccessibility.lambda$acceptMediaProjectionPermissionActivityV34Partial$4((AccessibilityNodeInfo) obj);
            }
        });
        final String strFindMediaProjectionOptionEntireScreen = findMediaProjectionOptionEntireScreen(this.service);
        String strFindMediaProjectionOptionSingleApp = findMediaProjectionOptionSingleApp(this.service);
        if (this.isAwaitingMediaProjectionLayoutChange && accessibilityNodeInfoFindNode2 == null) {
            AccessibilityNodeInfo accessibilityNodeInfoFindNode3 = findNode(accessibilityNodeInfo, new Predicate() { // from class: io.cobrowse.ControlInjectorAccessibility$$ExternalSyntheticLambda2
                @Override // io.cobrowse.Predicate
                public final boolean test(Object obj) {
                    return ControlInjectorAccessibility.lambda$acceptMediaProjectionPermissionActivityV34Partial$5(strFindMediaProjectionOptionEntireScreen, (AccessibilityNodeInfo) obj);
                }
            });
            if (accessibilityNodeInfoFindNode3 == null) {
                this.isAwaitingMediaProjectionLayoutChange = false;
                return false;
            }
            this.isAwaitingMediaProjectionLayoutChange = true;
            accessibilityNodeInfoFindNode3.performAction(16);
            return true;
        }
        if (accessibilityNodeInfoFindNode != null && accessibilityNodeInfoFindNode2 != null && accessibilityNodeInfoFindNode2.getText() != null && accessibilityNodeInfoFindNode2.getText().equals(strFindMediaProjectionOptionSingleApp)) {
            this.isAwaitingMediaProjectionLayoutChange = true;
            accessibilityNodeInfoFindNode.performAction(16);
            return true;
        }
        if (accessibilityNodeInfoFindNode != null && accessibilityNodeInfoFindNode2 != null && accessibilityNodeInfoFindNode2.getText() != null && accessibilityNodeInfoFindNode2.getText().equals(strFindMediaProjectionOptionEntireScreen)) {
            this.isAwaitingMediaProjectionLayoutChange = false;
            AccessibilityNodeInfo accessibilityNodeInfoFindMediaProjectionStartButton = findMediaProjectionStartButton(accessibilityNodeInfo, findMediaProjectionActionText(this.service));
            if (accessibilityNodeInfoFindMediaProjectionStartButton == null) {
                return false;
            }
            accessibilityNodeInfoFindMediaProjectionStartButton.performAction(16);
            return true;
        }
        if (accessibilityNodeInfoFindNode != null || accessibilityNodeInfoFindNode2 == null) {
            if (Build.VERSION.SDK_INT >= 35) {
            }
            this.isAwaitingMediaProjectionLayoutChange = false;
            return false;
        }
        this.isAwaitingMediaProjectionLayoutChange = false;
        AccessibilityNodeInfo accessibilityNodeInfoFindMediaProjectionStartButton2 = findMediaProjectionStartButton(accessibilityNodeInfo, findMediaProjectionActionTextV21(this.service));
        if (accessibilityNodeInfoFindMediaProjectionStartButton2 == null) {
            return false;
        }
        accessibilityNodeInfoFindMediaProjectionStartButton2.performAction(16);
        return true;
    }

    private void click(int i2, int i3, int i4) {
        AccessibilityNodeInfo rootInActiveWindow = this.service.getRootInActiveWindow();
        if (rootInActiveWindow == null) {
            return;
        }
        boolean zPerformAction = false;
        for (AccessibilityNodeInfo accessibilityNodeInfoPick = pick(rootInActiveWindow, i2, i3, new Predicate() { // from class: io.cobrowse.ControlInjectorAccessibility$$ExternalSyntheticLambda4
            @Override // io.cobrowse.Predicate
            public final boolean test(Object obj) {
                return ControlInjectorAccessibility.lambda$click$1((AccessibilityNodeInfo) obj);
            }
        }); accessibilityNodeInfoPick != null && !zPerformAction; accessibilityNodeInfoPick = accessibilityNodeInfoPick.getParent()) {
            zPerformAction = accessibilityNodeInfoPick.performAction(i4 >= ViewConfiguration.getLongPressTimeout() ? 32 : 16);
        }
        rootInActiveWindow.recycle();
    }

    private static String findMediaProjectionActionText(Context context) {
        return findSystemString(context, "com.android.systemui", "media_projection_entry_app_permission_dialog_continue");
    }

    private static String findMediaProjectionActionTextV21(Context context) {
        return findSystemString(context, "com.android.systemui", "media_projection_action_text");
    }

    private static String findMediaProjectionCancelText(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("|?g\u0011\u0017T7@Grw\u0018^YC\u001a\u0013]\u0004}0~\\", (short) (C1633zX.Xd() ^ (-229)))).getMethod(EO.Od("'R\u0012\rb>\u001ck(ZX\u0007", (short) (FB.Xd() ^ 10919)), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getString(android.R.string.cancel);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String findMediaProjectionOptionEntireScreen(Context context) {
        return findSystemString(context, "com.android.systemui", "screen_share_permission_dialog_option_entire_screen");
    }

    private static String findMediaProjectionOptionSingleApp(Context context) {
        return findSystemString(context, "com.android.systemui", "screen_share_permission_dialog_option_single_app");
    }

    private AccessibilityNodeInfo findMediaProjectionStartButton(AccessibilityNodeInfo accessibilityNodeInfo, final String str) {
        return findNode(accessibilityNodeInfo, new Predicate() { // from class: io.cobrowse.ControlInjectorAccessibility$$ExternalSyntheticLambda5
            @Override // io.cobrowse.Predicate
            public final boolean test(Object obj) {
                return ControlInjectorAccessibility.lambda$findMediaProjectionStartButton$7(str, (AccessibilityNodeInfo) obj);
            }
        });
    }

    private AccessibilityNodeInfo findNode(AccessibilityNodeInfo accessibilityNodeInfo, Predicate<AccessibilityNodeInfo> predicate) {
        for (int i2 = 0; i2 < accessibilityNodeInfo.getChildCount(); i2++) {
            AccessibilityNodeInfo accessibilityNodeInfoFindNode = findNode(accessibilityNodeInfo.getChild(i2), predicate);
            if (accessibilityNodeInfoFindNode != null) {
                return accessibilityNodeInfoFindNode;
            }
        }
        if (predicate.test(accessibilityNodeInfo)) {
            return accessibilityNodeInfo;
        }
        return null;
    }

    private static String findSystemString(Context context, String str, String str2) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("p|q~zsm6jusxhpu.Bmkp`rm", (short) (ZN.Xd() ^ 13103))).getMethod(C1593ug.zd("`_oL^ajahgPesgnm{", (short) (Od.Xd() ^ (-7389)), (short) (Od.Xd() ^ (-17046))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            try {
                Class<?> cls = Class.forName(C1561oA.od("\u001d)\u001e+' \u001ab\u0017\" %\u0015\u001d\"Z\u001c\u0018Wx\t\n\u0011\u0006\u000b\bn\u0002\u000e\u007f\u0005\u0002\u000e", (short) (C1633zX.Xd() ^ (-2173))));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(C1561oA.Kd("#\u001b1\u001dj* .(o\u001687/5/", (short) (OY.Xd() ^ 24738)));
                Object[] objArr2 = {str};
                Method method2 = cls.getMethod(Wg.Zd("Uhh;?\"\u000f\nw{rq93+j\u000f\"\u000f\u0001k>B,#5", (short) (FB.Xd() ^ 12066), (short) (FB.Xd() ^ 10447)), clsArr);
                try {
                    method2.setAccessible(true);
                    Resources resources = (Resources) method2.invoke(packageManager, objArr2);
                    return resources.getString(resources.getIdentifier(str2, C1561oA.Xd(" \"!\u0019\u001f\u0019", (short) (OY.Xd() ^ 26754)), str));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (PackageManager.NameNotFoundException | Resources.NotFoundException e3) {
                short sXd = (short) (ZN.Xd() ^ 10280);
                int[] iArr = new int["=Zfeei\u0014bduahl\u001d".length()];
                QB qb = new QB("=Zfeei\u0014bduahl\u001d");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                    i2++;
                }
                String str3 = new String(iArr, 0, i2) + str2 + Qg.kd("J \n\u0014\u001c\u000bD\n\u0015\u0011\u000e?", (short) (FB.Xd() ^ 21548), (short) (FB.Xd() ^ 31652)) + str + hg.Vd("3\u0018", (short) (OY.Xd() ^ 18007), (short) (OY.Xd() ^ 8082)) + e3.getMessage();
                short sXd2 = (short) (FB.Xd() ^ 17184);
                int[] iArr2 = new int["W\u0003t\u0004\u007f\u0007\u0002rUZ".length()];
                QB qb2 = new QB("W\u0003t\u0004\u007f\u0007\u0002rUZ");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                new String(iArr2, 0, i3);
                return null;
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private void gestureV24(int i2, int i3, int i4, int i5, int i6) {
        if (i6 <= 0) {
            i6 = 1;
        }
        GestureDescription.Builder builder = new GestureDescription.Builder();
        Path path = new Path();
        path.moveTo(i2, i3);
        path.lineTo(i4, i5);
        builder.addStroke(new GestureDescription.StrokeDescription(path, 0L, i6));
        this.service.dispatchGesture(builder.build(), null, null);
    }

    private void gestureV26(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i6 <= 0) {
            i6 = 1;
        }
        Path path = new Path();
        if (i7 == 0) {
            path.moveTo(i2, i3);
            this.strokeDescription = new GestureDescription.StrokeDescription(path, 0L, i6, true);
        } else if (i7 != 1) {
            if (i7 != 2) {
                String str = "Unsupported action " + i7;
                return;
            } else {
                if (this.strokeDescription == null) {
                    return;
                }
                path.moveTo(i2, i3);
                path.lineTo(i4, i5);
                this.strokeDescription = this.strokeDescription.continueStroke(path, 0L, i6, true);
            }
        } else {
            if (this.strokeDescription == null) {
                return;
            }
            path.moveTo(i2, i3);
            path.lineTo(i4, i5);
            this.strokeDescription = this.strokeDescription.continueStroke(path, 0L, i6, false);
        }
        this.service.dispatchGesture(new GestureDescription.Builder().addStroke(this.strokeDescription).build(), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CharSequence getTextFromNode(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence text = accessibilityNodeInfo.getText();
        if (text == null) {
            text = "";
        }
        return accessibilityNodeInfo.isShowingHintText() ? "" : text;
    }

    static void inject(Application application, KeyEvent keyEvent) {
        Intent intent = new Intent(REMOTE_CONTROL_INTENT);
        intent.setPackage(application.getPackageName());
        Bundle bundle = new Bundle();
        bundle.putString(Constant.NOTIFICATION_DETAILS_ACTION, "key");
        bundle.putString(SentryThread.JsonKeys.STATE, keyEvent.state);
        bundle.putString("code", keyEvent.code);
        bundle.putString("key", keyEvent.key);
        intent.putExtras(bundle);
        application.sendBroadcast(intent);
    }

    static void inject(Application application, Touch touch) {
        if (touch.isStart()) {
            initialTouch = touch;
        }
        PanGestureRecognizer panGestureRecognizer = panRecognizer;
        panGestureRecognizer.onTouchEvent(touch);
        Bundle bundle = new Bundle();
        if (initialTouch != null && previousTouch != null) {
            bundle.putString(Constant.NOTIFICATION_DETAILS_ACTION, "gestureV26");
            bundle.putInt("start_x", (int) previousTouch.position.x);
            bundle.putInt("start_y", (int) previousTouch.position.y);
            bundle.putInt("end_x", (int) touch.position.x);
            bundle.putInt("end_y", (int) touch.position.y);
            if (touch.isStart()) {
                bundle.putInt("touch_action", 0);
            } else if (touch.isMove()) {
                bundle.putInt("touch_action", 2);
            } else {
                bundle.putInt("touch_action", 1);
            }
        }
        previousTouch = touch;
        if (!bundle.isEmpty()) {
            Intent intent = new Intent(REMOTE_CONTROL_INTENT);
            intent.setPackage(application.getPackageName());
            intent.putExtras(bundle);
            application.sendBroadcast(intent);
        }
        if (touch.isEnd()) {
            panGestureRecognizer.reset();
            initialTouch = null;
            previousTouch = null;
        }
    }

    private void key(String str, String str2, String str3) {
        String str4 = str2;
        if (str == null || str4 == null || str3 == null || !str.equals("keydown")) {
            return;
        }
        if (str3.equals("GoBack")) {
            this.service.performGlobalAction(1);
            return;
        }
        if (str3.equals("GoHome")) {
            this.service.performGlobalAction(2);
            return;
        }
        AccessibilityNodeInfo accessibilityNodeInfoFindFocus = this.service.findFocus(1);
        if (accessibilityNodeInfoFindFocus == null) {
            return;
        }
        int iMax = Math.max(0, accessibilityNodeInfoFindFocus.getTextSelectionStart());
        Bundle bundle = new Bundle();
        if (str3.equals("ArrowLeft")) {
            int i2 = iMax - 1;
            bundle.putInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_START_INT, i2);
            bundle.putInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_END_INT, i2);
            accessibilityNodeInfoFindFocus.performAction(131072, bundle);
            return;
        }
        if (str3.equals("ArrowRight")) {
            int i3 = iMax + 1;
            bundle.putInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_START_INT, i3);
            bundle.putInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_END_INT, i3);
            accessibilityNodeInfoFindFocus.performAction(131072, bundle);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30 && str3.equals(ReactEditTextInputConnectionWrapper.ENTER_KEY_VALUE)) {
            accessibilityNodeInfoFindFocus.performAction(android.R.id.accessibilityActionImeEnter);
            return;
        }
        if (accessibilityNodeInfoFindFocus.isPassword()) {
            bundle.putCharSequence(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE, this.passwords.guessNewValue(accessibilityNodeInfoFindFocus, str3, str4));
            accessibilityNodeInfoFindFocus.performAction(2097152, bundle);
            return;
        }
        CharSequence textFromNode = getTextFromNode(accessibilityNodeInfoFindFocus);
        CharSequence charSequenceSubSequence = textFromNode.subSequence(0, iMax);
        CharSequence charSequenceSubSequence2 = textFromNode.subSequence(iMax, textFromNode.length());
        if (str4.length() != 1) {
            str4 = "";
            if (str3.equals(ReactEditTextInputConnectionWrapper.BACKSPACE_KEY_VALUE)) {
                charSequenceSubSequence = charSequenceSubSequence.subSequence(0, Math.max(0, charSequenceSubSequence.length() - 1));
                iMax--;
            }
        } else {
            iMax++;
        }
        bundle.putCharSequence(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE, ((Object) charSequenceSubSequence) + str4 + ((Object) charSequenceSubSequence2));
        accessibilityNodeInfoFindFocus.performAction(2097152, bundle);
        bundle.putInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_START_INT, iMax);
        bundle.putInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_END_INT, iMax);
        accessibilityNodeInfoFindFocus.performAction(131072, bundle);
    }

    static /* synthetic */ boolean lambda$acceptMediaProjectionPermissionActivityV34$6(String str, AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence text;
        return accessibilityNodeInfo.isClickable() && (text = accessibilityNodeInfo.getText()) != null && text.toString().equalsIgnoreCase(str);
    }

    static /* synthetic */ boolean lambda$acceptMediaProjectionPermissionActivityV34Partial$3(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getClassName() != null && accessibilityNodeInfo.getClassName().equals("android.widget.Spinner");
    }

    static /* synthetic */ boolean lambda$acceptMediaProjectionPermissionActivityV34Partial$4(AccessibilityNodeInfo accessibilityNodeInfo) {
        return (accessibilityNodeInfo.getParent() == null || accessibilityNodeInfo.getParent().getClassName() == null || !accessibilityNodeInfo.getParent().getClassName().equals("android.widget.Spinner")) ? false : true;
    }

    static /* synthetic */ boolean lambda$acceptMediaProjectionPermissionActivityV34Partial$5(String str, AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isClickable() && accessibilityNodeInfo.getChildCount() == 1 && accessibilityNodeInfo.getChild(0).getText() != null && accessibilityNodeInfo.getChild(0).getText().equals(str);
    }

    static /* synthetic */ boolean lambda$click$1(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isVisibleToUser() && accessibilityNodeInfo.isClickable();
    }

    static /* synthetic */ boolean lambda$findMediaProjectionStartButton$7(String str, AccessibilityNodeInfo accessibilityNodeInfo) {
        if (!accessibilityNodeInfo.isClickable()) {
            return false;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        return (text == null || str == null) ? text != null && text.toString().toLowerCase().contains(ViewProps.START) : text.toString().equalsIgnoreCase(str);
    }

    static /* synthetic */ boolean lambda$pick$0(int i2, int i3, Predicate predicate, AccessibilityNodeInfo accessibilityNodeInfo) {
        Rect rect = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect);
        return rect.contains(i2, i3) && predicate.test(accessibilityNodeInfo);
    }

    private static void logNode(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
        accessibilityNodeInfo.getBoundsInScreen(new Rect());
        StringBuilder sb = new StringBuilder();
        if (i2 > 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append("  ");
            }
            sb.append("└ ");
        }
        sb.append(accessibilityNodeInfo.getClassName());
        if (accessibilityNodeInfo.getText() != null) {
            sb.append(accessibilityNodeInfo.getText());
        }
        String str = ((Object) sb) + " - " + accessibilityNodeInfo;
        for (int i4 = 0; i4 < accessibilityNodeInfo.getChildCount(); i4++) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i4);
            if (child != null) {
                logNode(child, i2 + 1);
            }
        }
    }

    static void notifySessionEnded(Application application) {
        Intent intent = new Intent(SESSION_ENDED_INTENT);
        intent.setPackage(application.getPackageName());
        application.sendBroadcast(intent);
    }

    private void onRemoteControlIntentReceived(Intent intent) {
        String string;
        Bundle extras = intent.getExtras();
        if (extras == null || (string = extras.getString(Constant.NOTIFICATION_DETAILS_ACTION)) == null) {
        }
        string.hashCode();
        switch (string) {
            case "scroll":
                scroll(extras.getInt("x"), extras.getInt("y"), PanGestureRecognizer.Direction.valueOf(extras.getString("direction")));
                break;
            case "key":
                key(extras.getString(SentryThread.JsonKeys.STATE), extras.getString("key"), extras.getString("code"));
                break;
            case "click":
                click(extras.getInt("x"), extras.getInt("y"), extras.getInt("duration"));
                break;
            case "gestureV24":
                gestureV24(extras.getInt("start_x"), extras.getInt("start_y"), extras.getInt("end_x"), extras.getInt("end_y"), extras.getInt("duration"));
                break;
            case "gestureV26":
                gestureV26(extras.getInt("start_x"), extras.getInt("start_y"), extras.getInt("end_x"), extras.getInt("end_y"), extras.getInt("duration"), extras.getInt("touch_action"));
                break;
        }
    }

    private void onSessionEndedIntentReceived() {
        this.passwords.clear();
    }

    private AccessibilityNodeInfo pick(AccessibilityNodeInfo accessibilityNodeInfo, final int i2, final int i3, final Predicate<AccessibilityNodeInfo> predicate) {
        return findNode(accessibilityNodeInfo, new Predicate() { // from class: io.cobrowse.ControlInjectorAccessibility$$ExternalSyntheticLambda6
            @Override // io.cobrowse.Predicate
            public final boolean test(Object obj) {
                return ControlInjectorAccessibility.lambda$pick$0(i2, i3, predicate, (AccessibilityNodeInfo) obj);
            }
        });
    }

    private void scroll(int i2, int i3, PanGestureRecognizer.Direction direction) {
        int i4;
        int i5 = AnonymousClass1.$SwitchMap$io$cobrowse$PanGestureRecognizer$Direction[direction.ordinal()];
        if (i5 == 1 || i5 == 2) {
            i4 = 4096;
        } else if (i5 != 3 && i5 != 4) {
            return;
        } else {
            i4 = 8192;
        }
        AccessibilityNodeInfo rootInActiveWindow = this.service.getRootInActiveWindow();
        if (rootInActiveWindow == null) {
            return;
        }
        boolean zPerformAction = false;
        for (AccessibilityNodeInfo accessibilityNodeInfoPick = pick(rootInActiveWindow, i2, i3, new Predicate() { // from class: io.cobrowse.ControlInjectorAccessibility$$ExternalSyntheticLambda7
            @Override // io.cobrowse.Predicate
            public final boolean test(Object obj) {
                return ((AccessibilityNodeInfo) obj).isScrollable();
            }
        }); accessibilityNodeInfoPick != null && !zPerformAction; accessibilityNodeInfoPick = accessibilityNodeInfoPick.getParent()) {
            zPerformAction = accessibilityNodeInfoPick.performAction(i4);
        }
        rootInActiveWindow.recycle();
    }

    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) throws Throwable {
        boolean zEquals;
        Session sessionCurrentSession;
        AccessibilityNodeInfo rootInActiveWindow;
        if (this.acceptMediaProjectionPrompt) {
            CharSequence className = accessibilityEvent.getClassName();
            CharSequence packageName = accessibilityEvent.getPackageName();
            if (className == null || packageName == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                zEquals = false;
                if (!this.isAwaitingMediaProjectionLayoutChange ? className.equals("com.android.systemui.mediaprojection.permission.MediaProjectionPermissionActivity") || className.equals("com.android.systemui.media.MediaProjectionPermissionActivity") : packageName.equals("com.android.systemui") && className.equals("android.widget.FrameLayout") && accessibilityEvent.getEventType() == 2048) {
                    zEquals = true;
                }
            } else {
                zEquals = className.equals("com.android.systemui.media.MediaProjectionPermissionActivity");
            }
            if (!zEquals || (sessionCurrentSession = CobrowseIO.instance().currentSession()) == null || !sessionCurrentSession.fullDevice().booleanValue() || (rootInActiveWindow = this.service.getRootInActiveWindow()) == null) {
                return;
            }
            acceptMediaProjectionPermissionActivity(rootInActiveWindow);
            rootInActiveWindow.recycle();
        }
    }

    @Override // io.cobrowse.CobrowseAccessibilityService.AccessibilityInjector
    public void onDestroy() {
        this.service.unregisterReceiver(this);
        this.isAwaitingMediaProjectionLayoutChange = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.cobrowse.ControlInjectorAccessibility.onReceive(android.content.Context, android.content.Intent):void");
    }
}
