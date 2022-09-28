package com.catalisa.miniprojetorecirende.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CamposInvalidos {
    private String campo;
    private String erro;
}
