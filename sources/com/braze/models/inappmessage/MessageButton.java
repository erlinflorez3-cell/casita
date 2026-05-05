package com.braze.models.inappmessage;

import android.graphics.Color;
import android.net.Uri;
import bo.app.q40;
import bo.app.r40;
import bo.app.s40;
import bo.app.t40;
import bo.app.u40;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\r\"4\u0012}\u0007njO0L͜P.hS2\u000fq\u0001<$q$yCAU\"}0\u000fWNmpvJh\u0017K\u000f\f\u001a\u0001j:R]xc*\u0015GXģ]p}wM=pvL\u0004N2P7*\u0005/\u001bbGN7\u0002I_ë\u00162F)HVMh\u000b/\"\nL-\u0019\u001e\u000bg^>NlksG%\u0019hpNϮc2\u0003\u0006\u001b\u0001\u0015\t\u0013\u0007q\"9MO5C%c\t\u0015\u000esA\u0019> =\u0015l5;CI\"iF\\\u000e\u001a-+}\u0012mx4d\u001dSv\u000bUI_gYo&(&\u0019\f\u0013B\u0003\u001c2?H\\?*l\u000e\rA%\u000bSnb\u0012bP&\u0013ad<5\u00069*GN~Q\u0010MϭR9\u0002=\u001bZk\u000e|$sT<b[/ƻ{S7TNA\u0011o\u0018bUm2r\u0013\u00068\nHG.4,\u00194\u00173?s;9 \u001a\t\u000fIϼz\u0007fqas\u001bWN-\u0007\u0018M)7\f!X\u0081\tmV_f8ac*a\u001f\u007f\u001e\u0012N\\.<_%fʝ[ŹmnU_\u00102=t\bo|{&YO]aD\bcNa)Λ ͖@f\rZlRa\u001d+~66JH\u0019\"(\u007fRa$\u0013`Q( rl\bǐhČL\r&DG\u0011\u0017trj\u0016\u0015bJt%w*\r\t/U\rt}z\u0011IZ\u0002\u0017&k\u0002(ڈ%łY,p6\u0003)\u0015\u0017\f\u0002M\u0001Za\u001d\u0013$}m}6\u0015H@\u00025K&'\u0001?104{P1&(ˮ\u001eؠ~\u0007\u0002\u0011Ap<\u0003 lvHn\b\u001bqb6:xtqQ&\u001b\u00048e\u001dڰSϭX\u001bc@O\u0012\u0011yTP>\u001e\u0013A>'\u0007\u00130!\u0006MQM5\u0016&9e\u0019 a@۷:ԃf\u001f.vk*:\u000b.qhyk[[:O\u0004\rirDz/ZH\u0019\n>\bG8cΑTыh\u0001^:S7=\u0013~\t2:~m{<\u0019\u001e\fc~\u007f8$[}BpyjOQ*ܒyߑOl\u0013L\u0015:\u0019\u0011Ip\u0018MK7vYh;>5D8DtSb3N?ir0\u0013ޒ\u0017ͲXy\u000e\u0012\u00013Tt'\u00198v\u0002Rv\u0010Z.j\u0006\u0019\u0014n|x!X\u001f5Sʟ\"|M3\u000b$Tvиgq"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~A}.Ei\u0018.*SJz>'j", "\u001ab^:\")KO.~Df6{\t6sI\ffP\u0010z VyrJ\u0001.\u000b", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001e\u0004kaA\u0007_)Uv|", "", "3mP/_,\u001dO&\u0005ia,\u0005\t", "u(E", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u0013`\u0002\u001e=I\u0014=QMDA", "1kX0^\b<b\u001d\t\u0004", "\u001a`]1e6BRb\bzmul\u00163;", "CqX", "Adc\u0010_0<Yu~}Z=\u0001\u0013<", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI,\u0005<\f\"\u001fG}\u001c8x%~7\u0005$5sq,\\GEt\n\u0005\u0011q`F\u0011g+\u0018\u007f'V\u0016>9`(6.", "4na\u0017f6G>)\u000e", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", "8r^;B)CS\u0017\u000e", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "\u001aa^{T7I\u001d)ME4", "2`a8G/>[\u0019", "\u001aa^{T7I\u001d)ME4", "", "\nrTA \u0006\u0017", "7c", "\u0017", "5dc\u0016W", "u(8", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u0013`\u0002\u001e=I\u0014=QMDA", "5dc\u0010_0<Yt|\nb6\u0006", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eq\u007fI|\"\"Oo\u001cJr'5#[';k\u001c\nKR?u=s", "\u001a`]1e6BRb\bzmul\u00163;", "5dc\"e0", "u(;.a+K]\u001d}Dg,\fR\u001fr\u0004}", "", "BdgA", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc!X?M", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc!X?M", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "", "=oT;H9B7\"pz[=\u0001\tA", "(", "5dc\u001cc,GC&\u0003^g\u001e|\u0006@i\u007f:", "u(I", "Adc\u001cc,GC&\u0003^g\u001e|\u0006@i\u007f:", "uY\u0018#", "0`R8Z9Hc\"}Xh3\u0007\u0016", "5dc\u000fT*DU&\t\u000bg+Z\u00136o\r", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r", "uH\u0018#", "BdgA66E]&", "5dc!X?M1#\u0006\u0005k", "Adc!X?M1#\u0006\u0005k", "0na1X9\u001c] \t\b", "5dc\u000fb9=S&\\\u0005e6\n", "Adc\u000fb9=S&\\\u0005e6\n", "5dc g9B\\\u001bby", "Asa6a.\"R", "\nh]6g\u0005", "2`a8G/>[\u0019hwc,z\u0018", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}!TqWA\u0005/>#b\u000e!V\u007f+RC9z\na\u0006", "2`a8G/>[\u0019c\th5f\u00064e}7", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}!TqWA\u0005/>#b\u000e!V\u007f+RC9z\n\u0002{fkAP`9J\f'\u0011LW<d`<A\u001d\u000ee\u0019V+\u001b\u0013UC$8\">#\u00062%\u007fJl\u000b\u0015kt:f\u0002> \u0017C\u0003\u0017?/8uJbaO.FAs&.\u0013[&^\u0004(3!u\"\u001d>4\u0012~_\u0017\u0002", "\u0011n\\=T5B]\"", "0n\u001e.c7\b_gI", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public class MessageButton implements IPutIntoJson<JSONObject>, IInAppMessageThemeable {
    private static final String BG_COLOR = "bg_color";
    private static final String BORDER_COLOR = "border_color";
    private static final String CLICK_ACTION = "click_action";
    private static final String ID = "id";
    private static final String OPEN_URI_IN_WEBVIEW = "use_webview";
    private static final String TEXT = "text";
    private static final String TEXT_COLOR = "text_color";
    private static final String URI = "uri";
    private int backgroundColor;
    private int borderColor;
    private ClickAction clickAction;
    private u40 darkTheme;
    private int id;
    private JSONObject jsonObject;
    private boolean openUriInWebview;
    private String text;
    private int textColor;
    private Uri uri;
    public static final q40 Companion = new q40();
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) MessageButton.class);

    public MessageButton() {
        this.id = -1;
        this.clickAction = ClickAction.NONE;
        int color = Color.parseColor("#1B78CF");
        this.backgroundColor = color;
        this.textColor = -1;
        this.borderColor = color;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageButton(JSONObject jsonObject) {
        this(jsonObject, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessageButton(JSONObject jsonObject, JSONObject jSONObject) {
        String upperCase;
        int i2;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        int iOptInt = jsonObject.optInt("id", -1);
        ClickAction clickAction = ClickAction.NEWS_FEED;
        try {
            String string = jsonObject.getString("click_action");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            upperCase = string.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        } catch (Exception unused) {
        }
        for (ClickAction clickAction2 : ClickAction.values()) {
            if (Intrinsics.areEqual(clickAction2.name(), upperCase)) {
                if (clickAction2 != null) {
                    clickAction = clickAction2;
                }
                String strOptString = jsonObject.optString("uri");
                String strOptString2 = jsonObject.optString("text");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "jsonObject.optString(TEXT)");
                this(jsonObject, jSONObject, iOptInt, clickAction, strOptString, strOptString2, jsonObject.optInt("bg_color"), jsonObject.optInt("text_color"), jsonObject.optBoolean("use_webview", false), jsonObject.optInt(BORDER_COLOR));
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private MessageButton(JSONObject jSONObject, JSONObject jSONObject2, int i2, ClickAction clickAction, String str, String str2, int i3, int i4, boolean z2, int i5) {
        this.id = -1;
        this.clickAction = ClickAction.NONE;
        int color = Color.parseColor("#1B78CF");
        this.backgroundColor = color;
        this.textColor = -1;
        this.borderColor = color;
        this.jsonObject = jSONObject;
        this.id = i2;
        this.clickAction = clickAction;
        if (clickAction == ClickAction.URI && str != null && !StringsKt.isBlank(str)) {
            this.uri = Uri.parse(str);
        }
        this.text = str2;
        this.backgroundColor = i3;
        this.textColor = i4;
        this.openUriInWebview = z2;
        this.borderColor = i5;
        this.darkTheme = jSONObject2 != null ? new u40(jSONObject2) : null;
    }

    public /* synthetic */ MessageButton(JSONObject jSONObject, JSONObject jSONObject2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, (i2 + 2) - (i2 | 2) != 0 ? null : jSONObject2);
    }

    public static /* synthetic */ void setClickBehavior$default(MessageButton messageButton, ClickAction clickAction, Uri uri, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setClickBehavior");
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            uri = null;
        }
        messageButton.setClickBehavior(clickAction, uri);
    }

    @Override // com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        u40 u40Var = this.darkTheme;
        if (u40Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) r40.f1645a, 14, (Object) null);
            return;
        }
        Integer num = u40Var.f1911a;
        if (num != null) {
            this.backgroundColor = num.intValue();
        }
        Integer num2 = u40Var.f1912b;
        if (num2 != null) {
            this.textColor = num2.intValue();
        }
        Integer num3 = u40Var.f1913c;
        if (num3 != null) {
            this.borderColor = num3.intValue();
        }
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.id);
            jSONObject.put("click_action", this.clickAction.toString());
            Uri uri = this.uri;
            if (uri != null) {
                jSONObject.put("uri", String.valueOf(uri));
            }
            jSONObject.putOpt("text", this.text);
            jSONObject.put("bg_color", this.backgroundColor);
            jSONObject.put("text_color", this.textColor);
            jSONObject.put("use_webview", this.openUriInWebview);
            jSONObject.put(BORDER_COLOR, this.borderColor);
            return jSONObject;
        } catch (JSONException unused) {
            return this.jsonObject;
        }
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final ClickAction getClickAction() {
        return this.clickAction;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getOpenUriInWebview() {
        return this.openUriInWebview;
    }

    public final String getStringId() {
        return String.valueOf(this.id);
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final void setBackgroundColor(int i2) {
        this.backgroundColor = i2;
    }

    public final void setBorderColor(int i2) {
        this.borderColor = i2;
    }

    public final void setClickBehavior(ClickAction clickAction) {
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        setClickBehavior$default(this, clickAction, null, 2, null);
    }

    public final void setClickBehavior(ClickAction clickAction, Uri uri) {
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        if (uri == null && clickAction == ClickAction.URI) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) s40.f1725a, 12, (Object) null);
        } else if (uri != null && clickAction != ClickAction.URI) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) t40.f1811a, 12, (Object) null);
        } else {
            this.clickAction = clickAction;
            this.uri = uri;
        }
    }

    public final void setOpenUriInWebview(boolean z2) {
        this.openUriInWebview = z2;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTextColor(int i2) {
        this.textColor = i2;
    }
}
