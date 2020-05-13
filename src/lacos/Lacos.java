package lacos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class Lacos {

    public static void main(String[] args) {
        int c, sexo, contF, contM, idade, cont18, acIdade, acMaior;
        c = 0;      contF = 0;     contM = 0; cont18=0; acIdade=0; acMaior=0;
        
        while (c < 3) {
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
                acMaior += idade;
                cont18++;
                
            }
            acIdade += idade; //acIdade = acIdade + idade;
            c++;
        }//fim do loop while
        JOptionPane.showMessageDialog(null,"Quant. Mulheres: "+contF+"\nQuant. Homens:"+contM+"\nQuant. de maiores de idade:"+cont18
        +"\nA média de idades é: "+(acIdade/c) +"\nMedia da idade dos adultos:"+(acMaior/cont18));

    }

}
