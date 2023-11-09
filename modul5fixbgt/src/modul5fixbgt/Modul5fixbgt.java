/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul5fixbgt;

import java.sql.Connection;

/**
 *
 * @author Martin Hara
 */
public class Modul5fixbgt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection connection = koneksiDatabase.getConnection();
        
        if (connection != null) {
            System.out.println("Terhubung ke database.");
            // Sekarang Anda dapat menjalankan query atau operasi database lainnya di sini.
        } else {
            System.out.println("Gagal terhubung ke database.");
        }
    }
    
    
}
