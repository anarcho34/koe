import javax.swing.JOptionPane;
public class xxx 
{
   public static void main( String[] args )
   {
       String primeironumero = 
               JOptionPane.showInputDialog("bota o primeiro numerokk");
       String segundonumero = 
               JOptionPane.showInputDialog("bota o segundo cornokk");
       
   int number1 = Integer.parseInt(primeironumero);
   int number2 = Integer.parseInt(segundonumero);
   int sum = number1 + number2;
   JOptionPane.showMessageDialog(null, "a soma é " + sum,
           "soma de dois numeros", JOptionPane.PLAIN_MESSAGE);
   }
}
   

