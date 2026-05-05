package com.drew.metadata.jpeg;

import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class HuffmanTablesDescriptor extends TagDescriptor<HuffmanTablesDirectory> {
    public HuffmanTablesDescriptor(HuffmanTablesDirectory huffmanTablesDirectory) {
        super(huffmanTablesDirectory);
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 1 ? super.getDescription(i2) : getNumberOfTablesDescription();
    }

    public String getNumberOfTablesDescription() {
        Integer integer = ((HuffmanTablesDirectory) this._directory).getInteger(1);
        if (integer == null) {
            return null;
        }
        return integer + (integer.intValue() == 1 ? " Huffman table" : " Huffman tables");
    }
}
