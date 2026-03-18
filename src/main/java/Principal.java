import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        //Variáveis
        double base, altura, area;
        //Entradas
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
        area = (base * altura)/2.0;
        //Saída
        JOptionPane.showMessageDialog (null, "A area é" + area);
    }
    
}