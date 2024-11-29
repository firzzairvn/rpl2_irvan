/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mahasiswa.controller;

import com.mahasiswa.model.MahasiswaModel;
import com.mahasiswa.services.MahasiswaService;
import java.util.List;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author FirzaIrvan
 */
@Controller
public class MahasiswaController {

    @Autowired
    private MahasiswaService mahasiswaService;

    public String add(@RequestBody MahasiswaModel mhs) {
        if (mhs.getNpm() == null || mhs.getNpm().isEmpty()){
            throw new IllegalArgumentException("NPM tidak boleh kosong");
        }if (mhs.getNama() == null || mhs.getNama().isEmpty()){
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        mahasiswaService.add(mhs);
        return "Mahasiswa added successfully";
    }

    public MahasiswaModel getById(@PathVariable int id) {
        return mahasiswaService.getById(id);
    }

    public String update(@RequestBody MahasiswaModel mhs) {
        mahasiswaService.add(mhs);
        return "Mahasiswa updated successfully";
    }

    public String deleteById(@PathVariable int id) {
        mahasiswaService.deleteById(id);
        return "Mahasiswa deleted successfully";
    }

    public List<MahasiswaModel> getAll() {
        return mahasiswaService.getAll();
    }
}
