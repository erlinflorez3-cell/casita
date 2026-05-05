package kotlin.coroutines.jvm.internal;

import com.google.firebase.messaging.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Kl;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;

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
@Metadata(bv = {}, d1 = {"Я2\u001d̉=!,o\bӵLc\u0003\u0004I\u00066\f6B\u0015\"4\u0012\u000e\u0007nj?0LeV=ZS8\u001bs{:$c$\bCCU }:\u001f]N\u007fg\u001dK\u000b\u000fQ\u0011\u001e\u0016'i\\Mc{u\u0012=1\toW?[sU;vsd\nH2P>@\u0005\u0019$8O(v)Bs\f@6\u0007pRi\u001bU\u001d\"\"\bN /(rf|?pl\f@u\"ɨmB\\2wA\u000bY%Hj&;\u0004\n\u001eYF}4չ)S\t\u0015rgMšWqk\u0004?ѪyȅMs_̬ނ\u0004#"}, d2 = {"\u0011NA\u001cH\u001b\"<xlt=\fYx\u0011_g\bj\u001c_r\u0006#i~\u001cc\u0013\u0019Cf", "", "1gT0^\u000b>P)\u0001b^;x\b+t{\u0019{M\u000f\u001b!P", "", "3w_2V;>R", "/bcBT3", "5dc\u0011X)NU\u0001~\nZ+x\u0018+A\t1\u0006O|&\u001bQx", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eq\u0001Q\t`\u001bP~\u000eI\u007f!<#\\ 4}\u0018\u0016MR7j0-\u0011>", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eq\u0001Q\t`\u001bP~\u000eI\u007f!<#Z\u001cEms8VR?tD\u001a$lkBjk7UL", "5dc\u0019T)>Z", "5dc c0EZ\u0019}kZ9\u0001\u0005,l\u007f\t\u007f@\b\u0016~Cz\u0019@\u007f'", "", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6EE\u0012\u001f`Kx\u001d<\u0004.1`G|3{\u0016\fWLJo=.\u0011weC\u0010G4Y}|\u000bB51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D", "5dc g(<Y\b\fv\\,\\\u0010/m\u007f1\u000b$\t\"\u001e", "\u001aiPCTuEO\"\u0001DL;x\u00075T\r$y@`\u001e\u0017Oo\u0017KL", "5dc g(<Y\b\fv\\,\\\u0010/m\u007f1\u000b", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DebugMetadataKt {
    private static final int COROUTINES_DEBUG_METADATA_VERSION = 1;

    private static final void checkDebugMetadataVersion(int i2, int i3) {
        if (i3 > i2) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i2 + ", got " + i3 + ". Please update the Kotlin standard library.").toString());
        }
    }

    private static final DebugMetadata getDebugMetadataAnnotation(BaseContinuationImpl baseContinuationImpl) {
        return (DebugMetadata) Kl.Kd(baseContinuationImpl.getClass(), DebugMetadata.class);
    }

    private static final int getLabel(BaseContinuationImpl baseContinuationImpl) {
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField(Constants.ScionAnalytics.PARAM_LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final String[] getSpilledVariableFieldMapping(BaseContinuationImpl baseContinuationImpl) {
        Intrinsics.checkNotNullParameter(baseContinuationImpl, "<this>");
        DebugMetadata debugMetadataAnnotation = getDebugMetadataAnnotation(baseContinuationImpl);
        if (debugMetadataAnnotation == null) {
            return null;
        }
        checkDebugMetadataVersion(1, debugMetadataAnnotation.v());
        ArrayList arrayList = new ArrayList();
        int label = getLabel(baseContinuationImpl);
        int[] iArrI = debugMetadataAnnotation.i();
        int length = iArrI.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (iArrI[i2] == label) {
                arrayList.add(debugMetadataAnnotation.s()[i2]);
                arrayList.add(debugMetadataAnnotation.n()[i2]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final StackTraceElement getStackTraceElement(BaseContinuationImpl baseContinuationImpl) throws Throwable {
        Intrinsics.checkNotNullParameter(baseContinuationImpl, Wg.vd("7pacj6", (short) (C1499aX.Xd() ^ (-14939))));
        DebugMetadata debugMetadataAnnotation = getDebugMetadataAnnotation(baseContinuationImpl);
        if (debugMetadataAnnotation == null) {
            return null;
        }
        checkDebugMetadataVersion(1, debugMetadataAnnotation.v());
        int label = getLabel(baseContinuationImpl);
        int i2 = label < 0 ? -1 : debugMetadataAnnotation.l()[label];
        String moduleName = ModuleNameRetriever.INSTANCE.getModuleName(baseContinuationImpl);
        String strC = moduleName == null ? debugMetadataAnnotation.c() : moduleName + '/' + debugMetadataAnnotation.c();
        String strM = debugMetadataAnnotation.m();
        String strF = debugMetadataAnnotation.f();
        short sXd = (short) (FB.Xd() ^ 29921);
        short sXd2 = (short) (FB.Xd() ^ 17732);
        int[] iArr = new int["-#7!l*\u001e*\"g\f,\u0018\u0019 \b%\u0013\u0014\u0015s\u001a\u0012\u0019\u0010\u0018\u001d".length()];
        QB qb = new QB("-#7!l*\u001e*\"g\f,\u0018\u0019 \b%\u0013\u0014\u0015s\u001a\u0012\u0019\u0010\u0018\u001d");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(((sXd + i3) + xuXd.CK(iKK)) - sXd2);
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = new Class[4];
        short sXd3 = (short) (OY.Xd() ^ 22391);
        short sXd4 = (short) (OY.Xd() ^ 10722);
        int[] iArr2 = new int[">4H2};/;3x\u001d=:04,".length()];
        QB qb2 = new QB(">4H2};/;3x\u001d=:04,");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(sXd3 + i4 + xuXd2.CK(iKK2) + sXd4);
            i4++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i4));
        clsArr[1] = Class.forName(C1561oA.ud("cYmW#`T`X\u001eBb_UYQ", (short) (C1607wl.Xd() ^ 32243)));
        short sXd5 = (short) (OY.Xd() ^ 6854);
        int[] iArr3 = new int["=5G3|<.<2y\u001c>913-".length()];
        QB qb3 = new QB("=5G3|<.<2y\u001c>913-");
        int i5 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd5 ^ i5));
            i5++;
        }
        clsArr[2] = Class.forName(new String(iArr3, 0, i5));
        clsArr[3] = Integer.TYPE;
        Object[] objArr = {strC, strM, strF, Integer.valueOf(i2)};
        Constructor<?> constructor = cls.getConstructor(clsArr);
        try {
            constructor.setAccessible(true);
            return (StackTraceElement) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
