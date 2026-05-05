package com.braze.models.inappmessage;

import android.graphics.Color;
import bo.app.ba;
import bo.app.e00;
import bo.app.e20;
import bo.app.f9;
import bo.app.g30;
import bo.app.h00;
import bo.app.p20;
import bo.app.q20;
import bo.app.r20;
import bo.app.s20;
import bo.app.t20;
import bo.app.tf;
import bo.app.u20;
import bo.app.v20;
import bo.app.vw;
import bo.app.xe0;
import bo.app.z9;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.support.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
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
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\":\u001b\u007f\u0007ljA0ReP.XT2\u000f\u0002{<$a$yCI[\"}(\u0010WNusvJ`\u000fK\u000f\u00144\u0001j2M]xs\u0012\u00172HyG3coE9f}>\u000562*8\u007f\n\u0007?@Ϻ.:+Cy\u000bB0nprQQ\u000e\f $ĂB\"\u0007Zjo\u000fMN\u0001m>=`\u001bipX7c><e\rt\u0013ܮ\u0011xgZ9\u0001w|\u001b5c\u0007\u0015\u0010s?1I\u0002A\u0013(?'Y\b\u0004[Dp\u0018\u0014CB_\u0011k\u0001>\\3^p\u00105?gcy]\u001e,\u0006!\u0014\rj)\u001e\n5{F-H\u0019\u0018\u0012A6\u000bSn\u0003ؿbD\u00067ox_:\u000e7C9Ii\u0002eI\u001bf7*\u0006S2ţ\u0005p'_b\u0013)\")[\u0010Q_W\u0007Q˓R\f_D{\f9o\u00103\u001c0u\u0006u\u0010 2\u0019+@iAk.y\r`D\u0016\u0001KtĈWkXSN.?6E8!\f\tQ\u001b\u0019*d+Ш8ҭQ,\\\t\u0004\u0016!/tyB13!nQn{x`.*3C~7\b{\"\"\u0016M5ۀAɄg iT|(MKz\u0007^{Pd,\\b>0E\u0019\r\u001e\u0010\u0014Fd\u000bAIu\u0006ZH\u0003֒%Å\u0019X\u000b HY\u000b\"w\\n*\roS&\t\u00062\u0012Y'^{\tuwzY,+aPKwes-|ŵ.מ8\r+\t\u0005\u0013\u000eg\u007fNMmz8\u0016W\u0002C$>\nq=c+\u000f-Nh\u0016kY#Ȁq˛Q\"/|\u0003 \u001db\u00010m0x\u001aLbpt]\u007fgD\u0005\u000b\u000b%\u001ec.\u0007\u0018Z9[:Ӓ\u0017ИBYz\u0005_h\\e\u0015\u0007%L30\u0010$\u0003e;tw=$+,/C\u0014\u0014}.BP˃\u001b֑xu\f.iI}\u0017i_8pF\u007fy\u0001DY2%SVV$\u0010\bp\fj\rqH\u0018Я|ެ<Q\u00131\u0004 \u0015f]\u0007d\u0017R\u0015\u0006|bE\u0016*2CTйjǜ)\u0015UUm){dŵ\u000f\u0010"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=\u0007{Bx}.[Q7m4\u0002\u001dpaF\u0015g=NS#UL$", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=\u0007{Bx}.[Q7m4\u0010\u0019wd\u001d\u000f_.NS#UL$", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001expi9\u0014q0_v|", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~A}.Ei\u0018.*SJz>'j", ";db@T.>0)\u000e\nh5", "", ":nV\u000fh;M]\"\\\u0002b*\u0003", "uKR<`u;`\u0015\u0014z(4\u0007\b/l\u000eq\u007fI|\"\"Oo\u001cJr'5#e E{\u00120M KzC(\u001e>%.", "", "=m03g,K1 \t\t^+", "u(E", "3mP/_,\u001dO&\u0005ia,\u0005\t", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "4na\u0017f6G>)\u000e", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", "", "6dP1X9-S,\u000eXh3\u0007\u0016", "\u0017", "5dc\u0015X(=S&mzq;Z\u00136o\r", "u(8", "Adc\u0015X(=S&mzq;Z\u00136o\r", "uH\u0018#", "1k^@X\tNb(\t\u0004<6\u0004\u0013<", "5dc\u0010_6LSu\u000f\nm6\u0006f9l\n5", "Adc\u0010_6LSu\u000f\nm6\u0006f9l\n5", "", "6dP1X9", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0015X(=S&", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0015X(=S&", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "", ";db@T.>0)\u000e\nh5\u000b", "\u001aiPCTuNb\u001d\u0006DE0\u000b\u0018\u0005", "5dc\u001aX:LO\u001b~Wn;\f\u00138s", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\u001aX:LO\u001b~Wn;\f\u00138s", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u0019ay\"7[%BTC\u0011", "7lP4X\u001aMg ~", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u0019ay\"7[%BTC\u0011", "5dc\u0016`(@S\u0007\u000e\u000fe,", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eq\u007fI|\"\"Oo\u001cJr'5#a(3o\u0016\u001c\\WBk\n", "Adc\u0016`(@S\u0007\u000e\u000fe,", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI,\u0005<\f\"\u001fG}\u001c8x%~=\u0006\u001c9m\u0004=aJ;Aw\u000f", "4qP:X\nHZ#\f", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "5dc\u0013e(FSv\t\u0002h9", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc\u0013e(FSv\t\u0002h9", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn$Y\u0011/\u0013t\u001a0V\u0019", "6dP1X9-S,\u000eVe0~\u0012", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn$Y\u0011/\u0013t\u001a0V\u0019", "5dc\u0015X(=S&mzq;X\u00103g\t", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eq\u007fI|\"\"Oo\u001cJr'5#l J|q5QEDA", "Adc\u0015X(=S&mzq;X\u00103g\t", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI,\u0005<\f\"\u001fG}\u001c8x%~H}3FI\u001d2OL\u0011/%", "E`b\u000fh;M]\"\\\u0002b*\u0003o9g\u0002(z", "(", "0tcAb5\"Rv\u0006~\\2|\b", "\nh]6g\u0005", "8r^;B)CS\u0017\u000e", "\u001aa^{T7I\u001d\u001cIE4", "0qPGX\u0014:\\\u0015\u0001zk", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u0014Q9\nG\u0002n8$Huz^", ";db@T.>B\u0019\u0012\n:3\u0001\u000b8", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u0014Q9\nG\u0002n8$Hu\u001er\u0012?I\rBg= ^VpF\u000bl.$Z\u000b.JX4&O\u007f9)\u0012$\u000eW;\u0015\u0013#E-jOB'\b:W}=hJo\u001e\n7j^Qj\u0017GO{sK12Cf[\u000fG\u000bEk:l\u001a)!e6E/\u001cq')dR.SjS$\u0002.\u0001kiPna6.F7XSA\u0005U\u0006t0/S\nA\u0016;T\u007f6|-\u0012B&8dN:g+M:\u007f\u0019.e\u0017j\u0017", "\u0011n\\=T5B]\"", "0n\u001e.c7\b^eI", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public abstract class InAppMessageImmersiveBase extends InAppMessageWithImageBase implements IInAppMessageImmersive {
    private static final String BUTTONS = "btns";
    private static final String CLOSE_BUTTON_COLOR = "close_btn_color";
    public static final p20 Companion = new p20();
    private static final String FRAME_COLOR = "frame_color";
    private static final String HEADER = "header";
    private static final String HEADER_TEXT_ALIGN = "text_align_header";
    private static final String HEADER_TEXT_COLOR = "header_text_color";
    private static final String IMAGE_STYLE = "image_style";
    private String buttonIdClicked;
    private int closeButtonColor;
    private Integer frameColor;
    private String header;
    private TextAlign headerTextAlign;
    private int headerTextColor;
    private ImageStyle imageStyle;
    private List<? extends MessageButton> messageButtons;
    private boolean wasButtonClickLogged;

    public InAppMessageImmersiveBase() {
        this.headerTextColor = Color.parseColor("#333333");
        this.closeButtonColor = Color.parseColor("#9B9B9B");
        this.messageButtons = CollectionsKt.emptyList();
        this.imageStyle = ImageStyle.TOP;
        this.headerTextAlign = TextAlign.CENTER;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InAppMessageImmersiveBase(JSONObject jsonObject, h00 brazeManager) {
        String upperCase;
        int i2;
        String upperCase2;
        TextAlign[] textAlignArrValues;
        int length;
        int i3;
        String upperCase3;
        ImageStyle[] imageStyleArrValues;
        int length2;
        int i4;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        String strOptString = jsonObject.optString(HEADER);
        Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(HEADER)");
        int iOptInt = jsonObject.optInt(HEADER_TEXT_COLOR);
        int iOptInt2 = jsonObject.optInt(CLOSE_BUTTON_COLOR);
        ImageStyle imageStyle = ImageStyle.TOP;
        try {
            String string = jsonObject.getString(IMAGE_STYLE);
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            upperCase3 = string.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "this as java.lang.String).toUpperCase(locale)");
            imageStyleArrValues = ImageStyle.values();
            length2 = imageStyleArrValues.length;
        } catch (Exception unused) {
        }
        for (i4 = 0; i4 < length2; i4++) {
            ImageStyle imageStyle2 = imageStyleArrValues[i4];
            if (Intrinsics.areEqual(imageStyle2.name(), upperCase3)) {
                imageStyle2 = imageStyle2 == null ? imageStyle : imageStyle2;
                TextAlign textAlign = TextAlign.CENTER;
                try {
                    String string2 = jsonObject.getString(HEADER_TEXT_ALIGN);
                    Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(key)");
                    Locale US2 = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US2, "US");
                    upperCase2 = string2.toUpperCase(US2);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                    textAlignArrValues = TextAlign.values();
                    length = textAlignArrValues.length;
                } catch (Exception unused2) {
                }
                for (i3 = 0; i3 < length; i3++) {
                    TextAlign textAlign2 = textAlignArrValues[i3];
                    if (Intrinsics.areEqual(textAlign2.name(), upperCase2)) {
                        textAlign2 = textAlign2 == null ? textAlign : textAlign2;
                        TextAlign textAlign3 = TextAlign.CENTER;
                        try {
                            String string3 = jsonObject.getString(InAppMessageBase.MESSAGE_TEXT_ALIGN);
                            Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getString(key)");
                            Locale US3 = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(US3, "US");
                            upperCase = string3.toUpperCase(US3);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                        } catch (Exception unused3) {
                        }
                        for (TextAlign textAlign4 : TextAlign.values()) {
                            if (Intrinsics.areEqual(textAlign4.name(), upperCase)) {
                                if (textAlign4 != null) {
                                    textAlign3 = textAlign4;
                                }
                                this(jsonObject, brazeManager, strOptString, iOptInt, iOptInt2, imageStyle2, textAlign2, textAlign3);
                                JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray(BUTTONS);
                                JSONArray jSONArrayB = j.b(jsonObject);
                                ArrayList arrayList = new ArrayList();
                                Iterator itWithIndex = CollectionsKt.withIndex(jSONArrayOptJSONArray == null ? CollectionsKt.emptyList().iterator() : SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, jSONArrayOptJSONArray.length())), new u20(jSONArrayOptJSONArray)), new v20(jSONArrayOptJSONArray)).iterator());
                                while (itWithIndex.hasNext()) {
                                    IndexedValue indexedValue = (IndexedValue) itWithIndex.next();
                                    arrayList.add(new MessageButton((JSONObject) indexedValue.getValue(), jSONArrayB.optJSONObject(indexedValue.getIndex())));
                                }
                                setMessageButtons(arrayList);
                                return;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private InAppMessageImmersiveBase(JSONObject jSONObject, h00 h00Var, String str, int i2, int i3, ImageStyle imageStyle, TextAlign textAlign, TextAlign textAlign2) {
        super(jSONObject, h00Var);
        this.headerTextColor = Color.parseColor("#333333");
        this.closeButtonColor = Color.parseColor("#9B9B9B");
        this.messageButtons = CollectionsKt.emptyList();
        this.imageStyle = ImageStyle.TOP;
        this.headerTextAlign = TextAlign.CENTER;
        setHeader(str);
        setHeaderTextColor(i2);
        setCloseButtonColor(i3);
        if (jSONObject.has(FRAME_COLOR)) {
            setFrameColor(Integer.valueOf(jSONObject.optInt(FRAME_COLOR)));
        }
        setImageStyle(imageStyle);
        setHeaderTextAlign(textAlign);
        setMessageTextAlign(textAlign2);
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        super.enableDarkTheme();
        g30 inAppMessageDarkThemeWrapper = getInAppMessageDarkThemeWrapper();
        if (inAppMessageDarkThemeWrapper == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) q20.f1568a, 7, (Object) null);
            return;
        }
        Integer num = inAppMessageDarkThemeWrapper.f709g;
        if (num != null) {
            setFrameColor(num);
        }
        Integer num2 = inAppMessageDarkThemeWrapper.f705c;
        if (num2 != null) {
            setCloseButtonColor(num2.intValue());
        }
        Integer num3 = inAppMessageDarkThemeWrapper.f708f;
        if (num3 != null) {
            setHeaderTextColor(num3.intValue());
        }
        Iterator<MessageButton> it = getMessageButtons().iterator();
        while (it.hasNext()) {
            it.next().enableDarkTheme();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.inappmessage.InAppMessageWithImageBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject jSONObjectForJsonPut = super.forJsonPut();
        try {
            jSONObjectForJsonPut.putOpt(HEADER, getHeader());
            jSONObjectForJsonPut.put(HEADER_TEXT_COLOR, getHeaderTextColor());
            jSONObjectForJsonPut.put(CLOSE_BUTTON_COLOR, getCloseButtonColor());
            jSONObjectForJsonPut.putOpt(IMAGE_STYLE, getImageStyle().toString());
            jSONObjectForJsonPut.putOpt(HEADER_TEXT_ALIGN, getHeaderTextAlign().toString());
            Integer frameColor = getFrameColor();
            if (frameColor != null) {
                jSONObjectForJsonPut.put(FRAME_COLOR, frameColor.intValue());
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<MessageButton> it = getMessageButtons().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().forJsonPut());
            }
            jSONObjectForJsonPut.put(BUTTONS, jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObjectForJsonPut;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public int getCloseButtonColor() {
        return this.closeButtonColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public Integer getFrameColor() {
        return this.frameColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public String getHeader() {
        return this.header;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public TextAlign getHeaderTextAlign() {
        return this.headerTextAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public int getHeaderTextColor() {
        return this.headerTextColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public ImageStyle getImageStyle() {
        return this.imageStyle;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public List<MessageButton> getMessageButtons() {
        return this.messageButtons;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public boolean logButtonClick(MessageButton messageButton) {
        Intrinsics.checkNotNullParameter(messageButton, "messageButton");
        h00 brazeManager = getBrazeManager();
        String triggerId = getTriggerId();
        if (triggerId == null || StringsKt.isBlank(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) r20.f1642a, 7, (Object) null);
            return false;
        }
        if (this.wasButtonClickLogged) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) s20.f1722a, 6, (Object) null);
            return false;
        }
        if (brazeManager == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) t20.f1803a, 6, (Object) null);
            return false;
        }
        this.buttonIdClicked = messageButton.getStringId();
        z9 z9Var = ba.f257g;
        z9Var.getClass();
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        Intrinsics.checkNotNullParameter(messageButton, "messageButton");
        e00 e00VarA = z9Var.a(new f9(triggerId, messageButton));
        if (e00VarA != null) {
            ((tf) brazeManager).a(e00VarA);
        }
        this.wasButtonClickLogged = true;
        return true;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        String triggerId;
        String str;
        super.onAfterClosed();
        h00 brazeManager = getBrazeManager();
        if (!this.wasButtonClickLogged || (triggerId = getTriggerId()) == null || StringsKt.isBlank(triggerId) || (str = this.buttonIdClicked) == null || StringsKt.isBlank(str) || brazeManager == null) {
            return;
        }
        String triggerId2 = getTriggerId();
        String str2 = this.buttonIdClicked;
        e20 triggerEvent = new e20(triggerId2);
        triggerEvent.f537f = str2;
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        ((vw) ((tf) brazeManager).f1841d).b(xe0.class, new xe0(triggerEvent));
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setCloseButtonColor(int i2) {
        this.closeButtonColor = i2;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setFrameColor(Integer num) {
        this.frameColor = num;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setHeader(String str) {
        this.header = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setHeaderTextAlign(TextAlign textAlign) {
        Intrinsics.checkNotNullParameter(textAlign, "<set-?>");
        this.headerTextAlign = textAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setHeaderTextColor(int i2) {
        this.headerTextColor = i2;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setImageStyle(ImageStyle imageStyle) {
        Intrinsics.checkNotNullParameter(imageStyle, "<set-?>");
        this.imageStyle = imageStyle;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setMessageButtons(List<? extends MessageButton> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.messageButtons = list;
    }
}
