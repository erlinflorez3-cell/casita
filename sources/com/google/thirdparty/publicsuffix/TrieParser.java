package com.google.thirdparty.publicsuffix;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Queues;
import java.util.Deque;

/* JADX INFO: loaded from: classes7.dex */
final class TrieParser {
    private static final Joiner DIRECT_JOINER = Joiner.on("");

    TrieParser() {
    }

    private static int doParseTrieToBuilder(Deque<CharSequence> stack, CharSequence encoded, int start, ImmutableMap.Builder<String, PublicSuffixType> builder) {
        int length = encoded.length();
        char cCharAt = 0;
        int i2 = start;
        while (i2 < length && (cCharAt = encoded.charAt(i2)) != '&' && cCharAt != '?' && cCharAt != '!' && cCharAt != ':' && cCharAt != ',') {
            i2++;
        }
        stack.push(reverse(encoded.subSequence(start, i2)));
        if (cCharAt == '!' || cCharAt == '?' || cCharAt == ':' || cCharAt == ',') {
            String strJoin = DIRECT_JOINER.join(stack);
            if (strJoin.length() > 0) {
                builder.put(strJoin, PublicSuffixType.fromCode(cCharAt));
            }
        }
        int iDoParseTrieToBuilder = i2 + 1;
        if (cCharAt != '?' && cCharAt != ',') {
            while (iDoParseTrieToBuilder < length) {
                iDoParseTrieToBuilder += doParseTrieToBuilder(stack, encoded, iDoParseTrieToBuilder, builder);
                if (encoded.charAt(iDoParseTrieToBuilder) == '?' || encoded.charAt(iDoParseTrieToBuilder) == ',') {
                    iDoParseTrieToBuilder++;
                    break;
                }
            }
        }
        stack.pop();
        return iDoParseTrieToBuilder - start;
    }

    static ImmutableMap<String, PublicSuffixType> parseFullString(String encoded) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int length = encoded.length();
        int iDoParseTrieToBuilder = 0;
        while (iDoParseTrieToBuilder < length) {
            iDoParseTrieToBuilder += doParseTrieToBuilder(Queues.newArrayDeque(), encoded, iDoParseTrieToBuilder, builder);
        }
        return builder.buildOrThrow();
    }

    static ImmutableMap<String, PublicSuffixType> parseTrie(CharSequence... encodedChunks) {
        return parseFullString(DIRECT_JOINER.join(encodedChunks));
    }

    private static CharSequence reverse(CharSequence s2) {
        return new StringBuilder(s2).reverse();
    }
}
