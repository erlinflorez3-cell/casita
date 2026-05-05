package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.os.Build;
import androidx.compose.ui.text.AnnotatedString;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;

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
/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007ljA0ZeP.XT2\u000f\u0002{<řc$\bCC٥\"}0\u0012WȞog|Jb\u000bI\u0011\fǝ\u000f̓\\I\u0004w\u001e\u001f\u0015@RsM3eok:žx6\u0013\"r/>ц\u0015\u0005(-`\u0010%~ŲO\f 5\txH\\%O\u001b\u0019@\u0011\u00054I&jsf8^k\fGu7KoP\\?_^\f\u0014!\u000fd5\u001d\u000faL<p=C'=U\u0019\u0006\u0001f\u0006\u0017\b\u007fK\u0018\u0001'U<yweJp\u007fB\"qc]i\u0001)t\u0005\u007fdbʯ-յgKXʫx\u000e\t\u0002%@2\u0012n''5cn=ڳ\u0010\u07baxvkBV\nlKȾ~v"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fTGFh>\u001a\"gI5\u0010_.N\u0004|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013`\u0002+4w\u0012;L+7t0 \u0015u7", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "1kX=U6:`\u0018fvg(~\t<", "\u001a`]1e6BRb|\u0005g;|\u0012>/]/\u007fK}!\u0013Tnu8\u007f!7Y\u000bu", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0003D\f\u0014!C|\r$r.1[}-\r1\u0007", "<`c6i,\u001cZ\u001d\nwh(\n\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u001eU\r$Hms5QN8u0+\u0014>", "5dc\u001bT;Bd\u0019\\\u0002b7y\u0013+r~", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYG\u0005\"\u0014Qk\u001b;^!>U\u007f DC", "5dc\u0010_0I", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013`\u0002+\u0017v%;a\u0019", "5dc!X?M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "6`b!X?M", "", "Adc\u0010_0I", "", "1kX=85M`-", "Adc!X?M", "/m]<g(MS\u0018l\nk0\u0006\u000b", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidClipboardManager implements ClipboardManager {
    public static final int $stable = 8;
    private final android.content.ClipboardManager clipboardManager;

    public AndroidClipboardManager(android.content.ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public AndroidClipboardManager(Context context) throws Throwable {
        String strKd = Qg.kd("/739*6'7(", (short) (C1499aX.Xd() ^ (-4985)), (short) (C1499aX.Xd() ^ (-23356)));
        short sXd = (short) (Od.Xd() ^ (-2115));
        short sXd2 = (short) (Od.Xd() ^ (-14841));
        int[] iArr = new int["8D9FB;5}2=;@08=u\n538(:5".length()];
        QB qb = new QB("8D9FB;5}2=;@08=u\n538(:5");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {Class.forName(C1561oA.ud("|r\u0007p<ymyq7[{xnrj", (short) (FB.Xd() ^ 18835)))};
        Object[] objArr = {strKd};
        short sXd3 = (short) (C1499aX.Xd() ^ (-10171));
        int[] iArr2 = new int["\u0013\u0010\"\u007f)\"&\u0016\u0011u\u000b\u0017\u001e\u0010\r\u000e".length()];
        QB qb2 = new QB("\u0013\u0010\"\u007f)\"&\u0016\u0011u\u000b\u0017\u001e\u0010\r\u000e");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            Intrinsics.checkNotNull(objInvoke, C1561oA.Yd("X`XY\u000eRQ_`bh\u0015X\\\u0018\\[np\u001drn oqq1s{st)~\u0005|r.p~u\u0005\u0003}yDz\b\b\u000f\u0001\u000b\u0012Lb\r\u000b\u0013\u0006\u0014\u0007\u0019\fu\u000b\u0019\r\u0014\u0013!", (short) (C1580rY.Xd() ^ (-22148))));
            this((android.content.ClipboardManager) objInvoke);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public void setText(AnnotatedString annotatedString) {
        this.clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", AndroidClipboardManager_androidKt.convertToCharSequence(annotatedString)));
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public AnnotatedString getText() {
        ClipData primaryClip = this.clipboardManager.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        return AndroidClipboardManager_androidKt.convertToAnnotatedString(itemAt != null ? itemAt.getText() : null);
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public boolean hasText() {
        ClipDescription primaryClipDescription = this.clipboardManager.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public ClipEntry getClip() {
        ClipData primaryClip = this.clipboardManager.getPrimaryClip();
        if (primaryClip != null) {
            return new ClipEntry(primaryClip);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public void setClip(ClipEntry clipEntry) {
        if (clipEntry == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                Api28ClipboardManagerClipClear.clearPrimaryClip(this.clipboardManager);
                return;
            } else {
                this.clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
                return;
            }
        }
        this.clipboardManager.setPrimaryClip(clipEntry.getClipData());
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public android.content.ClipboardManager getNativeClipboard() {
        return this.clipboardManager;
    }
}
