package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    @Test
    void testFindUserFamilyNameByUserNameDistinct() {
        assertEquals(List.of("Torres"), new Searches().findUserFamilyNameByUserNameDistinct("Paula")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserFractionNumeratorByFamilyName() {
        assertEquals(List.of(2, 4, 0, 1, 1), new Searches().findFractionNumeratorByUserFamilyName("Torres")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindFamilyNameByFractionDenominator() {
        assertEquals(List.of("López", "Torres"), new Searches().findUserFamilyNameByFractionDenominator(2)
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserIdByAnyProperFraction() {
        assertEquals(List.of("1", "2", "3", "5"), new Searches().findUserIdByAnyProperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserNameByAnyImproperFraction() {
        assertEquals(List.of("Oscar", "Ana", "Oscar", "Paula", "Antonio", "Paula"), new Searches().findUserNameByAnyImproperFraction()
                .collect(Collectors.toList()));
    }

    void testFindUserFamilyNameByAllSignFractionDistinct() {
    }

    void testFindDecimalFractionByUserName() {
    }

    void testFindDecimalFractionBySignFraction() {
    }

    void testFindFractionAdditionByUserId() {
    }

    void testFindFractionSubtractionByUserName() {
    }
//patata
    @Test
    void testFindFractionMultiplicationByUserFamilyName() {
        assertEquals(new Fraction(8, 8), new Searches().findFractionMultiplicationByUserFamilyName("Torres"));
    }
}
