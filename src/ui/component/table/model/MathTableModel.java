/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.component.table.model;

import controller.Controller;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.MathOperator;

/**
 *
 * @author student1
 */
public class MathTableModel extends AbstractTableModel {

    private String[] columnNames = new String[]{"A", "B", "OPERATOR", "RESULT"};
    private Class[] columnClasses = new Class[]{Integer.class, Integer.class, MathOperator.class, Double.class};

    @Override
    public int getRowCount() {
        if (Controller.getInstance().getMaths() == null) {
            return 0;
        }
        return Controller.getInstance().getMaths().size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        if (column > columnNames.length) {
            return "n/a";
        }

        return columnNames[column];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public Class<?> getColumnClass(int column) {
        return columnClasses[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        model.Math math = Controller.getInstance().getMaths().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return math.getA();
            case 1:
                return math.getB();
            case 2:
                return math.getMathOperator();
            case 3:
                return math.getResult();
            default:
                return "n/a";
        }
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
        model.Math math = Controller.getInstance().getMaths().get(row);
        switch (column) {
            case 0:
                math.setA((int) value);
                break;
            case 1:
                math.setB((int) value);
                break;
            case 2:
                math.setMathOperator((MathOperator) value);
                break;
            case 3:
                math.setResult((Double) value);
                break;
        }
    }

}
