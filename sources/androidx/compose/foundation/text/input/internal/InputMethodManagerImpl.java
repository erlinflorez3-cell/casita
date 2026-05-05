package androidx.compose.foundation.text.input.internal;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.C1593ug;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.Od;
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
/* JADX INFO: compiled from: InputMethodManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lmA0ZeP\u008cZS8\u000fsڔ<$i-yCAX\"}8\tWNmgvJh\u0011KƤ\u000e\u0016\u000fj4I[|c܈%˰rom2\u000ezM=ntN\u0005N3ŕ<y\u0013\u0003b0V\u001b\u000fzqWR&xF~Gj\r{\u0013`&ND.\u00106\\\u0016Z|\\5cH?;\u0003\u0018N\u0015;(6\u000b^%F\u00033S\u000b*,9RO5C1\u0004\u0007\u0015es?1S8QM~5<CI\"cf\\\u000e*-+}$\u000ev4t\u001dQ\u000f%m?\u0018\nYj&(&\u0007,\u0011J\u001f&\u0006U_^1(\u0003 \u000ea\f#WNm\u001a^p\u0017+eD5=\u007faB\u007f/7jo>1Ne\u007f;MtŃЬnĲ_^\u0016b\u001b\"b\u007fi3WEKN\u001f\u0016gF\u0006\u0004\u001flXÒ\u0006ΥK\u007f7Ʌa:%%O[g$wȀ\u0004ҩHg~ݓÄlr"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PG5Y\u00076/L]/fQZ9\u001d\u000e\\\u000e[\u000f\u0015\u0010`\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PG5Y\u00076/L]/fQZ9\u001d\u000e\\\u000e[\u0001", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q\u0004q", "7l\\", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9qE\u00025DA}/:w\u0015\u0016IL7m4+j", "5dc\u0016`4", "u(;.a+K]\u001d}Do0|\u001bxi\t3\fO\t\u0017&Jy\r\u0006Z.@i\r\b7|\u00198L+7t0 \u0015u7", "7l\\pW,ES\u001bz\n^", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "AnUAj(KS~~\u000f[6x\u0016.C\n1\u000bM\u000b\u001e\u001eG|kF~01h", "\u001a`]1e6BR,Hxh9|R@i\u007f:E.\u000b\u0018&Yk\u001b<\\%IV\b\u001cDls8VRHu;%\u0015u?C\u000fn(]L", "6hS2F6?b|\b\u0006n;", "", "7r00g0OS", "", "@dbAT9M7\"\n\u000bm", "Ag^DF6?b|\b\u0006n;", "AsP?g\u001aMg \u000f\tA(\u0006\bAr\u00047\u007fI\u0003", "CoS.g,\u001cc&\r\u0005k\b\u0006\u00072o\r\f\u0005A\u000b", "1ta@b9\u001a\\\u0017\u0002\u0005k\u0010\u0006\n9", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kL\u00043?fY)5p ;1L<u\n", "CoS.g,\u001ef(\fv\\;|\b\u001ee\u00137", "BnZ2a", "", "3wc?T*MS\u0018mzq;", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9mO\u000621W\r 6\\\u0016A\\\u0019", "CoS.g,,S ~xm0\u0007\u0012", "Ad[2V;B]\"l\nZ9\f", "Ad[2V;B]\"^\u0004]", "1n\\=b:Bb\u001d\t\u0004L;x\u0016>", "1n\\=b:Bb\u001d\t\u0004>5{", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InputMethodManagerImpl implements InputMethodManager {
    public static final int $stable = 8;
    private final Lazy imm$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<android.view.inputmethod.InputMethodManager>() { // from class: androidx.compose.foundation.text.input.internal.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final android.view.inputmethod.InputMethodManager invoke() throws Throwable {
            Context context = this.this$0.view.getContext();
            String strZd = C1593ug.zd("flouuapiynvl", (short) (Od.Xd() ^ (-13139)), (short) (Od.Xd() ^ (-20721)));
            short sXd = (short) (C1633zX.Xd() ^ (-1720));
            int[] iArr = new int["NZO\\XQK\u0014HSQVFNS\f KIN>PK".length()];
            QB qb = new QB("NZO\\XQK\u0014HSQVFNS\f KIN>PK");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[1];
            short sXd2 = (short) (C1633zX.Xd() ^ (-27874));
            int[] iArr2 = new int["80F2\u007f?5C=\u0005+MLDJD".length()];
            QB qb2 = new QB("80F2\u007f?5C=\u0005+MLDJD");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr = {strZd};
            Method method = cls.getMethod(Wg.Zd("\u00039wI\u001e~+\u00037\u007fAAs\u001d\u0003>", (short) (Od.Xd() ^ (-16145)), (short) (Od.Xd() ^ (-7413))), clsArr);
            try {
                method.setAccessible(true);
                Object objInvoke = method.invoke(context, objArr);
                short sXd3 = (short) (ZN.Xd() ^ 5872);
                int[] iArr3 = new int["?G?@t98FGIO{?C~CBUW\u0004YU\u0007VXX\u0018ZbZ[\u0010ekcY\u0015We\\kid`+thex0lru{{un~s{q<X~\u0002\b\baz\u000b\u007f\b}g|\u000b~\u0006\u0005\u0013".length()];
                QB qb3 = new QB("?G?@t98FGIO{?C~CBUW\u0004YU\u0007VXX\u0018ZbZ[\u0010ekcY\u0015We\\kid`+thex0lru{{un~s{q<X~\u0002\b\baz\u000b\u007f\b}g|\u000b~\u0006\u0005\u0013");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 + i4));
                    i4++;
                }
                Intrinsics.checkNotNull(objInvoke, new String(iArr3, 0, i4));
                return (android.view.inputmethod.InputMethodManager) objInvoke;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    });
    private final SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat;
    private final View view;

    public InputMethodManagerImpl(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
    }

    private final android.view.inputmethod.InputMethodManager getImm() {
        return (android.view.inputmethod.InputMethodManager) this.imm$delegate.getValue();
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public boolean isActive() {
        return getImm().isActive(this.view);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void restartInput() {
        getImm().restartInput(this.view);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void showSoftInput() {
        this.softwareKeyboardControllerCompat.show();
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void hideSoftInput() {
        this.softwareKeyboardControllerCompat.hide();
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void updateExtractedText(int i2, ExtractedText extractedText) {
        getImm().updateExtractedText(this.view, i2, extractedText);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void updateSelection(int i2, int i3, int i4, int i5) {
        getImm().updateSelection(this.view, i2, i3, i4, i5);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        getImm().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void startStylusHandwriting() {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34StartStylusHandwriting.INSTANCE.startStylusHandwriting(getImm(), this.view);
        }
    }
}
