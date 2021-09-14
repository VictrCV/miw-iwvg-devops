package es.upm.miw.iwvg_devops.code;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el denominador
 * <p>
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el denominador
 * <p>
 * Dos fracciones son equivalentes cuando el producto de extremos (numerador de la primera por denominador de la segunda) es igual al
 * producto de medios (denominador de la primera por el numerador de la segunda)
 * <p>
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto sucede cuando el numerador y el denominador son primos entre
 * sí
 * <p>
 * Reducir varias fracciones a común denominador consiste en convertirlas en otras equivalentes que tengan el mismo denominador
 * <p>
 * Comparar fracciones
 * <p>
 * Suma fracciones: En primer lugar se reducen los denominadores a común denominador, y se suman o se restan los numeradores de las
 * fracciones equivalentes obtenidas
 * <p>
 * Multiplicación: La multiplicación de dos fracciones es otra fracción que tiene: Por numerador el producto de los numeradores. Por
 * denominador el producto de los denominadores.
 * <p>
 * La división de dos fracciones es otra fracción que tiene: Por numerador el producto de los extremos. Por denominador el producto de los
 * medios. Invertir fraccion
 */
public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return this.numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) this.numerator / this.denominator;
    }

    public boolean isProperFraction(){
        return this.numerator < this.denominator;
    }

    public boolean isImproperFraction(){
        return !this.isProperFraction();
    }

    public Fraction multiplyFraction(Fraction otherFraction){
        return new Fraction(this.numerator * otherFraction.getNumerator(),
                this.denominator * otherFraction.getDenominator());
    }

    public double decimalValue(){
        return (double) this.numerator/this.denominator;
    }

    public int compareTo(Fraction otherFraction){
        return Double.compare(this.decimalValue(), otherFraction.decimalValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //mira si es exactamente el mismo objeto
        if (o == null || this.getClass() != o.getClass()) return false; //mira si es null o si son clases distintas

        Fraction fraction = (Fraction) o; //casting

        return this.numerator == fraction.getNumerator() && this.denominator == fraction.getDenominator();
    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }

    public boolean isNegativeFraction(){
        return this.numerator < 0 ^ this.denominator < 0;
    }



    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
