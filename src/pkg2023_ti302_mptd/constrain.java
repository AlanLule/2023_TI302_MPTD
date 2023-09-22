/*
 * 2023 ITESS-TICS MPTD
 * Unidad 1 Programacion Lineal
 * Linear Constraint 2d class
 * Restriccion lineal2d
 * By: ARAL
 * Fecha: 22/Sept/2023
 *
 */
package pkg2023_ti302_mptd;

/**
 *
 * @author Rigel Lule
 */
public class constrain {
    private float a1;
    private float a2;
    private float b1;

    public constrain() {
    }

    public constrain(float a1, float a2, float b1) {
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
    }

    public float getA1() { 
        return a1;
    }

    public float getA2() {
        return a2;
    }

    public float getB1() {
        return b1;
    }

    public void setA1(float a1) {
        this.a1 = a1;
    }

    public void setA2(float a2) {
        this.a2 = a2;
    }

    public void setB1(float b1) {
        this.b1 = b1;
    }
    
    
    public point2D getp1(){
        point2D p1 = new point2D();
        if (a1 != 0.0f && a2 != 0.0f && b1!= 0f){
            //caso 1: p1 (x1 = 0, ??) & p2 (x1=x1max,??)
            p1.setX1(0);
            p1.setX2(b1/a2);
        }
        return p1;
    }
    
    public point2D getp2(){
        point2D p2 = new point2D();
        if (a1 != 0.0f && a2 != 0.0f && b1!= 0f){
            //caso 1: p1 (x1 = 0, ??) & p2 (x1=x1max,??)
            p2.setX1(xmax);
            p2.setX2((b1 - a1*coordinate.xmax)/a2);
        }
        return p2;
    }

}
