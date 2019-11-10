/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author student1
 */
public class Math {

    private int a;
    private int b;
    private double result;
    private MathOperator mathOperator;

    public Math() {
    }

    public Math(int a, int b, double result, MathOperator mathOperator) {
        this.a = a;
        this.b = b;
        this.mathOperator = mathOperator;
        this.result = calcualte();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public MathOperator getMathOperator() {
        return mathOperator;
    }

    public void setMathOperator(MathOperator mathOperator) {
        this.mathOperator = mathOperator;
    }

    @Override
    public String toString() {
        return "Math{" + "a=" + a + ", b=" + b + ", result=" + result + ", mathOperator=" + mathOperator + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.a;
        hash = 97 * hash + this.b;
        hash = 97 * hash + Objects.hashCode(this.mathOperator);
        return hash;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Math other = (Math) obj;
//        if (this.a != other.a) {
//            return false;
//        }
//        if (this.b != other.b) {
//            return false;
//        }
//        if (this.mathOperator != other.mathOperator) {
//            return false;
//        }
//        return true;
//    }

    private double calcualte() {
        switch (mathOperator) {
            case ADD:
                return a + b;
            case SUBSTRACT:
                return a - b;
            case MULTIPLY:
                return a * b;
            case DIVIDE:
                return a / b;
            default:
                return 0.0;
        }
    }

}
