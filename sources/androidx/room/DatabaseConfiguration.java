package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.room.RoomDatabase;
import androidx.room.migration.AutoMigrationSpec;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: DatabaseConfiguration.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яz\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u001a<$q$yّCU(\u0007*ޛWN}gvϺb\u000bY\u000f\u000e\u0016~j4Ic\u0019e\u0012\u001d8JoE8UoS9ht<\u0005(288\u0002\u0005\u0017\u001a2H\u0016v\u0003Ca\f\u001a0FrBR#M\r\u001a\u0018\u0006F \u0017\u001edgT;N\u0001sŽ_#1h\u00036-t@\u0001[\r^TU\u000e\u0007g,-X9K\u0014SV\u0013\u000b`_W\u0003mvM\tv-?+wzgBf\b,\u001d;Q\u001d]!0r\u0004\u007fi\u001c+9Z{K~\u001a8{\t\t%<2\u001c\u0016+V=E\u001a\u0015\u0018\u001e7\u0003\u0004k@~\u000enN\u000e\ry>''\u00103YM1e\u007ftޅ\u001dNE\u0011Eپ\u001d)\u0016~%iT&`C\u001cd}_3iBSG|\riA{\b\tb0/\u00144U\u0006G{?5'1EcQ+1m\u0012Hrq\r\u0004\u000fqcm`SX\"\u001d\"G.\u0017\u0019rD\u0013\u0013{TbgD\u0011{,d\u000b\f\u001e+ \u000b\bL%3'fO\u0017uzQk\u001b=/\u0015Ciry&o9\r?E]q\"yZ\u0007\u0016O<\u0011\u0019nepf۱^\\6;rʡi\u0016\r\fH\\\f+2mr,::31^+G1!RE\u000b\rwZ\u0017\u0015\u000fXA*\u001biR{\u0019\r^d\twwzY,+j8,oZE\u001d4`:hb\t3\u000b\r\u0001\u0018G\u0016ZWPz%\u000eU*0&\u001eGgG=A\u001f\u000f-@\u0019EEz~uU[#?z+\u0006\u001f?vF\u007f\b\u0019|<lx\\g\\'$\u0007^!7\u001ec.\rqL\ta{V!ZlL\u0003\tgWf:\u0013\u0004M:ݵ\u0005o0\u001auԬB-2&{\"/-a\fj\u007f4\bd'(\u000bd2/s\u001a}fi]`@HMg\u0005V\"Rs\u0013NVr\u0010\u0010R\u000bD\raRWc\u001f_HQ\u0019:\u0016f58\u001dtdhR\u0013\u001e\fD2m9\fC,$nG3'eS\u0016}}Oj\"b\u000f8\u0017\f5|#4=Nbgf\u0017H\u001esFBQGp\u0017T\u001146<<6\u001fYS\u0018\u0019 \u0001\u000e`w\u0011-1pvK\\\u001co\u0011^lG3|Ul/H\u0019\u0007\u001f5.xcQ\u001bltsвg2\u000ft]ͯ\u001apd\u000fj3+\\Tg\u001c8^\u000f\r]_YH09\u0014K7q\u0004o:=(\u0001+H0\u001bgX!k\u00058v\u0013ef^d%\u001c|Q|+9\u0003\t\b&<8\u001b\u001b\u001d]\u007f\bb[Z^{ER2\u0001ET9\u000b\u001a\u0013{FI=\u00169;TajB3\f[aL\u0016\bN,7\b\u00039tW<r\u001ai)L.y&d\u0012\tAd6\u0003\\]\u0005x\u0018H 8e\u0001a\u0005#dg\u0007\u0010#V&Y\t\u0016NY\u0007\u0011\u0012snsn\u0004+\u0019e_u\nt;r5\u000b=L\\6͠^:\u001fw`ȃ\u0010\u0006)%*-6 bW\u0011_ivr\u0004Qq\fY2{.o5HRL\u0003/}\u0004\nBTV\u001cKb[F|\u0011lnRW<h\u0001'\u0013}\u001c-\"\b\u0017H\r\u001d#8T\u007f6d]E)#i\u001c_`5\u0014UM47IRm+G6\u0019\u0007@v?\u000fJf\u0003\u0011BB7~\u0010k:E^Tk&7e2\u007f|\u000b6MU8p\u001cB\u0010<$?`F:V^0\u001biTCG',\u0019\u0017N\u0005\u001e#)Axok-:\u0003\r\u0001;_\u00100\u001aY\u0004=\u0001EG\u0011\u0006\u001a\u0006\nK/C\u000bd-\u001c\u0004uJ-L\u0012_ւe,W[\u0006ʖx[U\u0010\u000e-$<\u0006$$\u0010K?JBar?\u0005vg\b4.Nnr(Wp\u0007y\",\u0018\u001f\u0004piiLI\u000b\u0016)Dl4Ck5N]l\b\u0016\\\rs G\u0013\u00146K\u0017+\u001e_uN:ar{?laJ)\f\u0004hBq:\b^XYX\u0012=\u0016bt\u0003j\u001c]o\u0014F*%\r2\u0004A^n\u0012x%()[vtJrw{Tr\u0011N)<`DA:\u000e\u0016\u001c<c/\u0004\u0014I\u000f1#?U\u0012YO\"X\f!K1q$4DwpUamsn<gV\u001bwX}Mkl\u0007e!ycY\u001e\u0010t9U_\\N\u001c:X46smэ\u0014D\u0007mhӠ/65`\u0003hCu\u0001J M[#g\u00174x6\ng!/E[\u0007R\u0004(=|\u0010\t(AG\u001a\u001b*aAJ+\u0004\u000fA>*\u0012rH\u0004\u0006}M\u001e\u000eyJO;\u0016C=Ncl\u0005sO\u001deN\u0017\fN74\n!:zgAy\u001e(m-d8l(vvi\u0015tS\u0003\u000f)\u0001\u001c2\u001aPm\u0006k\u0012!n*GSgP.>p7[ei*=uut\u000fqO[*$\u001cN7\u007f,{Qu\u0013\u001dmldL5o.P\u0015\u0012\u001aKFwzvH@\u001dc\u0006\u0006l\nS\u000f4i>yU|\u007f\u0003ht>\u0012=jQ|#tv\u0016!aFr\t\u000f\u0019vJŹfl:S~^xF\u0019\u0001ymG\u0018Er\u000f#\u0016Gj&oQk]S[\u0011\u001aVxo(-{\f?f\u0011}]\u0015\u00153R-\bTz\u0013eH\u0004\u001a;hJ1ݸ\u001e\u07b2^'ușX8\u001c\u0017\u0015\u0005Zz\nV(Ά!ʒh~+̎jUe`_'#\u0005)<6Z{a1r/מ'ԏ\u007f\u0006'ˉ\u0013\u0012CtY{\f5gq}>s\u001dW\u0007 {vȰm՚\bcRЯ wp\u0011u.{x=]\u0013յCӫ\u000e\"1ͣX%5\u001c`6`1P&7\u0013\rΫLփrx-ߏ6\u001c=\u0010\u000e\u0010Hll\u0010\u001da>ҦCȒY]\u0007Ч}E\u007f&cQ}\u0001;G<i,9}k$y2ʝVţ6\u0007wɿ\u0002\u001e\u0002msBE\u0006>f\u000bĎ<߾K\u0003\u001cӳ\u001c<(`~n\u001b}\u0007efā\u0018Ȍ\u0018\u0005Fثy7N7whw\u0002K\t\u001f1MPswaӁ\u0013܃d2Fҁ_Vf}&\u001b0\u0011\u0002hpҹ;س|@Sф,\u0014u\u000ei$}G\u001aSe\u000eNק8\u05fb\u00045AΒD`l7\u007f`\u001fTQ\u0011]r&ȳsȺ6GeСp?i*&L|K~0w\u000bCͫxƲv\u0017GʏR8S15C\u0014)\u001e\t\rɛ=̈lSl҃n|il?0,\u0012W\u0017\u0018܄\u0018͙(\b\bݸ,B]y\u0019@v\u0018B\u001e\u001aǐ\nĄ\teT\u05cb\u0006\u0018OGWS\u001f)a{6ȎDҍ\u0011%)˴[,6\u0007\u0005\u0019\u007f\u00178\"q\u0012%$$\rf\u0097K֣\r-Yȋŋ\u001ed"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u000ea\u000f$x<\u000f\u0017tQx\u000f@x5BU\r$Avk", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "<`\\2", "", "Ap[6g,(^\u0019\b]^3\b\t<F{&\u000bJ\u000e+", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkA\\ud_H\u0011p@$", ";hV?T;B]\"\\\u0005g;x\r8e\r", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000ez^)7fy/;w\u001f\fWLJg8'\u0015u7", "1`[9U(<Y'", "", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000ezT!<`z\u001c5sk", "/k[<j\u0014:W\"m}k,x\b\u001bu\u007f5\u007f@\u000f", "", "8nd?a(E;#}z", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000ez[/Ef\u0007\u001c>U -M\u0019", "?tT?l\fQS\u0017\u000f\nh9", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "@d`B\\9>;\u001d\u0001\bZ;\u0001\u00138", ";hV?T;B]\"g\u0005m\u0019|\u0015?i\r(z!\u000e!\u001f", "", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{dj8\u0014m0M\npUXU0kR<<\u0011[H\u001eY6\u0017\u0012h/\u0010UHF\u001fq7I\u000b\u001eh\b\u0017\u0016\u001bsKl@e\u001aT\u000ej\\=2gSccxZ\u000bRl4lUL'fB\u0019 #m\u0016\u0017vPlq\u007fU\u001ena}qp%#\u0004G Bv[S\u001bVZ8\u0006#h[\u000b{\u0019{?x9\u0004\u0003x\u001b&?c\u0012Uk\u0017Q(\u0006\u001f6d\u000b\u00140@Dq;Z_rhL\u000e'\u0004k\u0018\u001bk18\u0001odc\u001eu\fY(W~qn\u0005>\u001c\u0004HRm%4S~KjCt\u001c\u0007\"}tSPpIg\u001flU\u001e)!\u0012\u0007ma\n.%\u0013\u001d\u007f", "BqP;f(<b\u001d\t\u0004>?|\u0007?t\n5", ";t[A\\\u0010Ga(z\u0004\\,`\u0012@a\u0007,z<\u0010\u001b!P", "/k[<j\u000b>a(\f\u000b\\;\u0001\u001a/M\u0004*\t<\u0010\u001b!PY\u0017\u001b\u00017>[\u000b\u001c6m", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{dj8\u0014m0M\npUXU0kR<<\u0011[H\u001eY6\u0017\u0012h/\u0010UHF\u001fq7I\u000b\u001eh\b\u0017\u0016\u001bsKl@e\u001aT\u000ej\\=2gSccxZ\u000bRl4lUL'fB\u0019 #m\u0016\u0017vPlq\u007fU\u001ena}qp%#\u0004G Bv[S\u001bVZ8\u0006#h[\u000b{\u0019{?x9\u0004\u0003x\u001b&?c\u0012Uk\u0017Q(\u0006\u001f6d\u000b\u00140@Dq;Z_rhL\u000e'\u0004k\u0018\u001bk18\u0001odc\u001eu\fY(W~qn\u0005>\u001c\u0004HRm%4S~KjCt\u001c\u0007\"}tSPp;\u0006\u0016\u0002@ko \u0007\n0\u0016&7\u0014Mf\u001ch3n\u0001-&\tfH\u001b\u0006f\u0019\ne=vrG\u0004W!\u007f3:\u007fZ7!B!\u007fg", "1n_F99H[t\r\t^;g\u0005>h", "1n_F99H[y\u0003\u0002^", "\u001aiPCTuB]b_~e,R", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{dj8\u0014m0M\npUXU0kR<<\u0011[H\u001eY6\u0017\u0012h/\u0010UHF\u001fq7I\u000b\u001eh\b\u0017\u0016\u001bsKl@e\u001aT\u000ej\\=2gSccxZ\u000bRl4lUL'fB\u0019 #m\u0016\u0017vPlq\u007fU\u001ena}qp%#\u0004G Bv[S\u001bVZ8\u0006#h[\u000b{\u0019{?x9\u0004\u0003x\u001b&?c\u0012Uk\u0017Q(\u0006\u001f6d\u000b\u00140@Dq;Z_rhL\u000e'\u0004k\u0018\u001bk18\u0001odc\u001eu\fY(W~qn\u0005>\u001c\u0004HRm%4S~KjCt\u001c\u0007\"}tSPp;\u0006\u0016\u0002@ko \u0007\n0\u0016&7\u0014Mf\u001ch3n\u0001-&\tfH\u001b\u0006f\u0019\ne=vrG\u0004W!\u007f3:\u007fZ7!B!#{NTkY\u001d0\n\rH\u000b\u0003vF\u00038h\f*9j4,d9THW)\u0019={\r", "1n_F99H[|\b\u0006n;j\u0018<e{0", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Nv\n9}%\u000b", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{dj8\u0014m0M\npUXU0kR<<\u0011[H\u001eY6\u0017\u0012h/\u0010UHF\u001fq7I\u000b\u001eh\b\u0017\u0016\u001bsKl@e\u001aT\u000ej\\=2gSccxZ\u000bRl4lUL'fB\u0019 #m\u0016\u0017vPlq\u007fU\u001ena}qp%#\u0004G Bv[S\u001bVZ8\u0006#h[\u000b{\u0019{?x9\u0004\u0003x\u001b&?c\u0012Uk\u0017Q(\u0006\u001f6d\u000b\u00140@Dq;Z_rhL\u000e'\u0004k\u0018\u001bk18\u0001odc\u001eu\fY(W~qn\u0005>\u001c\u0004HRm%4S~KjCt\u001c\u0007\"}tSPp;\u0006\u0016\u0002@ko \u0007\n0\u0016&7\u0014Mf\u001ch3n\u0001-&\tfH\u001b\u0006f\u0019\ne=vrG\u0004W!\u007f3:\u007fZ7!B!#{NTkY\u001d0\n\rH\u000b\u0003vF\u00038h\f*9j4,d9THW)\u0019=\u001f!\u001b>-KbOreA%\u001f\u0007\fx\n\"]GGK\u0011=Pq\u001e9jKZ\u007fK", ">qT=T*DO\u001b~y=(\f\u0005,a\u000e(Y<\b\u001e\u0014Cm\u0014", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000eza25dy\u001e=i\u0018.L\"7z0\u001b\u0011va\u0017\u0003j3Kr%M\"", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{dj8\u0014m0M\npUXU0kR<<\u0011[H\u001eY6\u0017\u0012h/\u0010UHF\u001fq7I\u000b\u001eh\b\u0017\u0016\u001bsKl@e\u001aT\u000ej\\=2gSccxZ\u000bRl4lUL'fB\u0019 #m\u0016\u0017vPlq\u007fU\u001ena}qp%#\u0004G Bv[S\u001bVZ8\u0006#h[\u000b{\u0019{?x9\u0004\u0003x\u001b&?c\u0012Uk\u0017Q(\u0006\u001f6d\u000b\u00140@Dq;Z_rhL\u000e'\u0004k\u0018\u001bk18\u0001odc\u001eu\fY(W~qn\u0005>\u001c\u0004HRm%4S~KjCt\u001c\u0007\"}tSPp;\u0006\u0016\u0002@ko \u0007\n0\u0016&7\u0014Mf\u001ch3n\u0001-&\tfH\u001b\u0006f\u0019\ne=vrG\u0004W!\u007f3:\u007fZ7!B!#{NTkY\u001d0\n\rH\u000b\u0003vF\u00038h\f*9j4,d9THW)\u0019=\u001f!\u001b>-KbOreA%\u001f\u0007\fx\n\"]GGK\u0011=Pq\u001e9jKZ#V[\u000f9W\u0019.s>#Le{~7x\u0018\bb'\b\u000f\u0019(4u\u0006\nt\u001b:b\n\u0012\u0006q\u001d.y|gJ\u0013I!n&D!\u0005X+\u0003\u0016w\nY", "Bx_266Gd\u0019\f\n^9\u000b", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{dj8\u0014m0M\npUXU0kR<<\u0011[H\u001eY6\u0017\u0012h/\u0010UHF\u001fq7I\u000b\u001eh\b\u0017\u0016\u001bsKl@e\u001aT\u000ej\\=2gSccxZ\u000bRl4lUL'fB\u0019 #m\u0016\u0017vPlq\u007fU\u001ena}qp%#\u0004G Bv[S\u001bVZ8\u0006#h[\u000b{\u0019{?x9\u0004\u0003x\u001b&?c\u0012Uk\u0017Q(\u0006\u001f6d\u000b\u00140@Dq;Z_rhL\u000e'\u0004k\u0018\u001bk18\u0001odc\u001eu\fY(W~qn\u0005>\u001c\u0004HRm%4S~KjCt\u001c\u0007\"}tSPp;\u0006\u0016\u0002@ko \u0007\n0\u0016&7\u0014Mf\u001ch3n\u0001-&\tfH\u001b\u0006f\u0019\ne=vrG\u0004W!\u007f3:\u007fZ7!B!#{NTkY\u001d0\n\rH\u000b\u0003vF\u00038h\f*9j4,d9THW)\u0019=\u001f!\u001b>-KbOreA%\u001f\u0007\fx\n\"]GGK\u0011=Pq\u001e9jKZ#V[\u000f9W\u0019.s>#Le{~7x\u0018\bb'\b\u000f\u0019(4u\u0006\nt\u001b:b\n\u0012\u0006q\u001d.y|gJ\u0013I!n&D!\u0005X+\u0003\u0016w-m\u0011]|rSIRO@\u00067\u0016\r*I#", "/tc<@0@`\u0015\u000e~h5j\u0014/c\u000e", "\u001a`]1e6BR,H\bh6\u0005R7i\u00025wO\u0005! \u0011K\u001eK\u0001\r9[\u000b\u001cFq 7;N;i\n", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{dj8\u0014m0M\npUXU0kR<<\u0011[H\u001eY6\u0017\u0012h/\u0010UHF\u001fq7I\u000b\u001eh\b\u0017\u0016\u001bsKl@e\u001aT\u000ej\\=2gSccxZ\u000bRl4lUL'fB\u0019 #m\u0016\u0017vPlq\u007fU\u001ena}qp%#\u0004G Bv[S\u001bVZ8\u0006#h[\u000b{\u0019{?x9\u0004\u0003x\u001b&?c\u0012Uk\u0017Q(\u0006\u001f6d\u000b\u00140@Dq;Z_rhL\u000e'\u0004k\u0018\u001bk18\u0001odc\u001eu\fY(W~qn\u0005>\u001c\u0004HRm%4S~KjCt\u001c\u0007\"}tSPp;\u0006\u0016\u0002@ko \u0007\n0\u0016&7\u0014Mf\u001ch3n\u0001-&\tfH\u001b\u0006f\u0019\ne=vrG\u0004W!\u007f3:\u007fZ7!B!#{NTkY\u001d0\n\rH\u000b\u0003vF\u00038h\f*9j4,d9THW)\u0019=\u001f!\u001b>-KbOreA%\u001f\u0007\fx\n\"]GGK\u0011=Pq\u001e9jKZ#V[\u000f9W\u0019.s>#Le{~7x\u0018\bb'\b\u000f\u0019(4u\u0006\nt\u001b:b\n\u0012\u0006q\u001d.y|gJ\u0013I!n&D!\u0005X+\u0003\u0016w-m\u0011]|rSIRO@\u00067\u0016\r*l7THu-J\n%(\u000bx\n\u0016_\\b6", ";t[A\\\u0010Ga(z\u0004\\,`\u0012@a\u0007,z<\u0010\u001b!P]\u000eI\b)3Ya)Fm\u001f=", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{dj8\u0014m0M\npUXU0kR<<\u0011[H\u001eY6\u0017\u0012h/\u0010UHF\u001fq7I\u000b\u001eh\b\u0017\u0016\u001bsKl@e\u001aT\u000ej\\=2gSccxZ\u000bRl4lUL'fB\u0019 #m\u0016\u0017vPlq\u007fU\u001ena}qp%#\u0004G Bv[S\u001bVZ8\u0006#h[\u000b{\u0019{?x9\u0004\u0003x\u001b&?c\u0012Uk\u0017Q(\u0006\u001f6d\u000b\u00140@Dq;Z_rhL\u000e'\u0004k\u0018\u001bk18\u0001odc\u001eu\fY(W~qn\u0005>\u001c\u0004HRm%4S~KjCt\u001c\u0007\"}tSPp;\u0006\u0016\u0002@ko \u0007\n0\u0016&7\u0014Mf\u001ch3n\u0001-&\tfH\u001b\u0006f\u0019{lQ\u000fzUvZ!m.?\b\u0011R0|/E\u0006RL~e\u000b)g\u0010z.o3R\t:\u001an\u0013=h\u000eIe+\u001cc\u001d)\u0015p:e\r<>\u0006[BDE|#&yWl\u0007^>B?\u0002\t(Nf38-[\u0014@a\u001c\u000e6V\u0013?m\u0002\u0016Kj=\u0013Fu\u0015{\u00012xh\u0003(/tT)k\u001aB0\u0019\u0016\u0014wf\u001c%\u000b`-\u0012\\\u000fkDV\u001a<F<\u0005\u001b\u001eDn\u0011N\u0001(\"6]Ds\u001bA\b[P\r9U3wi\u0010a&\u001dR\u000eO\u0018_\u000b&\u000f\u0002_$\tMSS+rMk\u001c\u0004ZF_5?#Gu]q", "7r<6Z9:b\u001d\t\u0004K,\t\u00193r\u007f'", "4q^:I,Ka\u001d\t\u0004", "BnE2e:B]\"", "7r<6Z9:b\u001d\t\u0004K,\t\u00193r\u007f'\\M\u000b\u001f", "Dda@\\6G", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class DatabaseConfiguration {
    public final boolean allowDestructiveMigrationOnDowngrade;
    public final boolean allowMainThreadQueries;
    public final List<AutoMigrationSpec> autoMigrationSpecs;
    public final List<RoomDatabase.Callback> callbacks;
    public final Context context;
    public final String copyFromAssetPath;
    public final File copyFromFile;
    public final Callable<InputStream> copyFromInputStream;
    public final RoomDatabase.JournalMode journalMode;
    public final RoomDatabase.MigrationContainer migrationContainer;
    private final Set<Integer> migrationNotRequiredFrom;
    public final boolean multiInstanceInvalidation;
    public final Intent multiInstanceInvalidationServiceIntent;
    public final String name;
    public final RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback;
    public final Executor queryExecutor;
    public final boolean requireMigration;
    public final SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;
    public final Executor transactionExecutor;
    public final List<Object> typeConverters;

    /* JADX WARN: Multi-variable type inference failed */
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z2, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z3, boolean z4, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> typeConverters, List<? extends AutoMigrationSpec> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = sqliteOpenHelperFactory;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z2;
        this.journalMode = journalMode;
        this.queryExecutor = queryExecutor;
        this.transactionExecutor = transactionExecutor;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z3;
        this.allowDestructiveMigrationOnDowngrade = z4;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
        this.typeConverters = typeConverters;
        this.autoMigrationSpecs = autoMigrationSpecs;
        this.multiInstanceInvalidation = intent != null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "\u0017N\u0005H1w$ek[:\u0010S);`\u001cU\u001cf\tm\u001cd{Io~Sxq", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @InterfaceC1492Gx
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z2, RoomDatabase.JournalMode journalMode, Executor queryExecutor, boolean z3, Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z2, journalMode, queryExecutor, queryExecutor, (Intent) null, z3, false, set, (String) null, (File) null, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) CollectionsKt.emptyList(), (List<? extends AutoMigrationSpec>) CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "\u0017N\u0005H1w$ek[:\u0010S);`\u001cU\u001cf\tm\u001cd{Io~Sxq", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @InterfaceC1492Gx
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z2, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z3, boolean z4, boolean z5, Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z2, journalMode, queryExecutor, transactionExecutor, z3 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z4, z5, set, (String) null, (File) null, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) CollectionsKt.emptyList(), (List<? extends AutoMigrationSpec>) CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "\u0017N\u0005H1w$ek[:\u0010S);`\u001cU\u001cf\tm\u001cd{Io~Sxq", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @InterfaceC1492Gx
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z2, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z3, boolean z4, boolean z5, Set<Integer> set, String str2, File file) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z2, journalMode, queryExecutor, transactionExecutor, z3 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z4, z5, set, str2, file, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) CollectionsKt.emptyList(), (List<? extends AutoMigrationSpec>) CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "\u0017N\u0005H1w$ek[:\u0010S);`\u001cU\u001cf\tm\u001cd{Io~Sxq", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @InterfaceC1492Gx
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z2, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z3, boolean z4, boolean z5, Set<Integer> set, String str2, File file, Callable<InputStream> callable) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z2, journalMode, queryExecutor, transactionExecutor, z3 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z4, z5, set, str2, file, callable, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) CollectionsKt.emptyList(), (List<? extends AutoMigrationSpec>) CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "\u0017N\u0005H1w$ek[:\u0010S);`\u001cU\u001cf\tm\u001cd{Io~Sxq", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @InterfaceC1492Gx
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z2, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z3, boolean z4, boolean z5, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z2, journalMode, queryExecutor, transactionExecutor, z3 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z4, z5, set, str2, file, callable, prepackagedDatabaseCallback, (List<? extends Object>) CollectionsKt.emptyList(), (List<? extends AutoMigrationSpec>) CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "\u0017N\u0005H1w$ek[:\u0010S);`\u001cU\u001cf\tm\u001cd{Io~Sxq", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @InterfaceC1492Gx
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z2, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z3, boolean z4, boolean z5, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> typeConverters) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z2, journalMode, queryExecutor, transactionExecutor, z3 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z4, z5, set, str2, file, callable, prepackagedDatabaseCallback, typeConverters, (List<? extends AutoMigrationSpec>) CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "\u0017N\u0005H1w$ek[:\u0010S);`\u001cU\u001cf\tm\u001cd{Io~Sxq", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @InterfaceC1492Gx
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z2, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z3, boolean z4, boolean z5, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> typeConverters, List<? extends AutoMigrationSpec> autoMigrationSpecs) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z2, journalMode, queryExecutor, transactionExecutor, z3 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z4, z5, set, str2, file, callable, (RoomDatabase.PrepackagedDatabaseCallback) null, typeConverters, autoMigrationSpecs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
    }

    @Deprecated(message = "\u0018Y\u0001tl}(DaN:{d\u001e;\\NQ\u001a<\u000ez\u0011V>O|~\u001a4-t|\u0015a\u0002ddq<N]G;\u001d[_#a\u0018\bz%}/\u0013\u0018S#[~{G\u0016\u0005!rK%a\u0003hf)\u001a|\\\u0019N\t0<\f@j}Be\u001dr\u0001\u001d5+R$5>\u001c\u0018\u000eHg 4l", replaceWith = @ReplaceWith(expression = "isMigrationRequired(version, version + 1)", imports = {}))
    @InterfaceC1492Gx
    public boolean isMigrationRequiredFrom(int i2) {
        return isMigrationRequired(i2, i2 + 1);
    }

    public boolean isMigrationRequired(int i2, int i3) {
        if ((i2 > i3 && this.allowDestructiveMigrationOnDowngrade) || !this.requireMigration) {
            return false;
        }
        Set<Integer> set = this.migrationNotRequiredFrom;
        return set == null || !set.contains(Integer.valueOf(i2));
    }
}
