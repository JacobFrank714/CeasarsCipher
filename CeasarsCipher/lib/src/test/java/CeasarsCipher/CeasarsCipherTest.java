package CeasarsCipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CeasarsCipherTest {
    private ceasarsCipher caesercipher = new ceasarsCipher();

    @Test
    void testCipheredMessafeWithOffsetOf12() {
        assertEquals("tai mdq kag pauzs fapmk", caesercipher.cipher("how are you doing today", 12));
    }
    
    @Test
    void testEmptyString() {
        assertEquals("", caesercipher.cipher("", 12));
    }

    @Test
    void testCipheredMessafeWithOffsetOf11() {
        assertEquals("tai mdq kag pauzs fapmk", caesercipher.cipher("how are you doing today", 11));
    }
}
