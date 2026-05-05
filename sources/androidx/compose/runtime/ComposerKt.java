package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĩ\u0014D߬)\u001e\u007f\u007fLDyt\fǻ\u000e0\u0019ǞJ~(/\u001aw\u0015lr96DmHDR[*\u0015\u000b\u000442d,qY;]ڼ\u0006\"\u001fOVgmnRZ!C\u0017\u0006\u001cyr,WU\u0001ز\u001a\u000f@NwЀ;M}<A`z:\r H\"@y\u000b\u0005\"*^\u0010~zIK\u0014\u0012F@x:X\u0019U\u00050\u0012\u000e>&\u0001&\\ul>H\u0003]Bǂ+\u0003\u007fBV'e0\u0005M#F\\'\u0013xi\u001e9_?5\u001b+[\u0003\u001dRc?\tKy=\u001bh/ݐCW\u0002\u000eNX.KE/]EurT\u0016Kĩx\u001a5egcy\f>,\u00063\u0014\rj=Tͺ?n<i2h\u001e\rav#YN\u000e\u001a`X~)cf\u001d3>K-O\u001a\u0015S\u0012A'\u000eO}\u001b\fL%Gn9abNx\u0015I\u0002>VI\u0001N~`Z\u001a[MmJ4r\u0004:\u0004v\f.q\u001c\u00134Ϗ3z{?) yFpD\u0016x5dv\u0019\u0002RvHhnގ;*\u0017RrRrL\u0004P\u0003\u0010\\\u0015[Yl\u0007,5Y\u05fet Jh=\u0010|\u0007\u0019mx\u000bu\nS\\\u0017Ag7\u0004\u0014g;n3c\u000b\u0012Y(\u05ed|ܠ?Bj\t^٨ZS\u001aYt>0|`j>/,H\\W+2m>L8:{1\\C\u0002I#ZO\u000bVwZ\u0017G/XAo\u001biRAO\u0006hz~>\u007fxwc-d0xYQceVY08L|Q\u000f/w\u000e\u0012\u007fLu\u00063\u001b\u000e[\np.\u001ag\tuB+5\rzJ\u0002[||vs!e\u0012U\u0003-}\u001d\u000e\u0001.\u0016\u0010\u001bt:4\u0003J}\\G&\u00053\u000b#6\u001eF~y\\\t\u0019{T9\u0013nM\u0001Rq<|@-\t-r=\u0001\u001e[C:EM5r.wB\\=a\fq6.\u0012l\u001d|\re24\f\u0016\u001e\u0010\u0018]JlF!q~\u0005zDn\tܩVC \bpUd\u0011A\"Yd\u001f\u0004h\\\u0019\n\u0016q\u0017.\u001dp\u001d4h\\̭\u000244;pϚI\u0382\u0018^Q\u0002)gaE\u0006u[`\u001bL%\t9}_M:\u001ck\u007f\u0007[piH\u0006\"y|ASt\u0013\u001f!$bcd\b9s\u0005m\u0014s\u0013\u007ftDUğJ\\\u0002!n\u000e\u0003\u0001\u0005Vv3\u0011In\bB\u0001-\u0017c\"\u0007\u001dI\u0005\u001cN\u001b/{X\u000f<5\u000f+l_~\u0015%Y.|?+*h\u00019E\f-y\u0006Dn_)\u001cs \u0010F\u0004\u0015\u001dp a9i)mcH^9]\rTtx\"f\u0001NP\u0013/~\u000b{T\n=\u0013_O\u000b\bp\u001cdN&?k \u0011\u0019T)5\f+Mv\u001f;sM-kQ1\u0014?\u001eeCS\u007f\u001e\u001fN',z1^g\u000e\u0015\n\f\u0005j\u001a\u007f\u0001z\u00027\u001b\u0001$\u0012\u001abt!\u0012t\bNy\u0010$\u001a\u0013\r\u0011\u0014}1B7+\u001b\u0006p5\u0019|\u0018Q\u0005c\u001d];\u0007t#ny\u001d \u0001#\u0017\u001be0)W\t<WS8z\u001ft,\u0015T'^\b\u0011W@Sq^\tk}c=/=bBa_8\u0003\"\f\u0017\u0012u22\u001b(-MdFVd7\u0014\u0015B\u0006>\u000fn6H\r\fWxCۈ`\u0003\u001f\rLF!U\r/eIO_\u001bBx\u00072My*/\u0018j?I?b\u0011}$\u000f\u0013\u00199\u0011vF*Z#\u0001|\u007f.CE\u0003=B-i&}d1&y/hF\u0016\u001a)\u000e?7!88^j\u00184;\u007fji\u001f!\u0003%84o5\u0003en_>=*/\u00051\u0011MeIkh{}r;i\u001dͶ\u001aofi\\UhRھ\u001a֍dr~{\u0014\u0007\u0015o\ra7[\u001d(7p\u0019\u0018٭#<\u001a\u0006%\u0010E_P:al@\u0005{g\u00076+|˖CQ؝k?݆\u0010L{&ĵ|aq6QzB\u0019r=\u0001˸nخIMpݟ+^\u001bF,7=\b_ؔmφ\u0012ޤuL3ߐ\u0003O5_k@+u\n?@gV\u000eUGq*45H˧:Ç=ҦUe\u0018ؾ\"\u000f\u0013\r\u00065rt\u000ej5\u001a=J%Q\r˪\u0005³Eh\u0013ٺ\u001f&d:P\u0010+\u0012$;`\u00170\u0006!ߺgΘ7G{ݝg\u001ed\n9\u001d?c{̸wڃnGGޟ\u0012rKHK\u000b\u001cL\u000f˂<ڦ\u0007Ȝ%WlƓ%\u0002p;<Kn@ ;f\f.YrZ(D'L^Ғ\u0007ߒ\u0003ʒ\u0003`Kי\u0011\u001e%Pc\u0019\u0006\u000b@vO[\u0013\u0019\u0002Ŏ*ּVU+ي\u0019\u001c\u0011%Y\u0019A\rTҍ\u0010ީ%Ѵ\u0011=Fϐ\u0018^Ok\u000bqa\u0012\txX'O\u001aMGYK\u001b^\u001cǪoٍ\u0012ך\u0010&/Ձ\u0016\u0015*{u\u0017\n(0y\u001bLdX_گ\"À\u0013ߒFv\u0017߇\u0005\u000e4'FY\u001e?\f-p\"UOm]D.\u001f\u0011}ڢAɺ|ڿsl|ɾ]G1\u0014'BQ\f\u001f\u0003g_Bp\bƁ/ƅ\u0019Ѝ*L\u001b˫*\u001f,\u0002\nLA2\u001dvqs\u000b\bb\u0003)YbsfٙPۺ9ΆBiF̡Xn\u001f\n]\u0002;kR\u0007!`\u001fJwŖ9۬.ɒ:Trߘ\u0011\u0003Q\u0007%\u0018OF|Iu9Z6oIk]SO\u0001ԑdÐ4ߢ\u0019\u0002eեF\u000fuT\u000b\u0019%Rt\u001c\u001cl3UfʚBͷ\u0005ծ^F$ޏj)s\u0013\u0016..\u0018\u000b0Dn\u0002Z(\u0381qʒh~+̎:Wee_!A0A<6`\u0004\u0017QэZ\u05f9)2\u0014\b%>P+U\u0003O \u00143\u0006\u001fw4\fN_<@ʱ\"ɋo\u0016\u001cePO]\u001b\u0003'k`ew5[dYo5@b\u007fͦ\nƜ+\u0006`6Pf0Xø\u0013ՠ\u0017"}, d2 = {"\u0017me._0=O(\u0003\u0005g\u0013\u0007\u0007+t\u00042\u0005\u001c\u000f\u0015\u0017Pn\u0012Ex", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9qE\b!<]|\u001cFq 7#", "1n\\=b:Bb\u001d\t\u0004E6z\u00056M{3", "", "5dc\u0010b4I]'\u0003\nb6\u0006o9c{/c<\fU\u0013Px\u0018Kr49c\u0007.", "u(E", "5dc\u0010b4I]'\u0003\nb6\u0006o9c{/c<\f", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1n\\=b:Bb\u001d\t\u0004E6z\u00056M{3a@\u0015", "", "5dc\u0010b4I]'\u0003\nb6\u0006o9c{/c<\f|\u0017[.\nE\u007f/DU\r$Av$", "1n\\=b:Bb\u001d\t\u0004M9x\u0007/r", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u001dZ?9kAs", "5dc\u0010b4I]'\u0003\nb6\u0006w<a}(\t~|  Q~\nKz/>g", "2dU.h3Ma~~\u000f", "7me._0=5&\t\u000bi\u0013\u0007\u0007+t\u00042\u0005", "7me<V(MW#\b", "5dc\u0016a=HQ\u0015\u000e~h5;\u00058n\n7wO\u0005! U", "5dc\u0016a=HQ\u0015\u000e~h5", "7me<V(MW#\b`^@", "5dc\u0016a=HQ\u0015\u000e~h5b\tC${1\u0005J\u0010\u0013&Ky\u0017J", "<nS2>,R", ">q^C\\+>`", "5dc\u001de6OW\u0018~\b\u001d(\u0006\u00129t{7\u007fJ\n%", "5dc\u001de6OW\u0018~\b", ">q^C\\+>`~~\u000f", "5dc\u001de6OW\u0018~\bD,\u0011G+n\t2\u000b<\u0010\u001b!P}", ">q^C\\+>`\u0001z\u0006l", "5dc\u001de6OW\u0018~\bF(\b\u0017ma\t1\u0006O|&\u001bQx\u001c", "5dc\u001de6OW\u0018~\bF(\b\u0017", ">q^C\\+>`\u0001z\u0006l\u0012|\u001d", "5dc\u001de6OW\u0018~\bF(\b\u0017\u0015e\u0014fwI\n!&C~\u0012F\u007f3", ">q^C\\+>`\nz\u0002n,\u000b", "5dc\u001de6OW\u0018~\bO(\u0004\u0019/s>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc\u001de6OW\u0018~\bO(\u0004\u0019/s", ">q^C\\+>`\nz\u0002n,\u000bn/y", "5dc\u001de6OW\u0018~\bO(\u0004\u0019/se(\u0010~|  Q~\nKz/>g", "@dU2e,GQ\u0019", "5dc\u001fX->`\u0019\bx^jx\u00128o\u000f$\u000bD\u000b %", "5dc\u001fX->`\u0019\bx^", "@dU2e,GQ\u0019dzr", "5dc\u001fX->`\u0019\bx^\u0012|\u001dma\t1\u0006O|&\u001bQx\u001c", "@dd@X\u0012>g", "5dc\u001fX<LS~~\u000f\u001d(\u0006\u00129t{7\u007fJ\n%", "@n^A>,R", "7r03g,K4\u001d\f\tm\n\u007f\r6d", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014\"Yy\u001f7zk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW*}/DF}\u001c6m#\u0004\u00118", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW*}/DK\u000b$Fm#\u0004\u00118", "8nX;X+$S-", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9s<\u000b\t>Z\bu", "5dc\u0017b0GS\u0018dzr", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\"v9\u0019b~*\r1|3IT75;\u001a\u001ej+#\u0004h,L\u0006|", "1n\\=b:>7!\u0007z]0x\u0018/R\u00101\u000bD\t\u0017vT|\u0018I", "", ";db@T.>", "", "1n\\=b:>@)\b\nb4|h<r\n5", "", "5dc\u0018X@", "D`[BX", ":dUA", "@hV5g", "7rC?T*>7\"i\bh.\n\t=s", ";t[A\\\u0014:^", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000e5i%=MP#{;-\u0019P]D\\", "\u0019", "$", "7mXA\\(E1\u0015\nv\\0\f\u001d", "uH\u0018\u0019T5=`#\u0003yquz\u00136l\u007f&\u000bD\u000b `/\u007f\u001d8s,5G{\u001cF|\u0016;5?FA", "@t]A\\4>1\u001c~xd", ":`iF@,La\u0015\u0001z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "And?V,\"\\\u001a\t\bf(\f\r9n", "1n\\=b:>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\r", "And?V,\"\\\u001a\t\bf(\f\r9ng$\tF\u0001$vPn", "And?V,\"\\\u001a\t\bf(\f\r9ng$\tF\u0001$\u0005Vk\u001bK", "9dh", "BqP0X\fOS\"\u000eZg+", "BqP0X\fOS\"\u000ehm(\n\u0018", "2haAlw", "2haAlx", "7mU<", "/r1<b3", "/r8;g", "1`R5X", "\"", "7me._0=", "0k^0^", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l@\u0005!<`\b2\u0015w\u001e9WQ7h;\u001erdh@\u00159", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DC\u000b\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WubH@F \u007f@\u0001&\u00045KK%e\u0006\f\u0014\u001d\u000b", "1n[9X*M<#}zl\r\n\u00137", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014$Uz'7C", "/mR5b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "2dP0g0OO(~Xn9\n\t8ta5\u0006P\f", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "2hbAT5<Sy\f\u0005f", "7mS2k", "@n^A", "4h[AX9-]\u0006z\u0004`,", "", "AsP?g", "3mS", "4h]1<5LS&\u000eah*x\u00183o\t", ":nR.g0H\\", "4h]1?6<O(\u0003\u0005g", "4ha@g\u0010G@\u0015\b|^", "7mb2e;\"T\u0001\u0003\tl0\u0006\u000b", "Ab^=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC\u001fs?%j", "7mbAT5<S", "<dP?X:M1#\u0007\u0003h5i\u00139ti)", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "1n\\:b5", "@d\\<i,\u001cc&\fzg;^\u00169u\u000b", "@d\\<i,\u001dO(z", "5q^Bc", "2`c.", "@d\\<i,%]\u0017z\nb6\u0006", "@d\\<i,+O\"\u0001z", "Ehc54-MS&Z\u0004\\/\u0007\u0016\u0013n\u00012", Global.BLANK, "1a", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ComposerKt {
    public static final int compositionLocalMapKey = 202;
    private static CompositionTracer compositionTracer = null;
    private static final int defaultsKey = -127;
    private static final int invalidGroupLocation = -2;
    public static final int invocationKey = 200;
    private static final int nodeKey = 125;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;
    private static final int rootKey = 100;
    private static final Object invocation = new OpaqueKey("provider");
    private static final Object provider = new OpaqueKey("provider");
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");
    private static final Object providerValues = new OpaqueKey("providerValues");
    private static final Object providerMaps = new OpaqueKey("providers");
    private static final Object reference = new OpaqueKey("reference");
    private static final Comparator<Invalidation> InvalidationLocationAscending = new Comparator() { // from class: androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComposerKt.InvalidationLocationAscending$lambda$15((Invalidation) obj, (Invalidation) obj2);
        }
    };

    public static final boolean asBool(int i2) {
        return i2 != 0;
    }

    public static final int asInt(boolean z2) {
        return z2 ? 1 : 0;
    }

    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    private static /* synthetic */ void getCompositionTracer$annotations() {
    }

    public static /* synthetic */ void getInvocation$annotations() {
    }

    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    public static /* synthetic */ void getProvider$annotations() {
    }

    public static /* synthetic */ void getProviderKey$annotations() {
    }

    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    public static /* synthetic */ void getProviderValues$annotations() {
    }

    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    public static /* synthetic */ void getReference$annotations() {
    }

    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    public static /* synthetic */ void getReuseKey$annotations() {
    }

    @ComposeCompilerApi
    public static final <T> T cache(Composer composer, boolean z2, Function0<? extends T> function0) {
        T t2 = (T) composer.rememberedValue();
        if (!z2 && t2 != Composer.Companion.getEmpty()) {
            return t2;
        }
        T tInvoke = function0.invoke();
        composer.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    @ComposeCompilerApi
    public static final void sourceInformation(Composer composer, String str) {
        composer.sourceInformation(str);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(Composer composer, int i2, String str) {
        composer.sourceInformationMarkerStart(i2, str);
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer2 = compositionTracer;
        return compositionTracer2 != null && compositionTracer2.isTraceInProgress();
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int i2, int i3, int i4, String str) {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventStart(i2, i3, i4, str);
        }
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventEnd();
        }
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(Composer composer) {
        composer.sourceInformationMarkerEnd();
    }

    public static final void removeCurrentGroup(SlotWriter slotWriter, RememberManager rememberManager) {
        int slotsSize;
        int iDataIndex = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(slotWriter.getCurrentGroup() + slotWriter.groupSize(slotWriter.getCurrentGroup())));
        for (int iDataIndex2 = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(slotWriter.getCurrentGroup())); iDataIndex2 < iDataIndex; iDataIndex2++) {
            Object obj = slotWriter.slots[slotWriter.dataIndexToDataAddress(iDataIndex2)];
            int iAnchorIndex = -1;
            if (obj instanceof ComposeNodeLifecycleCallback) {
                rememberManager.releasing((ComposeNodeLifecycleCallback) obj, slotWriter.getSlotsSize() - iDataIndex2, -1, -1);
            }
            if (obj instanceof RememberObserverHolder) {
                int slotsSize2 = slotWriter.getSlotsSize() - iDataIndex2;
                RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                Anchor after = rememberObserverHolder.getAfter();
                if (after != null && after.getValid()) {
                    iAnchorIndex = slotWriter.anchorIndex(after);
                    slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(iAnchorIndex);
                } else {
                    slotsSize = -1;
                }
                rememberManager.forgetting(rememberObserverHolder.getWrapped(), slotsSize2, iAnchorIndex, slotsSize);
            }
            if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).release();
            }
        }
        slotWriter.removeGroup();
    }

    public static final <R> void withAfterAnchorInfo(SlotWriter slotWriter, Anchor anchor, Function2<? super Integer, ? super Integer, ? extends R> function2) {
        int iAnchorIndex;
        int slotsSize;
        if (anchor != null && anchor.getValid()) {
            iAnchorIndex = slotWriter.anchorIndex(anchor);
            slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(iAnchorIndex);
        } else {
            iAnchorIndex = -1;
            slotsSize = -1;
        }
        function2.invoke(Integer.valueOf(iAnchorIndex), Integer.valueOf(slotsSize));
    }

    public static final boolean isAfterFirstChild(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() > slotWriter.getParent() + 1;
    }

    public static final boolean isAfterFirstChild(SlotReader slotReader) {
        return slotReader.getCurrentGroup() > slotReader.getParent() + 1;
    }

    public static final void deactivateCurrentGroup(SlotWriter slotWriter, RememberManager rememberManager) {
        int iAnchorIndex;
        int slotsSize;
        int currentGroup = slotWriter.getCurrentGroup();
        int currentGroupEnd = slotWriter.getCurrentGroupEnd();
        while (currentGroup < currentGroupEnd) {
            Object objNode = slotWriter.node(currentGroup);
            if (objNode instanceof ComposeNodeLifecycleCallback) {
                rememberManager.deactivating((ComposeNodeLifecycleCallback) objNode, slotWriter.getSlotsSize() - slotWriter.slotsStartIndex$runtime_release(currentGroup), -1, -1);
            }
            int iSlotIndex = slotWriter.slotIndex(slotWriter.groups, slotWriter.groupIndexToAddress(currentGroup));
            int i2 = currentGroup + 1;
            int iDataIndex = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(i2));
            for (int i3 = iSlotIndex; i3 < iDataIndex; i3++) {
                int i4 = i3 - iSlotIndex;
                Object obj = slotWriter.slots[slotWriter.dataIndexToDataAddress(i3)];
                if (obj instanceof RememberObserverHolder) {
                    RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                    RememberObserver wrapped = rememberObserverHolder.getWrapped();
                    if (!(wrapped instanceof ReusableRememberObserver)) {
                        removeData(slotWriter, currentGroup, i4, obj);
                        int slotsSize2 = slotWriter.getSlotsSize() - i4;
                        Anchor after = rememberObserverHolder.getAfter();
                        if (after != null && after.getValid()) {
                            iAnchorIndex = slotWriter.anchorIndex(after);
                            slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(iAnchorIndex);
                        } else {
                            iAnchorIndex = -1;
                            slotsSize = -1;
                        }
                        rememberManager.forgetting(wrapped, slotsSize2, iAnchorIndex, slotsSize);
                    }
                } else if (obj instanceof RecomposeScopeImpl) {
                    removeData(slotWriter, currentGroup, i4, obj);
                    ((RecomposeScopeImpl) obj).release();
                }
            }
            currentGroup = i2;
        }
    }

    private static final void removeData(SlotWriter slotWriter, int i2, int i3, Object obj) {
        if (obj == slotWriter.set(i2, i3, Composer.Companion.getEmpty())) {
            return;
        }
        composeImmediateRuntimeError("Slot table is out of sync");
    }

    public static final <K, V> MutableScatterMap<K, Object> multiMap(int i2) {
        return MutableScatterMultiMap.m3652constructorimpl(new MutableScatterMap(i2));
    }

    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if ((!Intrinsics.areEqual(joinedKey.getLeft(), obj2) || !Intrinsics.areEqual(joinedKey.getRight(), obj3)) && (obj = getKey(joinedKey.getLeft(), obj2, obj3)) == null) {
            obj = getKey(joinedKey.getRight(), obj2, obj3);
        }
        return obj;
    }

    private static final int findLocation(List<Invalidation> list, int i2) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iCompare = Intrinsics.compare(list.get(i4).getLocation(), i2);
            if (iCompare < 0) {
                i3 = i4 + 1;
            } else {
                if (iCompare <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    private static final int findInsertLocation(List<Invalidation> list, int i2) {
        int iFindLocation = findLocation(list, i2);
        return iFindLocation < 0 ? -(iFindLocation + 1) : iFindLocation;
    }

    public static final void insertIfMissing(List<Invalidation> list, int i2, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int iFindLocation = findLocation(list, i2);
        if (iFindLocation < 0) {
            int i3 = -(iFindLocation + 1);
            if (!(obj instanceof DerivedState)) {
                obj = null;
            }
            list.add(i3, new Invalidation(recomposeScopeImpl, i2, obj));
            return;
        }
        Invalidation invalidation = list.get(iFindLocation);
        if (obj instanceof DerivedState) {
            Object instances = invalidation.getInstances();
            if (instances == null) {
                invalidation.setInstances(obj);
                return;
            } else if (instances instanceof MutableScatterSet) {
                ((MutableScatterSet) instances).add(obj);
                return;
            } else {
                invalidation.setInstances(ScatterSetKt.mutableScatterSetOf(instances, obj));
                return;
            }
        }
        invalidation.setInstances(null);
    }

    public static final Invalidation firstInRange(List<Invalidation> list, int i2, int i3) {
        int iFindInsertLocation = findInsertLocation(list, i2);
        if (iFindInsertLocation >= list.size()) {
            return null;
        }
        Invalidation invalidation = list.get(iFindInsertLocation);
        if (invalidation.getLocation() < i3) {
            return invalidation;
        }
        return null;
    }

    public static final Invalidation removeLocation(List<Invalidation> list, int i2) {
        int iFindLocation = findLocation(list, i2);
        if (iFindLocation >= 0) {
            return list.remove(iFindLocation);
        }
        return null;
    }

    public static final void removeRange(List<Invalidation> list, int i2, int i3) {
        int iFindInsertLocation = findInsertLocation(list, i2);
        while (iFindInsertLocation < list.size() && list.get(iFindInsertLocation).getLocation() < i3) {
            list.remove(iFindInsertLocation);
        }
    }

    public static final List<Invalidation> filterToRange(List<Invalidation> list, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        for (int iFindInsertLocation = findInsertLocation(list, i2); iFindInsertLocation < list.size(); iFindInsertLocation++) {
            Invalidation invalidation = list.get(iFindInsertLocation);
            if (invalidation.getLocation() >= i3) {
                break;
            }
            arrayList.add(invalidation);
        }
        return arrayList;
    }

    public static final List<Object> collectNodesFrom(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader slotReaderOpenReader = slotTable.openReader();
        try {
            collectNodesFrom$lambda$10$collectFromGroup(slotReaderOpenReader, arrayList, slotTable.anchorIndex(anchor));
            Unit unit = Unit.INSTANCE;
            return arrayList;
        } finally {
            slotReaderOpenReader.close();
        }
    }

    private static final void collectNodesFrom$lambda$10$collectFromGroup(SlotReader slotReader, List<Object> list, int i2) {
        if (slotReader.isNode(i2)) {
            list.add(slotReader.node(i2));
            return;
        }
        int iGroupSize = i2 + 1;
        int iGroupSize2 = i2 + slotReader.groupSize(i2);
        while (iGroupSize < iGroupSize2) {
            collectNodesFrom$lambda$10$collectFromGroup(slotReader, list, iGroupSize);
            iGroupSize += slotReader.groupSize(iGroupSize);
        }
    }

    private static final int distanceFrom(SlotReader slotReader, int i2, int i3) {
        int i4 = 0;
        while (i2 > 0 && i2 != i3) {
            i2 = slotReader.parent(i2);
            i4++;
        }
        return i4;
    }

    public static final int nearestCommonRootOf(SlotReader slotReader, int i2, int i3, int i4) {
        if (i2 == i3) {
            return i2;
        }
        if (i2 != i4 && i3 != i4) {
            if (slotReader.parent(i2) == i3) {
                return i3;
            }
            if (slotReader.parent(i3) == i2) {
                return i2;
            }
            if (slotReader.parent(i2) == slotReader.parent(i3)) {
                return slotReader.parent(i2);
            }
            int iDistanceFrom = distanceFrom(slotReader, i2, i4);
            int iDistanceFrom2 = distanceFrom(slotReader, i3, i4);
            int i5 = iDistanceFrom - iDistanceFrom2;
            for (int i6 = 0; i6 < i5; i6++) {
                i2 = slotReader.parent(i2);
            }
            int i7 = iDistanceFrom2 - iDistanceFrom;
            for (int i8 = 0; i8 < i7; i8++) {
                i3 = slotReader.parent(i3);
            }
            while (i2 != i3) {
                i2 = slotReader.parent(i2);
                i3 = slotReader.parent(i3);
            }
            return i2;
        }
        return i4;
    }

    public static final Object getJoinedKey(KeyInfo keyInfo) {
        return keyInfo.getObjectKey() != null ? new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey()) : Integer.valueOf(keyInfo.getKey());
    }

    public static final Object getInvocation() {
        return invocation;
    }

    public static final Object getProvider() {
        return provider;
    }

    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    public static final Object getProviderValues() {
        return providerValues;
    }

    public static final Object getProviderMaps() {
        return providerMaps;
    }

    public static final Object getReference() {
        return reference;
    }

    public static final void runtimeCheck(boolean z2, Function0<String> function0) {
        if (z2) {
            return;
        }
        composeImmediateRuntimeError(function0.invoke());
    }

    public static final void runtimeCheck(boolean z2) {
        if (z2) {
            return;
        }
        composeImmediateRuntimeError("Check failed");
    }

    public static final Void composeRuntimeError(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void composeImmediateRuntimeError(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final int InvalidationLocationAscending$lambda$15(Invalidation invalidation, Invalidation invalidation2) {
        return Intrinsics.compare(invalidation.getLocation(), invalidation2.getLocation());
    }
}
