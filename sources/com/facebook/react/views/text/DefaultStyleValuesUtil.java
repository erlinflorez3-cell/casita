package com.facebook.react.views.text;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG6LeN0X\u07be*%ӆ,4RZdvI;ڈ\u001e}0\t\u0018fuh\u0007Lp\nq\u00116\u001a\u0007mDI\u0004|\u000e\u0016\u001d7Zom9\u0014o\u0006In{N\u000761P:*\t\u000f\u001dBH>zAH\u0014\u001a 8XphX=Q\u0013\u001d*\u0006l$G#%w\\?`ns9]%3mPQ?_^\u0001\u0014\u0012ШX1"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001d<\n4~8}!3}\u001d=;ROr4\u000f\u0011oq9\u0015S;R}|", "", "u(E", "5dc\u0011X-:c \u000ei^?\fd>t\r,xP\u0010\u0017", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\n^!\u001eQ|{Kr45@\u0002.FC", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/sc?\\)Nb\u0019", "", "5dc\u0011X-:c \u000ei^?\ff9l\n5", "5dc\u0011X-:c \u000ei^?\ff9l\n5^D\u0003\u001a\u001eKq\u0011K", "5dc\u0011X-:c \u000ei^?\ff9l\n5^D\n&", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DefaultStyleValuesUtil {
    public static final DefaultStyleValuesUtil INSTANCE = new DefaultStyleValuesUtil();

    private DefaultStyleValuesUtil() {
    }

    private final ColorStateList getDefaultTextAttribute(Context context, int i2) throws Throwable {
        short sXd = (short) (Od.Xd() ^ (-7753));
        int[] iArr = new int["1?6EC>:\u0005;HHOAKR\r#PPWI]Z".length()];
        QB qb = new QB("1?6EC>:\u0005;HHOAKR\r#PPWI]Z");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (Od.Xd() ^ (-13));
        int[] iArr2 = new int["hewVmitk".length()];
        QB qb2 = new QB("hewVmitk");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK((sXd2 ^ i4) + xuXd2.CK(iKK2));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArrayObtainStyledAttributes = ((Resources.Theme) method.invoke(context, objArr)).obtainStyledAttributes(new int[]{i2});
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, Qg.kd("*\u001c-\u0019 $\b(,\u001e\u0016\u0014o\"!\u001e\u0014\f\u001e\u001c\f\u0019LQPOI", (short) (ZN.Xd() ^ 9470), (short) (ZN.Xd() ^ 5723)));
            return typedArrayObtainStyledAttributes.getColorStateList(0);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @JvmStatic
    public static final ColorStateList getDefaultTextColor(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return INSTANCE.getDefaultTextAttribute(context, R.attr.textColor);
    }

    @JvmStatic
    public static final int getDefaultTextColorHighlight(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        ColorStateList defaultTextAttribute = INSTANCE.getDefaultTextAttribute(context, R.attr.textColorHighlight);
        if (defaultTextAttribute != null) {
            return defaultTextAttribute.getDefaultColor();
        }
        return 0;
    }

    @JvmStatic
    public static final ColorStateList getDefaultTextColorHint(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return INSTANCE.getDefaultTextAttribute(context, R.attr.textColorHint);
    }
}
