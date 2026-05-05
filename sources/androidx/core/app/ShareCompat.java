package androidx.core.app;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import androidx.core.content.IntentCompat;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
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

/* JADX INFO: loaded from: classes4.dex */
public final class ShareCompat {
    public static final String EXTRA_CALLING_ACTIVITY = "androidx.core.app.EXTRA_CALLING_ACTIVITY";
    public static final String EXTRA_CALLING_ACTIVITY_INTEROP = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    public static final String EXTRA_CALLING_PACKAGE = "androidx.core.app.EXTRA_CALLING_PACKAGE";
    public static final String EXTRA_CALLING_PACKAGE_INTEROP = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
    private static final String HISTORY_FILENAME_PREFIX = ".sharecompat_";

    private ShareCompat() {
    }

    public static String getCallingPackage(Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        return (callingPackage != null || intent == null) ? callingPackage : getCallingPackage(intent);
    }

    static String getCallingPackage(Intent intent) {
        String stringExtra = intent.getStringExtra(EXTRA_CALLING_PACKAGE);
        return stringExtra == null ? intent.getStringExtra(EXTRA_CALLING_PACKAGE_INTEROP) : stringExtra;
    }

    public static ComponentName getCallingActivity(Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? getCallingActivity(intent) : callingActivity;
    }

    static ComponentName getCallingActivity(Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(EXTRA_CALLING_ACTIVITY);
        return componentName == null ? (ComponentName) intent.getParcelableExtra(EXTRA_CALLING_ACTIVITY_INTEROP) : componentName;
    }

    @Deprecated
    public static void configureMenuItem(MenuItem menuItem, IntentBuilder intentBuilder) {
        ShareActionProvider shareActionProvider;
        ActionProvider actionProvider = menuItem.getActionProvider();
        if (!(actionProvider instanceof ShareActionProvider)) {
            shareActionProvider = new ShareActionProvider(intentBuilder.getContext());
        } else {
            shareActionProvider = (ShareActionProvider) actionProvider;
        }
        shareActionProvider.setShareHistoryFileName(HISTORY_FILENAME_PREFIX + intentBuilder.getContext().getClass().getName());
        shareActionProvider.setShareIntent(intentBuilder.getIntent());
        menuItem.setActionProvider(shareActionProvider);
    }

    @Deprecated
    public static void configureMenuItem(Menu menu, int i2, IntentBuilder intentBuilder) {
        MenuItem menuItemFindItem = menu.findItem(i2);
        if (menuItemFindItem == null) {
            throw new IllegalArgumentException("Could not find menu item with id " + i2 + " in the supplied menu");
        }
        configureMenuItem(menuItemFindItem, intentBuilder);
    }

    public static class IntentBuilder {
        private ArrayList<String> mBccAddresses;
        private ArrayList<String> mCcAddresses;
        private CharSequence mChooserTitle;
        private final Context mContext;
        private final Intent mIntent;
        private ArrayList<Uri> mStreams;
        private ArrayList<String> mToAddresses;

        @Deprecated
        public static IntentBuilder from(Activity activity) {
            return new IntentBuilder(activity);
        }

        public IntentBuilder(Context context) throws Throwable {
            Activity activity;
            this.mContext = (Context) Preconditions.checkNotNull(context);
            Intent action = new Intent().setAction(Wg.vd("\u007f\u000e\u0001\u0010\n\u0005|G\u007f\u0006\tz\u0001\b>rq\u0004u|x9[NTK", (short) (C1607wl.Xd() ^ 13307)));
            this.mIntent = action;
            String strKd = Qg.kd("\\h]jf_Yl!U`bT\u001cN\\[\u0018.@;8&C&#-,(,$;+\u001b\u001c#\u0018\u001d\u001a", (short) (C1580rY.Xd() ^ (-4759)), (short) (C1580rY.Xd() ^ (-28892)));
            Object[] objArr = new Object[0];
            Method method = Class.forName(hg.Vd("BNCPLE?\b<GEJ:BG\u007f\u0014?=B2D?", (short) (OY.Xd() ^ 7389), (short) (OY.Xd() ^ 28964))).getMethod(C1561oA.ud("\u0003\u007f\u000ehxy\u0001uzw_q|s", (short) (C1633zX.Xd() ^ (-21688))), new Class[0]);
            try {
                method.setAccessible(true);
                action.putExtra(strKd, (String) method.invoke(context, objArr));
                short sXd = (short) (FB.Xd() ^ 14515);
                int[] iArr = new int["\u0012 \u0017&$\u001f\u001be,/+,,03m7up%56t\r!\u001e\u001d\r,\u0011\u0010\u001c\u001d\u001b!\u001b4&\u0018\u001b$\u001b\"!".length()];
                QB qb = new QB("\u0012 \u0017&$\u001f\u001be,/+,,03m7up%56t\r!\u001e\u001d\r,\u0011\u0010\u001c\u001d\u001b!\u001b4&\u0018\u001b$\u001b\"!");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Yd("CQHWUPL\u0017MZZaS]d\u001f5bbi[ol", (short) (C1633zX.Xd() ^ (-9281)))).getMethod(Xg.qd("QP`=OR[RYXBVc\\", (short) (C1580rY.Xd() ^ (-27776)), (short) (C1580rY.Xd() ^ (-30267))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    action.putExtra(str, (String) method2.invoke(context, objArr2));
                    action.addFlags(524288);
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            activity = null;
                            break;
                        } else {
                            if (context instanceof Activity) {
                                activity = (Activity) context;
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                    if (activity != null) {
                        ComponentName componentName = activity.getComponentName();
                        this.mIntent.putExtra(Jg.Wd("BwUJ1\u0015xt\u00132(\u0012l =2\u001bDD=#\fbg5\u001d\u0011x^M0/x% zpOC.", (short) (C1633zX.Xd() ^ (-17580)), (short) (C1633zX.Xd() ^ (-14092))), componentName);
                        this.mIntent.putExtra(ZO.xd("C\u0017\t\u001e\u0014{h\u0017<\u001a2\u0015rg\u000f+4}CO\u0003\u0012.f?I\u0014Ddx\u007f\u001am.\u000bR)CSeq:\u0005T\t", (short) (C1580rY.Xd() ^ (-28937)), (short) (C1580rY.Xd() ^ (-2220))), componentName);
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        public Intent getIntent() {
            ArrayList<String> arrayList = this.mToAddresses;
            if (arrayList != null) {
                combineArrayExtra("android.intent.extra.EMAIL", arrayList);
                this.mToAddresses = null;
            }
            ArrayList<String> arrayList2 = this.mCcAddresses;
            if (arrayList2 != null) {
                combineArrayExtra("android.intent.extra.CC", arrayList2);
                this.mCcAddresses = null;
            }
            ArrayList<String> arrayList3 = this.mBccAddresses;
            if (arrayList3 != null) {
                combineArrayExtra("android.intent.extra.BCC", arrayList3);
                this.mBccAddresses = null;
            }
            ArrayList<Uri> arrayList4 = this.mStreams;
            if (arrayList4 == null || arrayList4.size() <= 1) {
                this.mIntent.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.mStreams;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    this.mIntent.putExtra("android.intent.extra.STREAM", this.mStreams.get(0));
                    ShareCompat.migrateExtraStreamToClipData(this.mIntent, this.mStreams);
                } else {
                    this.mIntent.removeExtra("android.intent.extra.STREAM");
                    this.mIntent.setClipData(null);
                    Intent intent = this.mIntent;
                    int flags = intent.getFlags();
                    intent.setFlags((flags - 2) - (flags | (-2)));
                }
            } else {
                this.mIntent.setAction("android.intent.action.SEND_MULTIPLE");
                this.mIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", this.mStreams);
                ShareCompat.migrateExtraStreamToClipData(this.mIntent, this.mStreams);
            }
            return this.mIntent;
        }

        Context getContext() {
            return this.mContext;
        }

        private void combineArrayExtra(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.mIntent.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.mIntent.putExtra(str, strArr);
        }

        private void combineArrayExtra(String str, String[] strArr) {
            Intent intent = getIntent();
            String[] stringArrayExtra = intent.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[strArr.length + length];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            intent.putExtra(str, strArr2);
        }

        public Intent createChooserIntent() {
            return Intent.createChooser(getIntent(), this.mChooserTitle);
        }

        public void startChooser() throws Throwable {
            Context context = this.mContext;
            Intent intentCreateChooserIntent = createChooserIntent();
            Class<?> cls = Class.forName(EO.Od("e\u001b~t)p\u0010h]mfNjqs\u000fQ\u0014:8h3\u0019", (short) (FB.Xd() ^ 29687)));
            Class<?>[] clsArr = {Class.forName(C1561oA.Qd("\u0016\"\u0017$ \u0019\u0013[\u0010\u001b\u0019\u001e\u000e\u0016\u001bSm\u0012\u0017\u0007\u000f\u0014", (short) (Od.Xd() ^ (-28873))))};
            Object[] objArr = {intentCreateChooserIntent};
            short sXd = (short) (ZN.Xd() ^ 26328);
            short sXd2 = (short) (ZN.Xd() ^ 15409);
            int[] iArr = new int["\u0014\u0016\u0004\u0016\u0019f\n\u001c\u0012 \u0014 &".length()];
            QB qb = new QB("\u0014\u0016\u0004\u0016\u0019f\n\u001c\u0012 \u0014 &");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public IntentBuilder setChooserTitle(CharSequence charSequence) {
            this.mChooserTitle = charSequence;
            return this;
        }

        public IntentBuilder setChooserTitle(int i2) throws Throwable {
            Context context = this.mContext;
            Class<?> cls = Class.forName(C1626yg.Ud("@Y^\u0007EY\u000fTl\u0019TwU0+!\u001eNBAl0`", (short) (Od.Xd() ^ (-5754)), (short) (Od.Xd() ^ (-15417))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            Method method = cls.getMethod(Ig.wd("w%f^\u0010}M", (short) (C1633zX.Xd() ^ (-22945))), clsArr);
            try {
                method.setAccessible(true);
                return setChooserTitle((CharSequence) method.invoke(context, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public IntentBuilder setType(String str) {
            this.mIntent.setType(str);
            return this;
        }

        public IntentBuilder setText(CharSequence charSequence) {
            this.mIntent.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        public IntentBuilder setHtmlText(String str) {
            this.mIntent.putExtra(IntentCompat.EXTRA_HTML_TEXT, str);
            if (!this.mIntent.hasExtra("android.intent.extra.TEXT")) {
                setText(Html.fromHtml(str));
            }
            return this;
        }

        public IntentBuilder setStream(Uri uri) {
            this.mStreams = null;
            if (uri != null) {
                addStream(uri);
            }
            return this;
        }

        public IntentBuilder addStream(Uri uri) {
            if (this.mStreams == null) {
                this.mStreams = new ArrayList<>();
            }
            this.mStreams.add(uri);
            return this;
        }

        public IntentBuilder setEmailTo(String[] strArr) {
            if (this.mToAddresses != null) {
                this.mToAddresses = null;
            }
            this.mIntent.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        public IntentBuilder addEmailTo(String str) {
            if (this.mToAddresses == null) {
                this.mToAddresses = new ArrayList<>();
            }
            this.mToAddresses.add(str);
            return this;
        }

        public IntentBuilder addEmailTo(String[] strArr) {
            combineArrayExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        public IntentBuilder setEmailCc(String[] strArr) {
            this.mIntent.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        public IntentBuilder addEmailCc(String str) {
            if (this.mCcAddresses == null) {
                this.mCcAddresses = new ArrayList<>();
            }
            this.mCcAddresses.add(str);
            return this;
        }

        public IntentBuilder addEmailCc(String[] strArr) {
            combineArrayExtra("android.intent.extra.CC", strArr);
            return this;
        }

        public IntentBuilder setEmailBcc(String[] strArr) {
            this.mIntent.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        public IntentBuilder addEmailBcc(String str) {
            if (this.mBccAddresses == null) {
                this.mBccAddresses = new ArrayList<>();
            }
            this.mBccAddresses.add(str);
            return this;
        }

        public IntentBuilder addEmailBcc(String[] strArr) {
            combineArrayExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        public IntentBuilder setSubject(String str) {
            this.mIntent.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }
    }

    public static class IntentReader {
        private static final String TAG = "IntentReader";
        private final ComponentName mCallingActivity;
        private final String mCallingPackage;
        private final Context mContext;
        private final Intent mIntent;
        private ArrayList<Uri> mStreams;

        @Deprecated
        public static IntentReader from(Activity activity) {
            return new IntentReader(activity);
        }

        public IntentReader(Activity activity) {
            this((Context) Preconditions.checkNotNull(activity), activity.getIntent());
        }

        public IntentReader(Context context, Intent intent) {
            this.mContext = (Context) Preconditions.checkNotNull(context);
            this.mIntent = (Intent) Preconditions.checkNotNull(intent);
            this.mCallingPackage = ShareCompat.getCallingPackage(intent);
            this.mCallingActivity = ShareCompat.getCallingActivity(intent);
        }

        public boolean isShareIntent() {
            String action = this.mIntent.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        public boolean isSingleShare() {
            return "android.intent.action.SEND".equals(this.mIntent.getAction());
        }

        public boolean isMultipleShare() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.mIntent.getAction());
        }

        public String getType() {
            return this.mIntent.getType();
        }

        public CharSequence getText() {
            return this.mIntent.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        public String getHtmlText() {
            String stringExtra = this.mIntent.getStringExtra(IntentCompat.EXTRA_HTML_TEXT);
            if (stringExtra == null) {
                CharSequence text = getText();
                if (text instanceof Spanned) {
                    return Html.toHtml((Spanned) text);
                }
                return text != null ? Html.escapeHtml(text) : stringExtra;
            }
            return stringExtra;
        }

        public Uri getStream() {
            return (Uri) this.mIntent.getParcelableExtra("android.intent.extra.STREAM");
        }

        public Uri getStream(int i2) {
            if (this.mStreams == null && isMultipleShare()) {
                this.mStreams = this.mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.mStreams;
            if (arrayList != null) {
                return arrayList.get(i2);
            }
            if (i2 == 0) {
                return (Uri) this.mIntent.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new IndexOutOfBoundsException("Stream items available: " + getStreamCount() + " index requested: " + i2);
        }

        public int getStreamCount() {
            if (this.mStreams == null && isMultipleShare()) {
                this.mStreams = this.mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.mStreams;
            if (arrayList != null) {
                return arrayList.size();
            }
            return this.mIntent.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        public String[] getEmailTo() {
            return this.mIntent.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        public String[] getEmailCc() {
            return this.mIntent.getStringArrayExtra("android.intent.extra.CC");
        }

        public String[] getEmailBcc() {
            return this.mIntent.getStringArrayExtra("android.intent.extra.BCC");
        }

        public String getSubject() {
            return this.mIntent.getStringExtra("android.intent.extra.SUBJECT");
        }

        public String getCallingPackage() {
            return this.mCallingPackage;
        }

        public ComponentName getCallingActivity() {
            return this.mCallingActivity;
        }

        public Drawable getCallingActivityIcon() throws Throwable {
            if (this.mCallingActivity == null) {
                return null;
            }
            Context context = this.mContext;
            short sXd = (short) (FB.Xd() ^ 5830);
            int[] iArr = new int["\f\u0018\r\u001a\u0016\u000f\tQ\u0006\u0011\u000f\u0014\u0004\f\u0011I]\t\u0007\f{\u000e\t".length()];
            QB qb = new QB("\f\u0018\r\u001a\u0016\u000f\tQ\u0006\u0011\u000f\u0014\u0004\f\u0011I]\t\u0007\f{\u000e\t");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Kd("_^nK]`i`gfOdrfmlz", (short) (C1607wl.Xd() ^ 14591)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                try {
                    ComponentName componentName = this.mCallingActivity;
                    Class<?> cls = Class.forName(Wg.Zd("4\"Z7vB@XP\u001c_t(\u0001IS\u0019txa?H\u001cX)_\u0013.\u0006?\u0013Wo", (short) (C1580rY.Xd() ^ (-9688)), (short) (C1580rY.Xd() ^ (-26386))));
                    Class<?>[] clsArr = new Class[1];
                    short sXd2 = (short) (OY.Xd() ^ 11803);
                    int[] iArr2 = new int["#1(750,v-::A3=D~\u0015BAEEE=GN)=JC".length()];
                    QB qb2 = new QB("#1(750,v-::A3=D~\u0015BAEEE=GN)=JC");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
                        i3++;
                    }
                    clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                    Object[] objArr2 = {componentName};
                    Method method2 = cls.getMethod(Wg.vd("?>J\u00187I;IIUW(?LH", (short) (OY.Xd() ^ 28209)), clsArr);
                    try {
                        method2.setAccessible(true);
                        return (Drawable) method2.invoke(packageManager, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    short sXd3 = (short) (C1607wl.Xd() ^ 14095);
                    short sXd4 = (short) (C1607wl.Xd() ^ 14052);
                    int[] iArr3 = new int["3W\\LTY6HCEEQ".length()];
                    QB qb3 = new QB("3W\\LTY6HCEEQ");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(((sXd3 + i4) + xuXd3.CK(iKK3)) - sXd4);
                        i4++;
                    }
                    new String(iArr3, 0, i4);
                    hg.Vd("c\u000f\u0014\n\u0001;\t\t\r7\tz\t\u0006{v\u0007t.vozx)nvx%gdnmime\u001d]^nbn`jn", (short) (C1607wl.Xd() ^ 21951), (short) (C1607wl.Xd() ^ 2284));
                    return null;
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }

        public Drawable getCallingApplicationIcon() throws Throwable {
            if (this.mCallingPackage == null) {
                return null;
            }
            Context context = this.mContext;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.ud("0<1>:3-u*538(05m\u0002-+0 2-", (short) (OY.Xd() ^ 15915))).getMethod(C1561oA.yd("<9K&:;F;41\u001c/?1:77", (short) (C1580rY.Xd() ^ (-2440))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                try {
                    String str = this.mCallingPackage;
                    Class<?> cls = Class.forName(C1561oA.Yd("\u001e,#20+'q(55<.8?y=;| 25>5<;$9G;BAO", (short) (FB.Xd() ^ 23582)));
                    Class<?>[] clsArr = new Class[1];
                    clsArr[0] = Class.forName(Xg.qd("\u001a\u0012(\u0014a!\u0017%\u001ff\r/.&,&", (short) (Od.Xd() ^ (-3623)), (short) (Od.Xd() ^ (-22149))));
                    Object[] objArr2 = {str};
                    Method method2 = cls.getMethod(Jg.Wd("4/yI\u0013HAz\u0018\u0011VFk-\u0005Pxz", (short) (C1580rY.Xd() ^ (-10576)), (short) (C1580rY.Xd() ^ (-18635))), clsArr);
                    try {
                        method2.setAccessible(true);
                        return (Drawable) method2.invoke(packageManager, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    ZO.xd("5kG%*\u0019.RSZC=", (short) (C1633zX.Xd() ^ (-12811)), (short) (C1633zX.Xd() ^ (-26629)));
                    C1626yg.Ud(",.JB\u0019\u000b4(Pqe\u007f 1\u0002\u0015mZ9p\u0005\u001fea\u0016\u001f:l'/o97<1\nwM\u0006\u0005dkUWF3\\", (short) (C1633zX.Xd() ^ (-15534)), (short) (C1633zX.Xd() ^ (-20678)));
                    return null;
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }

        public CharSequence getCallingApplicationLabel() throws Throwable {
            if (this.mCallingPackage == null) {
                return null;
            }
            Context context = this.mContext;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Ig.wd("j!\u0007{'D!XC\u0005\u007f*HQU2n/c_\u0016f\u000b", (short) (C1607wl.Xd() ^ 30177))).getMethod(EO.Od("O\u001dm/B\u001a4K\u0015dD<\u0019\u0010sY<", (short) (FB.Xd() ^ 26956)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                try {
                    String str = this.mCallingPackage;
                    short sXd = (short) (C1633zX.Xd() ^ (-29264));
                    int[] iArr = new int["htivrke.bmkp`hm&gc#DTU\\QVS:MYKPMY".length()];
                    QB qb = new QB("htivrke.bmkp`hm&gc#DTU\\QVS:MYKPMY");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    Class<?> cls = Class.forName(new String(iArr, 0, i2));
                    Class<?>[] clsArr = new Class[2];
                    short sXd2 = (short) (FB.Xd() ^ 22307);
                    short sXd3 = (short) (FB.Xd() ^ 4826);
                    int[] iArr2 = new int["RJ`L\u001aYO]W\u001fEgf^d^".length()];
                    QB qb2 = new QB("RJ`L\u001aYO]W\u001fEgf^d^");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
                        i3++;
                    }
                    clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr2 = {str, 0};
                    Method method2 = cls.getMethod(C1561oA.od("mjxDrqlha^pdigAe\\d", (short) (C1607wl.Xd() ^ 6461)), clsArr);
                    try {
                        method2.setAccessible(true);
                        ApplicationInfo applicationInfo = (ApplicationInfo) method2.invoke(packageManager, objArr2);
                        Class<?> cls2 = Class.forName(C1561oA.Kd("Yg^mkfb-cppwisz5xv8[mpypwv_t\u0003v}|\u000b", (short) (OY.Xd() ^ 31357)));
                        Class<?>[] clsArr2 = new Class[1];
                        clsArr2[0] = Class.forName(Wg.Zd("!?\u0004\u0014_i%\u000f\u0015!n6v`fnC~O3rC~KV\u0014\b|Qb{1\nR", (short) (Od.Xd() ^ (-22643)), (short) (Od.Xd() ^ (-3320))));
                        Object[] objArr3 = {applicationInfo};
                        Method method3 = cls2.getMethod(C1561oA.Xd("87G\u0015EFCA<;OELL+ACGO", (short) (Od.Xd() ^ (-22978))), clsArr2);
                        try {
                            method3.setAccessible(true);
                            return (CharSequence) method3.invoke(packageManager, objArr3);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (PackageManager.NameNotFoundException e4) {
                    short sXd4 = (short) (C1499aX.Xd() ^ (-3913));
                    int[] iArr3 = new int["\u001cBI;=D#7<@BP".length()];
                    QB qb3 = new QB("\u001cBI;=D#7<@BP");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK((sXd4 ^ i4) + xuXd3.CK(iKK3));
                        i4++;
                    }
                    new String(iArr3, 0, i4);
                    short sXd5 = (short) (Od.Xd() ^ (-16484));
                    short sXd6 = (short) (Od.Xd() ^ (-21600));
                    int[] iArr4 = new int["\u0018CH>5o==Ak=/=:0+;)b.\"\"$*\\\"*,X\u001b\u0018\"!\u001d!\u0019P\u0011\u001f\u001e\u0019\u0015\u000e\u000b\u001d\u0011\u0016\u0014".length()];
                    QB qb4 = new QB("\u0018CH>5o==Ak=/=:0+;)b.\"\"$*\\\"*,X\u001b\u0018\"!\u001d!\u0019P\u0011\u001f\u001e\u0019\u0015\u000e\u000b\u001d\u0011\u0016\u0014");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(((sXd5 + i5) + xuXd4.CK(iKK4)) - sXd6);
                        i5++;
                    }
                    new String(iArr4, 0, i5);
                    return null;
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
    }

    static void migrateExtraStreamToClipData(Intent intent, ArrayList<Uri> arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra(IntentCompat.EXTRA_HTML_TEXT), null, arrayList.get(0)));
        int size = arrayList.size();
        for (int i2 = 1; i2 < size; i2++) {
            clipData.addItem(new ClipData.Item(arrayList.get(i2)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }
}
