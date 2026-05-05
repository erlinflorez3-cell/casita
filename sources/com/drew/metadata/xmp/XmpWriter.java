package com.drew.metadata.xmp;

import com.adobe.internal.xmp.XMPException;
import com.adobe.internal.xmp.XMPMetaFactory;
import com.adobe.internal.xmp.options.SerializeOptions;
import com.drew.metadata.Metadata;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class XmpWriter {
    public static boolean write(OutputStream outputStream, Metadata metadata) throws XMPException {
        XmpDirectory xmpDirectory = (XmpDirectory) metadata.getFirstDirectoryOfType(XmpDirectory.class);
        if (xmpDirectory == null) {
            return false;
        }
        XMPMetaFactory.serialize(xmpDirectory.getXMPMeta(), outputStream, new SerializeOptions().setOmitPacketWrapper(true));
        return true;
    }
}
