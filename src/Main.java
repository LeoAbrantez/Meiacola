/*
VAR
latinha, garrafinha, garrafao, total, litros: Real

INICIO

Ler latinha
Ler garrafinha
Ler garrafao

total ← (latinha * 350) + (garrafinha * 600) + (garrafao * 2000)
litros ← total / 1000

Escreva "O comerciante comprou " + litros + " litros de refrigerante."

FIM

TESTE DE MESA

| Latinha (350ml) | Garrafinha (600ml) | Garrafão (2L) | Total ((latinha * 350) + (garrafinha * 600) + (garrafao * 2000)) | Litros (total / 1000) | Saída |
|---------------|--------------------|--------------|-------------------------------------------------|----------------|------------------------------------------------------------|
| 10            | 5                  | 2            | (10 * 350) + (5 * 600) + (2 * 2000) = 10500     | 10.5           | "O comerciante comprou 10.5 litros de refrigerante."       |
| 4             | 3                  | 1            | (4 * 350) + (3 * 600) + (1 * 2000) = 5200       | 5.2            | "O comerciante comprou 5.2 litros de refrigerante."        |
| 20            | 10                 | 5            | (20 * 350) + (10 * 600) + (5 * 2000) = 23000    | 23.00          | "O comerciante comprou 23.00 litros de refrigerante."      |
| 0             | 0                  | 3            | (0 * 350) + (0 * 600) + (3 * 2000) = 6000       | 6.00           | "O comerciante comprou 6.00  litros de refrigerante."      |
 */

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double latinha,garrafinha,garrafao,total,litros;

        //Strings
        String slatinha, sgarrafinha,sgarrafao;

        //Latinha
        slatinha = JOptionPane.showInputDialog(null, "Há quantas latinhas de 350ml?");
        latinha = Double.parseDouble(slatinha);

        //Garrafinha
        sgarrafinha = JOptionPane.showInputDialog(null,"Há quantas garrafas de 600ml");
        garrafinha = Double.parseDouble(sgarrafinha);

        //Garrafao
        sgarrafao = JOptionPane.showInputDialog(null, "Há quantas garrafas de 2 litros?");
        garrafao = Double.parseDouble(sgarrafao);

        //Main code
        total = (latinha * 350) + (garrafinha * 600) + (garrafao * 2000);
        litros = total/1000;

        //Output
        JOptionPane.showMessageDialog(null,"O comerciante comprou " + litros + " litros de refrigerante.");
    }
}
