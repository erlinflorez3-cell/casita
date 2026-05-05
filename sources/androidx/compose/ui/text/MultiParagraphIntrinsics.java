package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: MultiParagraphIntrinsics.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007t\tA0ZeP.hS2şs{J$cҕyCQU\"}(\tWN}gvJ`\rK\u000f\u0014\u001f\u0001j2J]xs\u0012\u00172HpG3[tE9f{>\u000562*8\u007f\u0005\u0007\u001f@Ϻ@v)B\fE\u0018EPtHR%M3\u001b\"\nL\"\u0019\u001e\u000bj^FVpuF?+\u0013oRP7_^\u0004{\u0013tY7\u0011\u0005i6+n@E\u00193]\u001b\u0007\u0001fύ\u0007?\u007fIE 7+9I\fWdY\u0010\u0018#-g\r\fu6l\u0013Ux\u001873_i[R\u001e(&\u0002*\u0013j\t\u001e\n5PF-Ho\u0018\u0012A\u0002\u000bSn^ؿbB\u000e\n*L%I\u00183Y^Kj_cS\u0019|\\,\t\u001bD;\u0001\u001dF\"T^o#\u001blw\u007f2ҨDCPݐ\"[C}\u0012\u00023\u00148\u0016HG.B2e\u0005Ϧ'ھ_=;#q\u0016VY8\u000f\u0013v\u0001YyTX@P\u0006D<\u0001\u009f\u000eʑHj\rߘhV^D\u001fflm\u0015\u0018 \u0013Nw.\u0011wَİNћlsrOc(3N~9_\u000by+(RlSMQ\u0012+\u0018'M̸ܴ<И\tbnDY.h{@$8ix-H\u0017RR$\u001fBG\u0002\"D.A\u0019\u000b\u001cv\tLG˩\u0001\u000fgʳ\u0001\u0012\u0005wA=ҙmK"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9uL}49Dy-3o#*XF\u001ftC+\u0019qo=\u0005q\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:Q\u001f=ZGDy8\u001c#>", "/m]<g(MS\u0018l\nk0\u0006\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", ">kP0X/HZ\u0018~\bl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "@db<h9<S\u007f\tv],\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F,\u0003.[MKx2\u001e{r]8\u0007p\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u00020\u00077y|U&\u001d9q:)Z\u001eVO{qJ(uP]^\r\u0011?Oj5n\u001a_fl>\u00044\u001du(dGP7\u0018\u007fb%H9upfT#~77\bkeNPyc<>7#\u0015\u000bw%A\"u5}<M\u00154?sC8g&Hn\u0006\u0013,CK#%6Ih\u0003<", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u00020\u00077y|U&\u001d9q:)Z\u001eVO{qJ(uP]^\r\u0011?Oj5n\u001a_fl>\u00044\u001du(dGP7\u0018\u007fb%H9upfT#~77\bkeNPyc<>7#\u0015\u000bw%A\"u5}<M\u00154?seGo\u001cEr7\u0002,jK.76Ih\u0003<", "5dc\u000ea5Hb\u0015\u000ez]\u001a\f\u00163n\u0002", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006R.>c\r\u001cFm\u0015\u001c\\P?t6s", "6`b g(ES\u0006~\th3\u000e\t.F\n1\u000bN", "", "5dc\u0015T:,b\u0015\u0006zK,\u000b\u00136v\u007f'\\J\n&%", "u(I", "7mU<?0Lb", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:Q\u001f=ZGDy8\u001cxqbC\\", "5dc\u0016a-H:\u001d\r\n\u001d<\u0001\u0003>e\u00137uM\u0001\u001e\u0017C}\u000e", "u(;7T=:\u001d)\u000e~euc\r=tU", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "", "5dc\u001aT?\"\\(\f~g:\u0001\u0007!i~7~", "u(5", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h>'{G\u0001\u0019\u0013Vo", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "5dc\u001a\\5\"\\(\f~g:\u0001\u0007!i~7~", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h>'{G\u0001\u0019\u0013Vo", "5dc\u001d_(<S\u001c\t\u0002],\n\u0017", "@db<_=>B\u0019\u0012\n=0\n\t-t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:[%BTC\u0011", "2dU.h3MA(\u0013\u0002^", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MultiParagraphIntrinsics implements ParagraphIntrinsics {
    public static final int $stable = 8;
    private final AnnotatedString annotatedString;
    private final List<ParagraphIntrinsicInfo> infoList;
    private final Lazy maxIntrinsicWidth$delegate;
    private final Lazy minIntrinsicWidth$delegate;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, Density density, FontFamily.Resolver resolver) {
        this.annotatedString = annotatedString;
        this.placeholders = list;
        this.minIntrinsicWidth$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Float>() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$minIntrinsicWidth$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo;
                ParagraphIntrinsics intrinsics;
                List<ParagraphIntrinsicInfo> infoList$ui_text_release = this.this$0.getInfoList$ui_text_release();
                if (infoList$ui_text_release.isEmpty()) {
                    paragraphIntrinsicInfo = null;
                } else {
                    paragraphIntrinsicInfo = infoList$ui_text_release.get(0);
                    float minIntrinsicWidth = paragraphIntrinsicInfo.getIntrinsics().getMinIntrinsicWidth();
                    int lastIndex = CollectionsKt.getLastIndex(infoList$ui_text_release);
                    int i2 = 1;
                    if (1 <= lastIndex) {
                        while (true) {
                            ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = infoList$ui_text_release.get(i2);
                            float minIntrinsicWidth2 = paragraphIntrinsicInfo2.getIntrinsics().getMinIntrinsicWidth();
                            if (Float.compare(minIntrinsicWidth, minIntrinsicWidth2) < 0) {
                                paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
                                minIntrinsicWidth = minIntrinsicWidth2;
                            }
                            if (i2 == lastIndex) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
                ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = paragraphIntrinsicInfo;
                return Float.valueOf((paragraphIntrinsicInfo3 == null || (intrinsics = paragraphIntrinsicInfo3.getIntrinsics()) == null) ? 0.0f : intrinsics.getMinIntrinsicWidth());
            }
        });
        this.maxIntrinsicWidth$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Float>() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$maxIntrinsicWidth$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo;
                ParagraphIntrinsics intrinsics;
                List<ParagraphIntrinsicInfo> infoList$ui_text_release = this.this$0.getInfoList$ui_text_release();
                if (infoList$ui_text_release.isEmpty()) {
                    paragraphIntrinsicInfo = null;
                } else {
                    paragraphIntrinsicInfo = infoList$ui_text_release.get(0);
                    float maxIntrinsicWidth = paragraphIntrinsicInfo.getIntrinsics().getMaxIntrinsicWidth();
                    int lastIndex = CollectionsKt.getLastIndex(infoList$ui_text_release);
                    int i2 = 1;
                    if (1 <= lastIndex) {
                        while (true) {
                            ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = infoList$ui_text_release.get(i2);
                            float maxIntrinsicWidth2 = paragraphIntrinsicInfo2.getIntrinsics().getMaxIntrinsicWidth();
                            if (Float.compare(maxIntrinsicWidth, maxIntrinsicWidth2) < 0) {
                                paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
                                maxIntrinsicWidth = maxIntrinsicWidth2;
                            }
                            if (i2 == lastIndex) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
                ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = paragraphIntrinsicInfo;
                return Float.valueOf((paragraphIntrinsicInfo3 == null || (intrinsics = paragraphIntrinsicInfo3.getIntrinsics()) == null) ? 0.0f : intrinsics.getMaxIntrinsicWidth());
            }
        });
        ParagraphStyle paragraphStyle = textStyle.toParagraphStyle();
        List<AnnotatedString.Range<ParagraphStyle>> listNormalizedParagraphStyles = AnnotatedStringKt.normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<ParagraphStyle> range = listNormalizedParagraphStyles.get(i2);
            AnnotatedString annotatedStringSubstringWithoutParagraphStyles = AnnotatedStringKt.substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd());
            arrayList.add(new ParagraphIntrinsicInfo(ParagraphIntrinsicsKt.ParagraphIntrinsics(annotatedStringSubstringWithoutParagraphStyles.getText(), textStyle.merge(resolveTextDirection(range.getItem(), paragraphStyle)), annotatedStringSubstringWithoutParagraphStyles.getSpanStyles(), (List<AnnotatedString.Range<Placeholder>>) MultiParagraphIntrinsicsKt.getLocalPlaceholders(getPlaceholders(), range.getStart(), range.getEnd()), density, resolver), range.getStart(), range.getEnd()));
        }
        this.infoList = arrayList;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    @Deprecated(message = "\tU\nI?f\u001ajg\\:}U\u0001;O`Q\u001bf\u000e{KV{V\u0001oQu8kl\u0018$ENhtx]'GBQ\\[\b6>IHnJM\u0004\u0011Z#P1{F", replaceWith = @ReplaceWith(expression = "MultiParagraphIntrinsics(annotatedString, style, placeholders, density, fontFamilyResolver)", imports = {}))
    @InterfaceC1492Gx
    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, Density density, Font.ResourceLoader resourceLoader) {
        this(annotatedString, textStyle, list, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return ((Number) this.minIntrinsicWidth$delegate.getValue()).floatValue();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return ((Number) this.maxIntrinsicWidth$delegate.getValue()).floatValue();
    }

    public final List<ParagraphIntrinsicInfo> getInfoList$ui_text_release() {
        return this.infoList;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        List<ParagraphIntrinsicInfo> list = this.infoList;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getIntrinsics().getHasStaleResolvedFonts()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphStyle resolveTextDirection(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2) {
        return !TextDirection.m6537equalsimpl0(paragraphStyle.m6031getTextDirections_7Xco(), TextDirection.Companion.m6546getUnspecifieds_7Xco()) ? paragraphStyle : ParagraphStyle.m6013copyykzQM6k$default(paragraphStyle, 0, paragraphStyle2.m6031getTextDirections_7Xco(), 0L, null, null, null, 0, 0, null, 509, null);
    }
}
