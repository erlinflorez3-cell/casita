package com.squareup.wire.internal;

import androidx.exifinterface.media.ExifInterface;
import com.braze.Constants;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoReader32;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯŃ\u0014D߬)\u001ew\u001fLDit\fA\u0014S\u0013.H\u0001*, \u0004\u000f߿r9>bm߉6RaL\u0017k\u00028,[:qK;cڼ\u0006\"\u000fQVg}nRZ\u0011C\u0017\u0006$\u0002r,OV\u0001](\u000f:B\u0006?;ݹw=Go|6\u000b :\"Fy\rЏ\"*V\u0016~zIW\u0014\u0012>SxíZ\rc\u0005\"\u0012\fB(\u0001,poN<Kt]HA+ɅqB\\8gܞ\u0005M\u001bJ\\܋\u0015vw\u001e3@M5\u001d%Y\u0003\u000fRiF\u000bӊy=\u0013m/'1P{WLX\b\u0014++W\rct.\\\u001bQh\f=+WcQQ&8\u0006\u07be\u0014\u0013L\u0006\u001e\u0006mH\\,:h\u000eԄAt\u000boNQ\u001ajR\u0002\u000ba|\u001a5\u0002C+\u007f\u001f\u0015S\u0002=\u001f\u05cbE~%\u000f$\"\u000fr9\u0006b\u0013x\u001b+V\bQwQn<hP\u0010ԯKm4tp\bB\u0004^N0;\n\u0019F\u001f59k9i!\u0002\u0001vM.{\u001d~vX\u0002XXB2n\\7X\b,\\Jߟ\u0013k\u0001^f4)S,V\u0017}N\u0013Ne\u0010x/*(Z_jyj\u0014`\u001a'?f}]\u001dm.Y?ӔA8qe\u0016``zDCJh\u001dX\u0015I\u0004\u001ehf@0BJz\u0010>~TP\u001c\u0013xC\b\u001bb7w\u001etEV\b6NQ~\u0019_!k \u0001d3j\u0007\u0018&\u0015\u000b\u0007ˆjs\u0010i~H:\u0001\u00112;KiA)(e\"/7\r%\u0017~:\u0004urdmZx.{e}0\u0016`9\u007f8]\u0015\u0015ȯ7221SR\u000be\u007fTB1\t\u0005\u0012\u0015Kj>gNj\u001f5x#X[l#2xnri\u000bt\u0002\na\r~unt\raŬWu#[BMF\u00015#,+\u0019oP\u0004e=Q15\"\b\u0016?\u0015(`yq>y)\u0013T\u007f}<:p.{rSm2\u0002;Y[\u000f>h(\u001b\u000ebJp̫\u0016E)6\u00132VE\u0015td>e\u000b]\u0005\u0017\u0017:\u0017\tbk<#oD7>a:s\n\u0002Bi[D\u001f[kg4mk^\u0011ͧ\u001d\n;\u007f?t*\u001ck'\u0007[p\u0018H\u0006:\u0018ݠE;p\u0015T82JDB\u0018\rST0\u0006>\u0004 Heʕ%2jyKX\u001eT?\\\u0005Q5jSw90\u0011\u0001\u001f3dxcIKrܑX/iK\u0019\u0015+\u001f3v_\u0001v%qGd;+(\u001f\u00059P}EO\u0379D\u0007g+sj}\u0010`$\r\u001fR\u0018a<a\u0013ovvb9`\u0015Xr\u000e*lbP2)E~+&\u0003\u000f۪\u000f\u0019U\f\bz;ffwe^J\u0007%`A\t\"{\u0012YK3\u0014RE?_iB:\u0014|aY\u0016\fN?\u0010\u0004SA\rk\u001c\b\"g+@\u001cp&d\u0018\bAcN&NL\u000bq8Aĝ:O\u0010V\u001a#l}\u0004wOeW3z\u000eZOxx\u0010d\u001bl\u0007i\u0019'~1\u0005\u001f\u001f9^'!/].\u0019Yj:\u0017TNc)\u0018\";>\u001fd/\u0013/\u001ek{j\u0007j}n=1=\tBcG/\u00011\u0016A\b\u001c\u001c*\u0003OEAdiVf\u001f[\u001bU\b\u0014l\b@f\u000b\u000bW'-\u0005V\u0007)\u0015JE!1|xE?7[;n\u0011\r\u0012aa(70\u0001RK=@(\b*\r\u00101M\u0013z\u000eRZ\u000b\t~\u0016?]Lbf2)o#\u001cw3:YoPL\u00182\u0017\r!1p7NQ\u000b<<=g2o,֩\u0005\u0015F1\b\u0013'b\u0003Q\u0002,Z\u0005\u000b\u0010%?(8\u0004L\u0002d\u000b#]\u0016 %e\u0015S+Eg\\':\t\u0014S\u0017Yq\u0006'aZPeI,*m@.\u00117827\u000e#.LaL8\u0010t@\u0005z\b\b4\\Nnr*_x\u0007'\",\u0018\u001f$hi\u0012LA)\u001b1`L^El5j}l\b@\\\rsJg\u0013\u0014`K\u0017+H\u007fuNdar{VtyJM\f\u0004hW\u0012:\b|XYX<]\u0016b\u001b\u0003j\u001c\n\u0010\u0014FK%\r2\u001fInn;x\u001dFL{zTktx{w\u0013\u000fNF<^\\z<\u000f\u0014OFHE)\u0016fnQ+3u\u0019qK \f\u0014!KG\f)\u0014\\\u007fjuw\u0006ufvQ39\u0015btC#t\u0005\u0004F{h9J\u0018jYdwZLQBX4FuhVI\\xrO\u0006L>nh~\th\u000e\u0005*TUUC%/6pnsd?cg[|\fm#[ \u001a\u001f\u001e\u00021\u00139C\u0004=@X\f\r_},\fj\u0001m|\u001c\u0002@\u0007o\u00049/4fG]Y.nem>\bC\rA8'REC(p\u001f+i<Z\u0010\u0007Zon)vrq-t\u0005\u0003\u000f)\u001a<2\u001amm\u0006kEAf*lS_nd^t\u0017\u0001gj*Q}\ft8qMsP&\u001dLf\n\u0011\u0012\u000f\u0010\u0018|\ttXlO\b*NL\u001a\u001aKMy\u0018VmH\u0017\u0004\t\u001en\u0002\nx\u0011\by\u001c4r1\u000bf\u0013v\u0014BJ\u0002\u0005\u0019\u0015v\u00167_\u000bz\t\u000f\u0016xE\u001e\u0018\u0005,U}xn'8\u0019K\u0010OD;R0;gaa:m0\u001cu%u\u00146\u0012x,\u0010\u0015*)KB\u001b8D|CNnj\u0001N\u0005\u0005{|\u001cw=\u007f^ZnC]^58\u0001\bXY$\t\u0013y\u0007S\u0001x&#\u0001/\u0017#LfYcG\u00169\u00131hl\f@\u0018pz\u001d$t1<J\u001e\u001f@\u0012,9z\f\f{a$\n[B.6),;($\u001b6*\u0004\u0012\u0016;[w3)]\\\u001f(\u000bg\u0007qA0V:52Z-'0odN@l;\u0001=\u00020VtA\u0011%7\r<3\u0003@&2\u001c\u000b\frk;LAk%\u000e\u0003SwGq6\u0017ay\r~_\u000ewejSZ8\u000e[k!.>\u0015D\u001c1>\u001b\u0011_Pa\u0010\b\u0011\u007f\u0004F\n\u001c\u001b\u0014\u0019r^\u001eh1\u0007l%\u001dy\u001cKk%\u00143\u000e$-1\u000b=_\u000f3\u0018G\u0017F57\u007f\u0015\u0015\u000fR[@``\u000b*\u001bV/~\u000eI)5Ord.9sDXW#2\u001cg\u0012xRkV6@/8D.B+WM9;C\u0001bC2v\t\u0004n&3|' q^\u0002wahjG[6ZbrZ)%A5\u0014^z\u0005=/?CMBQ0u[eG\u000f5:z\u0006uh\u00021\u0013*|5s'^M6%!\f7\u0016<o \f\u00035LO$PpL!V2C\\T,\"s'\u001d58\\YC\u0002L\u0002+V<\u000fH\u0013j=#>\nF;(ڥōs\u00156\u0001[&\u0005z\u0006\t>Cq)7\t:vYvxԃ٣Y\u0010Mj+\u007flR\u0018!wKXw7/5m\\\u0011\u001buxUv\u0012epjpEԧĔI(\u001e\njN\"BtDU\u0003PHEo\u0007\u001f\t\u0007xғɼ4\u001bjM\u001e\u000e\u0005cz\u001ap8t4h@c>Q\u0013N\u0001/\u001cY\u001e\u0002¯@ЀYJ|\u0011l\u000b^X2j\u0003j\u0002|68sέXۑi2$Ɗɒ}\u0007"}, d2 = {"<df\u001ah;:P ~ab:\f", "", "\"", "<df\u001ah;:P ~bZ7", "", "\u0019", "$", "1n_FB-", "<`\\2", "", ":hbA", "", ";`_", "", "7l\\Bg(;Z\u0019\\\u0005i@f\n", "7l\\Bg(;Z\u0019\\\u0005i@f\n\u0017a\u000b\u001a\u007fO\u0004\u0005&T\u007f\fKg!<i}.", "7l\\Bg(;Z\u0019\\\u0005i@f\n\u001dt\r8yO", "D`[BX", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", "Bx_2A(FS", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "", "5dc!l7><\u0015\u0007z\u001d\u0010\u0006\u0018/r\t$\u0003:zz Vo\u001bEr,\u001bh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0007!&Ns\u0017\u0006\u0004%6`}\u001eF7{\fT?Iy\n", "@dS.V;\u001eZ\u0019\u0007zg;\u000b", "/cP=g,K", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "zqT1T*M3 ~\u0003^5\f\u0017", "3pd._:", "", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, ";hb@\\5@@\u0019\u000b\u000bb9|\b\u0010i\u007f/zN", "\u001aiPCTuEO\"\u0001DB3\u0004\t1a\u0007\u0016\u000b<\u0010\u0017vZm\u000eG\u0006)?bS", "\u001aj^A_0G\u001d|\u0006\u0002^.x\u0010\u001dt{7{ \u0014\u0015\u0017R~\u0012F\u007fz", "/qV@", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#a'>m\u0018*T1JgC\u001et{_9\u0012r0X\u007f|", "1gT0^\fES!~\u0004m:e\u0013>N\u0010/\u0003", "", "1nd;g\u0015H\\\u0002\u000f\u0002e", "", "1", ExifInterface.GPS_MEASUREMENT_2D, "@dbA", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPyd+<\u001b\u0019(\u0013\t7q\u0003U\u007f\u000b:jnQ,S+", "\u0013R2\u000eC\f\u001dMvaVK\u001a", "A`]6g0SS", "D`[BX:", "0ng2W\u0016GS\u0003\u007fXe(\u000b\u0017\u0018a\b(", "=mT\u001cY\u0015:[\u0019", "0ng2W\u0016GS\u0003\u007f`^@]\r/l~\u0011wH\u0001", "4hT9W\u0015:[\u0019", "0ng2W\u0016GS\u0003\u007f`^@\u000bi3e\u0007'd<\t\u0017", "3mR<W,\u001a`&z\u000fX0\u0006\u0018|2", "/qa.l", "", "EqXAX9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\u0012\u0017$UoxI\u00014?K\u000b$Fm#\u0004", "B`V", "3mR<W,\u001a`&z\u000fX<\u0001\u0012>3L", "3mR<W,\u001a`&z\u000fX:\u0001\u0012>3L", "3mR<W,\u001a`&z\u000fX-\u0001\u001c/dMt", "3mR<W,\u001a`&z\u000fX:}\rBe~uH", "3mR<W,\u001a`&z\u000fX0\u0006\u0018\u007f4", "", "3mR<W,\u001a`&z\u000fX<\u0001\u0012>6N", "3mR<W,\u001a`&z\u000fX:\u0001\u0012>6N", "3mR<W,\u001a`&z\u000fX-\u0001\u001c/dPv", "3mR<W,\u001a`&z\u000fX:}\rBe~xJ", "3mR<W,\u001a`&z\u000fX-\u0004\u0013+t", "", "3mR<W,\u001a`&z\u000fX+\u0007\u0019,l\u007f", "", "2dR<W,)`\u001d\u0007~m0\u000e\t)d\n8xG\u0001", "", "@dP1X9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u0003&S", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "2dR<W,)`\u001d\u0007~m0\u000e\t)f\u0004;{?Nc", "2dR<W,)`\u001d\u0007~m0\u000e\t)f\u0004;{?Qe", "", "2dR<W,)`\u001d\u0007~m0\u000e\t)f\u00072wO", "", "2dR<W,)`\u001d\u0007~m0\u000e\t)i\t7I\r", "2dR<W,)`\u001d\u0007~m0\u000e\t)i\t7L\u000f", "2dR<W,)`\u001d\u0007~m0\u000e\t)s\u0001,\u000f@\u007fdc", "2dR<W,)`\u001d\u0007~m0\u000e\t)s\u0001,\u000f@\u007fge", "2dR<W,)`\u001d\u0007~m0\u000e\t)s\u00041\u000b\u000eM", "2dR<W,)`\u001d\u0007~m0\u000e\t)s\u00041\u000b\u0011O", "2dR<W,)`\u001d\u0007~m0\u000e\t)u\u00041\u000b\u000eM", "2dR<W,)`\u001d\u0007~m0\u000e\t)u\u00041\u000b\u0011O", "1n\\:b5\u001e_)z\u0002l", "\u001aiPCTuMW!~DB5\u000b\u0018+n\u000f}", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq_I\u000f&\u0013P~c", "=sW2e", "uKY.i(\bb\u001d\u0007z(\u0010\u0006\u0017>a\t7Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u00118", "1n\\:b5!O'\u0002Xh+|", "uKY.i(\bb\u001d\u0007z(\u0010\u0006\u0017>a\t7Q\u0004d", "\u001aiPCTuMW!~D=<\n\u0005>i\n1Q", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqZP\u000e\u0013&Ky\u0017\u0012", "uKY.i(\bb\u001d\u0007z(\u000b\r\u0016+t\u00042\u0005\u0016g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#\u00070", "uKY.i(\bb\u001d\u0007z(\u000b\r\u0016+t\u00042\u0005\u0016Dz", "Eha2 9N\\(\u0003\u0003^"}, k = 5, mv = {2, 0, 0}, pn = "", xi = 48, xs = "6A>~B?B-=/>8u=.6(p*.3#/*\u001c&g\u0001%*\u001a&!\u0013\u001d")
final /* synthetic */ class Internal__InternalKt {
    private static final String ESCAPED_CHARS = ",[]{}\\";

    /* JADX INFO: renamed from: com.squareup.wire.internal.Internal__InternalKt$sanitize$2 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<String, String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1, Internal__InternalKt.class, "sanitize", "sanitize(Ljava/lang/String;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return Internal.sanitize(p02);
        }
    }

    /* JADX INFO: renamed from: -redactElements */
    public static final <T> List<T> m8726redactElements(List<? extends T> list, ProtoAdapter<T> adapter) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        List<? extends T> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(adapter.redact(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: -redactElements */
    public static final <K, V> Map<K, V> m8727redactElements(Map<K, ? extends V> map, ProtoAdapter<V> adapter) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), adapter.redact(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final String boxedOneOfClassName(String oneOfName) {
        Intrinsics.checkNotNullParameter(oneOfName, "oneOfName");
        if (oneOfName.length() <= 0) {
            return oneOfName;
        }
        StringBuilder sbAppend = new StringBuilder().append((Object) CharsKt.titlecase(oneOfName.charAt(0)));
        String strSubstring = oneOfName.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return sbAppend.append(strSubstring).toString();
    }

    public static final String boxedOneOfKeyFieldName(String oneOfName, String fieldName) {
        Intrinsics.checkNotNullParameter(oneOfName, "oneOfName");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        String upperCase = (oneOfName + '_' + fieldName).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final String boxedOneOfKeysFieldName(String oneOfName) {
        Intrinsics.checkNotNullParameter(oneOfName, "oneOfName");
        String upperCase = (oneOfName + "_keys").toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final void checkElementsNotNull(List<?> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2) == null) {
                throw new NullPointerException("Element at index " + i2 + " is null");
            }
        }
    }

    public static final void checkElementsNotNull(Map<?, ?> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null) {
                throw new NullPointerException("map.containsKey(null)");
            }
            if (value == null) {
                throw new NullPointerException("Value for key " + key + " is null");
            }
        }
    }

    public static final boolean commonEquals(Duration duration, Object obj) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        if (duration == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Duration)) {
            return false;
        }
        Duration duration2 = (Duration) obj;
        return duration.getSeconds() == duration2.getSeconds() && duration.getNano() == duration2.getNano();
    }

    public static final boolean commonEquals(Instant instant, Object obj) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        if (instant == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Instant)) {
            return false;
        }
        Instant instant2 = (Instant) obj;
        return instant.getEpochSecond() == instant2.getEpochSecond() && instant.getNano() == instant2.getNano();
    }

    public static final int commonHashCode(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        return (Long.hashCode(duration.getSeconds()) * 31) + Integer.hashCode(duration.getNano());
    }

    public static final int commonHashCode(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        return (Long.hashCode(instant.getEpochSecond()) * 31) + Integer.hashCode(instant.getNano());
    }

    @Deprecated(message = "\u0013R\u00016\u0005yTi]N-\tU'-ba\f\f6\tmKg\nO|q\u000e\f-xm\u0019gQZlqEK0rP\u0017h_\u00031f\b\u000e3\u000e\u0002aKV&\u0004#\u007f;\nw\u001e=", replaceWith = @ReplaceWith(expression = "com.squareup.internal.Internal.copyOf(list)", imports = {}))
    @InterfaceC1492Gx
    public static final <T> List<T> copyOf(String name, List<? extends T> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNull(list);
        return Internal.copyOf(list);
    }

    public static final <T> List<T> copyOf(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return (list == CollectionsKt.emptyList() || (list instanceof ImmutableList)) ? new MutableOnWriteList(list) : new ArrayList(list);
    }

    @Deprecated(message = "\u0013R\u00016\u0005yTi]N-\tU'-ba\f\f6\tmKg\nO|q\u000e\f-xm\u0019gQZlqEK0rP\u0017h_\u00031f\b\u000e3\u000e\u0002aKV&\u0004#\u007f;\nw\u001e=", replaceWith = @ReplaceWith(expression = "com.squareup.internal.Internal.copyOf(map)", imports = {}))
    @InterfaceC1492Gx
    public static final <K, V> Map<K, V> copyOf(String name, Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNull(map);
        return Internal.copyOf(map);
    }

    public static final <K, V> Map<K, V> copyOf(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new LinkedHashMap(map);
    }

    public static final int countNonNull(Object obj, Object obj2) {
        return (obj != null ? 1 : 0) + (obj2 == null ? 0 : 1);
    }

    public static final int countNonNull(Object obj, Object obj2, Object obj3) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0) + (obj3 == null ? 0 : 1);
    }

    public static final int countNonNull(Object obj, Object obj2, Object obj3, Object obj4, Object... rest) {
        Intrinsics.checkNotNullParameter(rest, "rest");
        int i2 = obj != null ? 1 : 0;
        if (obj2 != null) {
            i2++;
        }
        if (obj3 != null) {
            i2++;
        }
        if (obj4 != null) {
            i2++;
        }
        for (Object obj5 : rest) {
            if (obj5 != null) {
                i2++;
            }
        }
        return i2;
    }

    public static final double decodePrimitive_double(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return Double.longBitsToDouble(reader.readFixed64());
    }

    public static final double decodePrimitive_double(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return Double.longBitsToDouble(reader.readFixed64());
    }

    public static final int decodePrimitive_fixed32(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed32();
    }

    public static final int decodePrimitive_fixed32(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed32();
    }

    public static final long decodePrimitive_fixed64(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed64();
    }

    public static final long decodePrimitive_fixed64(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed64();
    }

    public static final float decodePrimitive_float(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(reader.readFixed32());
    }

    public static final float decodePrimitive_float(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(reader.readFixed32());
    }

    public static final int decodePrimitive_int32(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint32();
    }

    public static final int decodePrimitive_int32(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint32();
    }

    public static final long decodePrimitive_int64(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint64();
    }

    public static final long decodePrimitive_int64(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint64();
    }

    public static final int decodePrimitive_sfixed32(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed32();
    }

    public static final int decodePrimitive_sfixed32(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed32();
    }

    public static final long decodePrimitive_sfixed64(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed64();
    }

    public static final long decodePrimitive_sfixed64(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readFixed64();
    }

    public static final int decodePrimitive_sint32(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return ProtoWriter.Companion.decodeZigZag32$wire_runtime(reader.readVarint32());
    }

    public static final int decodePrimitive_sint32(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return ProtoWriter.Companion.decodeZigZag32$wire_runtime(reader.readVarint32());
    }

    public static final long decodePrimitive_sint64(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return ProtoWriter.Companion.decodeZigZag64$wire_runtime(reader.readVarint64());
    }

    public static final long decodePrimitive_sint64(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return ProtoWriter.Companion.decodeZigZag64$wire_runtime(reader.readVarint64());
    }

    public static final int decodePrimitive_uint32(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint32();
    }

    public static final int decodePrimitive_uint32(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint32();
    }

    public static final long decodePrimitive_uint64(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint64();
    }

    public static final long decodePrimitive_uint64(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.readVarint64();
    }

    public static final void encodeArray_double(double[] array, ReverseProtoWriter writer, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeFixed64(Double.doubleToLongBits(array[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i2, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_fixed32(int[] array, ReverseProtoWriter writer, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeFixed32(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i2, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_fixed64(long[] array, ReverseProtoWriter writer, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeFixed64(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i2, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_float(float[] array, ReverseProtoWriter writer, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeFixed32(Float.floatToIntBits(array[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i2, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_int32(int[] array, ReverseProtoWriter writer, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeSignedVarint32$wire_runtime(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i2, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_int64(long[] array, ReverseProtoWriter writer, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeVarint64(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i2, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sfixed32(int[] array, ReverseProtoWriter writer, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Internal.encodeArray_fixed32(array, writer, i2);
    }

    public static final void encodeArray_sfixed64(long[] array, ReverseProtoWriter writer, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Internal.encodeArray_fixed64(array, writer, i2);
    }

    public static final void encodeArray_sint32(int[] array, ReverseProtoWriter writer, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeVarint32(ProtoWriter.Companion.encodeZigZag32$wire_runtime(array[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i2, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sint64(long[] array, ReverseProtoWriter writer, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeVarint64(ProtoWriter.Companion.encodeZigZag64$wire_runtime(array[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i2, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_uint32(int[] array, ReverseProtoWriter writer, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeVarint32(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i2, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_uint64(long[] array, ReverseProtoWriter writer, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Internal.encodeArray_int64(array, writer, i2);
    }

    public static final boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && Intrinsics.areEqual(obj, obj2));
    }

    private static final KClass<? extends Object> getTypeName$Internal__InternalKt(Object obj) {
        return Reflection.getOrCreateKotlinClass(obj.getClass());
    }

    public static final <T> List<T> immutableCopyOf(String name, List<? extends T> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(list, "list");
        if (list instanceof MutableOnWriteList) {
            list = (List<T>) ((MutableOnWriteList) list).getMutableList$wire_runtime();
        }
        if (list == CollectionsKt.emptyList() || (list instanceof ImmutableList)) {
            return (List<T>) list;
        }
        ImmutableList immutableList = new ImmutableList(list);
        if (immutableList.contains(null)) {
            throw new IllegalArgumentException((name + ".contains(null)").toString());
        }
        return immutableList;
    }

    public static final <K, V> Map<K, V> immutableCopyOf(String name, Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(map, "map");
        if (map.isEmpty()) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Set<K> setKeySet = linkedHashMap.keySet();
        Intrinsics.checkNotNull(setKeySet, "null cannot be cast to non-null type kotlin.collections.Collection<K of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOf?>");
        if (setKeySet.contains(null)) {
            throw new IllegalArgumentException((name + ".containsKey(null)").toString());
        }
        Collection<V> collectionValues = linkedHashMap.values();
        Intrinsics.checkNotNull(collectionValues, "null cannot be cast to non-null type kotlin.collections.Collection<V of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOf?>");
        if (collectionValues.contains(null)) {
            throw new IllegalArgumentException((name + ".containsValue(null)").toString());
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> immutableCopyOfMapWithStructValues(String name, Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(map, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null) {
                throw new IllegalArgumentException((name + ".containsKey(null)").toString());
            }
            linkedHashMap.put(key, Internal.immutableCopyOfStruct(name, value));
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
        Intrinsics.checkNotNull(mapUnmodifiableMap, "null cannot be cast to non-null type kotlin.collections.Map<K of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOfMapWithStructValues, V of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOfMapWithStructValues>");
        return mapUnmodifiableMap;
    }

    public static final <T> T immutableCopyOfStruct(String name, T t2) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (t2 == null || (t2 instanceof Boolean) || (t2 instanceof Double) || (t2 instanceof String)) {
            return t2;
        }
        if (t2 instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) t2).iterator();
            while (it.hasNext()) {
                arrayList.add(Internal.immutableCopyOfStruct(name, it.next()));
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
            return (T) listUnmodifiableList;
        }
        if (!(t2 instanceof Map)) {
            throw new IllegalArgumentException("struct value " + name + " must be a JSON type (null, Boolean, Double, String, List, or Map) but was " + getTypeName$Internal__InternalKt(t2) + ": " + t2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) t2).entrySet()) {
            linkedHashMap.put(Internal.immutableCopyOfStruct(name, entry.getKey()), Internal.immutableCopyOfStruct(name, entry.getValue()));
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
        return (T) mapUnmodifiableMap;
    }

    public static final IllegalStateException missingRequiredFields(Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, args.length - 1, 2);
        String str = "";
        if (progressionLastElement >= 0) {
            while (true) {
                if (args[i2] == null) {
                    if (sb.length() > 0) {
                        str = Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY;
                    }
                    sb.append("\n  ");
                    sb.append(args[i2 + 1]);
                }
                if (i2 == progressionLastElement) {
                    break;
                }
                i2 += 2;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        throw new IllegalStateException("Required field" + str + " not set:" + string);
    }

    public static final <T> List<T> newMutableList() {
        return new MutableOnWriteList(CollectionsKt.emptyList());
    }

    public static final <K, V> Map<K, V> newMutableMap() {
        return new LinkedHashMap();
    }

    public static final String sanitize(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sb = new StringBuilder(value.length());
        String str = value;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (StringsKt.contains$default((CharSequence) ESCAPED_CHARS, cCharAt, false, 2, (Object) null)) {
                sb.append('\\');
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final String sanitize(List<String> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return CollectionsKt.joinToString$default(values, null, "[", "]", 0, null, AnonymousClass2.INSTANCE, 25, null);
    }
}
