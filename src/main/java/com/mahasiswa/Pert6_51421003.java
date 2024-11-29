package com.mahasiswa;

import com.mahasiswa.controller.MahasiswaController;
import com.mahasiswa.view.MahasiswaView;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.*;

/**
 *
 * @author FirzaIrvan
 */
@SpringBootApplication
public class Pert6_51421003 implements ApplicationRunner {

    public static void main(String[] args) {
        // Pastikan untuk mengatur headless mode sebelum aplikasi dimulai
        System.setProperty("java.awt.headless", "false");

        // Menjalankan aplikasi Spring Boot
        ApplicationContext context = SpringApplication.run(Pert6_51421003.class, args);

       MahasiswaController controller = context.getBean(MahasiswaController.class);
       MahasiswaView mahasiswaView = new MahasiswaView(controller);
       mahasiswaView.setVisible(true);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Pastikan aplikasi GUI hanya dimulai setelah konteks Spring Boot siap
    }
}
