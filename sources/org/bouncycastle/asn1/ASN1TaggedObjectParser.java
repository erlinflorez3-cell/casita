package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface ASN1TaggedObjectParser extends ASN1Encodable, InMemoryRepresentable {
    ASN1Encodable getObjectParser(int i2, boolean z2) throws IOException;

    int getTagNo();
}
