import static org.junit.jupiter.api.Assertions.*;

public class Fraction {

    private int numerateur;
    private int denumerateur;

    public Fraction(int numerateur,int denumerateur) {
        //assert denumerateur!=0;
        this.numerateur=numerateur;
        this.denumerateur=denumerateur;
    }

    public int getDenumerateur() {
        return denumerateur;
    }

    public int getNumerateur() {
        return numerateur;
    }

    public void setNumerateur(int numerateur) {
        this.numerateur = numerateur;
    }

    public void setDenumerateur(int denumerateur) {
        this.denumerateur = denumerateur;
    }

    @Override
    public String toString() {
        return numerateur + "/" + denumerateur;
    }

    public void testDenumerateur(){
        assertNotEquals(this.denumerateur,0);

    }

}

