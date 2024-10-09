package KHAI_BAO_LOP_DOI_TUONG.TinhToanPhanSo;

class Fraction{
    private long numerator;
    private long denominator;

    Fraction(){
    }
    Fraction(long numerator,long denominator){
        long tmp = gcd(numerator,denominator);
        this.numerator = numerator/tmp;
        this.denominator = denominator/tmp;
    }

    static long gcd(long a,long b){
        while(a*b!=0){
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a+b;
    }

    Fraction add(Fraction p){
        long numera = this.numerator*p.denominator + this.denominator*p.numerator;
        long denomina = this.denominator*p.denominator;
        return new Fraction(numera,denomina);
    }
    Fraction mul(Fraction p){
        long numera = this.numerator*p.numerator;
        long denomina = this.denominator*p.denominator;
        return new Fraction(numera,denomina);
    }

    @Override
    public String toString(){
        return Long.toString(this.numerator)+ '/' + Long.toString(this.denominator)+' ' ;
    }
}
