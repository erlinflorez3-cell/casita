package com.ticnow.sdk.idnowonboarding.onboarding;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u001e\u007f\u0007lkA0ZeP.XT2\u000fy{<řc$\u007fLCU ~*\t]TogtOpŏs\u000f4\u00159u<Mcxu\u0012=3Բs?AO8AGk\r63,z6F\u0007\u001d\u0001H8x\u0014\u0005\n[K:\u0016`D~Jj\r{\u0013b\u001e\u0014O8\u0001Ln\u0018RDW\u0005]h3k\u0011wUf)u/+Q=Jb6%v\u0010\"sLEI-%\u0002\u000f7ViN\u001b? AM|5<CI\"cf\\\u000e#-+}\u0011\u000ev4r\u001dQ\u000f\u001ao?]xcP<4(~\n\u001cT\u0004<\nWL<D2f6 {\t\u0001hXP0jr\u0004\tpN\u0017S\u0004c/G3~Q\u0010?iZE~\u001d\rL'W͜cƟX\u000ehٽkc\u0006QIQn>˓R\u0010aƝ\u0006\u0006vg\u00100T?U\u0007G{?6ϲ)=cݽ;#q\u000bVNЂz\u001e"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\b)4w\u0012;LGDm}\f\u0018dn9\u0006N9Nw'TLW*\\(", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "\u001eQ4\u0013F&'/\u0001^", "", "5dc\u0010b5MS,\u000e", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "AgP?X+)`\u0019\u007f", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "5dc [(KS\u0018i\b^-", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqiC|$\u0017FZ\u001b<w%BY\u0007\u001e7{k", "1kT.e\u001aAO&~yI9|\n/r\u007f1y@", "", "5dc#T3NSu\t\u0005e0|\u0012", "", "\u0019DH,A\b&3", "2dU.h3MD\u0015\u0006\u000b^", "5dc#T3NS|\b\n", "", "5dc#T3NS\u0007\u000e\bb5~", "@d\\<i,/O \u000fz", "A`e2", "AsPAh:", "D`[BX", "BdgA", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class SharedPreference {
    private final String PREFS_NAME;
    private final Context context;
    private final SharedPreferences sharedPref;

    public SharedPreference(Context context) throws Throwable {
        Intrinsics.checkParameterIsNotNull(context, Qg.kd("r}{\u0001p\u0003}", (short) (C1580rY.Xd() ^ (-21755)), (short) (C1580rY.Xd() ^ (-1485))));
        this.context = context;
        String strVd = hg.Vd(".15,(, +\u001f\u001f,", (short) (C1499aX.Xd() ^ (-21128)), (short) (C1499aX.Xd() ^ (-29314)));
        this.PREFS_NAME = strVd;
        Class<?> cls = Class.forName(C1561oA.ud("XdYfb[U\u001eR][`PX]\u0016*USXHZU", (short) (FB.Xd() ^ 32341)));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1580rY.Xd() ^ (-15800));
        int[] iArr = new int["g]u_/ldp\\\"Jjkaia".length()];
        QB qb = new QB("g]u_/ldp\\\"Jjkaia");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {strVd, 0};
        Method method = cls.getMethod(C1561oA.Yd("@?O/E?QEE2UIKKYMWMP_", (short) (C1633zX.Xd() ^ (-32117))), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            Intrinsics.checkExpressionValueIsNotNull(sharedPreferences, Xg.qd(";HHOAUR\rGFV6LFXLL9\\PRR`T⳼>7\u001f\u00148eel^ro*JMCE`RUM[G[M2", (short) (ZN.Xd() ^ 30662), (short) (ZN.Xd() ^ 648)));
            this.sharedPref = sharedPreferences;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void clearSharedPreference() {
        SharedPreferences.Editor editorEdit = this.sharedPref.edit();
        Intrinsics.checkExpressionValueIsNotNull(editorEdit, "sharedPref.edit()");
        editorEdit.clear();
        editorEdit.commit();
    }

    public final Context getContext() {
        return this.context;
    }

    public final SharedPreferences getSharedPref() {
        return this.sharedPref;
    }

    public final boolean getValueBoolien(String KEY_NAME, boolean z2) {
        Intrinsics.checkParameterIsNotNull(KEY_NAME, "KEY_NAME");
        return this.sharedPref.getBoolean(KEY_NAME, z2);
    }

    public final int getValueInt(String KEY_NAME) {
        Intrinsics.checkParameterIsNotNull(KEY_NAME, "KEY_NAME");
        return this.sharedPref.getInt(KEY_NAME, 0);
    }

    public final String getValueString(String KEY_NAME) {
        Intrinsics.checkParameterIsNotNull(KEY_NAME, "KEY_NAME");
        return this.sharedPref.getString(KEY_NAME, null);
    }

    public final void removeValue(String KEY_NAME) {
        Intrinsics.checkParameterIsNotNull(KEY_NAME, "KEY_NAME");
        SharedPreferences.Editor editorEdit = this.sharedPref.edit();
        Intrinsics.checkExpressionValueIsNotNull(editorEdit, "sharedPref.edit()");
        editorEdit.remove(KEY_NAME);
        editorEdit.commit();
    }

    public final void save(String KEY_NAME, int i2) {
        Intrinsics.checkParameterIsNotNull(KEY_NAME, "KEY_NAME");
        SharedPreferences.Editor editorEdit = this.sharedPref.edit();
        Intrinsics.checkExpressionValueIsNotNull(editorEdit, "sharedPref.edit()");
        editorEdit.putInt(KEY_NAME, i2);
        editorEdit.commit();
    }

    public final void save(String KEY_NAME, String text) {
        Intrinsics.checkParameterIsNotNull(KEY_NAME, "KEY_NAME");
        Intrinsics.checkParameterIsNotNull(text, "text");
        SharedPreferences.Editor editorEdit = this.sharedPref.edit();
        Intrinsics.checkExpressionValueIsNotNull(editorEdit, "sharedPref.edit()");
        editorEdit.putString(KEY_NAME, text);
        if (editorEdit == null) {
            Intrinsics.throwNpe();
        }
        editorEdit.commit();
    }

    public final void save(String KEY_NAME, boolean z2) {
        Intrinsics.checkParameterIsNotNull(KEY_NAME, "KEY_NAME");
        SharedPreferences.Editor editorEdit = this.sharedPref.edit();
        Intrinsics.checkExpressionValueIsNotNull(editorEdit, "sharedPref.edit()");
        editorEdit.putBoolean(KEY_NAME, z2);
        editorEdit.commit();
    }
}
