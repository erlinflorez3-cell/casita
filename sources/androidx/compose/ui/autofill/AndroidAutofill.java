package androidx.compose.ui.autofill;

import android.content.Context;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.geometry.Rect;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
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
/* JADX INFO: compiled from: AndroidAutofill.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeN3ZS8\u000fsڔ<$q$yCAU |8ޛ\u007fN\u0016f/]j\u000fQ\u000f\u001e\u0016'k<Mczu\u0012=5Բs?AQ8KGm\r63.b&F\t\u001d\u0001H:\u000f$?\tQ\\$\u0012^N!>`\u001ce\u0005H\"LRp\u0010,a\u007fNdNǰa@7݊\u001bkHU5g\u0001\f[\u000f^TU\u0010țe$3¨O7\u001b.a\rWai?\u001b? >ݾl-/Ǣau]Af\fЕ\u0019="}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0011b|-Aq\u0015\n]REl8%\u001c>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0011i\r*8q\u001d5#", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "/tc<Y0EZ\b\fz^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0011i\r*8q\u001d5<P;k\n", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016w]G\u0005gD-\u001fie@\u000e-\b^\u00061HPU3K_r=iUK", "/tc<Y0EZ\u0001z\u0004Z.|\u0016", "\u001a`]1e6BRb\u0010~^>F\u0005?t\n)\u007fG\b`rW~\u0018=z,<Ay)3o\u0016;#", "5dc\u000eh;HT\u001d\u0006\u0002F(\u0006\u00051e\r", "u(;.a+K]\u001d}Do0|\u001bxa\u00107\u0006A\u0005\u001e\u001e\u0011K\u001eK\u0001&9`\u0005\b3v\u00120MP\u0011", "5dc\u000eh;HT\u001d\u0006\u0002M9|\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0013W~\u0018=z,<#Y0Fw\u00172TJ*x4\u001ej", "5dc#\\,P", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "1`]0X3\u001ac(\t{b3\u0004i9rh2z@", "", "/tc<Y0EZ\u0002\ty^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0011i\r*8q\u001d56M:k\n", "@d`BX:M/)\u000e\u0005_0\u0004\u0010\u0010o\r\u0011\u0006?\u0001", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidAutofill implements Autofill {
    public static final int $stable = 8;
    private final AutofillManager autofillManager;
    private final AutofillTree autofillTree;
    private final View view;

    public AndroidAutofill(View view, AutofillTree autofillTree) throws Throwable {
        this.view = view;
        this.autofillTree = autofillTree;
        Context context = view.getContext();
        Object[] objArr = {AutofillManager.class};
        Method method = Class.forName(Ig.wd("G&k_Jw\r\f\u0003`cE\f\u0015\u0011&\u000f3\b\u00046#r", (short) (C1633zX.Xd() ^ (-23133)))).getMethod(C1561oA.Qd(";8F$IBB29\u001e/;>0)*", (short) (C1580rY.Xd() ^ (-19046))), Class.forName(EO.Od("Z\u0001FS\u0003uHPot\u000eSr\r\u001f", (short) (C1607wl.Xd() ^ 31724))));
        try {
            method.setAccessible(true);
            AutofillManager autofillManager = (AutofillManager) method.invoke(context, objArr);
            if (autofillManager == null) {
                throw new IllegalStateException(C1593ug.zd("1ffbZ^bc\u0018l_mrfad dqxpi&uw}*mq-z~sr\u0007xxC", (short) (C1607wl.Xd() ^ 22783), (short) (C1607wl.Xd() ^ 32643)).toString());
            }
            this.autofillManager = autofillManager;
            view.setImportantForAutofill(1);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final View getView() {
        return this.view;
    }

    public final AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public void requestAutofillForNode(AutofillNode autofillNode) {
        Rect boundingBox = autofillNode.getBoundingBox();
        if (boundingBox == null) {
            throw new IllegalStateException("requestAutofill called before onChildPositioned()".toString());
        }
        this.autofillManager.notifyViewEntered(this.view, autofillNode.getId(), new android.graphics.Rect(Math.round(boundingBox.getLeft()), Math.round(boundingBox.getTop()), Math.round(boundingBox.getRight()), Math.round(boundingBox.getBottom())));
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public void cancelAutofillForNode(AutofillNode autofillNode) {
        this.autofillManager.notifyViewExited(this.view, autofillNode.getId());
    }
}
