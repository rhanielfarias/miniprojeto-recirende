package com.catalisa.miniprojetorecirende.enumerations.factory;

import com.catalisa.miniprojetorecirende.enumerations.EstadosEnum;

public class EstadoFactory {

   public EstadosEnum estado(String nome){
        if(nome.equalsIgnoreCase("sao paulo")){
            return EstadosEnum.Sao_Paulo;
        } else if (nome.equalsIgnoreCase("bahia")) {
            return EstadosEnum.Bahia;
        } else if (nome.equalsIgnoreCase("espirito santo")) {
            return EstadosEnum.Espirito_Santo;
        } else if (nome.equalsIgnoreCase("brasilia")) {
            return EstadosEnum.Brasilia;
        } else if (nome.equalsIgnoreCase("minas gerais")) {
            return EstadosEnum.Minas_Gerais;
        }
        return null;
    }
}
