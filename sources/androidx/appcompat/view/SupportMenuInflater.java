package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import com.dynatrace.android.callback.Callback;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes.dex */
public class SupportMenuInflater extends MenuInflater {
    static final Class<?>[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
    static final Class<?>[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    static final String LOG_TAG = "SupportMenuInflater";
    static final int NO_ID = 0;
    private static final String XML_GROUP = "group";
    private static final String XML_ITEM = "item";
    private static final String XML_MENU = "menu";
    final Object[] mActionProviderConstructorArguments;
    final Object[] mActionViewConstructorArguments;
    Context mContext;
    private Object mRealOwner;

    static {
        Class<?>[] clsArr = {Context.class};
        ACTION_VIEW_CONSTRUCTOR_SIGNATURE = clsArr;
        ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = clsArr;
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.mContext = context;
        Object[] objArr = {context};
        this.mActionViewConstructorArguments = objArr;
        this.mActionProviderConstructorArguments = objArr;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i2, Menu menu) {
        String strOd = C1561oA.od("(TSOQ}FJAF:L@D<s@7?En&\u001a\u0018", (short) (C1607wl.Xd() ^ 11014));
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z2 = false;
        try {
            try {
                Context context = this.mContext;
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.Kd("FTKZXSO\u001aP]]dV`g\"8eel^ro", (short) (C1499aX.Xd() ^ (-10241)))).getMethod(Wg.Zd("L\u0014\u001ft,2*XI2`f", (short) (C1499aX.Xd() ^ (-21665)), (short) (C1499aX.Xd() ^ (-31191))), new Class[0]);
                try {
                    method.setAccessible(true);
                    XmlResourceParser layout = ((Resources) method.invoke(context, objArr)).getLayout(i2);
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                    if (menu instanceof MenuBuilder) {
                        MenuBuilder menuBuilder = (MenuBuilder) menu;
                        if (menuBuilder.isDispatchingItemsChanged()) {
                            menuBuilder.stopDispatchingItemsChanged();
                            z2 = true;
                        }
                    }
                    parseMenu(layout, attributeSetAsAttributeSet, menu);
                    if (z2) {
                        ((MenuBuilder) menu).startDispatchingItemsChanged();
                    }
                    if (layout != null) {
                        layout.close();
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IOException e3) {
                throw new InflateException(strOd, e3);
            } catch (XmlPullParserException e4) {
                throw new InflateException(strOd, e4);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                ((MenuBuilder) menu).startDispatchingItemsChanged();
            }
            if (0 != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r1 == 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r1 == 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r1 == 3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        r1 = r14.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r1 = r14.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r9 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1.equals(r2) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        r9 = false;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r1.equals(androidx.appcompat.view.SupportMenuInflater.XML_GROUP) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        r6.resetGroup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r1.equals(androidx.appcompat.view.SupportMenuInflater.XML_ITEM) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r6.hasAddedItem() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r6.itemActionProvider == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        if (r6.itemActionProvider.hasSubMenu() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        r6.addSubMenuItem();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        r6.addItem();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        if (r1.equals(androidx.appcompat.view.SupportMenuInflater.XML_MENU) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (r9 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007d, code lost:
    
        r1 = r14.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        if (r1.equals(androidx.appcompat.view.SupportMenuInflater.XML_GROUP) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
    
        r6.readGroup(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        if (r1.equals(androidx.appcompat.view.SupportMenuInflater.XML_ITEM) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0091, code lost:
    
        r6.readItem(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r1.equals(androidx.appcompat.view.SupportMenuInflater.XML_MENU) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        parseMenu(r14, r15, r6.addSubMenuItem());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
    
        r2 = r1;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r10 = false;
        r9 = false;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r10 != false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void parseMenu(org.xmlpull.v1.XmlPullParser r14, android.util.AttributeSet r15, android.view.Menu r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.SupportMenuInflater.parseMenu(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object getRealOwner() {
        if (this.mRealOwner == null) {
            this.mRealOwner = findRealOwner(this.mContext);
        }
        return this.mRealOwner;
    }

    private Object findRealOwner(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? findRealOwner(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private static class InflatedOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] PARAM_TYPES = {MenuItem.class};
        private Method mMethod;
        private Object mRealOwner;

        public InflatedOnMenuItemClickListener(Object obj, String str) {
            this.mRealOwner = obj;
            Class<?> cls = obj.getClass();
            try {
                this.mMethod = cls.getMethod(str, PARAM_TYPES);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            Callback.onMenuItemClick_enter(menuItem);
            try {
                try {
                    if (this.mMethod.getReturnType() == Boolean.TYPE) {
                        return ((Boolean) this.mMethod.invoke(this.mRealOwner, menuItem)).booleanValue();
                    }
                    this.mMethod.invoke(this.mRealOwner, menuItem);
                    Callback.onMenuItemClick_exit();
                    return true;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            } finally {
                Callback.onMenuItemClick_exit();
            }
        }
    }

    private class MenuState {
        private static final int defaultGroupId = 0;
        private static final int defaultItemCategory = 0;
        private static final int defaultItemCheckable = 0;
        private static final boolean defaultItemChecked = false;
        private static final boolean defaultItemEnabled = true;
        private static final int defaultItemId = 0;
        private static final int defaultItemOrder = 0;
        private static final boolean defaultItemVisible = true;
        private int groupCategory;
        private int groupCheckable;
        private boolean groupEnabled;
        private int groupId;
        private int groupOrder;
        private boolean groupVisible;
        ActionProvider itemActionProvider;
        private String itemActionProviderClassName;
        private String itemActionViewClassName;
        private int itemActionViewLayout;
        private boolean itemAdded;
        private int itemAlphabeticModifiers;
        private char itemAlphabeticShortcut;
        private int itemCategoryOrder;
        private int itemCheckable;
        private boolean itemChecked;
        private CharSequence itemContentDescription;
        private boolean itemEnabled;
        private int itemIconResId;
        private ColorStateList itemIconTintList = null;
        private PorterDuff.Mode itemIconTintMode = null;
        private int itemId;
        private String itemListenerMethodName;
        private int itemNumericModifiers;
        private char itemNumericShortcut;
        private int itemShowAsAction;
        private CharSequence itemTitle;
        private CharSequence itemTitleCondensed;
        private CharSequence itemTooltipText;
        private boolean itemVisible;
        private Menu menu;

        public MenuState(Menu menu) {
            this.menu = menu;
            resetGroup();
        }

        public void resetGroup() {
            this.groupId = 0;
            this.groupCategory = 0;
            this.groupOrder = 0;
            this.groupCheckable = 0;
            this.groupVisible = true;
            this.groupEnabled = true;
        }

        public void readGroup(AttributeSet attributeSet) throws Throwable {
            Context context = SupportMenuInflater.this.mContext;
            int[] iArr = R.styleable.MenuGroup;
            Class<?> cls = Class.forName(C1561oA.ud("EQFSOHB\u000b?JHM=EJ\u0003\u0017B@E5GB", (short) (Od.Xd() ^ (-2557))));
            Class<?>[] clsArr = {Class.forName(C1561oA.yd("Zf[hd]W fdXZ\u001b-_^[QI[YI6GU", (short) (C1633zX.Xd() ^ (-2092)))), int[].class};
            Object[] objArr = {attributeSet, iArr};
            short sXd = (short) (C1607wl.Xd() ^ 32423);
            int[] iArr2 = new int["|p\u0004qz\u0001f\t\u000f\u0003||Z\u000f\u0010\u000f\u0007\u0001\u0015\u0015\u0007\u0016".length()];
            QB qb = new QB("|p\u0004qz\u0001f\t\u000f\u0003||Z\u000f\u0010\u000f\u0007\u0001\u0015\u0015\u0007\u0016");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr2[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                this.groupId = typedArray.getResourceId(R.styleable.MenuGroup_android_id, 0);
                this.groupCategory = typedArray.getInt(R.styleable.MenuGroup_android_menuCategory, 0);
                this.groupOrder = typedArray.getInt(R.styleable.MenuGroup_android_orderInCategory, 0);
                this.groupCheckable = typedArray.getInt(R.styleable.MenuGroup_android_checkableBehavior, 0);
                this.groupVisible = typedArray.getBoolean(R.styleable.MenuGroup_android_visible, true);
                this.groupEnabled = typedArray.getBoolean(R.styleable.MenuGroup_android_enabled, true);
                typedArray.recycle();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public void readItem(AttributeSet attributeSet) {
            TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(SupportMenuInflater.this.mContext, attributeSet, R.styleable.MenuItem);
            this.itemId = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.MenuItem_android_id, 0);
            int i2 = tintTypedArrayObtainStyledAttributes.getInt(R.styleable.MenuItem_android_menuCategory, this.groupCategory);
            int i3 = tintTypedArrayObtainStyledAttributes.getInt(R.styleable.MenuItem_android_orderInCategory, this.groupOrder);
            int i4 = i2 & SupportMenu.CATEGORY_MASK;
            int i5 = (-1) - (((-1) - i3) | ((-1) - 65535));
            this.itemCategoryOrder = (i4 + i5) - (i4 & i5);
            this.itemTitle = tintTypedArrayObtainStyledAttributes.getText(R.styleable.MenuItem_android_title);
            this.itemTitleCondensed = tintTypedArrayObtainStyledAttributes.getText(R.styleable.MenuItem_android_titleCondensed);
            this.itemIconResId = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.MenuItem_android_icon, 0);
            this.itemAlphabeticShortcut = getShortcut(tintTypedArrayObtainStyledAttributes.getString(R.styleable.MenuItem_android_alphabeticShortcut));
            this.itemAlphabeticModifiers = tintTypedArrayObtainStyledAttributes.getInt(R.styleable.MenuItem_alphabeticModifiers, 4096);
            this.itemNumericShortcut = getShortcut(tintTypedArrayObtainStyledAttributes.getString(R.styleable.MenuItem_android_numericShortcut));
            this.itemNumericModifiers = tintTypedArrayObtainStyledAttributes.getInt(R.styleable.MenuItem_numericModifiers, 4096);
            if (tintTypedArrayObtainStyledAttributes.hasValue(R.styleable.MenuItem_android_checkable)) {
                this.itemCheckable = tintTypedArrayObtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.itemCheckable = this.groupCheckable;
            }
            this.itemChecked = tintTypedArrayObtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_checked, false);
            this.itemVisible = tintTypedArrayObtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_visible, this.groupVisible);
            this.itemEnabled = tintTypedArrayObtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_enabled, this.groupEnabled);
            this.itemShowAsAction = tintTypedArrayObtainStyledAttributes.getInt(R.styleable.MenuItem_showAsAction, -1);
            this.itemListenerMethodName = tintTypedArrayObtainStyledAttributes.getString(R.styleable.MenuItem_android_onClick);
            this.itemActionViewLayout = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.MenuItem_actionLayout, 0);
            this.itemActionViewClassName = tintTypedArrayObtainStyledAttributes.getString(R.styleable.MenuItem_actionViewClass);
            String string = tintTypedArrayObtainStyledAttributes.getString(R.styleable.MenuItem_actionProviderClass);
            this.itemActionProviderClassName = string;
            boolean z2 = string != null;
            if (!z2 || this.itemActionViewLayout != 0 || this.itemActionViewClassName != null) {
                if (z2) {
                }
                this.itemActionProvider = null;
            } else {
                this.itemActionProvider = (ActionProvider) newInstance(string, SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE, SupportMenuInflater.this.mActionProviderConstructorArguments);
            }
            this.itemContentDescription = tintTypedArrayObtainStyledAttributes.getText(R.styleable.MenuItem_contentDescription);
            this.itemTooltipText = tintTypedArrayObtainStyledAttributes.getText(R.styleable.MenuItem_tooltipText);
            if (tintTypedArrayObtainStyledAttributes.hasValue(R.styleable.MenuItem_iconTintMode)) {
                this.itemIconTintMode = DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(R.styleable.MenuItem_iconTintMode, -1), this.itemIconTintMode);
            } else {
                this.itemIconTintMode = null;
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(R.styleable.MenuItem_iconTint)) {
                this.itemIconTintList = tintTypedArrayObtainStyledAttributes.getColorStateList(R.styleable.MenuItem_iconTint);
            } else {
                this.itemIconTintList = null;
            }
            tintTypedArrayObtainStyledAttributes.recycle();
            this.itemAdded = false;
        }

        private char getShortcut(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private void setItem(MenuItem menuItem) throws Throwable {
            boolean z2 = false;
            menuItem.setChecked(this.itemChecked).setVisible(this.itemVisible).setEnabled(this.itemEnabled).setCheckable(this.itemCheckable >= 1).setTitleCondensed(this.itemTitleCondensed).setIcon(this.itemIconResId);
            int i2 = this.itemShowAsAction;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.itemListenerMethodName != null) {
                Context context = SupportMenuInflater.this.mContext;
                short sXd = (short) (C1607wl.Xd() ^ 30781);
                short sXd2 = (short) (C1607wl.Xd() ^ 8984);
                int[] iArr = new int["!\u0012lZ,\nU\u0003\tx\\R\u0018\u0005k\t\u001f/\u0013x>5a".length()];
                QB qb = new QB("!\u0012lZ,\nU\u0003\tx\\R\u0018\u0005k\t\u001f/\u0013x>5a");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
                    i3++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i3));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd3 = (short) (C1499aX.Xd() ^ (-26045));
                int[] iArr2 = new int["\u001e)\t\u001d,.-% 2$$".length()];
                QB qb2 = new QB("\u001e)\t\u001d,.-% 2$$");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i4));
                    i4++;
                }
                Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
                try {
                    method.setAccessible(true);
                    if (((Boolean) method.invoke(context, objArr)).booleanValue()) {
                        throw new IllegalStateException(Wg.vd("7JF\u007fHTIVZSM\"^\\0X<5<o8JIFD<NLD}@=qppt'hj$\u0001}nl/\u0006v\u0001[[_\u0010X\u0016gYnnkabrb`B\u0005\u0010\u000e\u001b\u000b\u001d\u0018", (short) (ZN.Xd() ^ 18780)));
                    }
                    menuItem.setOnMenuItemClickListener(new InflatedOnMenuItemClickListener(SupportMenuInflater.this.getRealOwner(), this.itemListenerMethodName));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            if (this.itemCheckable >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).setExclusiveCheckable(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).setExclusiveCheckable(true);
                }
            }
            String str = this.itemActionViewClassName;
            if (str != null) {
                menuItem.setActionView((View) newInstance(str, SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, SupportMenuInflater.this.mActionViewConstructorArguments));
                z2 = true;
            }
            int i5 = this.itemActionViewLayout;
            if (i5 > 0) {
                if (!z2) {
                    menuItem.setActionView(i5);
                } else {
                    Qg.kd("UvpomopH_gm@d[`TfVb", (short) (C1499aX.Xd() ^ (-13255)), (short) (C1499aX.Xd() ^ (-679)));
                    short sXd4 = (short) (C1580rY.Xd() ^ (-21957));
                    short sXd5 = (short) (C1580rY.Xd() ^ (-23603));
                    int[] iArr3 = new int["-JPPRHLD{<NMJ@8JH8qw9C3:\r.>275\u001c.):\u000e\"9.31bhYy\u001b+\u001f$\"R(\u001a\u0015&M\u000e\u0018\u001d\u000f\n\f E\u0018\u0014\b\u0005\n\u0006\b\u0003\u0001I".length()];
                    QB qb3 = new QB("-JPPRHLD{<NMJ@8JH8qw9C3:\r.>275\u001c.):\u000e\"9.31bhYy\u001b+\u001f$\"R(\u001a\u0015&M\u000e\u0018\u001d\u000f\n\f E\u0018\u0014\b\u0005\n\u0006\b\u0003\u0001I");
                    int i6 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i6] = xuXd3.fK(sXd4 + i6 + xuXd3.CK(iKK3) + sXd5);
                        i6++;
                    }
                    new String(iArr3, 0, i6);
                }
            }
            ActionProvider actionProvider = this.itemActionProvider;
            if (actionProvider != null) {
                MenuItemCompat.setActionProvider(menuItem, actionProvider);
            }
            MenuItemCompat.setContentDescription(menuItem, this.itemContentDescription);
            MenuItemCompat.setTooltipText(menuItem, this.itemTooltipText);
            MenuItemCompat.setAlphabeticShortcut(menuItem, this.itemAlphabeticShortcut, this.itemAlphabeticModifiers);
            MenuItemCompat.setNumericShortcut(menuItem, this.itemNumericShortcut, this.itemNumericModifiers);
            PorterDuff.Mode mode = this.itemIconTintMode;
            if (mode != null) {
                MenuItemCompat.setIconTintMode(menuItem, mode);
            }
            ColorStateList colorStateList = this.itemIconTintList;
            if (colorStateList != null) {
                MenuItemCompat.setIconTintList(menuItem, colorStateList);
            }
        }

        public void addItem() throws Throwable {
            this.itemAdded = true;
            setItem(this.menu.add(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle));
        }

        public SubMenu addSubMenuItem() throws Throwable {
            this.itemAdded = true;
            SubMenu subMenuAddSubMenu = this.menu.addSubMenu(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle);
            setItem(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean hasAddedItem() {
            return this.itemAdded;
        }

        private <T> T newInstance(String str, Class<?>[] clsArr, Object[] objArr) throws Throwable {
            try {
                Context context = SupportMenuInflater.this.mContext;
                short sXd = (short) (FB.Xd() ^ 12946);
                int[] iArr = new int["HTIVRKE\u000eBMKP@HM\u0006\u001aECH8JE".length()];
                QB qb = new QB("HTIVRKE\u000eBMKP@HM\u0006\u001aECH8JE");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Object[] objArr2 = new Object[0];
                Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1593ug.zd("ut\u0005T~t\b\tb\u0007y}\u007f\u000e", (short) (FB.Xd() ^ 24318), (short) (FB.Xd() ^ 13072)), new Class[0]);
                try {
                    method.setAccessible(true);
                    Constructor<?> constructor = Class.forName(str, false, (ClassLoader) method.invoke(context, objArr2)).getConstructor(clsArr);
                    constructor.setAccessible(true);
                    return (T) constructor.newInstance(objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Exception e3) {
                short sXd2 = (short) (C1633zX.Xd() ^ (-11452));
                int[] iArr2 = new int["\u0001\u001e*))-W $((\u0014 %\u0019\u0010\"\u0012K\u000e\u0016\n\u001b\u001a_D".length()];
                QB qb2 = new QB("\u0001\u001e*))-W $((\u0014 %\u0019\u0010\"\u0012K\u000e\u0016\n\u001b\u001a_D");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                String str2 = new String(iArr2, 0, i3) + str;
                C1561oA.Kd("\u0003&\"##'*\u0004\u001d'/\u0004*#* 4&4", (short) (C1580rY.Xd() ^ (-26351)));
                return null;
            }
        }
    }
}
