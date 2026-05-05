package com.ticnow.sdk.idnowonboarding.logger;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Wg;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\":\u0012\u007fјnjG<LeN3hݷZ\u000f\u001azt1k*\u007fCSW0|P\nҊRgup\u0013n\u0019G'\u0006D}\u001b0W[\u0011]@\u0016bF}GKM\u001eD\u0002t\u0003?\u001d `'h}\u0013\u00072*v\u0017'~QS$\u0012^G9N`\u0017e\u0005H\u00176B.\u00076\\\u0016UfLzeR/Q\n2H\\2w0+TSF\u001d;\u001b\u0003y\u001eYEg9#+k\u00035Y\fC\u0011G\n=3oo59V\fWd]0\u0018#3g\r\fyl\\U_n\u000f?-ebyQdߍyߡ\u007f\rDǉأ\n5"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0005*9o\u0016;\u0017*Em6\u001e\"RqH\\", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", ";B^;g,Qb", ExifInterface.GPS_MEASUREMENT_2D, "", "B`V", "", ";db@T.>", ExifInterface.GPS_MEASUREMENT_3D, "7", "Bh\\2f;:[$", ExifInterface.LONGITUDE_EAST, "EqXAX\u001bH:#\u0001[b3|", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class LoggerOut {
    private final Context mContext;

    public LoggerOut(Context context) {
        this.mContext = context;
    }

    private final String timestamp() {
        String str = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date());
        Intrinsics.checkExpressionValueIsNotNull(str, "simpleDateFormat.format(Date())");
        return str;
    }

    private final void writeToLogFile(String str) throws Throwable {
        if (this.mContext != null) {
            Context context = this.mContext;
            Class<?> cls = Class.forName(C1561oA.od("-9.;70*r'205%-2j~*(-\u001d/*", (short) (OY.Xd() ^ 11687)));
            Class<?>[] clsArr = {Class.forName(C1561oA.Kd("]UkW%dZhb*Prqioi", (short) (FB.Xd() ^ 10648)))};
            Object[] objArr = {null};
            short sXd = (short) (ZN.Xd() ^ 24816);
            short sXd2 = (short) (ZN.Xd() ^ 22370);
            int[] iArr = new int["*c4D8m\"o-_$>%i\u001bhz`-".length()];
            QB qb = new QB("*c4D8m\"o-_$>%i\u001bhz`-");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                File file = new File((File) method.invoke(context, objArr), C1561oA.Xd("plwy\u0003\u007fqy=|\u0001y", (short) (C1607wl.Xd() ^ 32630)));
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
                    bufferedWriter.append((CharSequence) (timestamp() + Wg.vd("\u0012", (short) (C1580rY.Xd() ^ (-13654))) + str));
                    bufferedWriter.newLine();
                    bufferedWriter.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
    }

    public final void d(String tag, String message) throws Throwable {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(message, "message");
        writeToLogFile("D/" + tag + ": " + message);
    }

    public final void e(String tag, String message) throws Throwable {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(message, "message");
        writeToLogFile("E/" + tag + ": " + message);
    }

    public final void i(String tag, String message) throws Throwable {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(message, "message");
        writeToLogFile("I/" + tag + ": " + message);
    }

    public final void w(String tag, String message) throws Throwable {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(message, "message");
        writeToLogFile("W/" + tag + ": " + message);
    }
}
