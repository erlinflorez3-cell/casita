package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: NestedScrollModifier.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\rnjO0LeN1ZS@\u000fs{:)c$\bCCU \u0001*\teNo˧vJp\u000bK\u000f\f\u001d~oBկ\u0006x\f\u0011O5Բs?AM8^Gy\r63:b&F\u0015\u001d\u0001HDx\u0014\u0005\u0017[K:,vϒ/ŦQ҈̂\t\u001c\u0018#L>IDj\u0007f6v\r\u000e>=>\u001bipnWc>\u0019e\rttW\u0011\u0005\u00036+nYÆ\u0014Ǭ٨\u0007\tX~M'\b\u000bK*\u0001'UEyweRp\u007fB/q̄Kȗq̦ػ\tSf25R\u0018\u0002Yx&(&\u001b,\u0011J &\u0006Uh^1(\b \u000ea\u0017ʺRóг\u0006`H)\t\f\u000773\u0001K3I\u001fvSw:GQe}[ٽ*ţ\u0005z)żl\u0010f\u0019)Y\u0018S7WND\u0019]\u0018aUm2s\u0019Fò\b4_\u00025\u0005\u001f8g?EfQ%7j0T\u001bϚ\u0003ݶdt[֟jJF/|$W,\u000f\u001bhT5\u0019yalZB\u0010{.\u000bETܲ\u0015ء`{T#+#\\c9\u0004xbu\f;.\u0015:0ʥwް[EfڨMSi&o\\\u0017\u0016ESp\u001d֝fG[\u000f`ڄDP1ʴn;"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UU+UWJ;ZUrJi", "", "u(E", "1`[0h3:b\u0019gzl;|\b\u001dc\r2\u0003Gn\u0015!Ro", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "5dc\u0010T3<c z\n^\u0015|\u0017>e~\u0016yM\u000b\u001e\u001e5m\u0018GvcE]w-7t\u0016*[C", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "Adc\u0010T3<c z\n^\u0015|\u0017>e~\u0016yM\u000b\u001e\u001e5m\u0018GvcE]w-7t\u0016*[C", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", "1na<h;B\\\u0019lxh7|", "5dc\u0010b9Hc(\u0003\u0004^\u001az\u0013:e", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt!Ty\u001eKz.5G{*Bmk", "<dbAX+,Q&\t\u0002e\u0015\u0007\b/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3U_1FL$", "5dc\u001bX:MS\u0018lxk6\u0004\u0010\u0018o~(:P\u0005\u0011$Gv\u000e8\u0005%", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@.5g\r 6{\u0014;WJB5\u001d\u001e#wa8ta9X}.0VM,2", "Adc\u001bX:MS\u0018lxk6\u0004\u0010\u0018o~(:P\u0005\u0011$Gv\u000e8\u0005%", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u007f%Ch}\u001fEk#8TJ\u0005T4,$h`'\u0005p6U}\u0010QKN\u0002 C", ">`a2a;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UT1PUN*kV|Fi", "5dc\u001dT9>\\(=\u000bb&\n\t6e{6{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@.5g\r 6{\u0014;WJB5\u001d\u001e#wa8ta9X}.%VW5\\P\u0002A\u001e\u001b0", "Ab^=X", "5dc V6ISW\u000f~X9|\u0010/a\u000e(", "Adc V6ISW\u000f~X9|\u0010/a\u000e(", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7CY\u001f", "2hb=T;<V\u0004\t\tm\r\u0004\r8g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "1n]@h4>R", "/uP6_(;Z\u0019", "2hb=T;<V\u0004\t\tm\r\u0004\r8gG\u0015p\r\u0005r\b;", "uI9\u0019^6MZ\u001d\bD\\6\n\u0013?t\u00041{NJt!P~\u0012E\u0007!D]\b)\r1|3IT75;\u001a\u001ej+#\u0004h,L\u0006|", "2hb=T;<V\u0004\t\tm\u001az\u00169l\u0007", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "And?V,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3Ud1WYL,2", "2hb=T;<V\u0004\t\tm\u001az\u00169l\u0007oZUj\u0003\u000b\u0012W", "uI9\u0016\u001c\u0011", "2hb=T;<V\u0004\fz?3\u0001\u00121", "2hb=T;<V\u0004\fz?3\u0001\u00121-k\u001a\u0006HL~!", "uI;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007uzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "2hb=T;<V\u0004\fzL*\n\u00136l", "2hb=T;<V\u0004\fzL*\n\u00136lG\u0012\u0011\u001fL\u0013tM", "uI8u=", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class NestedScrollDispatcher {
    public static final int $stable = 8;
    private Function0<? extends CoroutineScope> calculateNestedScrollScope = new Function0<CoroutineScope>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineScope invoke() {
            return this.this$0.getScope$ui_release();
        }
    };
    private NestedScrollNode nestedScrollNode;
    private CoroutineScope scope;

    public final NestedScrollNode getNestedScrollNode$ui_release() {
        return this.nestedScrollNode;
    }

    public final void setNestedScrollNode$ui_release(NestedScrollNode nestedScrollNode) {
        this.nestedScrollNode = nestedScrollNode;
    }

    public final Function0<CoroutineScope> getCalculateNestedScrollScope$ui_release() {
        return this.calculateNestedScrollScope;
    }

    public final void setCalculateNestedScrollScope$ui_release(Function0<? extends CoroutineScope> function0) {
        this.calculateNestedScrollScope = function0;
    }

    public final CoroutineScope getScope$ui_release() {
        return this.scope;
    }

    public final void setScope$ui_release(CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }

    public final CoroutineScope getCoroutineScope() {
        CoroutineScope coroutineScopeInvoke = this.calculateNestedScrollScope.invoke();
        if (coroutineScopeInvoke != null) {
            return coroutineScopeInvoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final NestedScrollConnection getParent$ui_release() {
        NestedScrollNode nestedScrollNode = this.nestedScrollNode;
        return nestedScrollNode != null ? nestedScrollNode.getParentNestedScrollNode$ui_release() : null;
    }

    /* JADX INFO: renamed from: dispatchPreScroll-OzD1aCk, reason: not valid java name */
    public final long m5264dispatchPreScrollOzD1aCk(long j2, int i2) {
        NestedScrollConnection parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo1094onPreScrollOzD1aCk(j2, i2) : Offset.Companion.m3953getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: dispatchPostScroll-DzOQY0M, reason: not valid java name */
    public final long m5262dispatchPostScrollDzOQY0M(long j2, long j3, int i2) {
        NestedScrollConnection parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo820onPostScrollDzOQY0M(j2, j3, i2) : Offset.Companion.m3953getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX INFO: renamed from: dispatchPreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m5263dispatchPreFlingQWom1Mo(long r6, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L47
            r4 = r8
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r4 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L47
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L13:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L4d
            kotlin.ResultKt.throwOnFailure(r3)
        L23:
            androidx.compose.ui.unit.Velocity r3 = (androidx.compose.ui.unit.Velocity) r3
            long r0 = r3.m6884unboximpl()
        L29:
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m6866boximpl(r0)
            return r0
        L2e:
            kotlin.ResultKt.throwOnFailure(r3)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r0 = r5.getParent$ui_release()
            if (r0 == 0) goto L40
            r4.label = r1
            java.lang.Object r3 = r0.mo1093onPreFlingQWom1Mo(r6, r4)
            if (r3 != r2) goto L23
            return r2
        L40:
            androidx.compose.ui.unit.Velocity$Companion r0 = androidx.compose.ui.unit.Velocity.Companion
            long r0 = r0.m6886getZero9UxMQ8M()
            goto L29
        L47:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r4 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r4.<init>(r5, r8)
            goto L13
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.m5263dispatchPreFlingQWom1Mo(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX INFO: renamed from: dispatchPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m5261dispatchPostFlingRZ2iAVY(long r10, long r12, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L4c
            r8 = r14
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r8 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L4c
            int r0 = r8.label
            int r0 = r0 - r1
            r8.label = r0
        L16:
            java.lang.Object r3 = r8.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r0 = 1
            if (r1 == 0) goto L31
            if (r1 != r0) goto L52
            kotlin.ResultKt.throwOnFailure(r3)
        L26:
            androidx.compose.ui.unit.Velocity r3 = (androidx.compose.ui.unit.Velocity) r3
            long r0 = r3.m6884unboximpl()
        L2c:
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m6866boximpl(r0)
            return r0
        L31:
            kotlin.ResultKt.throwOnFailure(r3)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r3 = r9.getParent$ui_release()
            if (r3 == 0) goto L45
            r8.label = r0
            r6 = r12
            r4 = r10
            java.lang.Object r3 = r3.mo819onPostFlingRZ2iAVY(r4, r6, r8)
            if (r3 != r2) goto L26
            return r2
        L45:
            androidx.compose.ui.unit.Velocity$Companion r0 = androidx.compose.ui.unit.Velocity.Companion
            long r0 = r0.m6886getZero9UxMQ8M()
            goto L2c
        L4c:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r8 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r8.<init>(r9, r14)
            goto L16
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.m5261dispatchPostFlingRZ2iAVY(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
