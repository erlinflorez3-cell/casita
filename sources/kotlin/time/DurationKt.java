package kotlin.time;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.apache.commons.codec.language.Soundex;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d̉=!,p\bDJd|\u0004O\f8é6B\u0015\"4\u0012\u0006\u000bnj?XLeV:Zݷ2\u000fy\u0005<$a'yCQU\"}0\u0013WNmnvJp\u000bK\u000f\f\u0018\u0011\u0006:jmx\f\u0017?6P\u0012W3{nm=n\u0018N\u0005N5h8ѩ\t\u0001(N`#\u0005 [K:\u0017`D~`j\r{\u0004`\u0012ĂB \u000f,tz\\]`l\f?_'\u0011\u0012ZNU^v|֔\u0011Fb5%\noGC@e:E)a-\u001fR\n>I?џA\u0005v5?>W\u001fo6\u0007\u0005D\u00199{%]!%#\u0005Ōd\f59gqY}&(&y,\u0011J,&\u0006UGt-2t\u0016<Kt!RpT\u0010\u000bZ\u007f)`|\u0017=\u001bAZQ\u001b\u0015V\u0012?'~O{3>N'\u000f!9[\u0003A'\u0015ôXw_eiNK}f\n\b<\u001e\b~\u0013\u001a*2a\u000e\u007fG#\u001fd/%e^a#O\u001d2LR\u001f\u000f\u0005\u000fk\u0004y`\u0001X.~\u0018G*7FjFt\u0005\u001a\u0004\u0003\u0012rҍS4{\u00159 \u0013N\u000e <OV@R] \u0002j{`:5=\u001fOe~m\u001eWg\u0019C7ac>\u0015\u00010Z̶Bz\u001ff#ZS:_\u0005(P8xn\u001e5\u0014D|\u0011YԽGۇ 62o'\u001c-b\u0011ZZA+\u000e\bZ\u0017\u0013/XAa\u001biRyOɞXʷtqm9Wm\u0015w0oYQc\u001eNUPnd\u00011J\u0017s.\f.QܤPl$;m\u0013.X29\u007f4e\u0013=\u0002Y6\u0010p]L!*\u0018Rɟ+z\u000b@'Rvp\u007f\b\u0019uT`\u0019I\u007fX%e\u000f^!gNiѣ}aTBgobެs>wqYʜ\u000fҡ<|\rȔ>1\u000fo:|c,\u001aڰoə{\u00147֒\u0002iwpFy\u0011\u000e|۬8נ0c\u001e˱\u0003]k4S8w\\UЗtٝp\u0003Jו\u000b\u0014\u0016F!4;8pA\u0013v\r|$ߚ1̱j\u0011<\u000fv]iB+q\u0004=<iJ\u0010Q\u0002,^q*9M\u0002j$2\"Ŕ\rΊ\u0013\u0014\u001b}7u 'U\"\\`p\u0015P\"\u0002\u001cNAig-<7#jp\u0013ޒ\rͲXs\u0016\u0012\u0001\u0007Tl'\u00198K\u0002Iv*b\btVv\n\tE\u000f'`EU۸5\u038b|?A\u0007sVb7{4\u0007d+\u0013;\u0007]\u000e~%YI|9I+\u000fEaԽ_ƀM\fF\u0006M9{v\b\u000e>)\u000b)b4)Hi\u0011\u000e{X^9T\u001b\u0013;ʂ\u0014؉VX2+\u0005\u000b\u000b\u001bT\f\u0015\u001c']\u0013\fp?dN&<k\u001a/\u001dzm]ѡ~ސJ%=\b;@KQ\u0003\u0016-\u0010e][\u001a\u001628'2yI\\\u0006\u0011\u001dN4ͱ<Ϧu r\u0004\u000f&^+\u001c0P\t\u0001\u0016N$Da\u001a30\u0018\u0007Y\u001avW\u0005}ߤnތFUxz\u0010vzp\u0007W\u0011\u0017t?v\u0016|Bh\u001d7,u.A^\u0011~g֮\"Ǩ\u0015\n$\u0017,5D\u0010z+\u0016fqr\u0011\b]p%+]pRa_3\tbTέ{Ȅ\b4d*\u001bQdXVf\u000fszNw*l\u007f@d#\u0011Q\u0014+}~#gӊ6лv(t1=/-h%If\u001e\u0012SiB/Ij?I<Z\u000b\u001e.-UY̔d߰\u00044R\u000bx\u0019u4EHZW(1y@{|\u001b&yJ`B6/GRg˗\\ߣ$Hl\u001c\"T_>Y\u001b\u0017\u001b#D&\f\u00151Mj\u007fXM*/{7Q\u0016Ɵ3ˬ>}Gt)H\u001d|3YlU3C\u0006h5'\u001aex\u0004uc\u0005\u0015\u0018p ˇGɭ}_P\u0002\u0010;2,\u001ew)\u001dS;hFmwXV\"\\,&X9%\tyءnՐw\u0014<k\u001e\u0010rfy6G\u0018\"%dZ8H\u0005\u0007sR\u0011y9CC\njɦ\u0011ҋ-='~\u0016k\u007fMCKxj=j}X!\u0012\u001c:`f^yuF\u0010n\\Д\u0014̊gtzoW~\u001e@*\u000f\u0013$\u0006;r|\u000e~5\u0018UP\u001fFd_/\u0012\u0018Ǜ\rڝ\u0013.n0H+\u0019\u0011.0N7\u0010\nj|#1KG\"Fo\u0012\u0005zWag؋'͘)qzIEt\u007feU;9+{X֘9."}, d2 = {"\u001b@G,@\u0010%:|l", "", "\u001b@G,A\b'=\u0007", "\u001b@G,A\b'=\u0007x^G&dl\u0016Lc\u0016", "\u001c@=\u001cF&\"<\u0013f^E\u0013`v", "", "2`h@", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "", "5dc\u0011T@L\u0012\u0015\b\u0004h;x\u00183o\t6", "uC\u0018#", "5dc\u0011T@L", "uC\u0018\u0017", "uH\u0018#", "uH\u0018\u0017", "uI\u0018#", "uI\u0018\u0017", "6nd?f", "5dc\u0015b<KaWz\u0004g6\f\u0005>i\n1\n", "5dc\u0015b<Ka", ";hR?b:>Q#\byl", "5dc\u001a\\*K]'~xh5{\u0017ma\t1\u0006O|&\u001bQx\u001c", "5dc\u001a\\*K]'~xh5{\u0017", ";h[9\\:>Q#\byl", "5dc\u001a\\3EW'~xh5{\u0017ma\t1\u0006O|&\u001bQx\u001c", "5dc\u001a\\3EW'~xh5{\u0017", ";h]Bg,L", "5dc\u001a\\5Nb\u0019\r9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "5dc\u001a\\5Nb\u0019\r", "<`]<f,<]\"}\t", "5dc\u001bT5Ha\u0019|\u0005g+\u000bG+n\t2\u000b<\u0010\u001b!P}", "5dc\u001bT5Ha\u0019|\u0005g+\u000b", "AdR<a+L", "5dc X*H\\\u0018\r9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "5dc X*H\\\u0018\r", "2ta.g0H\\\u0003\u007f", "<na:T3/O \u000fz", "CmXA70LQ&\u0003\u0003b5x\u00189r", "uI8u=", "2ta.g0H\\\u0003\u007fbb3\u0004\r=", "<na:T3&W \u0006~l", "2ta.g0H\\\u0003\u007fbb3\u0004\r=N\n5\u0004<\b\u001b,Gn", ";h[9\\:", "2ta.g0H\\\u0003\u007fcZ5\u0007\u0017", "<na:T3'O\"\t\t", "2ta.g0H\\\u0003\u007fcZ5\u0007\u0017\u0018o\r0wG\u0005,\u0017F", "<`]<f", ";h[9\\:-]\u0002z\u0004h:", "<`]<f\u001bH;\u001d\u0006\u0002b:", ">`a@X\u000bN`\u0015\u000e~h5", "D`[BX", "", "Asa6V;\"a#", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p\u0004e", ">`a@X\u0016OS&e\u0005g.`\u00179C\n0\u0007J\n\u0017 V", "AjX=J/BZ\u0019", "AsP?g\u0010GR\u0019\u0012", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "AtQ@g9B\\\u001bp}b3|", "Bh\\2f", "2ta.g0H\\", "Bh\\2fsD7\u001ac\u0004D2", "uC9u=", "Bh\\2fsFd\u001fOmDv", "uH9u=", "Bn3Be(MW#\b", "CmXA", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006Ip \u001bVE", "uC;8b;EW\"H\nb4|R\u000eu\r$\u000bD\u000b \u0007Ps\u001d\u0012:\n", "uH;8b;EW\"H\nb4|R\u000eu\r$\u000bD\u000b \u0007Ps\u001d\u0012:\n", "uI;8b;EW\"H\nb4|R\u000eu\r$\u000bD\u000b \u0007Ps\u001d\u0012:\n", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final int NANOS_IN_MILLIS = 1000000;

    public static final long durationOf(long j2, int i2) {
        return Duration.m10306constructorimpl((j2 << 1) + ((long) i2));
    }

    public static final long durationOfMillis(long j2) {
        return Duration.m10306constructorimpl((j2 << 1) + 1);
    }

    public static final long durationOfMillisNormalized(long j2) {
        return new LongRange(-4611686018426L, MAX_NANOS_IN_MILLIS).contains(j2) ? durationOfNanos(millisToNanos(j2)) : durationOfMillis(RangesKt.coerceIn(j2, -4611686018427387903L, MAX_MILLIS));
    }

    public static final long durationOfNanos(long j2) {
        return Duration.m10306constructorimpl(j2 << 1);
    }

    public static final long durationOfNanosNormalized(long j2) {
        return new LongRange(-4611686018426999999L, MAX_NANOS).contains(j2) ? durationOfNanos(j2) : durationOfMillis(nanosToMillis(j2));
    }

    @Deprecated(message = "\u0018Y\u0001t8X$lZS-HT\u0016Ea#\f\u000e?\u0019m\u001ae\u007fU|*^\u00073vm^x[\rbzHS]\u0017O$W`\u00031f\u0016\u001etKD\u0013\u001aP#RZ\u007fB\u0015\u0007\u0011p;i", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getDays$annotations(double d2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8]#k&K)\u0014c[kSt`\u000e5\u0018q\u001b`6V\u0001y^y6z\u0002\fjT\\i(\u001d[04N\u001beZG\u0005gUKfL=!\u001a\u0007\u001dR.\u000b9\u0003vY", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getDays$annotations(int i2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8`$e_\u0015,{i(r\u000ead\u001d,\u0013{\u0015a\u0005\u0006~|]\u0005)x|e$H_kux*3E;&_[\bo;WHu?B\u001b\u001bUSM)\nH\u0007s\u0010=", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getDays$annotations(long j2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8X$lZS-HX$A`o\u0013H,\u001d|\u0011`\nO}x\u000e\u00056uxQvVf\u001cnKU+r\u001e'hM\u000e+gV\tHMA\"\rU\u001dS)6=\u0010\u0006 t8 \u0019", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getHours$annotations(double d2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8]#k&O7\u0010b(r\u000ead\u001d,\u0013{\u0015a\u0005\u0006~|]\u0005)x|e$H_kux*3E;&_[\bo;WHu?B\u001b\u001bUSM)\nH\u0007s\u0010=", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getHours$annotations(int i2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8`$e_\u00150\ne'?\u0015\u001cQ!;\nv\u001f[\u0006T.z`\u00044kz`}\u0002SnwF\u0006\u0002HL\u0013jU\t0&+JrN5 \u0015V\"\u0004$\u0005G\u0016w\rs\u0005", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getHours$annotations(long j2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8X$lZS-H]\u001e/`k_\u000e*\u0014v\u0010e=\u0006s\u0003by2yq[r\u0002]nwIK0GSQ\\^\t/\u0018,Pw?H\u001b\u001bUa'*\u0004D\u0003\u0001\u0015~E[T\f\u000fq'\t\u007f\u0016", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getMicroseconds$annotations(double d2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8]#k&T1}b$?S_[\u0017+\u0018/KW\u000fZsxa}3t(\\vQ]azM_]9L!c\f]7jIOnMB_nV!T\u001c\u0005=\u0011\u0001KxE/_\u0003|ao", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getMicroseconds$annotations(int i2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8`$e_\u00155\u0004S';aaO\u00185\t{R\u0012{^\u0003o\\\b-uv\ftT\\lmKZ7r@$eY9\u0006mZ<yGC Y*#Q+wB\u000b\u0002\u001a/@*^\u0012\u0001^&U", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getMicroseconds$annotations(long j2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8X$lZS-H]\u001e8Ze_\u000e*\u0014v\u0010e=\u0006s\u0003by2yq[r\u0002]nwIK0GSQ\\^\t/\u0018,Pw?H\u001b\u001bUa'*\u0004D\u0003\u0001\u0015~E[T\f\u000fq'\t\u007f\u0016", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getMilliseconds$annotations(double d2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8]#k&T1\u0007\\\u001e?S_[\u0017+\u0018/KW\u000fZsxa}3t(\\vQ]azM_]9L!c\f]7jIOnMB_nV!T\u001c\u0005=\u0011\u0001KxE/_\u0003|ao", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getMilliseconds$annotations(int i2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8`$e_\u00155\u0004\\!5aaO\u00185\t{R\u0012{^\u0003o\\\b-uv\ftT\\lmKZ7r@$eY9\u0006mZ<yGC Y*#Q+wB\u000b\u0002\u001a/@*^\u0012\u0001^&U", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getMilliseconds$annotations(long j2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8X$lZS-H]\u001e:cpQ\u001cmDm$f{T\u0002s]\u0003cvz[tG_p\u0002xL0BGQ:a\f#lQJs\f\u0017!\u0019W\u0015R$\u0006BA{\u001a\u0003K!L\u0002I", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getMinutes$annotations(double d2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8]#k&T1\te)1a#\f\u000e?\u0019m\u001ae\u007fU|*^\u00073vm^x[\rbzHS]\u0017O$W`\u00031f\u0016\u001etKD\u0013\u001aP#RZ\u007fB\u0015\u0007\u0011p;i", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getMinutes$annotations(int i2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8`$e_\u00155\u0004^*@So\u0013H,\u001d|\u0011`\nO}x\u000e\u00056uxQvVf\u001cnKU+r\u001e'hM\u000e+gV\tHMA\"\rU\u001dS)6=\u0010\u0006 t8 \u0019", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getMinutes$annotations(long j2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8X$lZS-H^\u0016:]oQ\f6\u0013l\u001f\u00196K\u0007~S\u00037owZ$R_kx>X2Ly\u0018h[\u0007a<]MfR=!\u001a\u0015vS(\u00075\u0010{\u001b}v%Y\u0011\u0010b#\fI", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getNanoseconds$annotations(double d2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8]#k&U)\t_(1QkZ\r:K(\u0011j\u000bK|}W\u00042&x^sRRn|R\u0006$EI\u001f\u00160\u000f4Y\\DtL\u0002t\u001bT$E)\u007fC\u00102\u0015}J0P~\u007f+", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getNanoseconds$annotations(int i2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8`$e_\u00156{^$?S_[\u0017+\u0018/KW\u000fZsxa}3t(\\vQ]azM_]9L!c\f]7jIOnMB_nV!T\u001c\u0005=\u0011\u0001KxE/_\u0003|ao", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getNanoseconds$annotations(long j2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8X$lZS-Hc\u001a/]jP\u001cmDm$f{T\u0002s]\u0003cvz[tG_p\u0002xL0BGQ:a\f#lQJs\f\u0017!\u0019W\u0015R$\u0006BA{\u001a\u0003K!L\u0002I", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getSeconds$annotations(double d2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8]#k&Z-}_#0a#\f\u000e?\u0019m\u001ae\u007fU|*^\u00073vm^x[\rbzHS]\u0017O$W`\u00031f\u0016\u001etKD\u0013\u001aP#RZ\u007fB\u0015\u0007\u0011p;i", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getSeconds$annotations(int i2) {
    }

    @Deprecated(message = "\u0018Y\u0001t8`$e_\u0015;\u007fS$:Ro\u0013H,\u001d|\u0011`\nO}x\u000e\u00056uxQvVf\u001cnKU+r\u001e'hM\u000e+gV\tHMA\"\rU\u001dS)6=\u0010\u0006 t8 \u0019", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getSeconds$annotations(long j2) {
    }

    public static final long millisToNanos(long j2) {
        return j2 * ((long) 1000000);
    }

    public static final long nanosToMillis(long j2) {
        return j2 / ((long) 1000000);
    }

    public static final long parseDuration(String str, boolean z2) {
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        long jM10409getZEROUwyO8pc = Duration.Companion.m10409getZEROUwyO8pc();
        boolean z3 = false;
        char cCharAt = str.charAt(0);
        int length2 = (cCharAt == '+' || cCharAt == '-') ? 1 : 0;
        boolean z4 = length2 > 0;
        DurationUnit durationUnit = null;
        if (z4 && StringsKt.startsWith$default((CharSequence) str, Soundex.SILENT_MARKER, false, 2, (Object) null)) {
            z3 = true;
        }
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c2 = '9';
        char c3 = '0';
        if (str.charAt(length2) == 'P') {
            int i2 = length2 + 1;
            if (i2 == length) {
                throw new IllegalArgumentException();
            }
            DurationUnit durationUnit2 = null;
            boolean z5 = false;
            while (i2 < length) {
                if (str.charAt(i2) != 'T') {
                    int i3 = i2;
                    while (i3 < str.length()) {
                        char cCharAt2 = str.charAt(i3);
                        if (!new CharRange(c3, c2).contains(cCharAt2) && !StringsKt.contains$default((CharSequence) "+-.", cCharAt2, false, 2, (Object) null)) {
                            break;
                        }
                        i3++;
                        c2 = '9';
                        c3 = '0';
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i2, i3);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    String str2 = strSubstring;
                    if (str2.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i2 + strSubstring.length();
                    String str3 = str;
                    if (length3 < 0 || length3 > StringsKt.getLastIndex(str3)) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt3 = str3.charAt(length3);
                    i2 = length3 + 1;
                    DurationUnit durationUnitDurationUnitByIsoChar = DurationUnitKt.durationUnitByIsoChar(cCharAt3, z5);
                    if (durationUnit2 != null && durationUnit2.compareTo(durationUnitDurationUnitByIsoChar) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str2, '.', 0, false, 6, (Object) null);
                    if (durationUnitDurationUnitByIsoChar != DurationUnit.SECONDS || iIndexOf$default <= 0) {
                        jM10409getZEROUwyO8pc = Duration.m10342plusLRDsOJo(jM10409getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(strSubstring), durationUnitDurationUnitByIsoChar));
                    } else {
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        long jM10342plusLRDsOJo = Duration.m10342plusLRDsOJo(jM10409getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(strSubstring2), durationUnitDurationUnitByIsoChar));
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        jM10409getZEROUwyO8pc = Duration.m10342plusLRDsOJo(jM10342plusLRDsOJo, toDuration(Double.parseDouble(strSubstring3), durationUnitDurationUnitByIsoChar));
                    }
                    durationUnit2 = durationUnitDurationUnitByIsoChar;
                    c2 = '9';
                    c3 = '0';
                } else {
                    if (z5 || (i2 = i2 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z5 = true;
                }
            }
        } else {
            if (z2) {
                throw new IllegalArgumentException();
            }
            if (StringsKt.regionMatches(str, length2, "Infinity", 0, Math.max(length - length2, "Infinity".length()), true)) {
                jM10409getZEROUwyO8pc = Duration.Companion.m10407getINFINITEUwyO8pc();
            } else {
                boolean z6 = !z4;
                if (z4 && str.charAt(length2) == '(' && StringsKt.last(str) == ')') {
                    length2++;
                    length--;
                    if (length2 == length) {
                        throw new IllegalArgumentException("No components");
                    }
                    z6 = true;
                }
                boolean z7 = false;
                while (length2 < length) {
                    if (z7 && z6) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i4 = length2;
                    while (i4 < str.length()) {
                        char cCharAt4 = str.charAt(i4);
                        if (!new CharRange('0', '9').contains(cCharAt4) && cCharAt4 != '.') {
                            break;
                        }
                        i4++;
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                    String str4 = strSubstring4;
                    if (str4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i5 = length4;
                    while (i5 < str.length()) {
                        if (!new CharRange('a', 'z').contains(str.charAt(i5))) {
                            break;
                        }
                        i5++;
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i5);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    DurationUnit durationUnitDurationUnitByShortName = DurationUnitKt.durationUnitByShortName(strSubstring5);
                    if (durationUnit != null && durationUnit.compareTo(durationUnitDurationUnitByShortName) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str4, '.', 0, false, 6, (Object) null);
                    if (iIndexOf$default2 > 0) {
                        Intrinsics.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        long jM10342plusLRDsOJo2 = Duration.m10342plusLRDsOJo(jM10409getZEROUwyO8pc, toDuration(Long.parseLong(strSubstring6), durationUnitDurationUnitByShortName));
                        Intrinsics.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        jM10409getZEROUwyO8pc = Duration.m10342plusLRDsOJo(jM10342plusLRDsOJo2, toDuration(Double.parseDouble(strSubstring7), durationUnitDurationUnitByShortName));
                        if (length2 < length) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jM10409getZEROUwyO8pc = Duration.m10342plusLRDsOJo(jM10409getZEROUwyO8pc, toDuration(Long.parseLong(strSubstring4), durationUnitDurationUnitByShortName));
                    }
                    durationUnit = durationUnitDurationUnitByShortName;
                    z7 = true;
                }
            }
        }
        return z3 ? Duration.m10359unaryMinusUwyO8pc(jM10409getZEROUwyO8pc) : jM10409getZEROUwyO8pc;
    }

    private static final long parseOverLongIsoComponent(String str) {
        int length = str.length();
        int i2 = (length <= 0 || !StringsKt.contains$default((CharSequence) "+-", str.charAt(0), false, 2, (Object) null)) ? 0 : 1;
        if (length - i2 > 16) {
            Iterable intRange = new IntRange(i2, StringsKt.getLastIndex(str));
            if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                Iterator it = intRange.iterator();
                while (it.hasNext()) {
                    if (!new CharRange('0', '9').contains(str.charAt(((IntIterator) it).nextInt()))) {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (StringsKt.startsWith$default(str, "+", false, 2, (Object) null)) {
            str = StringsKt.drop(str, 1);
        }
        return Long.parseLong(str);
    }

    private static final int skipWhile(String str, int i2, Function1<? super Character, Boolean> function1) {
        while (i2 < str.length() && function1.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2++;
        }
        return i2;
    }

    private static final String substringWhile(String str, int i2, Function1<? super Character, Boolean> function1) {
        int i3 = i2;
        while (i3 < str.length() && function1.invoke(Character.valueOf(str.charAt(i3))).booleanValue()) {
            i3++;
        }
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i2, i3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: times-kIfJnKk */
    private static final long m10432timeskIfJnKk(double d2, long j2) {
        return Duration.m10343timesUwyO8pc(j2, d2);
    }

    /* JADX INFO: renamed from: times-mvk6XK0 */
    private static final long m10433timesmvk6XK0(int i2, long j2) {
        return Duration.m10344timesUwyO8pc(j2, i2);
    }

    public static final long toDuration(double d2, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dConvertDurationUnit = DurationUnitKt.convertDurationUnit(d2, unit, DurationUnit.NANOSECONDS);
        if (Double.isNaN(dConvertDurationUnit)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long jRoundToLong = MathKt.roundToLong(dConvertDurationUnit);
        return new LongRange(-4611686018426999999L, MAX_NANOS).contains(jRoundToLong) ? durationOfNanos(jRoundToLong) : durationOfMillisNormalized(MathKt.roundToLong(DurationUnitKt.convertDurationUnit(d2, unit, DurationUnit.MILLISECONDS)));
    }

    public static final long toDuration(int i2, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(DurationUnit.SECONDS) <= 0 ? durationOfNanos(DurationUnitKt.convertDurationUnitOverflow(i2, unit, DurationUnit.NANOSECONDS)) : toDuration(i2, unit);
    }

    public static final long toDuration(long j2, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long jConvertDurationUnitOverflow = DurationUnitKt.convertDurationUnitOverflow(MAX_NANOS, DurationUnit.NANOSECONDS, unit);
        return new LongRange(-jConvertDurationUnitOverflow, jConvertDurationUnitOverflow).contains(j2) ? durationOfNanos(DurationUnitKt.convertDurationUnitOverflow(j2, unit, DurationUnit.NANOSECONDS)) : durationOfMillis(RangesKt.coerceIn(DurationUnitKt.convertDurationUnit(j2, unit, DurationUnit.MILLISECONDS), -4611686018427387903L, MAX_MILLIS));
    }
}
