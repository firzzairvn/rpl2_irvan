package com.mahasiswa.services;

import com.mahasiswa.model.MahasiswaModel;
import com.mahasiswa.repository.MahasiswaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author FirzaIrvan
 */
@Service
public class MahasiswaService {

    // Autowire MahasiswaRepository untuk melakukan operasi CRUD
    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    // Method untuk menambah data mahasiswa
    public void add(MahasiswaModel mhs) {
        mahasiswaRepository.save(mhs);
    }

    // Method untuk mendapatkan data mahasiswa berdasarkan ID
    public MahasiswaModel getById(int id) {
        return mahasiswaRepository.findById(id).orElse(null);
    }

    // Method untuk memperbarui data mahasiswa
    public void update(MahasiswaModel mhs) {
        mahasiswaRepository.save(mhs);
    }

    // Method untuk menghapus data mahasiswa berdasarkan ID
    public void deleteById(int id) {
        mahasiswaRepository.deleteById(id);
    }

    // Method untuk mendapatkan semua data mahasiswa
    public List<MahasiswaModel> getAll() {
        return mahasiswaRepository.findAll();
    }
}
