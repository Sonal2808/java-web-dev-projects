package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
           @Test
        public void testEmptyString() {
            assertTrue(BalancedBrackets.hasBalancedBrackets(""));
        }

        @Test
        public void testSinglePairOfBrackets() {
            assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        }

        @Test
        public void testNestedBrackets() {
            assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
        }

        @Test
        public void testMixedBrackets() {
            assertTrue(BalancedBrackets.hasBalancedBrackets("{[()]}"));
        }

        @Test
        public void testMissingClosingBracket() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        }

        @Test
        public void testMissingOpeningBracket() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
        }

        @Test
        public void testUnbalancedBracketsOrder() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
        }

        @Test
        public void testUnbalancedNestedBrackets() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]"));
        }

        @Test
        public void testExtraClosingBracket() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]]"));
        }

        @Test
        public void testExtraOpeningBracket() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]"));
        }

        @Test
        public void testNonBracketCharacters() {
            assertTrue(BalancedBrackets.hasBalancedBrackets("Hello [World]!"));
        }

        @Test
        public void testComplexExpression() {
            assertTrue(BalancedBrackets.hasBalancedBrackets("if (x > 0 && (y < 10 || z == 5)) { return true; }"));
        }


    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}
