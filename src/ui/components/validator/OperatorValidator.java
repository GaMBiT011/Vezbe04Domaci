/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.components.validator;

import model.MathOperator;

/**
 *
 * @author Nikola
 */
public class OperatorValidator implements Validator {

    @Override
    public void validate(Object value) throws Exception {
        try {
            MathOperator op = MathOperator.valueOf(value.toString());

        } catch (Exception e) {
            throw new Exception("Value:" + value + " is not operator.");

        }
    }

}
