package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.facebook.react.R;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import com.google.firebase.messaging.Constants;
import io.sentry.SentryReplayOptions;
import io.sentry.protocol.MetricSummary;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class ReactAccessibilityDelegate extends ExploreByTouchHelper {
    private static final int SEND_EVENT = 1;
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_DISABLED = "disabled";
    private static final String STATE_SELECTED = "selected";
    private static final String TAG = "ReactAccessibilityDelegate";
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    public static final String TOP_ACCESSIBILITY_ACTION_EVENT = "topAccessibilityAction";
    private static final String delimiter = ", ";
    private static final int delimiterLength = delimiter.length();
    public static final HashMap<String, Integer> sActionIdMap;
    private static int sCounter = 1056964608;
    private final HashMap<Integer, String> mAccessibilityActionsMap;
    View mAccessibilityLabelledBy;
    private final AccessibilityLinks mAccessibilityLinks;
    private Handler mHandler;
    private final View mView;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.ReactAccessibilityDelegate$1 */
    class AnonymousClass1 extends Handler {
        AnonymousClass1() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ((View) message.obj).sendAccessibilityEvent(4);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.ReactAccessibilityDelegate$2 */
    class AnonymousClass2 extends Event {
        final /* synthetic */ WritableMap val$event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i2, int i3, WritableMap writableMap) {
            super(i2, i3);
            writableMap = writableMap;
        }

        @Override // com.facebook.react.uimanager.events.Event
        protected WritableMap getEventData() {
            return writableMap;
        }

        @Override // com.facebook.react.uimanager.events.Event
        public String getEventName() {
            return ReactAccessibilityDelegate.TOP_ACCESSIBILITY_ACTION_EVENT;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.ReactAccessibilityDelegate$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole;
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role;

        static {
            int[] iArr = new int[Role.values().length];
            $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role = iArr;
            try {
                iArr[Role.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.CHECKBOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.COMBOBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.GRID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.HEADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.IMG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.LINK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.LIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.MENU.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.MENUBAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.MENUITEM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.NONE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.PROGRESSBAR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.RADIO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.RADIOGROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.SCROLLBAR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.SEARCHBOX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.SLIDER.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.SPINBUTTON.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.SUMMARY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.SWITCH.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.TAB.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.TABLIST.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.TIMER.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[Role.TOOLBAR.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr2 = new int[AccessibilityRole.values().length];
            $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole = iArr2;
            try {
                iArr2[AccessibilityRole.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.DROPDOWNLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.TOGGLEBUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.IMAGEBUTTON.ordinal()] = 6;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.KEYBOARDKEY.ordinal()] = 7;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.TEXT.ordinal()] = 8;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.ADJUSTABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.CHECKBOX.ordinal()] = 10;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.RADIO.ordinal()] = 11;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.SPINBUTTON.ordinal()] = 12;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.SWITCH.ordinal()] = 13;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.GRID.ordinal()] = 15;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.SCROLLVIEW.ordinal()] = 16;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.HORIZONTALSCROLLVIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.PAGER.ordinal()] = 18;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.DRAWERLAYOUT.ordinal()] = 19;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.SLIDINGDRAWER.ordinal()] = 20;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.ICONMENU.ordinal()] = 21;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.VIEWGROUP.ordinal()] = 22;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.WEBVIEW.ordinal()] = 23;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.NONE.ordinal()] = 24;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.LINK.ordinal()] = 25;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.SUMMARY.ordinal()] = 26;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.HEADER.ordinal()] = 27;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.ALERT.ordinal()] = 28;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.COMBOBOX.ordinal()] = 29;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.MENU.ordinal()] = 30;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.MENUBAR.ordinal()] = 31;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.MENUITEM.ordinal()] = 32;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.PROGRESSBAR.ordinal()] = 33;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.RADIOGROUP.ordinal()] = 34;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.SCROLLBAR.ordinal()] = 35;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.TAB.ordinal()] = 36;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.TABLIST.ordinal()] = 37;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.TIMER.ordinal()] = 38;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[AccessibilityRole.TOOLBAR.ordinal()] = 39;
            } catch (NoSuchFieldError unused65) {
            }
        }
    }

    public static class AccessibilityLinks {
        private final List<AccessibleLink> mLinks;

        private static class AccessibleLink {
            public String description;
            public int end;
            public int id;
            public int start;

            private AccessibleLink() {
            }

            /* synthetic */ AccessibleLink(AccessibleLinkIA accessibleLinkIA) {
                this();
            }
        }

        public AccessibilityLinks(ClickableSpan[] clickableSpanArr, Spannable spannable) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < clickableSpanArr.length; i2++) {
                ClickableSpan clickableSpan = clickableSpanArr[i2];
                int spanStart = spannable.getSpanStart(clickableSpan);
                int spanEnd = spannable.getSpanEnd(clickableSpan);
                if (spanStart != spanEnd && spanStart >= 0 && spanEnd >= 0 && spanStart <= spannable.length() && spanEnd <= spannable.length()) {
                    AccessibleLink accessibleLink = new AccessibleLink();
                    accessibleLink.description = spannable.subSequence(spanStart, spanEnd).toString();
                    accessibleLink.start = spanStart;
                    accessibleLink.end = spanEnd;
                    accessibleLink.id = (clickableSpanArr.length - 1) - i2;
                    arrayList.add(accessibleLink);
                }
            }
            this.mLinks = arrayList;
        }

        public AccessibleLink getLinkById(int i2) {
            for (AccessibleLink accessibleLink : this.mLinks) {
                if (accessibleLink.id == i2) {
                    return accessibleLink;
                }
            }
            return null;
        }

        public AccessibleLink getLinkBySpanPos(int i2, int i3) {
            for (AccessibleLink accessibleLink : this.mLinks) {
                if (accessibleLink.start == i2 && accessibleLink.end == i3) {
                    return accessibleLink;
                }
            }
            return null;
        }

        public int size() {
            return this.mLinks.size();
        }
    }

    public enum AccessibilityRole {
        NONE,
        BUTTON,
        DROPDOWNLIST,
        TOGGLEBUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        LIST,
        GRID,
        PAGER,
        SCROLLVIEW,
        HORIZONTALSCROLLVIEW,
        VIEWGROUP,
        WEBVIEW,
        DRAWERLAYOUT,
        SLIDINGDRAWER,
        ICONMENU,
        TOOLBAR;

        public static AccessibilityRole fromRole(Role role) {
            switch (AnonymousClass3.$SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role[role.ordinal()]) {
                case 1:
                    return ALERT;
                case 2:
                    return BUTTON;
                case 3:
                    return CHECKBOX;
                case 4:
                    return COMBOBOX;
                case 5:
                    return GRID;
                case 6:
                    return HEADER;
                case 7:
                    return IMAGE;
                case 8:
                    return LINK;
                case 9:
                    return LIST;
                case 10:
                    return MENU;
                case 11:
                    return MENUBAR;
                case 12:
                    return MENUITEM;
                case 13:
                    return NONE;
                case 14:
                    return PROGRESSBAR;
                case 15:
                    return RADIO;
                case 16:
                    return RADIOGROUP;
                case 17:
                    return SCROLLBAR;
                case 18:
                    return SEARCH;
                case 19:
                    return ADJUSTABLE;
                case 20:
                    return SPINBUTTON;
                case 21:
                    return SUMMARY;
                case 22:
                    return SWITCH;
                case 23:
                    return TAB;
                case 24:
                    return TABLIST;
                case 25:
                    return TIMER;
                case 26:
                    return TOOLBAR;
                default:
                    return null;
            }
        }

        public static AccessibilityRole fromValue(String str) {
            if (str == null) {
                return NONE;
            }
            for (AccessibilityRole accessibilityRole : values()) {
                if (accessibilityRole.name().equalsIgnoreCase(str)) {
                    return accessibilityRole;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }

        public static AccessibilityRole fromViewTag(View view) {
            Role role = (Role) view.getTag(R.id.role);
            return role != null ? fromRole(role) : (AccessibilityRole) view.getTag(R.id.accessibility_role);
        }

        public static String getValue(AccessibilityRole accessibilityRole) {
            switch (AnonymousClass3.$SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole[accessibilityRole.ordinal()]) {
                case 1:
                    return "android.widget.Button";
                case 2:
                    return "android.widget.Spinner";
                case 3:
                    return "android.widget.ToggleButton";
                case 4:
                    return AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName;
                case 5:
                    return SentryReplayOptions.IMAGE_VIEW_CLASS_NAME;
                case 6:
                    return "android.widget.ImageButton";
                case 7:
                    return "android.inputmethodservice.Keyboard$Key";
                case 8:
                    return "android.widget.TextView";
                case 9:
                    return "android.widget.SeekBar";
                case 10:
                    return "android.widget.CheckBox";
                case 11:
                    return "android.widget.RadioButton";
                case 12:
                    return "android.widget.SpinButton";
                case 13:
                    return "android.widget.Switch";
                case 14:
                    return "android.widget.AbsListView";
                case 15:
                    return "android.widget.GridView";
                case 16:
                    return "android.widget.ScrollView";
                case 17:
                    return "android.widget.HorizontalScrollView";
                case 18:
                    return "androidx.viewpager.widget.ViewPager";
                case 19:
                    return "androidx.drawerlayout.widget.DrawerLayout";
                case 20:
                    return "android.widget.SlidingDrawer";
                case 21:
                    return "com.android.internal.view.menu.IconMenuView";
                case 22:
                    return "android.view.ViewGroup";
                case 23:
                    return SentryReplayOptions.WEB_VIEW_CLASS_NAME;
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                    return AndroidComposeViewAccessibilityDelegateCompat.ClassName;
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + accessibilityRole);
            }
        }
    }

    public enum Role {
        ALERT,
        ALERTDIALOG,
        APPLICATION,
        ARTICLE,
        BANNER,
        BUTTON,
        CELL,
        CHECKBOX,
        COLUMNHEADER,
        COMBOBOX,
        COMPLEMENTARY,
        CONTENTINFO,
        DEFINITION,
        DIALOG,
        DIRECTORY,
        DOCUMENT,
        FEED,
        FIGURE,
        FORM,
        GRID,
        GROUP,
        HEADING,
        IMG,
        LINK,
        LIST,
        LISTITEM,
        LOG,
        MAIN,
        MARQUEE,
        MATH,
        MENU,
        MENUBAR,
        MENUITEM,
        METER,
        NAVIGATION,
        NONE,
        NOTE,
        OPTION,
        PRESENTATION,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        REGION,
        ROW,
        ROWGROUP,
        ROWHEADER,
        SCROLLBAR,
        SEARCHBOX,
        SEPARATOR,
        SLIDER,
        SPINBUTTON,
        STATUS,
        SUMMARY,
        SWITCH,
        TAB,
        TABLE,
        TABLIST,
        TABPANEL,
        TERM,
        TIMER,
        TOOLBAR,
        TOOLTIP,
        TREE,
        TREEGRID,
        TREEITEM;

        public static Role fromValue(String str) {
            for (Role role : values()) {
                if (role.name().equalsIgnoreCase(str)) {
                    return role;
                }
            }
            return null;
        }
    }

    static {
        HashMap<String, Integer> map = new HashMap<>();
        sActionIdMap = map;
        map.put("activate", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK.getId()));
        map.put("longpress", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_LONG_CLICK.getId()));
        map.put("increment", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId()));
        map.put("decrement", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId()));
        map.put("expand", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND.getId()));
        map.put("collapse", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE.getId()));
    }

    public ReactAccessibilityDelegate(View view, boolean z2, int i2) {
        super(view);
        this.mView = view;
        this.mAccessibilityActionsMap = new HashMap<>();
        this.mHandler = new Handler() { // from class: com.facebook.react.uimanager.ReactAccessibilityDelegate.1
            AnonymousClass1() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                ((View) message.obj).sendAccessibilityEvent(4);
            }
        };
        view.setFocusable(z2);
        ViewCompat.setImportantForAccessibility(view, i2);
        this.mAccessibilityLinks = (AccessibilityLinks) view.getTag(R.id.accessibility_links);
    }

    public static AccessibilityNodeInfoCompat createNodeInfoFromView(View view) {
        if (view == null) {
            return null;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
        try {
            ViewCompat.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompatObtain);
            return accessibilityNodeInfoCompatObtain;
        } catch (NullPointerException unused) {
            if (accessibilityNodeInfoCompatObtain != null) {
                accessibilityNodeInfoCompatObtain.recycle();
            }
            return null;
        }
    }

    private Rect getBoundsInParent(AccessibilityLinks.AccessibleLink accessibleLink) {
        View view = this.mView;
        if (!(view instanceof TextView)) {
            return new Rect(0, 0, this.mView.getWidth(), this.mView.getHeight());
        }
        TextView textView = (TextView) view;
        Layout layout = textView.getLayout();
        if (layout == null) {
            return new Rect(0, 0, textView.getWidth(), textView.getHeight());
        }
        double d2 = accessibleLink.start;
        double d3 = accessibleLink.end;
        int i2 = (int) d2;
        int lineForOffset = layout.getLineForOffset(i2);
        if (d2 > layout.getLineEnd(lineForOffset)) {
            return null;
        }
        Rect rect = new Rect();
        double primaryHorizontal = layout.getPrimaryHorizontal(i2);
        new Paint().setTextSize(((AbsoluteSizeSpan) getFirstSpan(accessibleLink.start, accessibleLink.end, AbsoluteSizeSpan.class)) != null ? r0.getSize() : textView.getTextSize());
        int iCeil = (int) Math.ceil(r1.measureText(accessibleLink.description));
        boolean z2 = lineForOffset != layout.getLineForOffset((int) d3);
        layout.getLineBounds(lineForOffset, rect);
        int scrollY = textView.getScrollY() + textView.getTotalPaddingTop();
        rect.top += scrollY;
        rect.bottom += scrollY;
        rect.left = (int) (((double) rect.left) + ((primaryHorizontal + ((double) textView.getTotalPaddingLeft())) - ((double) textView.getScrollX())));
        return z2 ? new Rect(rect.left, rect.top, rect.right, rect.bottom) : new Rect(rect.left, rect.top, rect.left + iCeil, rect.bottom);
    }

    public static CharSequence getTalkbackDescription(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfoFromView = accessibilityNodeInfoCompat == null ? createNodeInfoFromView(view) : AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
        if (accessibilityNodeInfoCompatCreateNodeInfoFromView == null) {
            return null;
        }
        try {
            CharSequence contentDescription = accessibilityNodeInfoCompatCreateNodeInfoFromView.getContentDescription();
            CharSequence text = accessibilityNodeInfoCompatCreateNodeInfoFromView.getText();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean z2 = view instanceof EditText;
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(contentDescription) && (!z2 || zIsEmpty)) {
                sb.append(contentDescription);
                return sb;
            }
            if (!zIsEmpty) {
                sb.append(text);
                return sb;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
                ViewCompat.onInitializeAccessibilityNodeInfo(childAt, accessibilityNodeInfoCompatObtain);
                if (isSpeakingNode(accessibilityNodeInfoCompatObtain, childAt) && !isAccessibilityFocusable(accessibilityNodeInfoCompatObtain, childAt)) {
                    CharSequence talkbackDescription = getTalkbackDescription(childAt, null);
                    if (!TextUtils.isEmpty(talkbackDescription)) {
                        sb2.append(((Object) talkbackDescription) + delimiter);
                    }
                }
                accessibilityNodeInfoCompatObtain.recycle();
            }
            return removeFinalDelimiter(sb2);
        } finally {
            accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean hasNonActionableSpeakingDescendants(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r6, android.view.View r7) {
        /*
            r5 = 0
            if (r6 == 0) goto L9
            if (r7 == 0) goto L9
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 != 0) goto La
        L9:
            return r5
        La:
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r4 = r7.getChildCount()
            r3 = r5
        L11:
            if (r3 >= r4) goto L9
            android.view.View r2 = r7.getChildAt(r3)
            if (r2 != 0) goto L1c
        L19:
            int r3 = r3 + 1
            goto L11
        L1c:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain()
            androidx.core.view.ViewCompat.onInitializeAccessibilityNodeInfo(r2, r1)     // Catch: java.lang.Throwable -> L48
            boolean r0 = r1.isVisibleToUser()     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L2f
            if (r1 == 0) goto L19
        L2b:
            r1.recycle()
            goto L19
        L2f:
            boolean r0 = isAccessibilityFocusable(r1, r2)     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L38
            if (r1 == 0) goto L19
            goto L2b
        L38:
            boolean r0 = isSpeakingNode(r1, r2)     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L45
            if (r1 == 0) goto L43
            r1.recycle()
        L43:
            r0 = 1
            return r0
        L45:
            if (r1 == 0) goto L19
            goto L2b
        L48:
            r0 = move-exception
            if (r1 == 0) goto L4e
            r1.recycle()
        L4e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.ReactAccessibilityDelegate.hasNonActionableSpeakingDescendants(androidx.core.view.accessibility.AccessibilityNodeInfoCompat, android.view.View):boolean");
    }

    private static boolean hasStateDescription(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return accessibilityNodeInfoCompat != null && (!TextUtils.isEmpty(accessibilityNodeInfoCompat.getStateDescription()) || accessibilityNodeInfoCompat.isCheckable() || hasValidRangeInfo(accessibilityNodeInfoCompat));
    }

    public static boolean hasText(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return (accessibilityNodeInfoCompat == null || accessibilityNodeInfoCompat.getCollectionInfo() != null || (TextUtils.isEmpty(accessibilityNodeInfoCompat.getText()) && TextUtils.isEmpty(accessibilityNodeInfoCompat.getContentDescription()) && TextUtils.isEmpty(accessibilityNodeInfoCompat.getHintText()))) ? false : true;
    }

    public static boolean hasValidRangeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfoCompat.RangeInfoCompat rangeInfo;
        if (accessibilityNodeInfoCompat == null || (rangeInfo = accessibilityNodeInfoCompat.getRangeInfo()) == null) {
            return false;
        }
        float max = rangeInfo.getMax();
        float min = rangeInfo.getMin();
        float current = rangeInfo.getCurrent();
        return max - min > 0.0f && current >= min && current <= max;
    }

    public static boolean isAccessibilityFocusable(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        if (accessibilityNodeInfoCompat == null || view == null || !accessibilityNodeInfoCompat.isVisibleToUser()) {
            return false;
        }
        return accessibilityNodeInfoCompat.isScreenReaderFocusable() || isActionableForAccessibility(accessibilityNodeInfoCompat);
    }

    public static boolean isActionableForAccessibility(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat == null) {
            return false;
        }
        if (accessibilityNodeInfoCompat.isClickable() || accessibilityNodeInfoCompat.isLongClickable() || accessibilityNodeInfoCompat.isFocusable()) {
            return true;
        }
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = accessibilityNodeInfoCompat.getActionList();
        return actionList.contains(16) || actionList.contains(32) || actionList.contains(1);
    }

    public static boolean isSpeakingNode(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        int importantForAccessibility;
        if (accessibilityNodeInfoCompat == null || view == null || (importantForAccessibility = ViewCompat.getImportantForAccessibility(view)) == 4) {
            return false;
        }
        if (importantForAccessibility != 2 || accessibilityNodeInfoCompat.getChildCount() > 0) {
            return hasText(accessibilityNodeInfoCompat) || hasStateDescription(accessibilityNodeInfoCompat) || accessibilityNodeInfoCompat.isCheckable() || hasNonActionableSpeakingDescendants(accessibilityNodeInfoCompat, view);
        }
        return false;
    }

    private static String removeFinalDelimiter(StringBuilder sb) {
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - delimiterLength, length);
        }
        return sb.toString();
    }

    public static void resetDelegate(View view, boolean z2, int i2) {
        ViewCompat.setAccessibilityDelegate(view, new ReactAccessibilityDelegate(view, z2, i2));
    }

    private void scheduleAccessibilityEventSender(View view) {
        if (this.mHandler.hasMessages(1, view)) {
            this.mHandler.removeMessages(1, view);
        }
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(1, view), 200L);
    }

    public static void setDelegate(View view, boolean z2, int i2) {
        if (ViewCompat.hasAccessibilityDelegate(view)) {
            return;
        }
        if (view.getTag(R.id.accessibility_role) == null && view.getTag(R.id.accessibility_state) == null && view.getTag(R.id.accessibility_actions) == null && view.getTag(R.id.react_test_id) == null && view.getTag(R.id.accessibility_collection_item) == null && view.getTag(R.id.accessibility_links) == null && view.getTag(R.id.role) == null) {
            return;
        }
        ViewCompat.setAccessibilityDelegate(view, new ReactAccessibilityDelegate(view, z2, i2));
    }

    public static void setRole(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityRole accessibilityRole, Context context) throws Throwable {
        if (accessibilityRole == null) {
            accessibilityRole = AccessibilityRole.NONE;
        }
        accessibilityNodeInfoCompat.setClassName(AccessibilityRole.getValue(accessibilityRole));
        if (accessibilityRole.equals(AccessibilityRole.LINK)) {
            int i2 = R.string.link_description;
            Class<?> cls = Class.forName(C1561oA.ud("/;0=92,t)427'/4l\u0001,*/\u001f1,", (short) (C1607wl.Xd() ^ 11759)));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            Method method = cls.getMethod(C1561oA.yd("DAO-MJ@DL", (short) (C1580rY.Xd() ^ (-30218))), clsArr);
            try {
                method.setAccessible(true);
                accessibilityNodeInfoCompat.setRoleDescription((String) method.invoke(context, objArr));
                return;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (accessibilityRole.equals(AccessibilityRole.IMAGE)) {
            int i3 = R.string.image_description;
            Class<?> cls2 = Class.forName(C1561oA.Yd("5C:IGB>\t?LLSEOV\u0011'TT[Ma^", (short) (OY.Xd() ^ 1730)));
            Class<?>[] clsArr2 = {Integer.TYPE};
            Object[] objArr2 = {Integer.valueOf(i3)};
            short sXd = (short) (C1607wl.Xd() ^ 6101);
            short sXd2 = (short) (C1607wl.Xd() ^ 26424);
            int[] iArr = new int["10@ BA9?9".length()];
            QB qb = new QB("10@ BA9?9");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK((xuXd.CK(iKK) - (sXd + i4)) + sXd2);
                i4++;
            }
            Method method2 = cls2.getMethod(new String(iArr, 0, i4), clsArr2);
            try {
                method2.setAccessible(true);
                accessibilityNodeInfoCompat.setRoleDescription((String) method2.invoke(context, objArr2));
                return;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        if (accessibilityRole.equals(AccessibilityRole.IMAGEBUTTON)) {
            int i5 = R.string.imagebutton_description;
            short sXd3 = (short) (Od.Xd() ^ (-1330));
            short sXd4 = (short) (Od.Xd() ^ (-21861));
            int[] iArr2 = new int["[e\u0012\r@5d!\u0007UCya'cGQ@oh\b\u001cN".length()];
            QB qb2 = new QB("[e\u0012\r@5d!\u0007UCya'cGQ@oh\b\u001cN");
            int i6 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i6] = xuXd2.fK(xuXd2.CK(iKK2) - ((i6 * sXd4) ^ sXd3));
                i6++;
            }
            Class<?> cls3 = Class.forName(new String(iArr2, 0, i6));
            Class<?>[] clsArr3 = {Integer.TYPE};
            Object[] objArr3 = {Integer.valueOf(i5)};
            Method method3 = cls3.getMethod(ZO.xd("+ahFAT@\tJ", (short) (C1633zX.Xd() ^ (-24846)), (short) (C1633zX.Xd() ^ (-19728))), clsArr3);
            try {
                method3.setAccessible(true);
                accessibilityNodeInfoCompat.setRoleDescription((String) method3.invoke(context, objArr3));
                accessibilityNodeInfoCompat.setClickable(true);
                return;
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
        if (accessibilityRole.equals(AccessibilityRole.BUTTON)) {
            accessibilityNodeInfoCompat.setClickable(true);
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.TOGGLEBUTTON)) {
            accessibilityNodeInfoCompat.setClickable(true);
            accessibilityNodeInfoCompat.setCheckable(true);
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.SUMMARY)) {
            int i7 = R.string.summary_description;
            Class<?> cls4 = Class.forName(C1626yg.Ud(")-Y\u001c@ :0=D!9!y)3\u0006E\"8-h~", (short) (C1499aX.Xd() ^ (-25606)), (short) (C1499aX.Xd() ^ (-30598))));
            Class<?>[] clsArr4 = {Integer.TYPE};
            Object[] objArr4 = {Integer.valueOf(i7)};
            short sXd5 = (short) (Od.Xd() ^ (-30759));
            int[] iArr3 = new int["\u001ba\u0003\u0002zC\u001esE".length()];
            QB qb3 = new QB("\u001ba\u0003\u0002zC\u001esE");
            int i8 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i8] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i8 % C1561oA.Xd.length] ^ (sXd5 + i8)));
                i8++;
            }
            Method method4 = cls4.getMethod(new String(iArr3, 0, i8), clsArr4);
            try {
                method4.setAccessible(true);
                accessibilityNodeInfoCompat.setRoleDescription((String) method4.invoke(context, objArr4));
                return;
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        if (accessibilityRole.equals(AccessibilityRole.HEADER)) {
            accessibilityNodeInfoCompat.setHeading(true);
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.ALERT)) {
            int i9 = R.string.alert_description;
            Class<?> cls5 = Class.forName(EO.Od("B}$WV\u0006Z\u001ezHKi\u0006\u0017\u000fc6v\u001f\u001b#\u0011\\", (short) (FB.Xd() ^ 29605)));
            Class<?>[] clsArr5 = {Integer.TYPE};
            Object[] objArr5 = {Integer.valueOf(i9)};
            Method method5 = cls5.getMethod(C1561oA.Qd("{x\u0007d\u0005\u0002w{s", (short) (FB.Xd() ^ 28154)), clsArr5);
            try {
                method5.setAccessible(true);
                accessibilityNodeInfoCompat.setRoleDescription((String) method5.invoke(context, objArr5));
                return;
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        }
        if (accessibilityRole.equals(AccessibilityRole.COMBOBOX)) {
            int i10 = R.string.combobox_description;
            Class<?> cls6 = Class.forName(C1593ug.zd("\u007f\u000e\u0005\u0014\u0012\r\tS\n\u0017\u0017\u001e\u0010\u001a![q\u001f\u001f&\u0018,)", (short) (C1499aX.Xd() ^ (-10237)), (short) (C1499aX.Xd() ^ (-11525))));
            Class<?>[] clsArr6 = {Integer.TYPE};
            Object[] objArr6 = {Integer.valueOf(i10)};
            Method method6 = cls6.getMethod(C1561oA.od("hesQqndh`", (short) (OY.Xd() ^ 19678)), clsArr6);
            try {
                method6.setAccessible(true);
                accessibilityNodeInfoCompat.setRoleDescription((String) method6.invoke(context, objArr6));
                return;
            } catch (InvocationTargetException e7) {
                throw e7.getCause();
            }
        }
        if (accessibilityRole.equals(AccessibilityRole.MENU)) {
            int i11 = R.string.menu_description;
            short sXd6 = (short) (Od.Xd() ^ (-12556));
            int[] iArr4 = new int["\u0011\u001f\u0016%#\u001e\u001ad\u001b((/!+2l\u0003007)=:".length()];
            QB qb4 = new QB("\u0011\u001f\u0016%#\u001e\u001ad\u001b((/!+2l\u0003007)=:");
            int i12 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i12] = xuXd4.fK(xuXd4.CK(iKK4) - ((sXd6 + sXd6) + i12));
                i12++;
            }
            Class<?> cls7 = Class.forName(new String(iArr4, 0, i12));
            Class<?>[] clsArr7 = {Integer.TYPE};
            Object[] objArr7 = {Integer.valueOf(i11)};
            Method method7 = cls7.getMethod(Wg.Zd("\u001403\u0007\u001c\u0017\u007fyf", (short) (Od.Xd() ^ (-10338)), (short) (Od.Xd() ^ (-6198))), clsArr7);
            try {
                method7.setAccessible(true);
                accessibilityNodeInfoCompat.setRoleDescription((String) method7.invoke(context, objArr7));
                return;
            } catch (InvocationTargetException e8) {
                throw e8.getCause();
            }
        }
        if (accessibilityRole.equals(AccessibilityRole.MENUBAR)) {
            int i13 = R.string.menubar_description;
            Class<?> cls8 = Class.forName(C1561oA.Xd("IWN][VR\u001dS``gYcj%;hhoaur", (short) (OY.Xd() ^ 10955)));
            Class<?>[] clsArr8 = {Integer.TYPE};
            Object[] objArr8 = {Integer.valueOf(i13)};
            Method method8 = cls8.getMethod(Wg.vd("32B\"DC;A;", (short) (C1633zX.Xd() ^ (-9756))), clsArr8);
            try {
                method8.setAccessible(true);
                accessibilityNodeInfoCompat.setRoleDescription((String) method8.invoke(context, objArr8));
                return;
            } catch (InvocationTargetException e9) {
                throw e9.getCause();
            }
        }
        if (accessibilityRole.equals(AccessibilityRole.MENUITEM)) {
            int i14 = R.string.menuitem_description;
            Class<?> cls9 = Class.forName(Qg.kd("-9.;70*r'205%-2j~*(-\u001d/*", (short) (Od.Xd() ^ (-19129)), (short) (Od.Xd() ^ (-28993))));
            Class<?>[] clsArr9 = {Integer.TYPE};
            Object[] objArr9 = {Integer.valueOf(i14)};
            Method method9 = cls9.getMethod(hg.Vd("GDR0PMCG?", (short) (FB.Xd() ^ 28902), (short) (FB.Xd() ^ 21664)), clsArr9);
            try {
                method9.setAccessible(true);
                accessibilityNodeInfoCompat.setRoleDescription((String) method9.invoke(context, objArr9));
                return;
            } catch (InvocationTargetException e10) {
                throw e10.getCause();
            }
        }
        if (accessibilityRole.equals(AccessibilityRole.PROGRESSBAR)) {
            int i15 = R.string.progressbar_description;
            Class<?> cls10 = Class.forName(C1561oA.ud("IUJWSLF\u000fCNLQAIN\u0007\u001bFDI9KF", (short) (Od.Xd() ^ (-1054))));
            Class<?>[] clsArr10 = {Integer.TYPE};
            Object[] objArr10 = {Integer.valueOf(i15)};
            Method method10 = cls10.getMethod(C1561oA.yd("\u000e\r\u001d|\u001f\u001e\u0016\u001c\u0016", (short) (C1607wl.Xd() ^ 18858)), clsArr10);
            try {
                method10.setAccessible(true);
                accessibilityNodeInfoCompat.setRoleDescription((String) method10.invoke(context, objArr10));
                return;
            } catch (InvocationTargetException e11) {
                throw e11.getCause();
            }
        }
        if (accessibilityRole.equals(AccessibilityRole.RADIOGROUP)) {
            int i16 = R.string.radiogroup_description;
            Class<?> cls11 = Class.forName(C1561oA.Yd("3A8GE@<\u0007=JJQCMT\u000f%RRYK_\\", (short) (C1633zX.Xd() ^ (-229))));
            Class<?>[] clsArr11 = {Integer.TYPE};
            Object[] objArr11 = {Integer.valueOf(i16)};
            Method method11 = cls11.getMethod(Xg.qd("\u0001\u007f\u0010o\u0012\u0011\t\u000f\t", (short) (C1607wl.Xd() ^ 10635), (short) (C1607wl.Xd() ^ 12851)), clsArr11);
            try {
                method11.setAccessible(true);
                accessibilityNodeInfoCompat.setRoleDescription((String) method11.invoke(context, objArr11));
                return;
            } catch (InvocationTargetException e12) {
                throw e12.getCause();
            }
        }
        if (accessibilityRole.equals(AccessibilityRole.SCROLLBAR)) {
            int i17 = R.string.scrollbar_description;
            Class<?> cls12 = Class.forName(Jg.Wd("\u00130u\u0014ak6\u0010\u00140~\u0015VoE\u000fv3\u0002\u0018Y|H", (short) (C1633zX.Xd() ^ (-24733)), (short) (C1633zX.Xd() ^ (-25637))));
            Class<?>[] clsArr12 = {Integer.TYPE};
            Object[] objArr12 = {Integer.valueOf(i17)};
            Method method12 = cls12.getMethod(ZO.xd("U!j\u0002o\u0004o!\\", (short) (C1633zX.Xd() ^ (-9694)), (short) (C1633zX.Xd() ^ (-22023))), clsArr12);
            try {
                method12.setAccessible(true);
                accessibilityNodeInfoCompat.setRoleDescription((String) method12.invoke(context, objArr12));
                return;
            } catch (InvocationTargetException e13) {
                throw e13.getCause();
            }
        }
        if (accessibilityRole.equals(AccessibilityRole.SPINBUTTON)) {
            int i18 = R.string.spinbutton_description;
            Class<?> cls13 = Class.forName(C1626yg.Ud("gZ`~f\u000b\u0010$jcr!,\u001f?w32x|kvB", (short) (ZN.Xd() ^ 27686), (short) (ZN.Xd() ^ 29640)));
            Class<?>[] clsArr13 = {Integer.TYPE};
            Object[] objArr13 = {Integer.valueOf(i18)};
            Method method13 = cls13.getMethod(Ig.wd("_\r\u001aU7_~$Y", (short) (C1607wl.Xd() ^ 16196)), clsArr13);
            try {
                method13.setAccessible(true);
                accessibilityNodeInfoCompat.setRoleDescription((String) method13.invoke(context, objArr13));
                return;
            } catch (InvocationTargetException e14) {
                throw e14.getCause();
            }
        }
        if (accessibilityRole.equals(AccessibilityRole.TAB)) {
            int i19 = R.string.rn_tab_description;
            short sXd7 = (short) (C1580rY.Xd() ^ (-32158));
            int[] iArr5 = new int["2vP<c#@\u0013\u001cy\u0011z\u001b\u0018<]\u0018d\rh\u001dmM".length()];
            QB qb5 = new QB("2vP<c#@\u0013\u001cy\u0011z\u001b\u0018<]\u0018d\rh\u001dmM");
            int i20 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i20] = xuXd5.fK((C1561oA.Xd[i20 % C1561oA.Xd.length] ^ ((sXd7 + sXd7) + i20)) + xuXd5.CK(iKK5));
                i20++;
            }
            Class<?> cls14 = Class.forName(new String(iArr5, 0, i20));
            Class<?>[] clsArr14 = {Integer.TYPE};
            Object[] objArr14 = {Integer.valueOf(i19)};
            short sXd8 = (short) (OY.Xd() ^ 19694);
            int[] iArr6 = new int[":7E#C@6:2".length()];
            QB qb6 = new QB(":7E#C@6:2");
            int i21 = 0;
            while (qb6.YK()) {
                int iKK6 = qb6.KK();
                Xu xuXd6 = Xu.Xd(iKK6);
                iArr6[i21] = xuXd6.fK(sXd8 + sXd8 + sXd8 + i21 + xuXd6.CK(iKK6));
                i21++;
            }
            Method method14 = cls14.getMethod(new String(iArr6, 0, i21), clsArr14);
            try {
                method14.setAccessible(true);
                accessibilityNodeInfoCompat.setRoleDescription((String) method14.invoke(context, objArr14));
                return;
            } catch (InvocationTargetException e15) {
                throw e15.getCause();
            }
        }
        if (accessibilityRole.equals(AccessibilityRole.TABLIST)) {
            int i22 = R.string.tablist_description;
            short sXd9 = (short) (C1580rY.Xd() ^ (-32350));
            short sXd10 = (short) (C1580rY.Xd() ^ (-13266));
            int[] iArr7 = new int["\u001a(\u001f.,'#m$118*4;u\f99@2FC".length()];
            QB qb7 = new QB("\u001a(\u001f.,'#m$118*4;u\f99@2FC");
            int i23 = 0;
            while (qb7.YK()) {
                int iKK7 = qb7.KK();
                Xu xuXd7 = Xu.Xd(iKK7);
                iArr7[i23] = xuXd7.fK((xuXd7.CK(iKK7) - (sXd9 + i23)) - sXd10);
                i23++;
            }
            Class<?> cls15 = Class.forName(new String(iArr7, 0, i23));
            Class<?>[] clsArr15 = {Integer.TYPE};
            Object[] objArr15 = {Integer.valueOf(i22)};
            Method method15 = cls15.getMethod(C1561oA.od("!\u001e,\n*'\u001d!\u0019", (short) (Od.Xd() ^ (-21276))), clsArr15);
            try {
                method15.setAccessible(true);
                accessibilityNodeInfoCompat.setRoleDescription((String) method15.invoke(context, objArr15));
                return;
            } catch (InvocationTargetException e16) {
                throw e16.getCause();
            }
        }
        if (accessibilityRole.equals(AccessibilityRole.TIMER)) {
            int i24 = R.string.timer_description;
            Class<?> cls16 = Class.forName(C1561oA.Kd("Xf]ljea,boovhry4Jww~p\u0005\u0002", (short) (C1580rY.Xd() ^ (-27557))));
            Class<?>[] clsArr16 = {Integer.TYPE};
            Object[] objArr16 = {Integer.valueOf(i24)};
            Method method16 = cls16.getMethod(Wg.Zd("lC5\u0013X]W\u001dx", (short) (C1607wl.Xd() ^ 10184), (short) (C1607wl.Xd() ^ 30761)), clsArr16);
            try {
                method16.setAccessible(true);
                accessibilityNodeInfoCompat.setRoleDescription((String) method16.invoke(context, objArr16));
                return;
            } catch (InvocationTargetException e17) {
                throw e17.getCause();
            }
        }
        if (accessibilityRole.equals(AccessibilityRole.TOOLBAR)) {
            int i25 = R.string.toolbar_description;
            Class<?> cls17 = Class.forName(C1561oA.Xd("o}t\u0004\u0002|xCy\u0007\u0007\u000e\u007f\n\u0011Ka\u000f\u000f\u0016\b\u001c\u0019", (short) (C1607wl.Xd() ^ 2822)));
            Class<?>[] clsArr17 = {Integer.TYPE};
            Object[] objArr17 = {Integer.valueOf(i25)};
            short sXd11 = (short) (ZN.Xd() ^ 17768);
            int[] iArr8 = new int["VSa?_\\RV^".length()];
            QB qb8 = new QB("VSa?_\\RV^");
            int i26 = 0;
            while (qb8.YK()) {
                int iKK8 = qb8.KK();
                Xu xuXd8 = Xu.Xd(iKK8);
                iArr8[i26] = xuXd8.fK((sXd11 ^ i26) + xuXd8.CK(iKK8));
                i26++;
            }
            Method method17 = cls17.getMethod(new String(iArr8, 0, i26), clsArr17);
            try {
                method17.setAccessible(true);
                accessibilityNodeInfoCompat.setRoleDescription((String) method17.invoke(context, objArr17));
            } catch (InvocationTargetException e18) {
                throw e18.getCause();
            }
        }
    }

    private static void setState(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, ReadableMap readableMap, Context context) {
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(strNextKey);
            if (strNextKey.equals(STATE_SELECTED) && dynamic.getType() == ReadableType.Boolean) {
                accessibilityNodeInfoCompat.setSelected(dynamic.asBoolean());
            } else if (strNextKey.equals(STATE_DISABLED) && dynamic.getType() == ReadableType.Boolean) {
                accessibilityNodeInfoCompat.setEnabled(!dynamic.asBoolean());
            } else if (strNextKey.equals(STATE_CHECKED) && dynamic.getType() == ReadableType.Boolean) {
                boolean zAsBoolean = dynamic.asBoolean();
                accessibilityNodeInfoCompat.setCheckable(true);
                accessibilityNodeInfoCompat.setChecked(zAsBoolean);
            }
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        if (this.mAccessibilityLinks != null) {
            return super.getAccessibilityNodeProvider(view);
        }
        return null;
    }

    protected <T> T getFirstSpan(int i2, int i3, Class<T> cls) {
        View view = this.mView;
        if (!(view instanceof TextView) || !(((TextView) view).getText() instanceof Spanned)) {
            return null;
        }
        Object[] spans = ((Spanned) ((TextView) this.mView).getText()).getSpans(i2, i3, cls);
        if (spans.length > 0) {
            return (T) spans[0];
        }
        return null;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    protected int getVirtualViewAt(float f2, float f3) {
        Layout layout;
        AccessibilityLinks accessibilityLinks = this.mAccessibilityLinks;
        if (accessibilityLinks == null || accessibilityLinks.size() == 0) {
            return Integer.MIN_VALUE;
        }
        View view = this.mView;
        if (!(view instanceof TextView)) {
            return Integer.MIN_VALUE;
        }
        TextView textView = (TextView) view;
        if (!(textView.getText() instanceof Spanned) || (layout = textView.getLayout()) == null) {
            return Integer.MIN_VALUE;
        }
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) ((f3 - textView.getTotalPaddingTop()) + textView.getScrollY())), (f2 - textView.getTotalPaddingLeft()) + textView.getScrollX());
        ClickableSpan clickableSpan = (ClickableSpan) getFirstSpan(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpan == null) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) textView.getText();
        AccessibilityLinks.AccessibleLink linkBySpanPos = this.mAccessibilityLinks.getLinkBySpanPos(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
        if (linkBySpanPos != null) {
            return linkBySpanPos.id;
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    protected void getVisibleVirtualViews(List<Integer> list) {
        if (this.mAccessibilityLinks == null) {
            return;
        }
        for (int i2 = 0; i2 < this.mAccessibilityLinks.size(); i2++) {
            list.add(Integer.valueOf(i2));
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (readableMap != null && readableMap.hasKey(MetricSummary.JsonKeys.MIN) && readableMap.hasKey("now") && readableMap.hasKey(MetricSummary.JsonKeys.MAX)) {
            Dynamic dynamic = readableMap.getDynamic(MetricSummary.JsonKeys.MIN);
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic(MetricSummary.JsonKeys.MAX);
            if (dynamic == null || dynamic.getType() != ReadableType.Number || dynamic2 == null || dynamic2.getType() != ReadableType.Number || dynamic3 == null || dynamic3.getType() != ReadableType.Number) {
                return;
            }
            int iAsInt = dynamic.asInt();
            int iAsInt2 = dynamic2.asInt();
            int iAsInt3 = dynamic3.asInt();
            if (iAsInt3 <= iAsInt || iAsInt2 < iAsInt || iAsInt3 < iAsInt2) {
                return;
            }
            accessibilityEvent.setItemCount(iAsInt3 - iAsInt);
            accessibilityEvent.setCurrentItemIndex(iAsInt2);
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) throws Throwable {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (view.getTag(R.id.accessibility_state_expanded) != null) {
            accessibilityNodeInfoCompat.addAction(((Boolean) view.getTag(R.id.accessibility_state_expanded)).booleanValue() ? 524288 : 262144);
        }
        AccessibilityRole accessibilityRoleFromViewTag = AccessibilityRole.fromViewTag(view);
        String str = (String) view.getTag(R.id.accessibility_hint);
        if (accessibilityRoleFromViewTag != null) {
            setRole(accessibilityNodeInfoCompat, accessibilityRoleFromViewTag, view.getContext());
        }
        if (str != null) {
            accessibilityNodeInfoCompat.setTooltipText(str);
        }
        Object tag = view.getTag(R.id.labelled_by);
        if (tag != null) {
            View viewFindView = ReactFindViewUtil.findView(view.getRootView(), (String) tag);
            this.mAccessibilityLabelledBy = viewFindView;
            if (viewFindView != null) {
                accessibilityNodeInfoCompat.setLabeledBy(viewFindView);
            }
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_state);
        if (readableMap != null) {
            setState(accessibilityNodeInfoCompat, readableMap, view.getContext());
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(R.id.accessibility_actions);
        ReadableMap readableMap2 = (ReadableMap) view.getTag(R.id.accessibility_collection_item);
        if (readableMap2 != null) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(readableMap2.getInt("rowIndex"), readableMap2.getInt("rowSpan"), readableMap2.getInt("columnIndex"), readableMap2.getInt("columnSpan"), readableMap2.getBoolean("heading")));
        }
        boolean z2 = true;
        if (readableArray != null) {
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                ReadableMap map = readableArray.getMap(i2);
                if (!map.hasKey("name")) {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
                int iIntValue = sCounter;
                String string = map.hasKey(Constants.ScionAnalytics.PARAM_LABEL) ? map.getString(Constants.ScionAnalytics.PARAM_LABEL) : null;
                HashMap<String, Integer> map2 = sActionIdMap;
                if (map2.containsKey(map.getString("name"))) {
                    iIntValue = map2.get(map.getString("name")).intValue();
                } else {
                    sCounter++;
                }
                this.mAccessibilityActionsMap.put(Integer.valueOf(iIntValue), map.getString("name"));
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(iIntValue, string));
            }
        }
        ReadableMap readableMap3 = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (readableMap3 != null && readableMap3.hasKey(MetricSummary.JsonKeys.MIN) && readableMap3.hasKey("now") && readableMap3.hasKey(MetricSummary.JsonKeys.MAX)) {
            Dynamic dynamic = readableMap3.getDynamic(MetricSummary.JsonKeys.MIN);
            Dynamic dynamic2 = readableMap3.getDynamic("now");
            Dynamic dynamic3 = readableMap3.getDynamic(MetricSummary.JsonKeys.MAX);
            if (dynamic != null && dynamic.getType() == ReadableType.Number && dynamic2 != null && dynamic2.getType() == ReadableType.Number && dynamic3 != null && dynamic3.getType() == ReadableType.Number) {
                int iAsInt = dynamic.asInt();
                int iAsInt2 = dynamic2.asInt();
                int iAsInt3 = dynamic3.asInt();
                if (iAsInt3 > iAsInt && iAsInt2 >= iAsInt && iAsInt3 >= iAsInt2) {
                    accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(0, iAsInt, iAsInt3, iAsInt2));
                }
            }
        }
        String str2 = (String) view.getTag(R.id.react_test_id);
        if (str2 != null) {
            accessibilityNodeInfoCompat.setViewIdResourceName(str2);
        }
        boolean z3 = TextUtils.isEmpty(accessibilityNodeInfoCompat.getContentDescription()) && TextUtils.isEmpty(accessibilityNodeInfoCompat.getText());
        if (readableArray == null && readableMap == null && tag == null && accessibilityRoleFromViewTag == null) {
            z2 = false;
        }
        if (z3 && z2) {
            accessibilityNodeInfoCompat.setContentDescription(getTalkbackDescription(view, accessibilityNodeInfoCompat));
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    protected boolean onPerformActionForVirtualView(int i2, int i3, Bundle bundle) {
        return false;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    protected void onPopulateNodeForVirtualView(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityLinks accessibilityLinks = this.mAccessibilityLinks;
        if (accessibilityLinks == null) {
            accessibilityNodeInfoCompat.setContentDescription("");
            accessibilityNodeInfoCompat.setBoundsInParent(new Rect(0, 0, 1, 1));
            return;
        }
        AccessibilityLinks.AccessibleLink linkById = accessibilityLinks.getLinkById(i2);
        if (linkById == null) {
            accessibilityNodeInfoCompat.setContentDescription("");
            accessibilityNodeInfoCompat.setBoundsInParent(new Rect(0, 0, 1, 1));
            return;
        }
        Rect boundsInParent = getBoundsInParent(linkById);
        if (boundsInParent == null) {
            accessibilityNodeInfoCompat.setContentDescription("");
            accessibilityNodeInfoCompat.setBoundsInParent(new Rect(0, 0, 1, 1));
            return;
        }
        accessibilityNodeInfoCompat.setContentDescription(linkById.description);
        accessibilityNodeInfoCompat.addAction(16);
        accessibilityNodeInfoCompat.setBoundsInParent(boundsInParent);
        accessibilityNodeInfoCompat.setRoleDescription(this.mView.getResources().getString(R.string.link_description));
        accessibilityNodeInfoCompat.setClassName(AccessibilityRole.getValue(AccessibilityRole.BUTTON));
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        if (i2 == 524288) {
            view.setTag(R.id.accessibility_state_expanded, false);
        }
        if (i2 == 262144) {
            view.setTag(R.id.accessibility_state_expanded, true);
        }
        if (!this.mAccessibilityActionsMap.containsKey(Integer.valueOf(i2))) {
            return super.performAccessibilityAction(view, i2, bundle);
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("actionName", this.mAccessibilityActionsMap.get(Integer.valueOf(i2)));
        ReactContext reactContext = (ReactContext) view.getContext();
        if (reactContext.hasActiveReactInstance()) {
            int id = view.getId();
            int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
            UIManager uIManager = UIManagerHelper.getUIManager(reactContext, ViewUtil.getUIManagerType(id));
            if (uIManager != null) {
                uIManager.getEventDispatcher().dispatchEvent(new Event(surfaceId, id) { // from class: com.facebook.react.uimanager.ReactAccessibilityDelegate.2
                    final /* synthetic */ WritableMap val$event;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(int surfaceId2, int id2, WritableMap writableMapCreateMap2) {
                        super(surfaceId2, id2);
                        writableMap = writableMapCreateMap2;
                    }

                    @Override // com.facebook.react.uimanager.events.Event
                    protected WritableMap getEventData() {
                        return writableMap;
                    }

                    @Override // com.facebook.react.uimanager.events.Event
                    public String getEventName() {
                        return ReactAccessibilityDelegate.TOP_ACCESSIBILITY_ACTION_EVENT;
                    }
                });
            }
        } else {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
        }
        AccessibilityRole accessibilityRole = (AccessibilityRole) view.getTag(R.id.accessibility_role);
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (accessibilityRole != AccessibilityRole.ADJUSTABLE || (i2 != AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId() && i2 != AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId())) {
            return true;
        }
        if (readableMap != null && !readableMap.hasKey("text")) {
            scheduleAccessibilityEventSender(view);
        }
        return super.performAccessibilityAction(view, i2, bundle);
    }
}
