package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.core.content.ContextCompat;
import androidx.cursoradapter.widget.ResourceCursorAdapter;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.WeakHashMap;
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

/* JADX INFO: loaded from: classes.dex */
class SuggestionsAdapter extends ResourceCursorAdapter implements View.OnClickListener {
    private static final boolean DBG = false;
    static final int INVALID_INDEX = -1;
    private static final String LOG_TAG = "SuggestionsAdapter";
    private static final int QUERY_LIMIT = 50;
    static final int REFINE_ALL = 2;
    static final int REFINE_BY_ENTRY = 1;
    static final int REFINE_NONE = 0;
    private boolean mClosed;
    private final int mCommitIconResId;
    private int mFlagsCol;
    private int mIconName1Col;
    private int mIconName2Col;
    private final WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache;
    private final Context mProviderContext;
    private int mQueryRefinement;
    private final SearchView mSearchView;
    private final SearchableInfo mSearchable;
    private int mText1Col;
    private int mText2Col;
    private int mText2UrlCol;
    private ColorStateList mUrlColor;

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public SuggestionsAdapter(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.mClosed = false;
        this.mQueryRefinement = 1;
        this.mText1Col = -1;
        this.mText2Col = -1;
        this.mText2UrlCol = -1;
        this.mIconName1Col = -1;
        this.mIconName2Col = -1;
        this.mFlagsCol = -1;
        this.mSearchView = searchView;
        this.mSearchable = searchableInfo;
        this.mCommitIconResId = searchView.getSuggestionCommitIconResId();
        this.mProviderContext = context;
        this.mOutsideDrawablesCache = weakHashMap;
    }

    public void setQueryRefinement(int i2) {
        this.mQueryRefinement = i2;
    }

    public int getQueryRefinement() {
        return this.mQueryRefinement;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) throws Throwable {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.mSearchView.getVisibility() == 0 && this.mSearchView.getWindowVisibility() == 0) {
            try {
                Cursor searchManagerSuggestions = getSearchManagerSuggestions(this.mSearchable, string, 50);
                if (searchManagerSuggestions != null) {
                    searchManagerSuggestions.getCount();
                    return searchManagerSuggestions;
                }
            } catch (RuntimeException e2) {
            }
        }
        return null;
    }

    public void close() {
        changeCursor(null);
        this.mClosed = true;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        updateSpinnerState(getCursor());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        updateSpinnerState(getCursor());
    }

    private void updateSpinnerState(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public void changeCursor(Cursor cursor) {
        if (this.mClosed) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.mText1Col = cursor.getColumnIndex("suggest_text_1");
                this.mText2Col = cursor.getColumnIndex("suggest_text_2");
                this.mText2UrlCol = cursor.getColumnIndex("suggest_text_2_url");
                this.mIconName1Col = cursor.getColumnIndex("suggest_icon_1");
                this.mIconName2Col = cursor.getColumnIndex("suggest_icon_2");
                this.mFlagsCol = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
        }
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewNewView = super.newView(context, cursor, viewGroup);
        viewNewView.setTag(new ChildViewCache(viewNewView));
        ((ImageView) viewNewView.findViewById(R.id.edit_query)).setImageResource(this.mCommitIconResId);
        return viewNewView;
    }

    private static final class ChildViewCache {
        public final ImageView mIcon1;
        public final ImageView mIcon2;
        public final ImageView mIconRefine;
        public final TextView mText1;
        public final TextView mText2;

        public ChildViewCache(View view) {
            this.mText1 = (TextView) view.findViewById(android.R.id.text1);
            this.mText2 = (TextView) view.findViewById(android.R.id.text2);
            this.mIcon1 = (ImageView) view.findViewById(android.R.id.icon1);
            this.mIcon2 = (ImageView) view.findViewById(android.R.id.icon2);
            this.mIconRefine = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) throws Throwable {
        CharSequence stringOrNull;
        ChildViewCache childViewCache = (ChildViewCache) view.getTag();
        int i2 = this.mFlagsCol;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        if (childViewCache.mText1 != null) {
            setViewText(childViewCache.mText1, getStringOrNull(cursor, this.mText1Col));
        }
        if (childViewCache.mText2 != null) {
            String stringOrNull2 = getStringOrNull(cursor, this.mText2UrlCol);
            if (stringOrNull2 != null) {
                stringOrNull = formatUrl(stringOrNull2);
            } else {
                stringOrNull = getStringOrNull(cursor, this.mText2Col);
            }
            if (TextUtils.isEmpty(stringOrNull)) {
                if (childViewCache.mText1 != null) {
                    childViewCache.mText1.setSingleLine(false);
                    childViewCache.mText1.setMaxLines(2);
                }
            } else if (childViewCache.mText1 != null) {
                childViewCache.mText1.setSingleLine(true);
                childViewCache.mText1.setMaxLines(1);
            }
            setViewText(childViewCache.mText2, stringOrNull);
        }
        if (childViewCache.mIcon1 != null) {
            setViewDrawable(childViewCache.mIcon1, getIcon1(cursor), 4);
        }
        if (childViewCache.mIcon2 != null) {
            setViewDrawable(childViewCache.mIcon2, getIcon2(cursor), 8);
        }
        int i4 = this.mQueryRefinement;
        if (i4 == 2 || (i4 == 1 && (-1) - (((-1) - i3) | ((-1) - 1)) != 0)) {
            childViewCache.mIconRefine.setVisibility(0);
            childViewCache.mIconRefine.setTag(childViewCache.mText1.getText());
            childViewCache.mIconRefine.setOnClickListener(this);
            return;
        }
        childViewCache.mIconRefine.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Callback.onClick_enter(view);
        try {
            Object tag = view.getTag();
            if (tag instanceof CharSequence) {
                this.mSearchView.onQueryRefine((CharSequence) tag);
            }
        } finally {
            Callback.onClick_exit();
        }
    }

    private CharSequence formatUrl(CharSequence charSequence) throws Throwable {
        if (this.mUrlColor == null) {
            TypedValue typedValue = new TypedValue();
            Context context = this.mProviderContext;
            short sXd = (short) (ZN.Xd() ^ 3144);
            int[] iArr = new int["<JAPNIE\u0010FSSZLV]\u0018.[[bThe".length()];
            QB qb = new QB("<JAPNIE\u0010FSSZLV]\u0018.[[bThe");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd2 = (short) (FB.Xd() ^ 30744);
            short sXd3 = (short) (FB.Xd() ^ 31626);
            int[] iArr2 = new int["^]mNcajc".length()];
            QB qb2 = new QB("^]mNcajc");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                ((Resources.Theme) method.invoke(context, objArr)).resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                Context context2 = this.mProviderContext;
                Class<?> cls2 = Class.forName(Jg.Wd("3=u(#9vh\u001bU\u0015|.Y ;\u0012jg\u0016Ixr", (short) (C1499aX.Xd() ^ (-15370)), (short) (C1499aX.Xd() ^ (-15557))));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd4 = (short) (OY.Xd() ^ 19382);
                short sXd5 = (short) (OY.Xd() ^ 10458);
                int[] iArr3 = new int["Ml!\r{l*8oS*k".length()];
                QB qb3 = new QB("Ml!\r{l*8oS*k");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd5) + sXd4)));
                    i4++;
                }
                Method method2 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                try {
                    method2.setAccessible(true);
                    this.mUrlColor = ((Resources) method2.invoke(context2, objArr2)).getColorStateList(typedValue.resourceId);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.mUrlColor, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private void setViewText(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private Drawable getIcon1(Cursor cursor) throws Throwable {
        int i2 = this.mIconName1Col;
        if (i2 == -1) {
            return null;
        }
        Drawable drawableFromResourceValue = getDrawableFromResourceValue(cursor.getString(i2));
        return drawableFromResourceValue != null ? drawableFromResourceValue : getDefaultIcon1();
    }

    private Drawable getIcon2(Cursor cursor) {
        int i2 = this.mIconName2Col;
        if (i2 == -1) {
            return null;
        }
        return getDrawableFromResourceValue(cursor.getString(i2));
    }

    private void setViewDrawable(ImageView imageView, Drawable drawable, int i2) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i2);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public CharSequence convertToString(Cursor cursor) {
        String columnString;
        String columnString2;
        if (cursor == null) {
            return null;
        }
        String columnString3 = getColumnString(cursor, "suggest_intent_query");
        if (columnString3 != null) {
            return columnString3;
        }
        if (this.mSearchable.shouldRewriteQueryFromData() && (columnString2 = getColumnString(cursor, "suggest_intent_data")) != null) {
            return columnString2;
        }
        if (!this.mSearchable.shouldRewriteQueryFromText() || (columnString = getColumnString(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return columnString;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            View viewNewView = newView(this.mProviderContext, getCursor(), viewGroup);
            if (viewNewView != null) {
                ((ChildViewCache) viewNewView.getTag()).mText1.setText(e2.toString());
            }
            return viewNewView;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            View viewNewDropDownView = newDropDownView(this.mProviderContext, getCursor(), viewGroup);
            if (viewNewDropDownView != null) {
                ((ChildViewCache) viewNewDropDownView.getTag()).mText1.setText(e2.toString());
            }
            return viewNewDropDownView;
        }
    }

    private Drawable getDrawableFromResourceValue(String str) throws Throwable {
        String strVd = Wg.vd("!/&5+&\"l*\u001e-*)'\u0019\u001c\n\u007f\u0001", (short) (ZN.Xd() ^ 6275));
        if (str == null || str.isEmpty() || Qg.kd(Global.HYPHEN, (short) (ZN.Xd() ^ 31908), (short) (ZN.Xd() ^ 24934)).equals(str)) {
            return null;
        }
        try {
            int i2 = Integer.parseInt(str);
            StringBuilder sb = new StringBuilder(strVd);
            Context context = this.mProviderContext;
            short sXd = (short) (Od.Xd() ^ (-28735));
            short sXd2 = (short) (Od.Xd() ^ (-1075));
            int[] iArr = new int["\u001d)\u001e+' \u001ab\u0017\" %\u0015\u001d\"Zn\u001a\u0018\u001d\r\u001f\u001a".length()];
            QB qb = new QB("\u001d)\u001e+' \u001ab\u0017\" %\u0015\u001d\"Zn\u001a\u0018\u001d\r\u001f\u001a");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK) + sXd2);
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i3));
            Object[] objArr = new Object[0];
            Method method = cls.getMethod(C1561oA.ud(".+9\u0014$%,!&#\u000b\u001d(\u001f", (short) (Od.Xd() ^ (-22906))), new Class[0]);
            try {
                method.setAccessible(true);
                String string = sb.append((String) method.invoke(context, objArr)).append(C1561oA.yd("~", (short) (C1580rY.Xd() ^ (-21085)))).append(i2).toString();
                Drawable drawableCheckIconCache = checkIconCache(string);
                if (drawableCheckIconCache != null) {
                    return drawableCheckIconCache;
                }
                Drawable drawable = ContextCompat.getDrawable(this.mProviderContext, i2);
                storeInIconCache(string, drawable);
                return drawable;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Resources.NotFoundException unused) {
            short sXd3 = (short) (C1633zX.Xd() ^ (-11330));
            int[] iArr2 = new int["^y\u0007\u00079\r\u0001\u0010\r\u0014\u0012\u0004\u0007B\u0012\u0014\u001aF\u000e\u0018\u001f\u0019\u0010fM".length()];
            QB qb2 = new QB("^y\u0007\u00079\r\u0001\u0010\r\u0014\u0012\u0004\u0007B\u0012\u0014\u001aF\u000e\u0018\u001f\u0019\u0010fM");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd3 + sXd3) + sXd3) + i4));
                i4++;
            }
            String str2 = new String(iArr2, 0, i4) + str;
            Xg.qd("\u0005(\u001b\u001c\u001b*,\"))/}\" 05'5", (short) (C1633zX.Xd() ^ (-20252)), (short) (C1633zX.Xd() ^ (-21457)));
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableCheckIconCache2 = checkIconCache(str);
            if (drawableCheckIconCache2 != null) {
                return drawableCheckIconCache2;
            }
            Drawable drawable2 = getDrawable(Uri.parse(str));
            storeInIconCache(str, drawable2);
            return drawable2;
        }
    }

    private Drawable getDrawable(Uri uri) throws Throwable {
        C1626yg.Ud("j\u000e\u007flScDgA3f\u0006\u0006\"[3h\u0011", (short) (OY.Xd() ^ 7142), (short) (OY.Xd() ^ 6247));
        short sXd = (short) (C1607wl.Xd() ^ 9725);
        int[] iArr = new int["YZ*\u000e\u0017~\\\u001cK60\u0011V\u00176\robjT\u0012n13\u0018\u0005f\u001f^\u0017".length()];
        QB qb = new QB("YZ*\u000e\u0017~\\\u001cK60\u0011V\u00176\robjT\u0012n13\u0018\u0005f\u001f^\u0017");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        short sXd2 = (short) (ZN.Xd() ^ 19965);
        int[] iArr2 = new int["\\H$\u0001\u000b7\u0001'm+z\u001c`e\u001d".length()];
        QB qb2 = new QB("\\H$\u0001\u000b7\u0001'm+z\u001c`e\u001d");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i3)) + xuXd2.CK(iKK2));
            i3++;
        }
        String str2 = new String(iArr2, 0, i3);
        short sXd3 = (short) (C1607wl.Xd() ^ 4550);
        int[] iArr3 = new int["q\u0004\u0011\f\u0011\r|}7z\u0005y\u00072\u007f\u007f\u0004.r\u0005t}}B'".length()];
        QB qb3 = new QB("q\u0004\u0011\f\u0011\r|}7z\u0005y\u00072\u007f\u007f\u0004.r\u0005t}}B'");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(sXd3 + sXd3 + sXd3 + i4 + xuXd3.CK(iKK3));
            i4++;
        }
        String str3 = new String(iArr3, 0, i4);
        try {
            String scheme = uri.getScheme();
            short sXd4 = (short) (C1633zX.Xd() ^ (-4527));
            short sXd5 = (short) (C1633zX.Xd() ^ (-7518));
            int[] iArr4 = new int["FTKZXSO\u001a_Sb_fdVY".length()];
            QB qb4 = new QB("FTKZXSO\u001a_Sb_fdVY");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd4 + i5)) - sXd5);
                i5++;
            }
            if (new String(iArr4, 0, i5).equals(scheme)) {
                try {
                    return getDrawableFromResourceUri(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException(str3 + uri);
                }
            }
            Context context = this.mProviderContext;
            Class<?> cls = Class.forName(C1561oA.od("NZO\\XQK\u0014HSQVFNS\f KIN>PK", (short) (C1607wl.Xd() ^ 31016)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd6 = (short) (C1607wl.Xd() ^ 21394);
            int[] iArr5 = new int["zy\nY\u0007\u0007\u000e\u007f\n\u0011o\u0004\u0013\u0010\u000e\u0019\t\u0017".length()];
            QB qb5 = new QB("zy\nY\u0007\u0007\u000e\u007f\n\u0011o\u0004\u0013\u0010\u000e\u0019\t\u0017");
            int i6 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - ((sXd6 + sXd6) + i6));
                i6++;
            }
            Method method = cls.getMethod(new String(iArr5, 0, i6), clsArr);
            try {
                method.setAccessible(true);
                InputStream inputStreamOpenInputStream = ((ContentResolver) method.invoke(context, objArr)).openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    throw new FileNotFoundException(str2 + uri);
                }
                try {
                    return Drawable.createFromStream(inputStreamOpenInputStream, null);
                } finally {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException e2) {
                        String str4 = str + uri;
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (FileNotFoundException e4) {
            String str5 = Wg.Zd("AS'MFL5\u0002TR#\u0011Q~{)", (short) (Od.Xd() ^ (-25667)), (short) (Od.Xd() ^ (-13357))) + uri + C1561oA.Xd("nc", (short) (C1607wl.Xd() ^ 22370)) + e4.getMessage();
            return null;
        }
        String str52 = Wg.Zd("AS'MFL5\u0002TR#\u0011Q~{)", (short) (Od.Xd() ^ (-25667)), (short) (Od.Xd() ^ (-13357))) + uri + C1561oA.Xd("nc", (short) (C1607wl.Xd() ^ 22370)) + e4.getMessage();
        return null;
    }

    private Drawable checkIconCache(String str) {
        Drawable.ConstantState constantState = this.mOutsideDrawablesCache.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private void storeInIconCache(String str, Drawable drawable) {
        if (drawable != null) {
            this.mOutsideDrawablesCache.put(str, drawable.getConstantState());
        }
    }

    private Drawable getDefaultIcon1() throws Throwable {
        Drawable activityIconWithCache = getActivityIconWithCache(this.mSearchable.getSearchActivity());
        if (activityIconWithCache != null) {
            return activityIconWithCache;
        }
        Context context = this.mProviderContext;
        Class<?> cls = Class.forName(C1561oA.Yd("O]Tca\\X#Yffm_ip+Annug{x", (short) (C1580rY.Xd() ^ (-20059))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1580rY.Xd() ^ (-4348));
        short sXd2 = (short) (C1580rY.Xd() ^ (-1386));
        int[] iArr = new int["<;K(:=F=DC,AOCJIW".length()];
        QB qb = new QB("<;K(:=F=DC,AOCJIW");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Jg.Wd("\u0011P7gi\u000eq\u0018mp,YzbO3j\u001aK\u0010\u0006taX|o6jp\u001c\r7W", (short) (C1499aX.Xd() ^ (-11659)), (short) (C1499aX.Xd() ^ (-11857)))).getMethod(ZO.xd("5\u0017\u001eYw?7>{J\u0019S\f\u0010h6{k\u000e\\^\u0012", (short) (C1633zX.Xd() ^ (-3279)), (short) (C1633zX.Xd() ^ (-1633))), new Class[0]);
            try {
                method2.setAccessible(true);
                return (Drawable) method2.invoke(packageManager, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private Drawable getActivityIconWithCache(ComponentName componentName) throws Throwable {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (this.mOutsideDrawablesCache.containsKey(strFlattenToShortString)) {
            Drawable.ConstantState constantState = this.mOutsideDrawablesCache.get(strFlattenToShortString);
            if (constantState == null) {
                return null;
            }
            Context context = this.mProviderContext;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.ud("?K@MIB<\u00059DBG7?D|\u0011<:?/A<", (short) (C1499aX.Xd() ^ (-25221)))).getMethod(C1561oA.yd(">;M*8EDIQAFS", (short) (ZN.Xd() ^ 3717)), new Class[0]);
            try {
                method.setAccessible(true);
                return constantState.newDrawable((Resources) method.invoke(context, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Drawable activityIcon = getActivityIcon(componentName);
        this.mOutsideDrawablesCache.put(strFlattenToShortString, activityIcon != null ? activityIcon.getConstantState() : null);
        return activityIcon;
    }

    private Drawable getActivityIcon(ComponentName componentName) throws Throwable {
        C1626yg.Ud("\u0013fS-`\u00125a-zN\u0016-\u000evO!\u0013", (short) (C1607wl.Xd() ^ 679), (short) (C1607wl.Xd() ^ 6204));
        Context context = this.mProviderContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("F\u001a\"OD\nh\u0002\u0011\u0018\u0015A\b\u000b\u001d{Tb9\u0007a\u001c\u0006", (short) (C1499aX.Xd() ^ (-11488)))).getMethod(EO.Od(",TQ\u0012Z9YoD\u0003d^67\u0019yC", (short) (C1499aX.Xd() ^ (-22900))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            try {
                Class<?> cls = Class.forName(C1561oA.Qd("T`Ub^WQ\u001aNYW\\LTY\u0012SO\u000f0@AH=B?&9E7<9E", (short) (Od.Xd() ^ (-2995))));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(C1593ug.zd("\u0017%\u001c+)$ j!..5'18r\t659991;B\u001d1>7", (short) (C1499aX.Xd() ^ (-11552)), (short) (C1499aX.Xd() ^ (-23821))));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {componentName, 128};
                Method method2 = cls.getMethod(C1561oA.od("zw\u0006Qr\u0003v\u0003t~\u0003Qult", (short) (C1633zX.Xd() ^ (-4979))), clsArr);
                try {
                    method2.setAccessible(true);
                    ActivityInfo activityInfo = (ActivityInfo) method2.invoke(packageManager, objArr2);
                    int iconResource = activityInfo.getIconResource();
                    if (iconResource == 0) {
                        return null;
                    }
                    String packageName = componentName.getPackageName();
                    ApplicationInfo applicationInfo = activityInfo.applicationInfo;
                    Class<?> cls2 = Class.forName(C1561oA.Kd("u\u0004z\n\b\u0003~I\u007f\r\r\u0014\u0006\u0010\u0017Q\u0015\u0013Tw\n\r\u0016\r\u0014\u0013{\u0011\u001f\u0013\u001a\u0019'", (short) (C1607wl.Xd() ^ 5797)));
                    Class<?>[] clsArr2 = {Class.forName(Wg.Zd("15cjP+9btG\u0006CZm\f!", (short) (OY.Xd() ^ 18640), (short) (OY.Xd() ^ 19063))), Integer.TYPE, Class.forName(C1561oA.Xd("&4+:83/y0==D6@G\u0002EC\u0005\u0019IJGE@?SIPP,RKU", (short) (FB.Xd() ^ 32402)))};
                    Object[] objArr3 = {packageName, Integer.valueOf(iconResource), applicationInfo};
                    Method method3 = cls2.getMethod(Wg.vd("sp\u0003Qzh\u0002jfok", (short) (C1633zX.Xd() ^ (-27863))), clsArr2);
                    try {
                        method3.setAccessible(true);
                        Drawable drawable = (Drawable) method3.invoke(packageManager, objArr3);
                        if (drawable != null) {
                            return drawable;
                        }
                        String str = Qg.kd("]\u0002\tr|xr-unyw(ykxsxtde\u001f", (short) (C1607wl.Xd() ^ 6140), (short) (C1607wl.Xd() ^ 15416)) + iconResource + hg.Vd("\u0007LTV\u0003", (short) (C1580rY.Xd() ^ (-25363)), (short) (C1580rY.Xd() ^ (-18558))) + componentName.flattenToShortString();
                        return null;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (PackageManager.NameNotFoundException e4) {
                e4.toString();
                return null;
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    public static String getColumnString(Cursor cursor, String str) {
        return getStringOrNull(cursor, cursor.getColumnIndex(str));
    }

    private static String getStringOrNull(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            return null;
        }
    }

    Drawable getDrawableFromResourceUri(Uri uri) throws Throwable {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(C1561oA.Xd("'Iz=RRGOSKW]\u001f\u0006", (short) (ZN.Xd() ^ 31677)) + uri);
        }
        try {
            Context context = this.mProviderContext;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Jg.Wd("D|.(\u007fUk\u007f1\tR\u0004PD\u0006\u001bjb=\u000fj)`", (short) (C1633zX.Xd() ^ (-28672)), (short) (C1633zX.Xd() ^ (-22753)))).getMethod(ZO.xd("\u0011`\t\u0002x1\u0010iA\u0002+bA; \f ", (short) (FB.Xd() ^ 16634), (short) (FB.Xd() ^ 24338)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Class<?> cls = Class.forName(C1626yg.Ud("\u0016&l]wfxy\u001cRL7\u0015S)\u007fhmg\r#\rf4u\u0005\u0011\u001b\u0016VH \u000b", (short) (C1499aX.Xd() ^ (-16780)), (short) (C1499aX.Xd() ^ (-14132))));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(Ig.wd("\u0002*k|WhO\u000b8q\u0017\u0018FA`:", (short) (OY.Xd() ^ 14066)));
                Object[] objArr2 = {authority};
                Method method2 = cls.getMethod(EO.Od("M\u0011o/<w\u001aQ.<:l\u000b41# \u0010UL\u0006Y\u0019\u00149N", (short) (FB.Xd() ^ 12095)), clsArr);
                try {
                    method2.setAccessible(true);
                    Resources resources = (Resources) method2.invoke(packageManager, objArr2);
                    List<String> pathSegments = uri.getPathSegments();
                    if (pathSegments == null) {
                        throw new FileNotFoundException(C1561oA.Kd("\u0018:k=/C8\u000bq", (short) (OY.Xd() ^ 13568)) + uri);
                    }
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            identifier = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException(C1561oA.Qd("l\u0002\u0006}\u0002y3\u0003r\u0005w.\u0001qrwnv{&nw#ppt\u001f_\u001dn`mhmiYZ\u0014<6+\u0010", (short) (C1633zX.Xd() ^ (-13127))) + uri);
                        }
                    } else if (size == 2) {
                        identifier = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        short sXd = (short) (C1607wl.Xd() ^ 22558);
                        int[] iArr = new int["\u001457)b6)!-]13*Y)\u0019+\u001eT'\u0018\u0019\u001e\u0015\u001d\" eJ".length()];
                        QB qb = new QB("\u001457)b6)!-]13*Y)\u0019+\u001eT'\u0018\u0019\u001e\u0015\u001d\" eJ");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                            i2++;
                        }
                        throw new FileNotFoundException(new String(iArr, 0, i2) + uri);
                    }
                    if (identifier == 0) {
                        throw new FileNotFoundException(C1593ug.zd("Y{-\u0001t\u0004\u0001\b\u0006wz6}\b\u000f\t\u007f<\u0004\u000e\u0012ZA", (short) (OY.Xd() ^ 17106), (short) (OY.Xd() ^ 8165)) + uri);
                    }
                    return resources.getDrawable(identifier);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(Wg.Zd("\u0001~Mz\u001d=\"<\u007fZ/J\u00113\u0011$\u001a=\\9%\r}\u0016H$C\u0018g\u0007%'", (short) (C1607wl.Xd() ^ 20043), (short) (C1607wl.Xd() ^ 15182)) + uri);
        }
    }

    Cursor getSearchManagerSuggestions(SearchableInfo searchableInfo, String str, int i2) throws Throwable {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme(Wg.vd("\\gejZbg", (short) (C1499aX.Xd() ^ (-29812)))).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        short sXd = (short) (C1499aX.Xd() ^ (-21957));
        short sXd2 = (short) (C1499aX.Xd() ^ (-32325));
        int[] iArr = new int["@1,<,0&9:+*'44\u001e/2!-3".length()];
        QB qb = new QB("@1,<,0&9:+*'44\u001e/2!-3");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(((sXd + i3) + xuXd.CK(iKK)) - sXd2);
            i3++;
        }
        builderFragment.appendPath(new String(iArr, 0, i3));
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        if (i2 > 0) {
            builderFragment.appendQueryParameter(hg.Vd("oknis", (short) (C1499aX.Xd() ^ (-29547)), (short) (C1499aX.Xd() ^ (-9797))), String.valueOf(i2));
        }
        Uri uriBuild = builderFragment.build();
        Context context = this.mProviderContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("z\u0007{\t\u0005}w@t\u007f}\u0003rz\u007f8Lwuzj|w", (short) (C1633zX.Xd() ^ (-9060)))).getMethod(C1561oA.yd("\u000e\u000b\u001dj\u0012\u0010\u0019\t\u001d\"\u0003\u0015\u001e\u0019\u0019\"{\b", (short) (FB.Xd() ^ 22278)), new Class[0]);
        try {
            method.setAccessible(true);
            return ((ContentResolver) method.invoke(context, objArr)).query(uriBuild, null, suggestSelection, strArr, null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
