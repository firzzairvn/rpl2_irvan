/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mahasiswa.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author FirzaIrvan
 */
public class ModelTabelMahasiswa extends AbstractTableModel {

    private List<MahasiswaModel> listMhs;
    private String[] columnNames = {"ID", "NPM", "Nama", "Semester", "IPK"};

    public ModelTabelMahasiswa() {

    }

    public ModelTabelMahasiswa(List<MahasiswaModel> listMhs) {
        this.listMhs = listMhs;
    }

    public int getRowCount() {
        return listMhs.size();
    }

    public int getColumnCount() {
        return columnNames.length;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        MahasiswaModel mhs = listMhs.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return mhs.getId();
            case 1:
                return mhs.getNpm();
            case 2:
                return mhs.getNama();
            case 3:
                return mhs.getSemester();
            case 4:
                return mhs.getIpk();
            default:
                return null;
        }
    }
    
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public void setMahasiswaList(List<MahasiswaModel> listMhs) {
        this.listMhs = listMhs;
        fireTableDataChanged();
    }
}
