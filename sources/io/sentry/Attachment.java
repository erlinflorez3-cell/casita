package io.sentry;

import com.biocatch.client.android.sdk.core.Constants;
import com.reactnativecommunity.clipboard.ClipboardModule;
import io.sentry.protocol.ViewHierarchy;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class Attachment {
    private static final String DEFAULT_ATTACHMENT_TYPE = "event.attachment";
    private static final String VIEW_HIERARCHY_ATTACHMENT_TYPE = "event.view_hierarchy";
    private final boolean addToTransactions;
    private String attachmentType;
    private final Callable<byte[]> byteProvider;
    private byte[] bytes;
    private final String contentType;
    private final String filename;
    private String pathname;
    private final JsonSerializable serializable;

    public Attachment(JsonSerializable jsonSerializable, String str, String str2, String str3, boolean z2) {
        this.bytes = null;
        this.serializable = jsonSerializable;
        this.byteProvider = null;
        this.filename = str;
        this.contentType = str2;
        this.attachmentType = str3;
        this.addToTransactions = z2;
    }

    public Attachment(String str) {
        this(str, new File(str).getName());
    }

    public Attachment(String str, String str2) {
        this(str, str2, (String) null);
    }

    public Attachment(String str, String str2, String str3) {
        this(str, str2, str3, DEFAULT_ATTACHMENT_TYPE, false);
    }

    public Attachment(String str, String str2, String str3, String str4, boolean z2) {
        this.pathname = str;
        this.filename = str2;
        this.serializable = null;
        this.byteProvider = null;
        this.contentType = str3;
        this.attachmentType = str4;
        this.addToTransactions = z2;
    }

    public Attachment(String str, String str2, String str3, boolean z2) {
        this.attachmentType = DEFAULT_ATTACHMENT_TYPE;
        this.pathname = str;
        this.filename = str2;
        this.serializable = null;
        this.byteProvider = null;
        this.contentType = str3;
        this.addToTransactions = z2;
    }

    public Attachment(String str, String str2, String str3, boolean z2, String str4) {
        this.pathname = str;
        this.filename = str2;
        this.serializable = null;
        this.byteProvider = null;
        this.contentType = str3;
        this.addToTransactions = z2;
        this.attachmentType = str4;
    }

    public Attachment(Callable<byte[]> callable, String str, String str2, String str3, boolean z2) {
        this.bytes = null;
        this.serializable = null;
        this.byteProvider = callable;
        this.filename = str;
        this.contentType = str2;
        this.attachmentType = str3;
        this.addToTransactions = z2;
    }

    public Attachment(byte[] bArr, String str) {
        this(bArr, str, (String) null);
    }

    public Attachment(byte[] bArr, String str, String str2) {
        this(bArr, str, str2, false);
    }

    public Attachment(byte[] bArr, String str, String str2, String str3, boolean z2) {
        this.bytes = bArr;
        this.serializable = null;
        this.byteProvider = null;
        this.filename = str;
        this.contentType = str2;
        this.attachmentType = str3;
        this.addToTransactions = z2;
    }

    public Attachment(byte[] bArr, String str, String str2, boolean z2) {
        this(bArr, str, str2, DEFAULT_ATTACHMENT_TYPE, z2);
    }

    public static Attachment fromByteProvider(Callable<byte[]> callable, String str, String str2, boolean z2) {
        return new Attachment(callable, str, str2, DEFAULT_ATTACHMENT_TYPE, z2);
    }

    public static Attachment fromScreenshot(byte[] bArr) {
        return new Attachment(bArr, "screenshot.png", ClipboardModule.MIMETYPE_PNG, false);
    }

    public static Attachment fromThreadDump(byte[] bArr) {
        return new Attachment(bArr, "thread-dump.txt", "text/plain", false);
    }

    public static Attachment fromViewHierarchy(ViewHierarchy viewHierarchy) {
        return new Attachment((JsonSerializable) viewHierarchy, "view-hierarchy.json", Constants.WUP_CONTENT_TYPE, VIEW_HIERARCHY_ATTACHMENT_TYPE, false);
    }

    public String getAttachmentType() {
        return this.attachmentType;
    }

    public Callable<byte[]> getByteProvider() {
        return this.byteProvider;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getFilename() {
        return this.filename;
    }

    public String getPathname() {
        return this.pathname;
    }

    public JsonSerializable getSerializable() {
        return this.serializable;
    }

    boolean isAddToTransactions() {
        return this.addToTransactions;
    }
}
