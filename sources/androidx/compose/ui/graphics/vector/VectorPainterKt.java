package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.vector.VectorProperty;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: VectorPainter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яę\u0014D߬)\u001ew\fL܀kt\u0012A\u000eֶ\u0013.X~*ܥ\u001aw\u0015\tr9FDmH4R[*%k\u0004é,[:qKП]\u001a\u0014\"\u0011OThon`Z\u0013¼\u0017\u0006,xrߚQU\u000f]\u001aƁ:B\u0006?;ݹw=O`|6\u000b :\"F~\r\u0001 /P\u0010\rzKK\u0012\u00138@\u0007:Z\rc\u0005\"\u0012\u001c>(\u00014\\oN<It]H8+\u0003oJV'u0\u0005ձ\u0015Fj'\u0015vw\u001e3@=7-Na\u0003\u001fR\n@3C\u007f?\u001dhU*[[yWD\\\u0018 %-_\r\fq6^\u0015Q\u000f\u0012U0\u0016hׂT\u000e6~\u0013\u001e\u001bD\u001c\u0010\u001c&v7]\u001et\u0012&3#}\u0004D^\u000evB.\b(6҆$ĮĴ/;!t_pS7\\G\u0014\u0005;/S\u0005|3sT<sE\u001fb\fi1\u007fUmL\\ q=\u001c\u001b7ç\u001aR\u0012H_\u007f]\u0015A2%?O[g<Qo\u0010c\\g%!\u0011la\u0007jHn>5\u0016\u05ec)\u009eɔ^Fj#yolk:1e\u001c\u0003\u0018.\f!Atwj6k\u0015ʽShw\reρ\t3O~7\b\u007f\u001c\u0012e\\v3cu\u0014\u0014ow\u000f\u0014m`\u0013\u000b^fPn$Z\u000bDR8Nj\u001e\u0015\u0014D|(C8Eq*ZD1G[EN\t\u001ePK\u0015\t\u000ee\u0019\u0016\u0005TA0\u001biR\u00029?^\u0004\t*w\nY;+|Ę1KW^),[Hx6\u0003)-\u001a\u0004\u0011Wvzcƥp {~\f&\u001c@IS5C9,\u000f+B\u0002[Fz\u001bϯUM\u0018Qϸ\u0001y\u0015f/3֏\u0007ξҔ0bpv]\u0002/Ȓul\u0013;\b\u0013\u0011*eT\u001e_c\u0003/\fBW\u0018\u001bYjrh\u0003\u000b\u001f,@\u0019oP\u0019e3I'+3\u0010\u0014]1\u0012coo< z\u000fTs\u0016\n2c$yzQ\f=k>OY\rJ:$\u001b\u0010rNpw\u0016p!4;bx\u007fr\u0018nr]\u001c?\r\u0015#Ր\u0011z\\\u0005J\u0019u$D0e0\u001a^\u000e%nRS-ߠWqs\u0017[b\u0011p\u001f\f\u0011\u0002W\f\"\u001eM \u0005X\u00111ޘ\ns\u001e`װ?b\u000bgO)Ԃ+фޭ\u000fEZ\u001a\u0014A\u0013BT\u0012'\u0017`S\u001c;\u0005\u001f\u0005|jp`\u0005\u000f^\u0011%84\u0017\u000fa7);7\u0005{ll/\u001211Y+=3le}\u0015.[JZ9)Vp\u00019t$ŝΫ\u0001ԍ\u0086K+s!}BP*\u000bTZ\u0018IPy\u0011\u000e\u000e`b\u0019\u000e|N\u0013yXצjr0b\u0017z+\u000fd\n=EId\u0001+z>\\P\b7qT\u0011\u0019T)5\r+ ̍\u001f-\frs֔O\u000385:oSi\u00170 N:4x/\u007fo\u000e\u0015.\u000e\u001fH;\n\u0016\u0011&O\u0013Ҝ\u001fɌ̛NvxI<HV[\u0010֯\u001a\u0013\rXBճs͛++tݩןKm\u0001\riػ\u007f\u001dT̬\u0007("}, d2 = {" n^A:9Hc$gvf,", "", " d]1X9/S\u0017\u000e\u0005k\u000e\n\u0013?p", "", "5q^Bc", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\u007f\"rqD\\", "1n]3\\.L", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA{\u001fqb=\t9", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~j}\u001eFw#w>C9z>+vukI\u00129\u0013Sr8C\u0016^;`Y<%\u0010\u001d0tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u000e\u001c\u001f\u001d9rp\f4\u001aO\u0005\u001f\u0004A6>*=#j", "1qT.g,\u001c] \t\b?0\u0004\u0018/r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "Bh]A66E]&", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Bh]A53>\\\u0018f\u0005],", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "1qT.g,\u001c] \t\b?0\u0004\u0018/rG;[/\n$\u0016U", "uI8u?(GR&\t~]?F\u00079m\u000b2\n@J'\u001b\u0011q\u001b8\u0002(9W\fi\u0015w\u001d8Z$?rC\u001e\">", "1qT.g,/S\u0017\u000e\u0005k\u0017x\r8t\u007f5\\M\u000b\u001fzOk\u0010<g%3h\b-", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\u0011ljH\u0007p\u0002", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "7lP4X\u001d>Q(\t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0012U?=k%\u001e\u0013wkF\\", "@n^A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0010ZMKv\u0012(\u001dskB\u0007l;$", "=ac.\\5/W\u0019\u0011\u0006h9\fv3z\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "2dU.h3MA\u001d\u0014z", "DhTDc6Kb\u000b\u0003ym/", "", "DhTDc6Kb{~~`/\f", "=ac.\\5/W\u0019\u0011\u0006h9\fv3z\u007fofLT,+VS", "uI5\u0013\u001c\u0011", "@d\\2`)>`\n~xm6\ns+i\t7{M", "7lP4X", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~j}\u001eFw#w1K7m4\u000f\u0015fpC\u00149\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001a\u0015bP(vD\u0001|\u00124T\fIh\u000eayQ\u001cfyAc\u001aKx(??3pQcmy\u0011QI,,q\bj `8Hm%q\u0017*r]wz{Q |_dckP(zEy", "2dU.h3ME\u001d}\na", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "2dU.h3M6\u0019\u0003|a;", "<`\\2", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA{\u001fplC\u0015_)Uv|", "@d\\2`)>`\n~xm6\ns+i\t7{MH\u001f\u001e0}v\u001d\u0005", "uE5\u00139\u0013CO*zDe(\u0006\u000bxS\u000f5\u007fI\u0003l{+V\u0014F\u0006,9bG%Hu_/]L9z8(\u001ev+\u001a\u0017l*]z1P\u001b$\u0013X[qJ\u001e\u0016Y!\u0018)\u0017\rdK2n\u000eD/\u0011;M\n;2^\u0016\u001e\u0019?xpO,s+={qJ(uP]^\r\u0011?Oj5n\u001a_fl>\u0004&!m$\u001elN<S\rS\u000f\u0002\\\u00071XG\u0017\nB1)i_OTob\u0012", "/tc<@0K`#\f", "", "@d\\2`)>`\n~xm6\ns+i\t7{MH(z2B~#f", "uE5\u00139\u0013CO*zDe(\u0006\u000bxS\u000f5\u007fI\u0003l{+dtB\u00014<]\u0007i<~\u001ewNSDiC\"\u001fqo\u0003gs5L\u0006+QU\u001d\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001,\u00185X\u0006ChJi \u0016@t~Bce+]X\\=2gSccxZ\u000bCl2o\u0016m\u001d&J>m\u0016~\u0015&kT,\u0018Ed\u0011pa\u0004t18\u0019xG.KXWJN~UIJ", "1n]3\\.N`\u0019oz\\;\u0007\u0016\u001aa\u00041\u000b@\u000e", "DhTDc6Kb\u0007\u0003\u0010^", "7mc?\\5LW\u0017\\\u0005e6\ni3l\u000f(\t", "1n]3\\.N`\u0019oz\\;\u0007\u0016\u001aa\u00041\u000b@\u000e^\u0006\u0016Z~*hw", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~j}\u001eFw#w>C9z>+\u007fdeB\u0016c9$[\f.QJ=X\u001cy9\u001d\u0014${]8\u0011\u000e[\u0017\u000bjM6,\u00120H\u0015\u0005f\u000b\u0014!\u0018Cj:RZYI\u0007\u0011\u0001D-fT#=\u0004NKRC.k\u001b_*2/}\u000b\u0010z\u0018(rT-\u001dEQ\u001bz]\u0004ug\u0011)~\u0002&KifIImc\u0006\u0006'\u001dZ\u0006\u0005[#Xr:~:n0.?s\u0005X=", "1qT.g, `#\u000f\u0006<6\u0005\u00149n\u007f1\u000b", "1ta?X5M5&\t\u000bi", ";ha?b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "=ac.\\5,W.~eq", "=ac.\\5,W.~eqsm\u0014#3\u0015\u0011J", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\rNvq2", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VectorPainterKt {
    public static final String RootGroupName = "VectorRootGroup";

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$2 */
    /* JADX INFO: compiled from: VectorPainter.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Map<String, VectorConfig> $configs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Map<String, ? extends VectorConfig> map, int i2, int i3) {
            super(2);
            map = map;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            VectorPainterKt.RenderVectorGroup(vectorGroup, map, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    @Deprecated(message = "\u0015K\fArw\u001a\u0017jL5\u007f]\u00171`RQ\f;\u0014z{S\u007fT\u0003o`4+xi\\lKPoT:_#Ey&^M\u000ea[WIxSA\u0017\u001f\u0007(L 65\u0017\u0007\u001b/D%]\u0010\u000boa\u000e\bI\u0017", replaceWith = @ReplaceWith(expression = "rememberVectorPainter(defaultWidth, defaultHeight, viewportWidth, viewportHeight, name, tintColor, tintBlendMode, false, content)", imports = {"androidx.compose.ui.graphics.vector"}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: rememberVectorPainter-mlNsNFs */
    public static final VectorPainter m4897rememberVectorPaintermlNsNFs(float f2, float f3, float f4, float f5, String str, long j2, int i2, Function4<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> function4, Composer composer, int i3, int i4) {
        int iM4118getSrcIn0nO6VwU = i2;
        String str2 = str;
        long jM4214getUnspecified0d7_KjU = j2;
        float f6 = f4;
        ComposerKt.sourceInformationMarkerStart(composer, -964365210, "C(rememberVectorPainter)P(2:c#ui.unit.Dp,1:c#ui.unit.Dp,7,6,3,5:c#ui.graphics.Color,4:c#ui.graphics.BlendMode)86@3732L207:VectorPainter.kt#huu6hf");
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            f6 = Float.NaN;
        }
        float f7 = (-1) - (((-1) - i4) | ((-1) - 8)) == 0 ? f5 : Float.NaN;
        if ((i4 & 16) != 0) {
            str2 = RootGroupName;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 64) != 0) {
            iM4118getSrcIn0nO6VwU = BlendMode.Companion.m4118getSrcIn0nO6VwU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-964365210, i3, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:86)");
        }
        int i5 = i3 & 14;
        int i6 = (i5 + 12582912) - (i5 & 12582912);
        int i7 = (i3 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i3);
        int i8 = (i6 + i7) - (i6 & i7);
        int i9 = (i3 + 896) - (896 | i3);
        int i10 = ((i8 + i9) - (i8 & i9)) | ((-1) - (((-1) - i3) | ((-1) - 7168))) | ((57344 + i3) - (57344 | i3)) | (458752 & i3) | ((-1) - (((-1) - 3670016) | ((-1) - i3)));
        int i11 = i3 << 3;
        int i12 = (i11 + 234881024) - (i11 | 234881024);
        VectorPainter vectorPainterM4898rememberVectorPaintervIP8VLU = m4898rememberVectorPaintervIP8VLU(f2, f3, f6, f7, str2, jM4214getUnspecified0d7_KjU, iM4118getSrcIn0nO6VwU, false, function4, composer, (i10 + i12) - (i10 & i12), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return vectorPainterM4898rememberVectorPaintervIP8VLU;
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0194  */
    /* JADX INFO: renamed from: rememberVectorPainter-vIP8VLU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.graphics.vector.VectorPainter m4898rememberVectorPaintervIP8VLU(float r10, float r11, float r12, float r13, java.lang.String r14, long r15, int r17, boolean r18, final kotlin.jvm.functions.Function4<? super java.lang.Float, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorPainterKt.m4898rememberVectorPaintervIP8VLU(float, float, float, float, java.lang.String, long, int, boolean, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int):androidx.compose.ui.graphics.vector.VectorPainter");
    }

    public static final VectorPainter rememberVectorPainter(ImageVector imageVector, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1413834416, "C(rememberVectorPainter)172@7145L7,174@7229L215:VectorPainter.kt#huu6hf");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1413834416, i2, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:171)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) objConsume;
        long jFloatToRawIntBits = (-1) - (((-1) - ((-1) - (((-1) - ((long) Float.floatToRawIntBits(density.getDensity()))) | ((-1) - 4294967295L)))) & ((-1) - (((long) Float.floatToRawIntBits(imageVector.getGenId$ui_release())) << 32)));
        ComposerKt.sourceInformationMarkerStart(composer, -1837470287, "CC(remember):VectorPainter.kt#9igjgp");
        boolean zChanged = composer.changed(jFloatToRawIntBits);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            GroupComponent groupComponent = new GroupComponent();
            createGroupComponent(groupComponent, imageVector.getRoot());
            Unit unit = Unit.INSTANCE;
            objRememberedValue = createVectorPainterFromImageVector(density, imageVector, groupComponent);
            composer.updateRememberedValue(objRememberedValue);
        }
        VectorPainter vectorPainter = (VectorPainter) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return vectorPainter;
    }

    /* JADX INFO: renamed from: obtainSizePx-VpY3zN4 */
    private static final long m4895obtainSizePxVpY3zN4(Density density, float f2, float f3) {
        return SizeKt.Size(density.mo710toPx0680j_4(f2), density.mo710toPx0680j_4(f3));
    }

    /* JADX INFO: renamed from: obtainViewportSize-Pq9zytI */
    private static final long m4896obtainViewportSizePq9zytI(long j2, float f2, float f3) {
        if (Float.isNaN(f2)) {
            f2 = Size.m4006getWidthimpl(j2);
        }
        if (Float.isNaN(f3)) {
            f3 = Size.m4003getHeightimpl(j2);
        }
        return SizeKt.Size(f2, f3);
    }

    /* JADX INFO: renamed from: createColorFilter-xETnrds */
    private static final ColorFilter m4894createColorFilterxETnrds(long j2, int i2) {
        if (j2 != 16) {
            return ColorFilter.Companion.m4222tintxETnrds(j2, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: configureVectorPainter-T4PVSW8$default */
    public static /* synthetic */ VectorPainter m4893configureVectorPainterT4PVSW8$default(VectorPainter vectorPainter, long j2, long j3, String str, ColorFilter colorFilter, boolean z2, int i2, Object obj) {
        if ((4 & i2) != 0) {
            str = RootGroupName;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            z2 = false;
        }
        return m4892configureVectorPainterT4PVSW8(vectorPainter, j2, j3, str, colorFilter, z2);
    }

    /* JADX INFO: renamed from: configureVectorPainter-T4PVSW8 */
    public static final VectorPainter m4892configureVectorPainterT4PVSW8(VectorPainter vectorPainter, long j2, long j3, String str, ColorFilter colorFilter, boolean z2) {
        vectorPainter.m4890setSizeuvyYCjk$ui_release(j2);
        vectorPainter.setAutoMirror$ui_release(z2);
        vectorPainter.setIntrinsicColorFilter$ui_release(colorFilter);
        vectorPainter.m4891setViewportSizeuvyYCjk$ui_release(j3);
        vectorPainter.setName$ui_release(str);
        return vectorPainter;
    }

    public static final VectorPainter createVectorPainterFromImageVector(Density density, ImageVector imageVector, GroupComponent groupComponent) {
        long jM4895obtainSizePxVpY3zN4 = m4895obtainSizePxVpY3zN4(density, imageVector.m4866getDefaultWidthD9Ej5fM(), imageVector.m4865getDefaultHeightD9Ej5fM());
        return m4892configureVectorPainterT4PVSW8(new VectorPainter(groupComponent), jM4895obtainSizePxVpY3zN4, m4896obtainViewportSizePq9zytI(jM4895obtainSizePxVpY3zN4, imageVector.getViewportWidth(), imageVector.getViewportHeight()), imageVector.getName(), m4894createColorFilterxETnrds(imageVector.m4868getTintColor0d7_KjU(), imageVector.m4867getTintBlendMode0nO6VwU()), imageVector.getAutoMirror());
    }

    public static final GroupComponent createGroupComponent(GroupComponent groupComponent, VectorGroup vectorGroup) {
        int size = vectorGroup.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            VectorNode vectorNode = vectorGroup.get(i2);
            if (vectorNode instanceof VectorPath) {
                PathComponent pathComponent = new PathComponent();
                VectorPath vectorPath = (VectorPath) vectorNode;
                pathComponent.setPathData(vectorPath.getPathData());
                pathComponent.m4876setPathFillTypeoQ8Xj4U(vectorPath.m4899getPathFillTypeRgk1Os());
                pathComponent.setName(vectorPath.getName());
                pathComponent.setFill(vectorPath.getFill());
                pathComponent.setFillAlpha(vectorPath.getFillAlpha());
                pathComponent.setStroke(vectorPath.getStroke());
                pathComponent.setStrokeAlpha(vectorPath.getStrokeAlpha());
                pathComponent.setStrokeLineWidth(vectorPath.getStrokeLineWidth());
                pathComponent.m4877setStrokeLineCapBeK7IIE(vectorPath.m4900getStrokeLineCapKaPHkGw());
                pathComponent.m4878setStrokeLineJoinWw9F2mQ(vectorPath.m4901getStrokeLineJoinLxFBmk8());
                pathComponent.setStrokeLineMiter(vectorPath.getStrokeLineMiter());
                pathComponent.setTrimPathStart(vectorPath.getTrimPathStart());
                pathComponent.setTrimPathEnd(vectorPath.getTrimPathEnd());
                pathComponent.setTrimPathOffset(vectorPath.getTrimPathOffset());
                groupComponent.insertAt(i2, pathComponent);
            } else if (vectorNode instanceof VectorGroup) {
                GroupComponent groupComponent2 = new GroupComponent();
                VectorGroup vectorGroup2 = (VectorGroup) vectorNode;
                groupComponent2.setName(vectorGroup2.getName());
                groupComponent2.setRotation(vectorGroup2.getRotation());
                groupComponent2.setScaleX(vectorGroup2.getScaleX());
                groupComponent2.setScaleY(vectorGroup2.getScaleY());
                groupComponent2.setTranslationX(vectorGroup2.getTranslationX());
                groupComponent2.setTranslationY(vectorGroup2.getTranslationY());
                groupComponent2.setPivotX(vectorGroup2.getPivotX());
                groupComponent2.setPivotY(vectorGroup2.getPivotY());
                groupComponent2.setClipPathData(vectorGroup2.getClipPathData());
                createGroupComponent(groupComponent2, vectorGroup2);
                groupComponent.insertAt(i2, groupComponent2);
            }
        }
        return groupComponent;
    }

    public static final void RenderVectorGroup(VectorGroup vectorGroup, Map<String, ? extends VectorConfig> map, Composer composer, int i2, int i3) {
        int i4;
        Map<String, ? extends VectorConfig> mapEmptyMap = map;
        Composer composerStartRestartGroup = composer.startRestartGroup(-446179233);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(RenderVectorGroup)P(1):VectorPainter.kt#huu6hf");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (composerStartRestartGroup.changed(vectorGroup) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(mapEmptyMap) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-446179233, i4, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:430)");
            }
            for (VectorNode vectorNode : vectorGroup) {
                if (vectorNode instanceof VectorPath) {
                    composerStartRestartGroup.startReplaceGroup(-23647808);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "434@16086L1719");
                    VectorPath vectorPath = (VectorPath) vectorNode;
                    VectorConfig vectorConfig = mapEmptyMap.get(vectorPath.getName());
                    if (vectorConfig == null) {
                        vectorConfig = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$1
                        };
                    }
                    VectorComposeKt.m4882Path9cdaXJ4((List) vectorConfig.getOrDefault(VectorProperty.PathData.INSTANCE, vectorPath.getPathData()), vectorPath.m4899getPathFillTypeRgk1Os(), vectorPath.getName(), (Brush) vectorConfig.getOrDefault(VectorProperty.Fill.INSTANCE, vectorPath.getFill()), ((Number) vectorConfig.getOrDefault(VectorProperty.FillAlpha.INSTANCE, Float.valueOf(vectorPath.getFillAlpha()))).floatValue(), (Brush) vectorConfig.getOrDefault(VectorProperty.Stroke.INSTANCE, vectorPath.getStroke()), ((Number) vectorConfig.getOrDefault(VectorProperty.StrokeAlpha.INSTANCE, Float.valueOf(vectorPath.getStrokeAlpha()))).floatValue(), ((Number) vectorConfig.getOrDefault(VectorProperty.StrokeLineWidth.INSTANCE, Float.valueOf(vectorPath.getStrokeLineWidth()))).floatValue(), vectorPath.m4900getStrokeLineCapKaPHkGw(), vectorPath.m4901getStrokeLineJoinLxFBmk8(), vectorPath.getStrokeLineMiter(), ((Number) vectorConfig.getOrDefault(VectorProperty.TrimPathStart.INSTANCE, Float.valueOf(vectorPath.getTrimPathStart()))).floatValue(), ((Number) vectorConfig.getOrDefault(VectorProperty.TrimPathEnd.INSTANCE, Float.valueOf(vectorPath.getTrimPathEnd()))).floatValue(), ((Number) vectorConfig.getOrDefault(VectorProperty.TrimPathOffset.INSTANCE, Float.valueOf(vectorPath.getTrimPathOffset()))).floatValue(), composerStartRestartGroup, 0, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (vectorNode instanceof VectorGroup) {
                    composerStartRestartGroup.startReplaceGroup(-21815553);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "513@19224L88,479@17944L1368");
                    VectorGroup vectorGroup2 = (VectorGroup) vectorNode;
                    VectorConfig vectorConfig2 = mapEmptyMap.get(vectorGroup2.getName());
                    if (vectorConfig2 == null) {
                        vectorConfig2 = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$2
                        };
                    }
                    VectorComposeKt.Group(vectorGroup2.getName(), ((Number) vectorConfig2.getOrDefault(VectorProperty.Rotation.INSTANCE, Float.valueOf(vectorGroup2.getRotation()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.PivotX.INSTANCE, Float.valueOf(vectorGroup2.getPivotX()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.PivotY.INSTANCE, Float.valueOf(vectorGroup2.getPivotY()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.ScaleX.INSTANCE, Float.valueOf(vectorGroup2.getScaleX()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.ScaleY.INSTANCE, Float.valueOf(vectorGroup2.getScaleY()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TranslateX.INSTANCE, Float.valueOf(vectorGroup2.getTranslationX()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TranslateY.INSTANCE, Float.valueOf(vectorGroup2.getTranslationY()))).floatValue(), (List) vectorConfig2.getOrDefault(VectorProperty.PathData.INSTANCE, vectorGroup2.getClipPathData()), ComposableLambdaKt.rememberComposableLambda(1450046638, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt.RenderVectorGroup.1
                        final /* synthetic */ Map<String, VectorConfig> $configs;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(Map<String, ? extends VectorConfig> mapEmptyMap2) {
                            super(2);
                            map = mapEmptyMap2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            ComposerKt.sourceInformation(composer2, "C514@19242L56:VectorPainter.kt#huu6hf");
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1450046638, i6, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:514)");
                            }
                            VectorPainterKt.RenderVectorGroup((VectorGroup) vectorNode, map, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306368, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-20402883);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt.RenderVectorGroup.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Map<String, VectorConfig> $configs;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(Map<String, ? extends VectorConfig> mapEmptyMap2, int i22, int i32) {
                    super(2);
                    map = mapEmptyMap2;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    VectorPainterKt.RenderVectorGroup(vectorGroup, map, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1 */
    /* JADX INFO: compiled from: VectorPainter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Map<String, VectorConfig> $configs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Map<String, ? extends VectorConfig> mapEmptyMap2) {
            super(2);
            map = mapEmptyMap2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer2, int i6) {
            ComposerKt.sourceInformation(composer2, "C514@19242L56:VectorPainter.kt#huu6hf");
            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1450046638, i6, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:514)");
            }
            VectorPainterKt.RenderVectorGroup((VectorGroup) vectorNode, map, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    private static final void mirror(DrawScope drawScope, Function1<? super DrawScope, Unit> function1) {
        long jMo4733getCenterF1C5BW0 = drawScope.mo4733getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4662scale0AR0LA0(-1.0f, 1.0f, jMo4733getCenterF1C5BW0);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }
}
