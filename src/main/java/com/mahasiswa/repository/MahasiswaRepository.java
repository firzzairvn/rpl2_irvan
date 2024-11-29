/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mahasiswa.repository;

import com.mahasiswa.model.MahasiswaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author FirzaIrvan
 */

@Repository
public interface MahasiswaRepository extends JpaRepository<MahasiswaModel, Integer>{
    
}
