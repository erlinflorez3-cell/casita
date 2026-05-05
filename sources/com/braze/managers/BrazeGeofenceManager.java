package com.braze.managers;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import bo.app.ab;
import bo.app.ba;
import bo.app.bb;
import bo.app.cb;
import bo.app.d9;
import bo.app.db;
import bo.app.e00;
import bo.app.eb;
import bo.app.fb;
import bo.app.gb;
import bo.app.h00;
import bo.app.hb;
import bo.app.ib;
import bo.app.ic;
import bo.app.jb;
import bo.app.jc;
import bo.app.kb;
import bo.app.kc;
import bo.app.kf;
import bo.app.lb;
import bo.app.lc;
import bo.app.mb;
import bo.app.mc;
import bo.app.nb;
import bo.app.ob;
import bo.app.oc;
import bo.app.of;
import bo.app.pb;
import bo.app.pc;
import bo.app.qa;
import bo.app.qb;
import bo.app.ra;
import bo.app.rb;
import bo.app.rc;
import bo.app.rz;
import bo.app.sa;
import bo.app.sb;
import bo.app.sd;
import bo.app.tb;
import bo.app.tf;
import bo.app.tz;
import bo.app.ub;
import bo.app.v00;
import bo.app.vb;
import bo.app.vb0;
import bo.app.vz;
import bo.app.wb;
import bo.app.wz;
import bo.app.xb;
import bo.app.xz;
import bo.app.yb;
import bo.app.z9;
import bo.app.za;
import bo.app.zb;
import bo.app.zd;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.GeofenceTransitionType;
import com.braze.location.IBrazeGeofenceApi;
import com.braze.location.IBrazeLocationApi;
import com.braze.models.BrazeGeofence;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.google.android.gms.common.GoogleApiAvailability;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZO;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яķ\u0014D57\u001eq\u007fR܀kt\u001aA\u000e0\u0019.J~(,\u001aw\u001dfrˎ8DsQ6RY-\u0017k\u00124,[*rK;c&\u0006̝\u0011OdgonP[\u0013C%\u0006\u001exp/QU\u000f]\u001a\u000f8Dw?IMw=?a|6\u0013>:\">\u007f\r\u00010*P\u0010||KK\"\u00128@v:Z\rc\u0005\"\u0012\f>(\u00014\\oN<Kt]P/+\u0003oHV'u0\u0005M\u0013F\\'#vi\u001e1C?5#D[\u0003\rZc?\u0019?y=\u000bx/'9O{W<^\b\u0014++W\rcu,a\u001bĩ~\tW+}b{P<(0yxMq\u0014\u0012\u0014,`.[\u001ev\f\u001c+\rr\u0002P`\u0006lq\u0018z\u0010d')\u000egC9I\u001aaeIPf7*;\u001d\"1z\u0007!\nM\u05f8d\u0017!O\u0006My\\N?`N8Zǀq\u0006vd\u0010-LEU\u0007G{?4G)E`Q#OoHMזkx\u000bgv[2gVJ:nD8Z\r\u001ac\\d3q\u0017Yг0\u0013S&b\u0012F\u001f!.twj\"U\u0016\\\\\u0001k\u0001L\f\u0016k4Ϭ;[ty\u001cf\u0002{AIic>g\u0003z\"PTb3h\u0017Fa\u001fr\\V4xMн\u0014y\u0002X\\![IM\t46B0GrEL\u0011/ZA+\u0019&_ӳ\u0014\u0001ZJ2\u001b2A\u0003#\u0019P\u000bq k\u0007ZD|\u000f2]E_N1&\u00044/Hč'\t\u0005\u000e\u000eb0aUj\u0005\u0016$V,$$7QQ]YY#ɒ-4\bKSk;z_k*')}*\u0013I\tFg6p7@߯nLUr%-?s\u0001F d.z\u0012J\ti{T9|\u0005]\u03a2\u0007[BqF!M:,L\u0019oP}e7QM5\u001c\b\u0016?\u0015\u0010s\u0018\u0015t\u000eˏ\u0013(z\r\u0012T,#}\fi]`<~]˕\u0003@(Mz\u0006\u000b_x\" B75=9V^|rl7{'u\u0012֨\u000b.\u0013\u001bdz\u0003 })L.\u000e+:H\u0382\u0018`IP\u001fP\u001c\u000b{\u001ac\\9K?\u0014\u0019\"It\"\u001eM \u0005m\u0011.`\n\u0002%NAinKAʢ(62h\u00168\u0014iw5(z.t\u0016\u0013ł6L{=\\=b)tXN6nw1385\u0017\u000faQ/5\b܍oܑX3k4\u0007\b+>k|]6~%Yz\u000b9qμZ܁\u000fIeEO9D<\u0018G{&\b\ffQ3!\u0019ȸ\u001dʦU!gx6\u0019\u0019\u0011tPj5 ijP(e\r8M,JJ'\u000bG\u000f)s9ΪNϸ{GK\u001c\u0007WRj\u0017\u000e\u0003(T\u001eE\b;oK\r;.5Bo[YC0\"6&2xO`\u000e\u000e=ō_Ό>\u001ay\u0018hH\u0017Z!2\u0012wbt!Rd\b\rС\u0004ג\u0006\u0017f[qA/\u000bwIzRZK\u0017D@gC̡pό\u000f\u0013n3\\F|z`\u001f\u000fw[1+Z`\t\u001f#p|\u001fR,\u001b6!F\b\u0011?>!\u001alGթQܣ\u0011;7m04?\u0004b \u0004u\bx\u001c,Z|#\u0011'mL<!^\u0003A\u0006\u001a\u0015n~˷vצ-$\u0005\u0001N6\u001fkDHxyr2O\u001b%5\u001b\"1-\u0012#a&O\u000e\tCY;\tЫ{Ĭz'\u000b<hR\u000e\tR\u000bxcu/EHZ\u001d(\by&sF\u0011\t\u001cmF' .'\r?K\u0011<^B3Ӓ(ՀUII\u001b\u0017e#\u001e\u0016q\r\u0003CmiU+\u0011\u000fd!\u000fEb?\u000b\u000b\u001aE];/=uQ[%?{˧qͺ+\"\ngPi[Of\u0011g\u001bW8] \u007f@Nl*!*\u0012\u0014\u0001s&S\"`*\u000eLvZ2[Zڗ6߂rZ+Iri\u0002{<k\u001ejr^y6Gm\"\rd@0\"z|ƞQf"}, d2 = {"\u001ab^:\")KO.~Df(\u0006\u00051e\r6E\u001d\u000e\u0013,GQ\u000eFw%>W}\b3v\u00120MP\u0011", "", "\u001ab^:\")KO.~Df(\u0006\u00051e\r6E$]$\u0013\\oo<\u0001&5b{ \u001ew\u0014*\\GEt$)\u0014dp9mg:]v0GY$", "", "7mXA\\(EW.~\\^6}\t8c\u007f6", "u(E", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1n]AX?M", "", "7r62b->\\\u0017~\t>5x\u00066e~\t\tJ\tv Xs\u001bF\u007f-5b\r", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ1", "@dA2Z0Lb\u0019\f\\^6}\t8c\u007f6", "Adc\"c\u000e>]\u001a~\u0004\\,\u000b", "uY\u0018#", "\u001a`]1e6BRbz\u0006iug\t8d\u00041}$\n&\u0017P~c", "5d^3X5<S\u0006~\u0007n,\u000b\u0018\u0013n\u000f(\u0005O", "BdP?76P\\z~\u0005_,\u0006\u0007/s", "uKP;W9HW\u0018Hvi7Fs/n~,\u0005Bd &Gx\u001d\u0012:\u0016", "", "5d^3X5<S|}", "\u001ab^:\")KO.~D^5\r\u0011=/a(\u0006A\u0001 \u0015G^\u001b8\u007f39h\u0002*@\\*9M\u0019", "5d^3X5<S\b\fvg:\u0001\u00183o\t\u0017\u0010K\u0001", "/mP9l;BQ'^\u0004Z)\u0004\t.F\n5]@\u000b\u0018\u0017Pm\u000e u", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`D|\nQvn5b\u000e(E7w.WD;t2\u001e\u0004u]B\u0015g;R\u000106`Y,2\u0016g", "\u001ab^:\")KO.~Df6{\t6sI\u0005\t<\u0016\u0017xGy\u000f<\u007f#5/", "5dc\u000fe(SSz~\u0005_,\u0006\u0007/F\n5]@\u000b\u0018\u0017Pm\u000e u", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011l\u001b8\f%~a\b\u001f7t$w*P7\u00014\u007f\u0015rb9\u0010a,$", "BqP;f0MW#\bir7|", ">nbA:,HT\u0019\bx^\u0019|\u00149r\u000f", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`D|\nQvn5b\u000e(E7w.WD;t2\u001e\u0004u]B\u0015g;R\u000106`Y,2\u0016c", "\u001ab^:\")KO.~Df6{\t6sI\fXM|,\u0017.y\f8\u0006)?bS", ":nR.g0H\\", "@d`BX:M5\u0019\t{^5z\t\u001ce\u00015{N\u0004", "uKR<`u;`\u0015\u0014z(4\u0007\b/l\u000eq_\u001d\u000e\u0013,GV\u0018:r49c\u0007uz^", "7f]<e,+O(~ab4\u0001\u0018", "\u001aa^{T7I\u001d\u001a{E4", "AdaCX9\u001c]\"\u007f~`", "1n]3\\.N`\u0019_\bh4j\t<v\u007f5YJ\n\u0018\u001bI", "uKQ<\"(I^b\u007fw)\u0002@y", "", "5d^3X5<S\u007f\u0003\tm", "@dV6f;>`z~\u0005_,\u0006\u0007/s", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "Cma2Z0Lb\u0019\f\\^6}\t8c\u007f6", "=m;<V(MW#\bg^8\r\t=t]2\u0004K\b\u0017&G", "@d`BX:MA\u001d\b|e,c\u0013-a\u000f,\u0006Ip\"\u0016C~\u000e\u001d\u0004/=;\b*9t\u0016\u0019T?O", "@dV6f;>`z~\u0005_,\u0006\u0007/sq,\u000bCb!!Iv\u000e'}!I", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f$\u0005?\u000e!\u001bF9\nG\u0002n Y\u0007\u001f;v\u0018\u0012VR;tCsXY", "\u001aa^{T7I\u001d\u001cIE4", "0qPGX\u0014:\\\u0015\u0001zk", "\u001aa^{T7I\u001d\u001cIE4", "5dc\u000fe(SS\u0001z\u0004Z.|\u0016", "u(;/bu:^$H})vR", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;o&;IR?u=\t\"rr=\u0006c9$", "1n]3\\.N`\u0015\u000e~h5g\u00169v\u0004'{M", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;o&;IR?u=\t\"rr=\u0006c9$", "\u001aa^{T7I\u001d*{E4", "AdaCX9\u001c]\"\u007f~`\u001a\f\u0013<a\u0002(fM\u000b(\u001bFo\u001b", "\u001aa^{T7I\u001d*{E4", "\u001aa^{T7I\u001d%zP", "0qPGX\u000e>]\u001a~\u0004\\,X\u00143", "\u001aa^{T7I\u001d%zP", "5dc\u000fe(SSz~\u0005_,\u0006\u0007/A\u000b,", "u(;/bu:^$H\u0007Z\u0002", "5dc\u000fe(SSz~\u0005_,\u0006\u0007/A\u000b,:<\n !Vk\u001d@\u0001.C", "\u001aa^{T7I\u001d'}P", "0qPGX\u0013HQ\u0015\u000e~h5X\u00143", "\u001aa^{T7I\u001d'}P", "5dc\u000fe(SS\u007f\txZ;\u0001\u00138A\u000b,", "u(;/bu:^$H\t]\u0002", "5dc\u000fe(SS\u007f\txZ;\u0001\u00138A\u000b,:<\n !Vk\u001d@\u0001.C", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "/o_9\\*:b\u001d\t\u0004<6\u0006\u0018/x\u000f", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006c%5b\r-3v%\u0015WAAA", "5d^3X5<S\u007f\u0003\tm\u0013\u0007\u00075", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006c%5b\r-3v%\u0015WAAA", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "5d^3X5<S\u0007\u000e\u0005k(~\t\u001dh{5{?k$\u0017Ho\u001b<\u007f#5g", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "5dc\u0014X6?S\"|zL;\u0007\u0016+g\u007f\u0016~<\u000e\u0017\u00162|\u000e=v25b{ E", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqiC|$\u0017FZ\u001b<w%BY\u0007\u001e7{k", "5dc\u0014X6?S\"|zL;\u0007\u0016+g\u007f\u0016~<\u000e\u0017\u00162|\u000e=v25b{ E,\u00127VMJgC\"\u001fqo", "", "0qPGX\u000e>]\u001a~\u0004\\,\u000b", "\u001aiPCTuNb\u001d\u0006DE0\u000b\u0018\u0005", "5dc\u000fe(SSz~\u0005_,\u0006\u0007/s", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u000fe(SSz~\u0005_,\u0006\u0007/s>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5d^3X5<S\b\fvg:\u0001\u00183o\t\u0013{I\u007f\u001b IS\u0017Kv.D", "\u001a`]1e6BRbz\u0006iug\t8d\u00041}$\n&\u0017P~c", "5dc\u0014X6?S\"|zM9x\u0012=i\u000f,\u0006Ik\u0017 Fs\u0017>Z.DY\u0007/", "u(;.a+K]\u001d}DZ7\bR\u001ae\t'\u007fI\u0003z Vo\u0017KL", "5dc\u0014X6?S\"|zM9x\u0012=i\u000f,\u0006Ik\u0017 Fs\u0017>Z.DY\u0007/ui\u001f7WR7z8(\u001ev", "\u001aa^{T7I\u001d&|P", "0qPGX\u000e>]\u001a~\u0004\\,i\t\u000fl\u0004*\u007f=\u0005\u001e\u001bV\u0004u8\u007f!7Y\u000b", "\u001aa^{T7I\u001d&|P", "5dc\u000fe(SSz~\u0005_,\u0006\u0007/R\u007f\b\u0003D\u0003\u001b\u0014Kv\u0012K\u000b\r1by\"7z", "u(;/bu:^$H\b\\\u0002", "Adc\u000fe(SSz~\u0005_,\u0006\u0007/R\u007f\b\u0003D\u0003\u001b\u0014Kv\u0012K\u000b\r1by\"7z", "uKQ<\"(I^b\fx4om", "5dc\u000fe(SSz~\u0005_,\u0006\u0007/R\u007f\b\u0003D\u0003\u001b\u0014Kv\u0012K\u000b\r1by\"7zT*VLEz0-\u0019rjG", "5d^3X5<S\u0006~\u0007n,\u000b\u0018\u0016o}$\u000bD\u000b ", "\u001ab^:\")KO.~Df6{\t6sI\fXM|,\u0017.y\f8\u0006)?bS", "5dc\u0014X6?S\"|zK,\t\u0019/s\u000f\u000f\u0006>|&\u001bQx", "u(;0b4\bP&z\u0010^u\u0005\u0013.e\u00076E$]$\u0013\\otFt!D]\b)\r", "Adc\u0014X6?S\"|zK,\t\u0019/s\u000f\u000f\u0006>|&\u001bQx", "5dc\u0014X6?S\"|zK,\t\u0019/s\u000f\u000f\u0006>|&\u001bQxL8\u007f.?hy/;w\u001f<", "7r62b->\\\u0017~\t>5x\u00066e~", "(", "u(I", "Adc\u0014X6?S\"|zl\f\u0006\u0005,l\u007f'", "7r62b->\\\u0017~\t>5x\u00066e~fwI\n!&C~\u0012F\u007f3", "", ";`g\u001bh4-]\u0006~|b:\f\t<", "\u0017", "5dc\u001aT?'c!m\u0005K,~\r=t\u007f5", "u(8", "Adc\u001aT?'c!m\u0005K,~\r=t\u007f5", "uH\u0018#", "5dc\u001aT?'c!m\u0005K,~\r=t\u007f5:<\n !Vk\u001d@\u0001.C", "/oX\u0018X@", "\u001aa^{T7I\u001d*IE4", "7mc2e5:Z|^\f^5\fp/s\u000e(\u0005B\u0001$", "\nh]6g\u0005", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{ek\u0003\u0003n7\u0018yq\u0012\"5*fZ<:!\u000eo\u000e\u0018)\u0017\u000eZE&~Q3.\f6RK\u0018u|!\u0016k?sqFX Tu$yK2SScp}FAR8\u0011a\u0016)\u0019gE\u00045\u0011<n\u0002eZw\u0006\u0007^Z\u0004\u001dD=+8", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public final class BrazeGeofenceManager implements IBrazeGeofenceLocationUpdateListener {
    public static final Companion Companion = new Companion(null);
    private static final String GEOFENCE_STORAGE_SHARED_PREFS_LOCATION = "com.appboy.managers.geofences.storage";
    private final Context applicationContext;
    private final qa brazeGeofenceApi;
    private rc brazeGeofenceReEligibilityManager;
    private final List<BrazeGeofence> brazeGeofences;
    private final sd brazeLocationApi;
    private final h00 brazeManager;
    private final BrazeConfigurationProvider configurationProvider;
    private final ReentrantLock geofenceListLock;
    private IBrazeLocation geofenceRequestLocation;
    private final SharedPreferences geofenceStorageSharedPreferences;
    private final PendingIntent geofenceTransitionPendingIntent;
    private boolean isGeofencesEnabled;
    private int maxNumToRegister;
    private final vb0 serverConfigStorageProvider;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLc\u0003\u0010I\u00066\f6B\u0015\"4ߚ\u007f\u0007tsA0JeP.hS2\u000fq|<$i*yCAU\"}8\tWȞog|hb\u000bY\u000f\u000e\u0016~o2շV\u000fزB\u000f`A0F9MڱA;f\rD\u001ehG0:\u0012\u0005/\u001aZL\u001ew\u0013Cy\fX5Ϯt<X\u000f[\bb'\u0014E8\u0001Lb\u0018RDM\u0005]h3i\bݦFP-f>\u0005\u0016\"T_?\r%gN/NAM\u0015S\\I\fқ_A\tJ\u007fIM}55CI\"df\\\u000e\u001e-+}\u0016$w͉`\u0007Wn\u001a6sjq_h\u00148y\u000b{;O2 6+V?E\u001a\u0015\u0018T8ϢvUFd\u0010s\u0013\u0012\twN\u0017S\u007fi+\u0010Ә9Ђe?!P=\u0012\u0013$̽'\u001b"}, d2 = {"\u001ab^:\")KO.~Df(\u0006\u00051e\r6E\u001d\u000e\u0013,GQ\u000eFw%>W}\b3v\u00120MPyI>& dj=\u0011l\u0002", "", "", "/oX\u0018X@", "5dc\u0014X6?S\"|zL/x\u0016/dj5{A\u0001$\u0017Pm\u000eJ_!=Y", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;o&;IR?u=\t\"rr=\u0006c9$", "1n]3\\.N`\u0015\u000e~h5g\u00169v\u0004'{M", "", "5dc\u0014X6?S\"|zl\f\u0006\u0005,l\u007f'\\M\u000b\u001ftQx\u000f@x5BU\r$Av", "uKR<`u;`\u0015\u0014z(*\u0007\u00120i\u00028\t<\u0010\u001b!P9jIr:57\b)8q\u0018>Z?Jo>'\u007fukJ\u000bb,[Lj<", "\u001aa^{T7I\u001d*{E4", "AdaCX9\u001c]\"\u007f~`\u001a\f\u0013<a\u0002(fM\u000b(\u001bFo\u001b", "5dc\u0014X6?S\"|zl\f\u0006\u0005,l\u007f'\\M\u000b\u001f\u0005G|\u001f<\u0004\u0003?b~$9", "uKQ<\"(I^b\u0010w)\u0002@}", "", "5dc\u001aT?'c!m\u0005K,~\r=t\u007f5", "uKQ<\"(I^b\u0010w)\u0002@l", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "AgP?X+)`\u0019\u007fzk,\u0006\u0007/s", "", "\u001ab^:\")KO.~Df6{\t6sI\u0005\t<\u0016\u0017xGy\u000f<\u007f#5/", "@dc?\\,OSu\fvs,^\t9f\u007f1y@\u000fw$QwtFt!<G\r*Di\u0018.", "uKP;W9HW\u0018Hxh5\f\t8tI\u0016~<\u000e\u0017\u00162|\u000e=v25b{ ECY\u0015R?Lg}.$lh\u0003mg:]L", "\u0015D>\u00138\u0015\u001c3\u0013liH\u0019Xj\u000f_m\u000bW-`u\u00112\\m\u001dd\u001f\u001cC[{&Q\u007f\u0017", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "\nh]6g\u0005", "u(E", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final String getGeofenceSharedPreferencesName(String apiKey) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            return "com.appboy.managers.geofences.storage." + apiKey;
        }

        @JvmStatic
        public final boolean getGeofencesEnabledFromConfiguration(BrazeConfigurationProvider configurationProvider) {
            Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
            return configurationProvider.isGeofencesEnabled();
        }

        @JvmStatic
        public final boolean getGeofencesEnabledFromServerConfig(vb0 serverConfigStorageProvider) {
            Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
            if (!serverConfigStorageProvider.B()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) c.f2669a, 6, (Object) null);
                return false;
            }
            if (serverConfigStorageProvider.A()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) a.f2667a, 6, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) b.f2668a, 6, (Object) null);
            return false;
        }

        @JvmStatic
        public final int getMaxNumToRegister(vb0 serverConfigStorageProvider) {
            Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
            if (serverConfigStorageProvider.k() > 0) {
                return serverConfigStorageProvider.k();
            }
            return 20;
        }

        @JvmStatic
        public final List<BrazeGeofence> retrieveBrazeGeofencesFromLocalStorage(SharedPreferences sharedPreferences) {
            Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
            ArrayList arrayList = new ArrayList();
            Map<String, ?> all = sharedPreferences.getAll();
            if (all == null || all.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) d.f2670a, 7, (Object) null);
                return arrayList;
            }
            Set<String> setKeySet = all.keySet();
            if (setKeySet.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) e.f2671a, 6, (Object) null);
                return arrayList;
            }
            for (String str : setKeySet) {
                String string = sharedPreferences.getString(str, null);
                if (string != null) {
                    try {
                    } catch (JSONException e2) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new g(string), 4, (Object) null);
                    } catch (Exception e3) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new h(string), 4, (Object) null);
                    }
                    if (!StringsKt.isBlank(string)) {
                        arrayList.add(new BrazeGeofence(new JSONObject(string)));
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new f(str), 6, (Object) null);
            }
            return arrayList;
        }
    }

    public BrazeGeofenceManager(Context context, String str, h00 h00Var, BrazeConfigurationProvider brazeConfigurationProvider, vb0 vb0Var, v00 v00Var) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 9474);
        short sXd2 = (short) (C1607wl.Xd() ^ 7401);
        int[] iArr = new int["*O~l\u000e\u001c<".length()];
        QB qb = new QB("*O~l\u000e\u001c<");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(str, ZO.xd("[p\u0001sAx", (short) (OY.Xd() ^ 25546), (short) (OY.Xd() ^ 16292)));
        Intrinsics.checkNotNullParameter(h00Var, C1626yg.Ud(")`+\u0019\u0005K\u0001*t\u0011ej", (short) (C1499aX.Xd() ^ (-19478)), (short) (C1499aX.Xd() ^ (-29261))));
        short sXd3 = (short) (C1580rY.Xd() ^ (-14941));
        int[] iArr2 = new int["\u0003`k\t\u000b,\u001c\u0017+\u007ft\u001bK!MiL3s*|".length()];
        QB qb2 = new QB("\u0003`k\t\u000b,\u001c\u0017+\u007ft\u001bK!MiL3s*|");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
            i3++;
        }
        Intrinsics.checkNotNullParameter(brazeConfigurationProvider, new String(iArr2, 0, i3));
        short sXd4 = (short) (Od.Xd() ^ (-5508));
        int[] iArr3 = new int["%_@'o9(~8\u000f\u0012o\n7Hk\u001f\ta6\u0013Z\u0002z\u007f\u0017H".length()];
        QB qb3 = new QB("%_@'o9(~8\u000f\u0012o\n7Hk\u001f\ta6\u0013Z\u0002z\u007f\u0017H");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + i4)) + xuXd3.CK(iKK3));
            i4++;
        }
        Intrinsics.checkNotNullParameter(vb0Var, new String(iArr3, 0, i4));
        Intrinsics.checkNotNullParameter(v00Var, C1561oA.Qd("w{\u0001p|wisOJzhpuMdqpaia^j", (short) (C1580rY.Xd() ^ (-7330))));
        this.brazeManager = h00Var;
        this.configurationProvider = brazeConfigurationProvider;
        this.serverConfigStorageProvider = vb0Var;
        qa qaVar = new qa();
        this.brazeGeofenceApi = qaVar;
        this.brazeLocationApi = new sd(context, zd.f2383c.a(brazeConfigurationProvider), brazeConfigurationProvider);
        short sXd5 = (short) (C1499aX.Xd() ^ (-13949));
        short sXd6 = (short) (C1499aX.Xd() ^ (-17040));
        int[] iArr4 = new int["\\japnie0fsszlv}8N{{\u0003t\t\u0006".length()];
        QB qb4 = new QB("\\japnie0fsszlv}8N{{\u0003t\t\u0006");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd5 + i5)) - sXd6);
            i5++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr4, 0, i5)).getMethod(C1561oA.od("-*8\u000421,(!\u001e0$)'z&$)\u0019+&", (short) (OY.Xd() ^ 23453)), new Class[0]);
        try {
            method.setAccessible(true);
            this.applicationContext = (Context) method.invoke(context, objArr);
            this.geofenceListLock = new ReentrantLock();
            Companion companion = Companion;
            boolean z2 = false;
            Object[] objArr2 = {companion.getGeofenceSharedPreferencesName(str), 0};
            Method method2 = Class.forName(C1561oA.Kd("s\u0002x\b\u0006\u0001|G}\u000b\u000b\u0012\u0004\u000e\u0015Oe\u0013\u0013\u001a\f \u001d", (short) (C1499aX.Xd() ^ (-28524)))).getMethod(C1561oA.Xd("HGW7MGYMM:]QSSaU_UXg", (short) (Od.Xd() ^ (-26095))), Class.forName(Wg.Zd("\u0005;0zB_\u0014\u001an\u0011\u001c\u0019rFG\u001f", (short) (Od.Xd() ^ (-12953)), (short) (Od.Xd() ^ (-8680)))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                SharedPreferences sharedPreferences = (SharedPreferences) method2.invoke(context, objArr2);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, Wg.vd("ivryo\u0004|7edpPjdrfzg\u0007z\u0001\u0001\u000b~\uf5f9~z\u0002w\f\u0005?svhj\n{zrt`pb,C@AV`", (short) (C1580rY.Xd() ^ (-13868))));
                this.geofenceStorageSharedPreferences = sharedPreferences;
                this.brazeGeofences = CollectionsKt.toMutableList((Collection) companion.retrieveBrazeGeofencesFromLocalStorage(sharedPreferences));
                this.geofenceTransitionPendingIntent = qaVar.a(context);
                this.brazeGeofenceReEligibilityManager = new rc(context, str, vb0Var, v00Var);
                if (companion.getGeofencesEnabledFromServerConfig(vb0Var) && isGeofencesEnabledFromEnvironment(context) && qaVar.a()) {
                    z2 = true;
                }
                this.isGeofencesEnabled = z2;
                this.maxNumToRegister = companion.getMaxNumToRegister(vb0Var);
                if (!qaVar.a()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) ra.f1661a, 6, (Object) null);
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) sa.f1754a, 6, (Object) null);
                setUpGeofences(true);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static /* synthetic */ void getBrazeGeofenceApi$annotations() {
    }

    public static /* synthetic */ void getBrazeGeofenceReEligibilityManager$annotations() {
    }

    public static /* synthetic */ void getBrazeGeofences$annotations() {
    }

    public static /* synthetic */ void getBrazeLocationApi$annotations() {
    }

    public static /* synthetic */ void getGeofenceRequestLocation$annotations() {
    }

    @JvmStatic
    public static final String getGeofenceSharedPreferencesName(String str) {
        return Companion.getGeofenceSharedPreferencesName(str);
    }

    public static /* synthetic */ void getGeofenceStorageSharedPreferences$annotations() {
    }

    public static /* synthetic */ void getGeofenceTransitionPendingIntent$annotations() {
    }

    @JvmStatic
    public static final boolean getGeofencesEnabledFromConfiguration(BrazeConfigurationProvider brazeConfigurationProvider) {
        return Companion.getGeofencesEnabledFromConfiguration(brazeConfigurationProvider);
    }

    @JvmStatic
    public static final boolean getGeofencesEnabledFromServerConfig(vb0 vb0Var) {
        return Companion.getGeofencesEnabledFromServerConfig(vb0Var);
    }

    @JvmStatic
    public static final int getMaxNumToRegister(vb0 vb0Var) {
        return Companion.getMaxNumToRegister(vb0Var);
    }

    public static /* synthetic */ void getMaxNumToRegister$annotations() {
    }

    public static /* synthetic */ void isGeofencesEnabled$annotations() {
    }

    @JvmStatic
    public static final List<BrazeGeofence> retrieveBrazeGeofencesFromLocalStorage(SharedPreferences sharedPreferences) {
        return Companion.retrieveBrazeGeofencesFromLocalStorage(sharedPreferences);
    }

    public final boolean analyticsEnabledForGeofenceId(String geofenceId, GeofenceTransitionType geofenceTransitionType) {
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        Intrinsics.checkNotNullParameter(geofenceTransitionType, "geofenceTransitionType");
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeGeofence brazeGeofenceForGeofenceId = getBrazeGeofenceForGeofenceId(geofenceId);
            if (brazeGeofenceForGeofenceId != null) {
                if (geofenceTransitionType == GeofenceTransitionType.ENTER) {
                    return brazeGeofenceForGeofenceId.getAnalyticsEnabledEnter();
                }
                if (geofenceTransitionType == GeofenceTransitionType.EXIT) {
                    return brazeGeofenceForGeofenceId.getAnalyticsEnabledExit();
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void configureFromServerConfig(bo.app.fb0 r14) {
        /*
            r13 = this;
            java.lang.String r0 = "serverConfig"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            boolean r1 = r14.f641i
            com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.INSTANCE
            bo.app.ta r10 = new bo.app.ta
            r10.<init>(r1)
            r11 = 7
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r6 = r13
            com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11, r12)
            r3 = 1
            r4 = 0
            if (r1 == 0) goto Lb4
            android.content.Context r2 = r13.applicationContext
            java.lang.String r1 = "applicationContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            boolean r1 = r13.isGeofencesEnabledFromEnvironment(r2)
            if (r1 == 0) goto Lb4
            bo.app.qa r1 = r13.brazeGeofenceApi
            boolean r1 = r1.a()
            if (r1 == 0) goto Lb4
            r2 = r3
        L32:
            boolean r1 = r13.isGeofencesEnabled
            if (r2 == r1) goto La5
            r13.isGeofencesEnabled = r2
            com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.I
            bo.app.ua r10 = new bo.app.ua
            r10.<init>(r13)
            r11 = 6
            r12 = 0
            r8 = 0
            r9 = 0
            r6 = r13
            com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r1 = r13.isGeofencesEnabled
            if (r1 == 0) goto L9f
            r13.setUpGeofences(r4)
            com.braze.configuration.BrazeConfigurationProvider r1 = r13.configurationProvider
            boolean r1 = r1.isAutomaticGeofenceRequestsEnabled()
            if (r1 == 0) goto L59
            r13.requestGeofenceRefresh(r3)
        L59:
            int r1 = r14.f639g
            if (r1 < 0) goto L6e
            r13.maxNumToRegister = r1
            com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.I
            bo.app.wa r10 = new bo.app.wa
            r10.<init>(r13)
            r11 = 6
            r12 = 0
            r8 = 0
            r9 = 0
            r6 = r13
            com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11, r12)
        L6e:
            bo.app.rc r6 = r13.brazeGeofenceReEligibilityManager
            r6.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            int r0 = r14.f637e
            if (r0 < 0) goto L8a
            r6.f1672g = r0
            com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.I
            bo.app.ac r10 = new bo.app.ac
            r10.<init>(r0)
            r11 = 6
            r12 = 0
            r8 = 0
            r9 = 0
            com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11, r12)
        L8a:
            int r0 = r14.f638f
            if (r0 < 0) goto L9e
            r6.f1673h = r0
            com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.I
            bo.app.bc r10 = new bo.app.bc
            r10.<init>(r0)
            r11 = 6
            r12 = 0
            r8 = 0
            r9 = 0
            com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11, r12)
        L9e:
            return
        L9f:
            android.app.PendingIntent r1 = r13.geofenceTransitionPendingIntent
            r13.tearDownGeofences(r1)
            goto L59
        La5:
            bo.app.va r10 = new bo.app.va
            r10.<init>(r2)
            r11 = 7
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r6 = r13
            com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L59
        Lb4:
            r2 = r4
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.BrazeGeofenceManager.configureFromServerConfig(bo.app.fb0):void");
    }

    public final qa getBrazeGeofenceApi() {
        return this.brazeGeofenceApi;
    }

    public final BrazeGeofence getBrazeGeofenceForGeofenceId(String geofenceId) {
        Object next;
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.brazeGeofences.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((BrazeGeofence) next).getId(), geofenceId)) {
                    break;
                }
            }
            return (BrazeGeofence) next;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final rc getBrazeGeofenceReEligibilityManager() {
        return this.brazeGeofenceReEligibilityManager;
    }

    public final List<BrazeGeofence> getBrazeGeofences() {
        return this.brazeGeofences;
    }

    public final sd getBrazeLocationApi() {
        return this.brazeLocationApi;
    }

    public final h00 getBrazeManager() {
        return this.brazeManager;
    }

    public final IBrazeLocation getGeofenceRequestLocation() {
        return this.geofenceRequestLocation;
    }

    public final SharedPreferences getGeofenceStorageSharedPreferences() {
        return this.geofenceStorageSharedPreferences;
    }

    public final PendingIntent getGeofenceTransitionPendingIntent() {
        return this.geofenceTransitionPendingIntent;
    }

    public final int getMaxNumToRegister() {
        return this.maxNumToRegister;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void initializeGeofences() {
        /*
            r11 = this;
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.INSTANCE
            bo.app.xa r8 = bo.app.xa.f2197a
            r9 = 7
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r4 = r11
            com.braze.support.BrazeLogger.brazelog$default(r3, r4, r5, r6, r7, r8, r9, r10)
            com.braze.managers.BrazeGeofenceManager$Companion r1 = com.braze.managers.BrazeGeofenceManager.Companion
            bo.app.vb0 r0 = r11.serverConfigStorageProvider
            boolean r0 = r1.getGeofencesEnabledFromServerConfig(r0)
            r2 = 1
            if (r0 == 0) goto L48
            android.content.Context r1 = r11.applicationContext
            java.lang.String r0 = "applicationContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            boolean r0 = r11.isGeofencesEnabledFromEnvironment(r1)
            if (r0 == 0) goto L48
            bo.app.qa r0 = r11.brazeGeofenceApi
            boolean r0 = r0.a()
            if (r0 == 0) goto L48
            r0 = r2
        L2e:
            r11.isGeofencesEnabled = r0
            com.braze.configuration.BrazeConfigurationProvider r0 = r11.configurationProvider
            boolean r0 = r0.isAutomaticGeofenceRequestsEnabled()
            if (r0 == 0) goto L3c
            r11.requestGeofenceRefresh(r2)
        L3b:
            return
        L3c:
            bo.app.ya r8 = bo.app.ya.f2292a
            r9 = 7
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r4 = r11
            com.braze.support.BrazeLogger.brazelog$default(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L3b
        L48:
            r0 = 0
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.BrazeGeofenceManager.initializeGeofences():void");
    }

    public final boolean isGeofencesEnabled() {
        return this.isGeofencesEnabled;
    }

    public final boolean isGeofencesEnabledFromEnvironment(Context context) {
        int iIsGooglePlayServicesAvailable;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!Companion.getGeofencesEnabledFromConfiguration(this.configurationProvider)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) za.f2372a, 7, (Object) null);
            return false;
        }
        if (!PermissionUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) ab.f188a, 6, (Object) null);
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && !PermissionUtils.hasPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) bb.f266a, 6, (Object) null);
            return false;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Class.forName("com.google.android.gms.common.GoogleApiAvailability");
            iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) com.braze.support.h.f2706a, BrazeLogger.Priority.I, (Throwable) e2, false, (Function0) vz.f2084a, 4, (Object) null);
        }
        if (iIsGooglePlayServicesAvailable != 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) com.braze.support.h.f2706a, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xz(iIsGooglePlayServicesAvailable), 7, (Object) null);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) cb.f330a, 7, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) com.braze.support.h.f2706a, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) wz.f2171a, 7, (Object) null);
        if (!this.brazeGeofenceApi.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) db.f475a, 7, (Object) null);
            return false;
        }
        try {
            Class.forName("com.google.android.gms.location.LocationServices", false, BrazeGeofenceManager.class.getClassLoader());
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) fb.f632a, 7, (Object) null);
            return true;
        } catch (Exception unused) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) eb.f560a, 7, (Object) null);
            return false;
        }
    }

    @Override // com.braze.managers.IBrazeGeofenceLocationUpdateListener
    public void onLocationRequestComplete(IBrazeLocation iBrazeLocation) {
        if (iBrazeLocation == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) hb.f817a, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new gb(iBrazeLocation), 7, (Object) null);
        requestGeofenceRefresh(iBrazeLocation);
        this.brazeGeofenceReEligibilityManager.a(DateTimeUtils.nowInSeconds());
    }

    public void postGeofenceReport(String id, GeofenceTransitionType transitionType) {
        Unit unit;
        Intrinsics.checkNotNullParameter(id, "geofenceId");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) ib.f893a, 6, (Object) null);
            return;
        }
        z9 z9Var = ba.f257g;
        String string = transitionType.toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String eventType = string.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(eventType, "this as java.lang.String).toLowerCase(locale)");
        z9Var.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        e00 geofenceEvent = z9Var.a(new d9(id, eventType));
        if (geofenceEvent != null) {
            if (analyticsEnabledForGeofenceId(id, transitionType)) {
                ((tf) this.brazeManager).a(geofenceEvent);
            }
            BrazeGeofence brazeGeofenceForGeofenceId = getBrazeGeofenceForGeofenceId(id);
            if (brazeGeofenceForGeofenceId != null && this.brazeGeofenceReEligibilityManager.a(DateTimeUtils.nowInSeconds(), brazeGeofenceForGeofenceId, transitionType)) {
                tf tfVar = (tf) this.brazeManager;
                tfVar.getClass();
                Intrinsics.checkNotNullParameter(geofenceEvent, "geofenceEvent");
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) tfVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) kf.f1106a, 7, (Object) null);
                tfVar.a(new tz(tfVar.f1843f, tfVar.f1842e.getBaseUrlForRequests(), geofenceEvent));
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new jb(id, transitionType), 6, (Object) null);
        }
    }

    public void registerGeofences(List<BrazeGeofence> geofenceList) {
        BrazeGeofenceManager brazeGeofenceManager = this;
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        List<BrazeGeofence> brazeGeofenceList = CollectionsKt.toMutableList((Collection) geofenceList);
        if (!brazeGeofenceManager.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) kb.f1096a, 6, (Object) null);
            return;
        }
        if (brazeGeofenceManager.geofenceRequestLocation != null) {
            for (BrazeGeofence brazeGeofence : brazeGeofenceList) {
                IBrazeLocation iBrazeLocation = brazeGeofenceManager.geofenceRequestLocation;
                if (iBrazeLocation != null) {
                    double latitude = iBrazeLocation.getLatitude();
                    double longitude = iBrazeLocation.getLongitude();
                    double latitude2 = brazeGeofence.getLatitude();
                    double longitude2 = brazeGeofence.getLongitude();
                    double radians = Math.toRadians(latitude2 - latitude);
                    double radians2 = Math.toRadians(longitude2 - longitude);
                    double d2 = 2;
                    brazeGeofence.setDistanceFromGeofenceRefresh(Math.asin(Math.sqrt((Math.cos(Math.toRadians(latitude2)) * Math.cos(Math.toRadians(latitude)) * Math.pow(Math.sin(radians2 / d2), 2.0d)) + Math.pow(Math.sin(radians / d2), 2.0d))) * 1.2742E7d);
                }
                brazeGeofenceManager = this;
            }
            CollectionsKt.sort(brazeGeofenceList);
        }
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lb(brazeGeofenceList), 7, (Object) null);
            SharedPreferences.Editor editorEdit = this.geofenceStorageSharedPreferences.edit();
            editorEdit.clear();
            this.brazeGeofences.clear();
            Iterator it = brazeGeofenceList.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BrazeGeofence brazeGeofence2 = (BrazeGeofence) it.next();
                if (i2 == this.maxNumToRegister) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mb(this), 7, (Object) null);
                    break;
                }
                this.brazeGeofences.add(brazeGeofence2);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new nb(brazeGeofence2), 7, (Object) null);
                editorEdit.putString(brazeGeofence2.getId(), brazeGeofence2.forJsonPut().toString());
                i2++;
            }
            editorEdit.apply();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ob(this), 7, (Object) null);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            rc rcVar = this.brazeGeofenceReEligibilityManager;
            rcVar.getClass();
            Intrinsics.checkNotNullParameter(brazeGeofenceList, "brazeGeofenceList");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = brazeGeofenceList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(((BrazeGeofence) it2.next()).getId());
            }
            HashSet<String> hashSet = new HashSet(rcVar.f1668c.keySet());
            SharedPreferences.Editor editorEdit2 = rcVar.f1667b.edit();
            for (String reEligibilityId : hashSet) {
                Intrinsics.checkNotNullExpressionValue(reEligibilityId, "reEligibilityId");
                if (linkedHashSet.contains(rcVar.a(reEligibilityId))) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) rcVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new pc(reEligibilityId), 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) rcVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new oc(reEligibilityId), 7, (Object) null);
                    rcVar.f1668c.remove(reEligibilityId);
                    editorEdit2.remove(reEligibilityId);
                }
            }
            editorEdit2.apply();
            setUpGeofences(true);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void registerGeofencesWithGooglePlay(List<BrazeGeofence> geofenceList, PendingIntent geofenceRequestIntent) {
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        Intrinsics.checkNotNullParameter(geofenceRequestIntent, "geofenceRequestIntent");
        qa qaVar = this.brazeGeofenceApi;
        Context context = this.applicationContext;
        Intrinsics.checkNotNullExpressionValue(context, "applicationContext");
        qaVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        Intrinsics.checkNotNullParameter(geofenceRequestIntent, "geofenceRequestIntent");
        IBrazeGeofenceApi iBrazeGeofenceApi = qaVar.f1588a;
        if (iBrazeGeofenceApi != null) {
            iBrazeGeofenceApi.registerGeofences(context, geofenceList, geofenceRequestIntent);
        }
    }

    public void requestGeofenceRefresh(IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) pb.f1502a, 7, (Object) null);
            return;
        }
        this.geofenceRequestLocation = location;
        if (location != null) {
            tf tfVar = (tf) this.brazeManager;
            tfVar.getClass();
            Intrinsics.checkNotNullParameter(location, "location");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) tfVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) of.f1441a, 7, (Object) null);
            tfVar.a(new rz(tfVar.f1843f, tfVar.f1842e.getBaseUrlForRequests(), location));
        }
    }

    public void requestGeofenceRefresh(boolean z2) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) qb.f1592a, 7, (Object) null);
            return;
        }
        rc rcVar = this.brazeGeofenceReEligibilityManager;
        long jNowInSeconds = DateTimeUtils.nowInSeconds() - rcVar.f1670e;
        if (!z2 && rcVar.f1672g > jNowInSeconds) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) rcVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ic(jNowInSeconds, rcVar), 7, (Object) null);
            return;
        }
        if (z2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) rcVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jc(jNowInSeconds), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) rcVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new kc(jNowInSeconds, rcVar), 7, (Object) null);
        }
        if (!rcVar.f1669d.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) rcVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) mc.f1275a, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) rcVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) lc.f1185a, 7, (Object) null);
            requestSingleLocationUpdateFromGooglePlay();
        }
    }

    public final void requestSingleLocationUpdateFromGooglePlay() {
        sd sdVar = this.brazeLocationApi;
        rb manualLocationUpdateCallback = new rb(this);
        sdVar.getClass();
        Intrinsics.checkNotNullParameter(manualLocationUpdateCallback, "manualLocationUpdateCallback");
        IBrazeLocationApi iBrazeLocationApi = sdVar.f1760a;
        if (iBrazeLocationApi != null) {
            iBrazeLocationApi.requestSingleLocationUpdate(manualLocationUpdateCallback);
        }
    }

    public final void setBrazeGeofenceReEligibilityManager(rc rcVar) {
        Intrinsics.checkNotNullParameter(rcVar, "<set-?>");
        this.brazeGeofenceReEligibilityManager = rcVar;
    }

    public final void setGeofenceRequestLocation(IBrazeLocation iBrazeLocation) {
        this.geofenceRequestLocation = iBrazeLocation;
    }

    public final void setGeofencesEnabled(boolean z2) {
        this.isGeofencesEnabled = z2;
    }

    public final void setMaxNumToRegister(int i2) {
        this.maxNumToRegister = i2;
    }

    public final void setUpGeofences(boolean z2) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) sb.f1756a, 7, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new tb(z2), 6, (Object) null);
        PendingIntent pendingIntent = this.geofenceTransitionPendingIntent;
        if (pendingIntent == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) ub.f1929a, 7, (Object) null);
            return;
        }
        if (z2) {
            ReentrantLock reentrantLock = this.geofenceListLock;
            reentrantLock.lock();
            try {
                registerGeofencesWithGooglePlay(this.brazeGeofences, pendingIntent);
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void tearDownGeofences(PendingIntent intent) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) vb.f2030a, 7, (Object) null);
        if (intent != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) wb.f2126a, 7, (Object) null);
            qa qaVar = this.brazeGeofenceApi;
            Context applicationContext = this.applicationContext;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            qaVar.getClass();
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(intent, "intent");
            IBrazeGeofenceApi iBrazeGeofenceApi = qaVar.f1588a;
            if (iBrazeGeofenceApi != null) {
                iBrazeGeofenceApi.teardownGeofences(applicationContext, intent);
            }
        }
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) xb.f2199a, 7, (Object) null);
            this.geofenceStorageSharedPreferences.edit().clear().apply();
            this.brazeGeofences.clear();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void unregisterGeofences() {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) yb.f2294a, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) zb.f2374a, 7, (Object) null);
            tearDownGeofences(this.geofenceTransitionPendingIntent);
        }
    }
}
