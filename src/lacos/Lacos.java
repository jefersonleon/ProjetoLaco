package lacos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class Lacos {

    public static void main(String[] args) {
        int c, sexo, contF, contM, idade, cont18;
        c = 0;      contF = 0;     contM = 0; cont18=0; 
        
        while (c < 5) {
            sexo = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 Feminino ou 2 Masculino"));
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
            if (sexo == 1) {
                contF++;
            } else if (sexo == 2) {
                contM++;//contador de incremento
            } else {
                c--;//contador de decremento
                JOptionPane.showMessageDialog(null,"Usuário, digite apenas 1 ou 2");
            }
            if(idade>=18){
                cont18++;
            }
            c++;
        }//fim do loop while
        JOptionPane.showMessageDialog(null,"Quant. Mulheres: "+contF+"\nQuant. Homens:"+contM+"\nQuant. de maiores de idade:"+cont18);

    }

}
