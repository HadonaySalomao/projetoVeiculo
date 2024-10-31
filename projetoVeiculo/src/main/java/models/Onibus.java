/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Usuario
 */
public class Onibus extends Veiculo {
    private int numeroAssentos;

    public Onibus(int numeroAssentos, String placa, int ano) {
        super(placa, ano);
        this.numeroAssentos = numeroAssentos;
    }

    public int getNumeroAssentos() {
        return numeroAssentos;
    }

    public void setNumeroAssentos(int numeroAssentos) {
        this.numeroAssentos = numeroAssentos;
    }

    @Override
    public String toString() {
        return 
                super.toString() +"  " +
                "Assentos:" + numeroAssentos;
    }
    
    
}
