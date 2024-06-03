package br.com.challenge;

import java.time.LocalDate;

public class Curso extends Conteudo {

   private int cargaHoraria;
   private LocalDate data;

    public Curso() {
    }


    @Override
    public double cacularXp() {
        // TODO Auto-generated method stub

        return XP_PADRAO * cargaHoraria; 
    }

   
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


   

    
}
