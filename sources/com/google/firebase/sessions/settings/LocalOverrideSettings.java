package com.google.firebase.sessions.settings;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.sessions.settings.SettingsProvider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007llA0RiP.XT2\u000fy\u0005<$a%yCQU\"}(\u000bUȞ}˧\r^\u000b\u000bq\u000e>\u0015\r+7YY\u0007]*\u000f`CņC3[q\u000eSnwN\r>7J:\u0010\u0004/\u001eXLf͏|ŲO\u0012\u001aؓPr@X\u001bTU. \u000eV\"\u0017\u001d\u000bp\u0005\u000b\u001fǤ_Ơ3'\u001bkHX5j\u0001\u0011[\u0019^V=\f%nT\u007f\u0017ˑ7չ)W\u001b\tXiM\u0012\u0010\u000fK\u0015\u0001)=*w\u0005\u000e\u000b/ó\u0016Ǽ*˽\u05ce\\qΟ[\u0005Ōd\u0010?-UuYcʮ(\u0005\u0003{\u0013S\f\u0011\fϋd\\,\"f\u000e-߀x\b"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u0017*Ei0%~yaF\u0014g+Nd'V[R5^`H", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u00171;zC\"\u001ejo$\u0014m=Ru'T\"", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", ";dc.W(MO", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "5dc\u001aX;:R\u0015\u000ev\u001d(\u0006\u00129t{7\u007fJ\n%", "u(E", "A`\\=_0GU\u0006z\n^", "", "5dc T4IZ\u001d\b|K(\f\t", "u(;7T=:\u001d z\u0004`u[\u0013?b\u0007(Q", "Adb@\\6G3\"zwe,{", "", "5dc X:LW#\bZg(y\u0010/d", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "Adb@\\6G@\u0019\r\nZ9\fw3m\u007f2\fO", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "5dc X:LW#\bg^:\f\u0005<tn,\u0004@\u000b'&\u000fP\u0010?fv\u0007(", "u(;8b;EW\"H\nb4|R\u000eu\r$\u000bD\u000b l", "\u0011n\\=T5B]\"", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LocalOverrideSettings implements SettingsProvider {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String SAMPLING_RATE = "firebase_sessions_sampling_rate";

    @Deprecated
    public static final String SESSIONS_ENABLED = "firebase_sessions_enabled";

    @Deprecated
    public static final String SESSION_RESTART_TIMEOUT = "firebase_sessions_sessions_restart_timeout";
    private final Bundle metadata;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#2ߝx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅ś<~"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u0017*Ei0%~yaF\u0014g+Nd'V[R5^`1\u001b\u001e\u001ae\nW/\u0017\u000e/", "", "u(E", "!@<\u001d?\u0010'5\u0013kVM\f", "", "!DB <\u0016'A\u0013^c:\tch\u000e", "!DB <\u0016'M\u0006^hM\biw)Tc\u0010[*p\u0006", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LocalOverrideSettings(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.yd(">IKPDVU", (short) (OY.Xd() ^ 21705)));
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("lzq\u0001~yu@v\u0004\u0004\u000b|\u0007\u000eH^\f\f\u0013\u0005\u0019\u0016", (short) (Od.Xd() ^ (-20509)))).getMethod(Xg.qd("\u0006\u0005\u0015q\u0004\u0007\u0010\u0007\u000e\ru\u000b\u0019\r\u0014\u0013!", (short) (C1607wl.Xd() ^ 8075), (short) (C1607wl.Xd() ^ 19021)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Class<?> cls = Class.forName(Jg.Wd("|P=d\u0019\u001b-.|~GdNm+m\u001a~\u0015\u0014Luj", (short) (C1580rY.Xd() ^ (-8237)), (short) (C1580rY.Xd() ^ (-20271))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd = (short) (C1607wl.Xd() ^ 21886);
            short sXd2 = (short) (C1607wl.Xd() ^ 9483);
            int[] iArr = new int["\u001a\u0006\u00068w\u0015\u0016H5oWNL\u000e".length()];
            QB qb = new QB("\u001a\u0006\u00068w\u0015\u0016H5oWNL\u000e");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method2.setAccessible(true);
                String str = (String) method2.invoke(context, objArr2);
                Class<?> cls2 = Class.forName(C1626yg.Ud("FpA\u001e\u000ft\u0017\u0006\u001fH\u0014\to\u0007o\u0010E\u001a`\u0001 \b2x^\u0003^-\fL%\u007fL", (short) (FB.Xd() ^ 27377), (short) (FB.Xd() ^ 22035)));
                Class<?>[] clsArr2 = new Class[2];
                short sXd3 = (short) (ZN.Xd() ^ 7971);
                int[] iArr2 = new int["\u0002*qsYk4\u0019W-P\u0018c,-\f".length()];
                QB qb2 = new QB("\u0002*qsYk4\u0019W-P\u0018c,-\f");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                    i3++;
                }
                clsArr2[0] = Class.forName(new String(iArr2, 0, i3));
                clsArr2[1] = Integer.TYPE;
                Object[] objArr3 = {str, 128};
                short sXd4 = (short) (Od.Xd() ^ (-28017));
                int[] iArr3 = new int["\u0018e\u0003v\u0007,\u0014x*K`o`U$$hW".length()];
                QB qb3 = new QB("\u0018e\u0003v\u0007,\u0014x*K`o`U$$hW");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + i4)) + xuXd3.CK(iKK3));
                    i4++;
                }
                Method method3 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                try {
                    method3.setAccessible(true);
                    Bundle bundle = ((ApplicationInfo) method3.invoke(packageManager, objArr3)).metaData;
                    this.metadata = bundle == null ? Bundle.EMPTY : bundle;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private static /* synthetic */ void getMetadata$annotations() {
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Double getSamplingRate() {
        if (this.metadata.containsKey(SAMPLING_RATE)) {
            return Double.valueOf(this.metadata.getDouble(SAMPLING_RATE));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Boolean getSessionEnabled() {
        if (this.metadata.containsKey(SESSIONS_ENABLED)) {
            return Boolean.valueOf(this.metadata.getBoolean(SESSIONS_ENABLED));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774, reason: not valid java name */
    public Duration mo7778getSessionRestartTimeoutFghU774() {
        if (this.metadata.containsKey(SESSION_RESTART_TIMEOUT)) {
            return Duration.m10304boximpl(DurationKt.toDuration(this.metadata.getInt(SESSION_RESTART_TIMEOUT), DurationUnit.SECONDS));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return SettingsProvider.DefaultImpls.isSettingsStale(this);
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Object updateSettings(Continuation<? super Unit> continuation) {
        return SettingsProvider.DefaultImpls.updateSettings(this, continuation);
    }
}
