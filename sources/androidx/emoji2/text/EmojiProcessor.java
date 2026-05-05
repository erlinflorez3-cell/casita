package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.MetadataRepo;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class EmojiProcessor {
    private static final int ACTION_ADVANCE_BOTH = 1;
    private static final int ACTION_ADVANCE_END = 2;
    private static final int ACTION_FLUSH = 3;
    private static final int MAX_LOOK_AROUND_CHARACTER = 16;
    private final int[] mEmojiAsDefaultStyleExceptions;
    private EmojiCompat.GlyphChecker mGlyphChecker;
    private final MetadataRepo mMetadataRepo;
    private final EmojiCompat.SpanFactory mSpanFactory;
    private final boolean mUseEmojiAsDefaultStyle;

    private interface EmojiProcessCallback<T> {
        T getResult();

        boolean handleEmoji(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    private static boolean hasInvalidSelection(int i2, int i3) {
        return i2 == -1 || i3 == -1 || i2 != i3;
    }

    EmojiProcessor(MetadataRepo metadataRepo, EmojiCompat.SpanFactory spanFactory, EmojiCompat.GlyphChecker glyphChecker, boolean z2, int[] iArr, Set<int[]> set) {
        this.mSpanFactory = spanFactory;
        this.mMetadataRepo = metadataRepo;
        this.mGlyphChecker = glyphChecker;
        this.mUseEmojiAsDefaultStyle = z2;
        this.mEmojiAsDefaultStyleExceptions = iArr;
        initExclusions(set);
    }

    private void initExclusions(Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            process(str, 0, str.length(), 1, true, new MarkExclusionCallback(str));
        }
    }

    int getEmojiMatch(CharSequence charSequence) {
        return getEmojiMatch(charSequence, this.mMetadataRepo.getMetadataVersion());
    }

    int getEmojiMatch(CharSequence charSequence, int i2) {
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int length = charSequence.length();
        int iCharCount = 0;
        int i3 = 0;
        int i4 = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            int iCheck = processorSm.check(iCodePointAt);
            TypefaceEmojiRasterizer currentMetadata = processorSm.getCurrentMetadata();
            if (iCheck == 1) {
                iCharCount += Character.charCount(iCodePointAt);
                i4 = 0;
            } else if (iCheck == 2) {
                iCharCount += Character.charCount(iCodePointAt);
            } else if (iCheck == 3) {
                currentMetadata = processorSm.getFlushMetadata();
                if (currentMetadata.getCompatAdded() <= i2) {
                    i3++;
                }
            }
            if (currentMetadata != null && currentMetadata.getCompatAdded() <= i2) {
                i4++;
            }
        }
        if (i3 != 0) {
            return 2;
        }
        if (!processorSm.isInFlushableState() || processorSm.getCurrentMetadata().getCompatAdded() > i2) {
            return i4 == 0 ? 0 : 2;
        }
        return 1;
    }

    int getEmojiStart(CharSequence charSequence, int i2) {
        if (i2 >= 0 && i2 < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i2, i2 + 1, EmojiSpan.class);
                if (emojiSpanArr.length > 0) {
                    return spanned.getSpanStart(emojiSpanArr[0]);
                }
            }
            return ((EmojiProcessLookupCallback) process(charSequence, Math.max(0, i2 - 16), Math.min(charSequence.length(), i2 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i2))).start;
        }
        return -1;
    }

    int getEmojiEnd(CharSequence charSequence, int i2) {
        if (i2 >= 0 && i2 < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i2, i2 + 1, EmojiSpan.class);
                if (emojiSpanArr.length > 0) {
                    return spanned.getSpanEnd(emojiSpanArr[0]);
                }
            }
            return ((EmojiProcessLookupCallback) process(charSequence, Math.max(0, i2 - 16), Math.min(charSequence.length(), i2 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i2))).end;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018 A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:6:0x0014, B:9:0x0021, B:11:0x0025, B:13:0x0034, B:17:0x003e, B:19:0x0048, B:21:0x004b, B:23:0x004f, B:25:0x005b, B:26:0x005e, B:28:0x006b, B:34:0x0079, B:35:0x0087, B:37:0x0099, B:8:0x0018), top: B:51:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.CharSequence process(java.lang.CharSequence r16, int r17, int r18, int r19, boolean r20) {
        /*
            r15 = this;
            r9 = r16
            r12 = r19
            r11 = r18
            r10 = r17
            boolean r2 = r9 instanceof androidx.emoji2.text.SpannableBuilder
            if (r2 == 0) goto L12
            r0 = r9
            androidx.emoji2.text.SpannableBuilder r0 = (androidx.emoji2.text.SpannableBuilder) r0
            r0.beginBatchEdit()
        L12:
            if (r2 != 0) goto L18
            boolean r0 = r9 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto L21
        L18:
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r3 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> Lb7
            r0 = r9
            android.text.Spannable r0 = (android.text.Spannable) r0     // Catch: java.lang.Throwable -> Lb7
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lb7
            goto L3b
        L21:
            boolean r0 = r9 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto L3a
            r4 = r9
            android.text.Spanned r4 = (android.text.Spanned) r4     // Catch: java.lang.Throwable -> Lb7
            int r3 = r10 + (-1)
            int r1 = r11 + 1
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r0 = androidx.emoji2.text.EmojiSpan.class
            int r0 = r4.nextSpanTransition(r3, r1, r0)     // Catch: java.lang.Throwable -> Lb7
            if (r0 > r11) goto L3a
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r3 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> Lb7
            r3.<init>(r9)     // Catch: java.lang.Throwable -> Lb7
            goto L3b
        L3a:
            r3 = 0
        L3b:
            r6 = 0
            if (r3 == 0) goto L69
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r0 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r8 = r3.getSpans(r10, r11, r0)     // Catch: java.lang.Throwable -> Lb7
            androidx.emoji2.text.EmojiSpan[] r8 = (androidx.emoji2.text.EmojiSpan[]) r8     // Catch: java.lang.Throwable -> Lb7
            if (r8 == 0) goto L69
            int r0 = r8.length     // Catch: java.lang.Throwable -> Lb7
            if (r0 <= 0) goto L69
            int r7 = r8.length     // Catch: java.lang.Throwable -> Lb7
            r5 = r6
        L4d:
            if (r5 >= r7) goto L69
            r4 = r8[r5]     // Catch: java.lang.Throwable -> Lb7
            int r1 = r3.getSpanStart(r4)     // Catch: java.lang.Throwable -> Lb7
            int r0 = r3.getSpanEnd(r4)     // Catch: java.lang.Throwable -> Lb7
            if (r1 == r11) goto L5e
            r3.removeSpan(r4)     // Catch: java.lang.Throwable -> Lb7
        L5e:
            int r10 = java.lang.Math.min(r1, r10)     // Catch: java.lang.Throwable -> Lb7
            int r11 = java.lang.Math.max(r0, r11)     // Catch: java.lang.Throwable -> Lb7
            int r5 = r5 + 1
            goto L4d
        L69:
            if (r10 == r11) goto Lae
            int r0 = r9.length()     // Catch: java.lang.Throwable -> Lb7
            if (r10 < r0) goto L72
            goto Lae
        L72:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r12 == r0) goto L87
            if (r3 == 0) goto L87
            int r1 = r3.length()     // Catch: java.lang.Throwable -> Lb7
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r0 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r0 = r3.getSpans(r6, r1, r0)     // Catch: java.lang.Throwable -> Lb7
            androidx.emoji2.text.EmojiSpan[] r0 = (androidx.emoji2.text.EmojiSpan[]) r0     // Catch: java.lang.Throwable -> Lb7
            int r0 = r0.length     // Catch: java.lang.Throwable -> Lb7
            int r12 = r12 - r0
        L87:
            androidx.emoji2.text.EmojiProcessor$EmojiProcessAddSpanCallback r14 = new androidx.emoji2.text.EmojiProcessor$EmojiProcessAddSpanCallback     // Catch: java.lang.Throwable -> Lb7
            androidx.emoji2.text.EmojiCompat$SpanFactory r0 = r15.mSpanFactory     // Catch: java.lang.Throwable -> Lb7
            r14.<init>(r3, r0)     // Catch: java.lang.Throwable -> Lb7
            r8 = r15
            r13 = r20
            java.lang.Object r0 = r8.process(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> Lb7
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r0 = (androidx.emoji2.text.UnprecomputeTextOnModificationSpannable) r0     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto La5
            android.text.Spannable r0 = r0.getUnwrappedSpannable()     // Catch: java.lang.Throwable -> Lb7
            if (r2 == 0) goto La4
            androidx.emoji2.text.SpannableBuilder r9 = (androidx.emoji2.text.SpannableBuilder) r9
            r9.endBatchEdit()
        La4:
            return r0
        La5:
            if (r2 == 0) goto Lad
            r0 = r9
            androidx.emoji2.text.SpannableBuilder r0 = (androidx.emoji2.text.SpannableBuilder) r0
            r0.endBatchEdit()
        Lad:
            return r9
        Lae:
            if (r2 == 0) goto Lb6
            r0 = r9
            androidx.emoji2.text.SpannableBuilder r0 = (androidx.emoji2.text.SpannableBuilder) r0
            r0.endBatchEdit()
        Lb6:
            return r9
        Lb7:
            r0 = move-exception
            if (r2 == 0) goto Lbf
            androidx.emoji2.text.SpannableBuilder r9 = (androidx.emoji2.text.SpannableBuilder) r9
            r9.endBatchEdit()
        Lbf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.EmojiProcessor.process(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    private <T> T process(CharSequence charSequence, int i2, int i3, int i4, boolean z2, EmojiProcessCallback<T> emojiProcessCallback) {
        int iCharCount;
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int iCodePointAt = Character.codePointAt(charSequence, i2);
        int i5 = 0;
        boolean zHandleEmoji = true;
        loop0: while (true) {
            iCharCount = i2;
            while (i2 < i3 && i5 < i4 && zHandleEmoji) {
                int iCheck = processorSm.check(iCodePointAt);
                if (iCheck == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i3) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i2 = iCharCount;
                } else if (iCheck == 2) {
                    i2 += Character.charCount(iCodePointAt);
                    if (i2 < i3) {
                        iCodePointAt = Character.codePointAt(charSequence, i2);
                    }
                } else if (iCheck == 3) {
                    if (z2 || !hasGlyph(charSequence, iCharCount, i2, processorSm.getFlushMetadata())) {
                        zHandleEmoji = emojiProcessCallback.handleEmoji(charSequence, iCharCount, i2, processorSm.getFlushMetadata());
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (processorSm.isInFlushableState() && i5 < i4 && zHandleEmoji && (z2 || !hasGlyph(charSequence, iCharCount, i2, processorSm.getCurrentMetadata()))) {
            emojiProcessCallback.handleEmoji(charSequence, iCharCount, i2, processorSm.getCurrentMetadata());
        }
        return emojiProcessCallback.getResult();
    }

    static boolean handleOnKeyDown(Editable editable, int i2, KeyEvent keyEvent) {
        boolean zDelete;
        if (i2 == 67) {
            zDelete = delete(editable, keyEvent, false);
        } else {
            zDelete = i2 != 112 ? false : delete(editable, keyEvent, true);
        }
        if (!zDelete) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private static boolean delete(Editable editable, KeyEvent keyEvent, boolean z2) {
        EmojiSpan[] emojiSpanArr;
        if (hasModifiers(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!hasInvalidSelection(selectionStart, selectionEnd) && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            for (EmojiSpan emojiSpan : emojiSpanArr) {
                int spanStart = editable.getSpanStart(emojiSpan);
                int spanEnd = editable.getSpanEnd(emojiSpan);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean handleDeleteSurroundingText(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z2) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i2 >= 0 && i3 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (hasInvalidSelection(selectionStart, selectionEnd)) {
                return false;
            }
            if (z2) {
                iMax = CodepointIndexFinder.findIndexBackward(editable, selectionStart, Math.max(i2, 0));
                iMin = CodepointIndexFinder.findIndexForward(editable, selectionEnd, Math.max(i3, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i2, 0);
                iMin = Math.min(selectionEnd + i3, editable.length());
            }
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) editable.getSpans(iMax, iMin, EmojiSpan.class);
            if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                for (EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart = editable.getSpanStart(emojiSpan);
                    int spanEnd = editable.getSpanEnd(emojiSpan);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    private static boolean hasModifiers(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private boolean hasGlyph(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if (typefaceEmojiRasterizer.getHasGlyph() == 0) {
            typefaceEmojiRasterizer.setHasGlyph(this.mGlyphChecker.hasGlyph(charSequence, i2, i3, typefaceEmojiRasterizer.getSdkAdded()));
        }
        return typefaceEmojiRasterizer.getHasGlyph() == 2;
    }

    static final class ProcessorSm {
        private static final int STATE_DEFAULT = 1;
        private static final int STATE_WALKING = 2;
        private int mCurrentDepth;
        private MetadataRepo.Node mCurrentNode;
        private final int[] mEmojiAsDefaultStyleExceptions;
        private MetadataRepo.Node mFlushNode;
        private int mLastCodepoint;
        private final MetadataRepo.Node mRootNode;
        private int mState = 1;
        private final boolean mUseEmojiAsDefaultStyle;

        private static boolean isEmojiStyle(int i2) {
            return i2 == 65039;
        }

        private static boolean isTextStyle(int i2) {
            return i2 == 65038;
        }

        ProcessorSm(MetadataRepo.Node node, boolean z2, int[] iArr) {
            this.mRootNode = node;
            this.mCurrentNode = node;
            this.mUseEmojiAsDefaultStyle = z2;
            this.mEmojiAsDefaultStyleExceptions = iArr;
        }

        int check(int i2) {
            MetadataRepo.Node node = this.mCurrentNode.get(i2);
            int iReset = 2;
            if (this.mState != 2) {
                if (node == null) {
                    iReset = reset();
                } else {
                    this.mState = 2;
                    this.mCurrentNode = node;
                    this.mCurrentDepth = 1;
                }
            } else if (node != null) {
                this.mCurrentNode = node;
                this.mCurrentDepth++;
            } else if (isTextStyle(i2)) {
                iReset = reset();
            } else if (!isEmojiStyle(i2)) {
                if (this.mCurrentNode.getData() != null) {
                    iReset = 3;
                    if (this.mCurrentDepth != 1 || shouldUseEmojiPresentationStyleForSingleCodepoint()) {
                        this.mFlushNode = this.mCurrentNode;
                        reset();
                    } else {
                        iReset = reset();
                    }
                } else {
                    iReset = reset();
                }
            }
            this.mLastCodepoint = i2;
            return iReset;
        }

        private int reset() {
            this.mState = 1;
            this.mCurrentNode = this.mRootNode;
            this.mCurrentDepth = 0;
            return 1;
        }

        TypefaceEmojiRasterizer getFlushMetadata() {
            return this.mFlushNode.getData();
        }

        TypefaceEmojiRasterizer getCurrentMetadata() {
            return this.mCurrentNode.getData();
        }

        boolean isInFlushableState() {
            return this.mState == 2 && this.mCurrentNode.getData() != null && (this.mCurrentDepth > 1 || shouldUseEmojiPresentationStyleForSingleCodepoint());
        }

        private boolean shouldUseEmojiPresentationStyleForSingleCodepoint() {
            if (this.mCurrentNode.getData().isDefaultEmoji() || isEmojiStyle(this.mLastCodepoint)) {
                return true;
            }
            if (this.mUseEmojiAsDefaultStyle) {
                if (this.mEmojiAsDefaultStyleExceptions == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.mEmojiAsDefaultStyleExceptions, this.mCurrentNode.getData().getCodepointAt(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    private static final class CodepointIndexFinder {
        private static final int INVALID_INDEX = -1;

        private CodepointIndexFinder() {
        }

        static int findIndexBackward(CharSequence charSequence, int i2, int i3) {
            int length = charSequence.length();
            if (i2 < 0 || length < i2 || i3 < 0) {
                return -1;
            }
            while (true) {
                boolean z2 = false;
                while (i3 != 0) {
                    i2--;
                    if (i2 < 0) {
                        return z2 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i2);
                    if (z2) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i3--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i3--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z2 = true;
                    }
                }
                return i2;
            }
        }

        static int findIndexForward(CharSequence charSequence, int i2, int i3) {
            int length = charSequence.length();
            if (i2 < 0 || length < i2 || i3 < 0) {
                return -1;
            }
            while (true) {
                boolean z2 = false;
                while (i3 != 0) {
                    if (i2 >= length) {
                        if (z2) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i2);
                    if (z2) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i3--;
                        i2++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i3--;
                        i2++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2++;
                        z2 = true;
                    }
                }
                return i2;
            }
        }
    }

    private static class EmojiProcessAddSpanCallback implements EmojiProcessCallback<UnprecomputeTextOnModificationSpannable> {
        private final EmojiCompat.SpanFactory mSpanFactory;
        public UnprecomputeTextOnModificationSpannable spannable;

        EmojiProcessAddSpanCallback(UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable, EmojiCompat.SpanFactory spanFactory) {
            this.spannable = unprecomputeTextOnModificationSpannable;
            this.mSpanFactory = spanFactory;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            Spannable spannableString;
            if (typefaceEmojiRasterizer.isPreferredSystemRender()) {
                return true;
            }
            if (this.spannable == null) {
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                this.spannable = new UnprecomputeTextOnModificationSpannable(spannableString);
            }
            this.spannable.setSpan(this.mSpanFactory.createSpan(typefaceEmojiRasterizer), i2, i3, 33);
            return true;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public UnprecomputeTextOnModificationSpannable getResult() {
            return this.spannable;
        }
    }

    private static class EmojiProcessLookupCallback implements EmojiProcessCallback<EmojiProcessLookupCallback> {
        private final int mOffset;
        public int start = -1;
        public int end = -1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public EmojiProcessLookupCallback getResult() {
            return this;
        }

        EmojiProcessLookupCallback(int i2) {
            this.mOffset = i2;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            int i4 = this.mOffset;
            if (i2 > i4 || i4 >= i3) {
                return i3 <= i4;
            }
            this.start = i2;
            this.end = i3;
            return false;
        }
    }

    private static class MarkExclusionCallback implements EmojiProcessCallback<MarkExclusionCallback> {
        private final String mExclusion;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public MarkExclusionCallback getResult() {
            return this;
        }

        MarkExclusionCallback(String str) {
            this.mExclusion = str;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (!TextUtils.equals(charSequence.subSequence(i2, i3), this.mExclusion)) {
                return true;
            }
            typefaceEmojiRasterizer.setExclusion(true);
            return false;
        }
    }
}
