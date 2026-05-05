package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.intl.LocaleList;
import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: AnnotatedString.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0001\u001d̉=!4i\bDJc|\u0004O\u00128é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2\u000f\u0002{<$i$yCQU\"Ԃ*\t]Wo˧vJh\u0011K\u000f\f\u0019\u0001j:g]xs\u0012\u00172HxG3coE9ft>\u0005.݅*8\u007f\b\t\u001a@H\u0018v\u0011CS\f\u00187HpPR\u0015M\u000b\u001a\u001a\u0006T \t\u001ebkV6^le:5'\u001b}PN?_^{}\u0011TU?\r%cN/N:M\u0015SW\u001b'`[W\u0003mpm\tv(?+wu\b:f\u0005,\u0015YU=ex&j\bib\"&YS{k^\u0015@w)z=Q\u0012\u0016\u001e8X0=\u001a\u0015\u0012\u001e5\u0005r\u0002K~\u000bެF\u007f\u0001m|Д+\u0018Y9F3f\u007fok\u001d\\F\u0014\u0005;.S\u0005|2sT<pE\u001fb\ni1\u007fPmL\\\u001dq=\u001c\u00147ç\u001a0\u0012D_\u007f]zWф/gEpQ11s\u0012NTi\u0007\u0005'\u0001\u0002\u0001hGn8\u000f\u0018=ѧ\u0017$\u000bXr\u001e\u0004`db<\u0019] Z\u0006\u000e\bY8\u000b\u000fR S&~Sv\u0004\u0003M\f\u001aU3tRqn\u001a\u001e\u001e9vYCm{\u0010\u0010`'\u0018MYz\u0005\u0007vrW\u001axt(PBxn\u001e\u0017\u0014D|\u001cC6M\u001244ZA_¢-Z\u0011?ZA+\b\bZ\u0017\u000f/Z9$\u0011\f<t7$hn~\u0014\u007fxw+%`P,qW;\u00194w:hb ;1\r\u0019\u0018WwVWT|\u001a{T\f D@ghE<A%')`\u0001]IZ\r}Q{\"W~\u000b\u0015';\u0017>.\b\u0003\u0019:\b\u0003X_\\'(\u0007`\u0003#6h.\u0011wE)]\fT9ZnM\u0001\u001dq<|H-\t-9=\u0001\u001e2C5Ek5E.\u0006$7%gmk\u007f.(h==\u000bd2B\f\u0016\u001ea\u0002a@UPI\b\u000fn&2\b\u001bBvz>\bZhB6KNQf\u0001V~e9E\u001eh\rԭ\u001b\t~[h\u0012 \u0002BXw*\"G.PdE3<e\nw~}Z\u000b\nΊ\u0013\u0014\u0011)At\u0018JM\"\\]\t8@\u001d\u0004-FCKb3@7;Ҭ0F\u000e8SZo4 |\u0006L\u0006\u0012'4Rs\u0002n<\u0001?ֵ\\`#nux-:\t\u000f\u0015C \t5_\t\u001c]\u0003E\f2/RM\r)\u0015g~\u0015)qלlS)Yp\u00019D\u0006Cw\u0001f\bUC\u0006k\u001e\u001ch\u001c\u000b8Z\u0018II\u0018\u0011w\t>\u0011#U\u0013M\rv@e\u0003T()\r\u001d\u0015\u000ej-'\u001d'\u0003\u000bo\u0011,tN&6s \u0007\u0017RK\u001f\f+\u0007^X;:M-\u0004~\u000b\u001a-سe\tc}6FH'2~Q`eD~\n\fRj-w\u0018p-!$`\"\u0014.x~\u0003\f>\b|\u00050<ě\u0017^_w>̂FӲ/l\u0014zc&\u0007>{l*$u\u0011\tϟ?\f\"n[vE\tUW^\u0017f\u0014R\u0011\u0002Z\t(\u0006\u0016#Q7G\u0018d9\u0010}mxr{O\"BY8֗.a7<\u0019ʼ\u0004ψ}u\u0012elm#onM\u0005\u001a)br܀eC\u0007jV\u000b\u001d\fW\u001e-\u0003V\u001b)\u0013bH#\"rlO\u0019M]=^f\t\u0012pa713b?IAB\r\u007f(=F1CŪx\u007f0NOۊ\u0006\u05ff0-T\u0013UU5\u0019<m+8FQKЯP=T\u0011<7WZf*n`(\\SQa\u0003I&\u000f@P\u0017\u007f\t)5\u0019[c':\u0001C6;Hƺ5k@\u007f}\u008f)˧\u0013o)\u001a~x3x}LmA\"kPӭ[\u0019~\u000f\u0010Rq5s(*YND\"\u001fR(6\r)\u0002S\\`;o^PV\"a\u0014(:65yQPـ|s\u001080ѩy\u008c_aB\u0007\u0013O'\bV*s\"'KSˈ\b@l\rs:_\u000f43c\u001b\u000bTgqn1y\b[ZtnL\u0015\u0004\u0004h<q8\nG\u0007\u000fX\u000fЯ\u0016Tiv1ҊW̼\u00148 S-\u0010\u0006ٚj`._sȄ)ֲzF>˧ܷQ\t"}, d2 = {"\u0013l_Al\bG\\#\u000evm,{v>r\u00041}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "\u000fm]<g(MS\u0018l\nk0\u0006\u000b", "BdgA", "", ">`a.Z9:^\u001cl\nr3|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:[%BTC\u0011", "AoP;F;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9{Gr.#h\u0012'7C", "0tX9W\bG\\#\u000evm,{v>r\u00041}", "0tX9W,K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*\u0011.\u0019o`9\u00149", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "1n]AT0Ga", "", "0`b2F;:`(", "", "0`b285=", "B`a4X;,b\u0015\f\n", "B`a4X;\u001e\\\u0018", "3l_Al\bG\\#\u000evm,{v>r\u00041}", "4h[AX9+O\"\u0001zl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\"", "@`]4X:", "AsP?g", "3mS", "7mc2e:>Q(", ":Rc.e;", ":D]1", "@Rc.e;", "@D]1", "1`_6g(EW.~", ":nR._,%W'\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u0006,~@\b\u001e3t\u0016\u0015QQJA", "2dR.c0MO \u0003\u0010^", "5dc\u0019b*:Zt\b\u0004h;x\u00183o\t6", "", "5dc\u0019b*:Z\u0004z\bZ.\n\u0005:hm7\u0010G\u0001%", "5dc\u0019b*:Z\u0007\nvg\u001a\f\u001d6e\u000e", ";`_\u0012T*A>\u0015\fv`9x\u00142S\u000f<\u0003@", "2dU.h3M>\u0015\fv`9x\u00142S\u000f<\u0003@", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "/m]<g(MS\u0018l\nk0\u0006\u000b", "<na:T3Bh\u0019}eZ9x\u000b<a\u000b+iO\u0015\u001e\u0017U", "AtQ@g9B\\\u001bp~m/\u0007\u0019>P{5wB\u000e\u0013\"J]\u001dP}%C", "Bn;<j,K1\u0015\rz", "BnD=c,K1\u0015\rz", "Ehc545G](z\nb6\u0006", Global.BLANK, "Bsb\u000ea5Hb\u0015\u000e~h5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|K\u0005\u0001>b\b/3|\u001a8V\u0019", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDmrz%lh8\u0007p\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b3nWFhv;W]Dq\u000b\u001b\u0012\u001d9ty\u0018=\u0016Q\t\u001cyJrmWa)zWJCq.n\u0015mf=JC\"#u#$4&qp\u0001O\"n\u001c\u0001cpIbd5)>kj\u001c", "Cq[\u000ea5Hb\u0015\u000e~h5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9}I}\u0001>b\b/3|\u001a8V\u0019", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDmrz%lh8\u0007p\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b3nWFhw9P]Dq\u000b\u001b\u0012\u001d9ty\u0018=\u0016Q\t\u001cyJrmWa)zWJCq.n\u0015mf=JC\"#u#$4&qp\u0001O\"n\u001c\u0001cpIbd5)>kj\u001c", "B`V", "/m]<g(MW#\b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDmrz%lh8\u0007p\u00025{#XH\u00183X[t\u0007\u0002!g\u0012W-bk^=5j\u000e>\u001b\u0011.\u0013oJu\u0005\u0015\u0018c\u001cpzQ]\u0014PC\u001a\u0007IriVb]\tKKNpsE\u001ch\u001bk>D-_G\\\u0002mL?\u0006EZ\r{TCQdL\u0019xGy", "Ehc5?0GY", ":h]8", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9t@\u007f+\u0011b\u0007*Fi%2WL\u0011", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDmrz%lh8\u0007p\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b3nWFhn0R\b\u0017q\n\u0016%\nDnzK,vM\u0004$|E22KjgCHQN`9h\u0016h+&\u001bJ-\u0012\u0001\u001d%q\u001c\u0004MbX\r\u0004NCncP\u001bD\"!CmYU\u001b", "Ehc5F;RZ\u0019", "Ash9X", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDmrz%lh8\u0007p\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b3nWFhr(V}=u|\u0017\u0019{D~wB,vM\u0004$|E22KjgCHQN`9h\u0016h+&\u001bJ-\u0012\u0001\u001d%q\u001c\u0004MbX\r\u0004NCncP\u001bD\"!CmYU\u001b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDmrz%lh8\u0007p\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b3nWFhu7E\u000b)w\u0015\u0013\u0016c\u001cpzQ]\u0014PC\u001a\u0007IriVb]\tKKNpsE\u001ch\u001bk>D-_G\\\u0002mL?\u0006EZ\r{TCQdL\u0019xGy", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnnotatedStringKt {
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, null, 6, null);

    public static final boolean contains(int i2, int i3, int i4, int i5) {
        if (i2 > i4 || i5 > i3) {
            return false;
        }
        if (i3 == i5) {
            if ((i4 == i5) != (i2 == i3)) {
                return false;
            }
        }
        return true;
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(AnnotatedString annotatedString, ParagraphStyle paragraphStyle) {
        int length = annotatedString.getText().length();
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release == null) {
            paragraphStylesOrNull$ui_text_release = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = paragraphStylesOrNull$ui_text_release.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i2);
            ParagraphStyle paragraphStyleComponent1 = range.component1();
            int iComponent2 = range.component2();
            int iComponent3 = range.component3();
            if (iComponent2 != i3) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle, i3, iComponent2));
            }
            arrayList.add(new AnnotatedString.Range(paragraphStyle.merge(paragraphStyleComponent1), iComponent2, iComponent3));
            i2++;
            i3 = iComponent3;
        }
        if (i3 != length) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, i3, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    public static final List<AnnotatedString.Range<SpanStyle>> getLocalSpanStyles(AnnotatedString annotatedString, int i2, int i3) {
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release;
        if (i2 == i3 || (spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i2 == 0 && i3 >= annotatedString.getText().length()) {
            return spanStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(spanStylesOrNull$ui_text_release.size());
        int size = spanStylesOrNull$ui_text_release.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i4);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList2.get(i5);
            arrayList3.add(new AnnotatedString.Range(range3.getItem(), RangesKt.coerceIn(range3.getStart(), i2, i3) - i2, RangesKt.coerceIn(range3.getEnd(), i2, i3) - i2));
        }
        return arrayList3;
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> getLocalParagraphStyles(AnnotatedString annotatedString, int i2, int i3) {
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release;
        if (i2 == i3 || (paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i2 == 0 && i3 >= annotatedString.getText().length()) {
            return paragraphStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
        int size = paragraphStylesOrNull$ui_text_release.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i4);
            AnnotatedString.Range<ParagraphStyle> range2 = range;
            if (intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList2.get(i5);
            arrayList3.add(new AnnotatedString.Range(range3.getItem(), RangesKt.coerceIn(range3.getStart(), i2, i3) - i2, RangesKt.coerceIn(range3.getEnd(), i2, i3) - i2));
        }
        return arrayList3;
    }

    public static final List<AnnotatedString.Range<? extends Object>> getLocalAnnotations(AnnotatedString annotatedString, int i2, int i3) {
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release;
        if (i2 == i3 || (annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release()) == null) {
            return null;
        }
        if (i2 == 0 && i3 >= annotatedString.getText().length()) {
            return annotations$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(annotations$ui_text_release.size());
        int size = annotations$ui_text_release.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<? extends Object> range = annotations$ui_text_release.get(i4);
            AnnotatedString.Range<? extends Object> range2 = range;
            if (intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList2.get(i5);
            arrayList3.add(new AnnotatedString.Range(range3.getItem(), RangesKt.coerceIn(range3.getStart(), i2, i3) - i2, RangesKt.coerceIn(range3.getEnd(), i2, i3) - i2, range3.getTag()));
        }
        return arrayList3;
    }

    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i2, int i3) {
        String strSubstring;
        if (i2 != i3) {
            strSubstring = annotatedString.getText().substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        return new AnnotatedString(strSubstring, getLocalSpanStyles(annotatedString, i2, i3), null, null, 12, null);
    }

    public static final <T> List<T> mapEachParagraphStyle(AnnotatedString annotatedString, ParagraphStyle paragraphStyle, Function2<? super AnnotatedString, ? super AnnotatedString.Range<ParagraphStyle>, ? extends T> function2) {
        List<AnnotatedString.Range<ParagraphStyle>> listNormalizedParagraphStyles = normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<ParagraphStyle> range = listNormalizedParagraphStyles.get(i2);
            arrayList.add(function2.invoke(substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.AnnotatedStringKt$toUpperCase$1 */
    /* JADX INFO: compiled from: AnnotatedString.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,u\bDJc|\u0004O\f8\u000b4B\rӬD\u0012&\u0006\u0017nG0\\ev-\u0003W8\u0010\u0004{b&\f(\u007fFSUH\u007fh\u0011ҊRgmr"}, d2 = {"\n`]<a@F])\rS", "", "Asa", "AsP?g", "", "3mS", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07811 extends Lambda implements Function3<String, Integer, Integer, String> {
        C07811() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
            return invoke(str, num.intValue(), num2.intValue());
        }

        public final String invoke(String str, int i2, int i3) {
            String strSubstring = str.substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return StringKt.toUpperCase(strSubstring, localeList);
        }
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    public static final AnnotatedString toUpperCase(AnnotatedString annotatedString, LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.toUpperCase.1
            C07811() {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            public final String invoke(String str, int i2, int i3) {
                String strSubstring = str.substring(i2, i3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.toUpperCase(strSubstring, localeList);
            }
        });
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.AnnotatedStringKt$toLowerCase$1 */
    /* JADX INFO: compiled from: AnnotatedString.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,u\bDJc|\u0004O\f8\u000b4B\rӬD\u0012&\u0006\u0017nG0\\ev-\u0003W8\u0010\u0004{b&\f(\u007fFSUH\u007fh\u0011ҊRgmr"}, d2 = {"\n`]<a@F])\rS", "", "Asa", "AsP?g", "", "3mS", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07801 extends Lambda implements Function3<String, Integer, Integer, String> {
        C07801() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
            return invoke(str, num.intValue(), num2.intValue());
        }

        public final String invoke(String str, int i2, int i3) {
            String strSubstring = str.substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return StringKt.toLowerCase(strSubstring, localeList);
        }
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    public static final AnnotatedString toLowerCase(AnnotatedString annotatedString, LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.toLowerCase.1
            C07801() {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            public final String invoke(String str, int i2, int i3) {
                String strSubstring = str.substring(i2, i3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.toLowerCase(strSubstring, localeList);
            }
        });
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.AnnotatedStringKt$capitalize$1 */
    /* JADX INFO: compiled from: AnnotatedString.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,u\bDJc|\u0004O\f8\u000b4B\rӬD\u0012&\u0006\u0017nG0\\ev-\u0003W8\u0010\u0004{b&\f(\u007fFSUH\u007fh\u0011ҊRgmr"}, d2 = {"\n`]<a@F])\rS", "", "Asa", "AsP?g", "", "3mS", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function3<String, Integer, Integer, String> {
        AnonymousClass1() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
            return invoke(str, num.intValue(), num2.intValue());
        }

        public final String invoke(String str, int i2, int i3) {
            if (i2 != 0) {
                String strSubstring = str.substring(i2, i3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
            }
            String strSubstring2 = str.substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return StringKt.capitalize(strSubstring2, localeList);
        }
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return capitalize(annotatedString, localeList);
    }

    public static final AnnotatedString capitalize(AnnotatedString annotatedString, LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.capitalize.1
            AnonymousClass1() {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            public final String invoke(String str, int i2, int i3) {
                if (i2 != 0) {
                    String strSubstring = str.substring(i2, i3);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return strSubstring;
                }
                String strSubstring2 = str.substring(i2, i3);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.capitalize(strSubstring2, localeList);
            }
        });
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.AnnotatedStringKt$decapitalize$1 */
    /* JADX INFO: compiled from: AnnotatedString.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,u\bDJc|\u0004O\f8\u000b4B\rӬD\u0012&\u0006\u0017nG0\\ev-\u0003W8\u0010\u0004{b&\f(\u007fFSUH\u007fh\u0011ҊRgmr"}, d2 = {"\n`]<a@F])\rS", "", "Asa", "AsP?g", "", "3mS", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07791 extends Lambda implements Function3<String, Integer, Integer, String> {
        C07791() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
            return invoke(str, num.intValue(), num2.intValue());
        }

        public final String invoke(String str, int i2, int i3) {
            if (i2 != 0) {
                String strSubstring = str.substring(i2, i3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
            }
            String strSubstring2 = str.substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return StringKt.decapitalize(strSubstring2, localeList);
        }
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    public static final AnnotatedString decapitalize(AnnotatedString annotatedString, LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.decapitalize.1
            C07791() {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            public final String invoke(String str, int i2, int i3) {
                if (i2 != 0) {
                    String strSubstring = str.substring(i2, i3);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return strSubstring;
                }
                String strSubstring2 = str.substring(i2, i3);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.decapitalize(strSubstring2, localeList);
            }
        });
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, SpanStyle spanStyle, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushStyle = builder.pushStyle(spanStyle);
        try {
            return function1.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushStyle);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, ParagraphStyle paragraphStyle, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushStyle = builder.pushStyle(paragraphStyle);
        try {
            return function1.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushStyle);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder builder, String str, String str2, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushStringAnnotation = builder.pushStringAnnotation(str, str2);
        try {
            return function1.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushStringAnnotation);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder builder, TtsAnnotation ttsAnnotation, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return function1.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushTtsAnnotation);
            InlineMarker.finallyEnd(1);
        }
    }

    @Deprecated(message = "\u0018Y\u0001t]}#b9U6\nd\u0016@WkZH\btQKX\u0006X.vW\u0003/y(UrUaai=", replaceWith = @ReplaceWith(expression = "withLink(, block)", imports = {}))
    @InterfaceC1492Gx
    public static final <R> R withAnnotation(AnnotatedString.Builder builder, UrlAnnotation urlAnnotation, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushUrlAnnotation = builder.pushUrlAnnotation(urlAnnotation);
        try {
            return function1.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushUrlAnnotation);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R withLink(AnnotatedString.Builder builder, LinkAnnotation linkAnnotation, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushLink = builder.pushLink(linkAnnotation);
        try {
            return function1.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushLink);
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    public static final AnnotatedString AnnotatedString(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, CollectionsKt.listOf(new AnnotatedString.Range(spanStyle, 0, str.length())), paragraphStyle == null ? CollectionsKt.emptyList() : CollectionsKt.listOf(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    public static final AnnotatedString AnnotatedString(String str, ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, CollectionsKt.emptyList(), CollectionsKt.listOf(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    public static final AnnotatedString buildAnnotatedString(Function1<? super AnnotatedString.Builder, Unit> function1) {
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        function1.invoke(builder);
        return builder.toAnnotatedString();
    }

    public static final boolean intersect(int i2, int i3, int i4, int i5) {
        return Math.max(i2, i4) < Math.min(i3, i5) || contains(i2, i3, i4, i5) || contains(i4, i5, i2, i3);
    }

    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }

    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException(("start (" + i2 + ") should be less than or equal to end (" + i3 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<? extends T> range = list.get(i4);
            AnnotatedString.Range<? extends T> range2 = range;
            if (intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList2.get(i5);
            arrayList3.add(new AnnotatedString.Range(range3.getItem(), Math.max(i2, range3.getStart()) - i2, Math.min(i3, range3.getEnd()) - i2, range3.getTag()));
        }
        ArrayList arrayList4 = arrayList3;
        return arrayList4.isEmpty() ? null : arrayList4;
    }
}
