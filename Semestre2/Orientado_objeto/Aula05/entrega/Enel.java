import javax.swing.JOptionPane;

public class Enel{
    public static void main(String[]args){
        double tarifa = 0.28172;
        double micms=0;
        double mcofins=0;
        double mpis=0;
       double kwh = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o seu consumo em KWh::"));
       if(kwh<=200){
           micms = 0.136363;
           mcofins = 0.0614722;
           mpis = 0.013346;
           
       }else{
           micms = 0.333333;
           mcofins = 0.0730751;
           mpis = 0.0158651;
       }
       
       double fornecimento = kwh*tarifa;
       double icms = fornecimento*micms;
       double cofins = fornecimento*mcofins;
       double pis = fornecimento*mpis;
       double icms_cofins = mcofins*micms*fornecimento;
       double icms_pis = mpis*micms*fornecimento;
       double fatura = fornecimento+icms+cofins+pis+icms_cofins+icms_pis;
        
        
        JOptionPane.showMessageDialog(null,"Fornecimento = "+fornecimento+"\nIMCS = "+icms+"\nCOFINS = "+cofins+
        "\nPIS/PASESP = "+pis+"\nICMS SOBRE COFINS = "+icms_cofins+"\nICMS SOBRE PIS/PASESP = "+icms_pis+"\nFatura = "+fatura);
    }
    
}
