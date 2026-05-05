package androidx.compose.foundation.text.input.internal;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
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
/* JADX INFO: compiled from: ComposeInputMethodManager.android.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0LeN/ZS8\u000fs{:+c$\bCCU }*\t]To˧vJp\u000bK\u000f\f\u001a~\u000bBկ\u0006x\f\u0011O=RsM3eok:žx6\u0013\"z(F\u0003\u001d\u0001H4\u000f$?\u0001QV$\u0012^D7:\u001b\u0013[\u00112\u00124Hf\u0015fbu[NH\u001bg\u0001Ck\twPf'\u000e4COULb6%v\u0010(qT\u007f;#5k\u00035\\\"SKE\u007fN\u001dhU1q]<eDj\u0018\u0014C5\u007f\u0011k\u0006>\\3e' oA]xcP<2(~\n#T\u0004<\u001dWL<E2f6'y\t;yNj\u001a^p\n+eD2=\u007faBi\u001ftmy;Geg\u007f\u0013*6#/\u0006Q_b,x\u0015Ik>e\u0002_N@`P XkqZ͒n͆.\u00048ϚP;\n\u0016F\u0017S=2ހ%\u074co\u0002Pֳ8\t\u0013`\u0001S\u0018S\u001f\u061c$å\u001a=2\u009e$\\Jk\u0013sÕXw"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PA6V\u00021UL25gb\u0002%\u0014!]\u0018M\u0013\t\u000eUC${(?*\u000f\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PA6V\u00021UL25gb\u0002%\u0014!]\u0018M\u0013\t\u000eUC${\u001a", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q\u0004q", "7l\\", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9qE\u00025DA}/:w\u0015\u0016IL7m4+j", "AnUAj(KS~~\u000f[6x\u0016.C\n1\u000bM\u000b\u001e\u001eG|kF~01h", "\u001a`]1e6BR,Hxh9|R@i\u007f:E.\u000b\u0018&Yk\u001b<\\%IV\b\u001cDls8VRHu;%\u0015u?C\u000fn(]L", "5dc#\\,P", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "/bR2c;,b-\u0006\u000bl\u000fx\u0012.w\r,\u000bD\n\u0019uGv\u000e>r49c\u0007", "", "1qT.g,\"[!", "6hS2F6?b|\b\u0006n;", ">qT=T9>A(\u0013\u0002n:_\u00058d\u00125\u007fO\u0005 \u0019&o\u0015<x!D]\b)", "@d`B\\9>7!\u0007", "@dbAT9M7\"\n\u000bm", "Ag^DF6?b|\b\u0006n;", "AsP?g\u001aMg \u000f\tA(\u0006\bAr\u00047\u007fI\u0003", "CoS.g,\u001cc&\r\u0005k\b\u0006\u00072o\r\f\u0005A\u000b", "7mU<", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kL\u00043?fY)5p ;1L<u\n", "CoS.g,\u001ef(\fv\\;|\b\u001ee\u00137", "BnZ2a", "", "3wc?T*MS\u0018mzq;", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9mO\u000621W\r 6\\\u0016A\\\u0019", "CoS.g,,S ~xm0\u0007\u0012", "Ad[2V;B]\"l\nZ9\f", "Ad[2V;B]\"^\u0004]", "1n\\=b:Bb\u001d\t\u0004L;x\u0016>", "1n\\=b:Bb\u001d\t\u0004>5{", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
abstract class ComposeInputMethodManagerImpl implements ComposeInputMethodManager {
    private android.view.inputmethod.InputMethodManager imm;
    private final SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat;
    private final View view;

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void acceptStylusHandwritingDelegation() {
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void prepareStylusHandwritingDelegation() {
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void startStylusHandwriting() {
    }

    public ComposeInputMethodManagerImpl(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
    }

    protected final View getView() {
        return this.view;
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void restartInput() {
        requireImm().restartInput(this.view);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void showSoftInput() {
        this.softwareKeyboardControllerCompat.show();
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void hideSoftInput() {
        this.softwareKeyboardControllerCompat.hide();
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void updateExtractedText(int i2, ExtractedText extractedText) {
        requireImm().updateExtractedText(this.view, i2, extractedText);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void updateSelection(int i2, int i3, int i4, int i5) {
        requireImm().updateSelection(this.view, i2, i3, i4, i5);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        requireImm().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    protected final android.view.inputmethod.InputMethodManager requireImm() throws Throwable {
        android.view.inputmethod.InputMethodManager inputMethodManager = this.imm;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        android.view.inputmethod.InputMethodManager inputMethodManagerCreateImm = createImm();
        this.imm = inputMethodManagerCreateImm;
        return inputMethodManagerCreateImm;
    }

    private final android.view.inputmethod.InputMethodManager createImm() throws Throwable {
        Context context = this.view.getContext();
        short sXd = (short) (C1607wl.Xd() ^ 12751);
        short sXd2 = (short) (C1607wl.Xd() ^ 15475);
        int[] iArr = new int["C\u0001zq9H/\u0015vs>\u0005".length()];
        QB qb = new QB("C\u0001zq9H/\u0015vs>\u0005");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        Class<?> cls = Class.forName(C1626yg.Ud("f7(NX\fy>US`=\u000e(\u001dmRYN)% \u0005", (short) (OY.Xd() ^ 26420), (short) (OY.Xd() ^ 3689)));
        Class<?>[] clsArr = new Class[1];
        short sXd3 = (short) (C1633zX.Xd() ^ (-16178));
        int[] iArr2 = new int["'h\n')\"lx\u001a\u00130],/.G".length()];
        QB qb2 = new QB("'h\n')\"lx\u001a\u00130],/.G");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {str};
        Method method = cls.getMethod(EO.Od("o=\u000eQ8V\u007f![2\u001aQ$\t\u0003+", (short) (ZN.Xd() ^ 13979)), clsArr);
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            Intrinsics.checkNotNull(objInvoke, C1561oA.Qd("MSIHz=:FEEIs57p30AAk?9h664q28.-_37-!Z\u001b'\u001c)%\u001e\u0018`(\u001a\u0015&[\u0016\u001a\u001b\u001f\u001d\u0015\f\u001a\r\u0013\u0007Oi\u000e\u000f\u0013\u0011h\u007f\u000e\u0001\u0007zbu\u0002sxu\u0002", (short) (Od.Xd() ^ (-30927))));
            return (android.view.inputmethod.InputMethodManager) objInvoke;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
