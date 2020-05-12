package lacos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class Lacos {

    public static void main(String[] args) {
        int c, sexo, contF, contM;
        c = 0;      contF = 0;     contM = 0;
        while (c < 10) {
            sexo = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 Feminino ou 2 Masculino"));
            if (sexo == 1) {
                contF++;
            } else if (sexo == 2) {
                contM++;//contador de incremento
            } else {
                c--;//contador de decremento
                JOptionPane.showMessageDialog(null,"Usuário, digite apenas 1 ou 2");
            }
            c++;
        }//fim do loop while
        JOptionPane.showMessageDialog(null,"Quant. Mulheres: "+contF+"\nQuant. Homens:"+contM);

    }

}
