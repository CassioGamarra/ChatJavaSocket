
import cliente.FrameCliente;
import javax.swing.JOptionPane;
import servidor.FrameServidor;

public class Main {
    public static void main(String[] args) {
        String opString = JOptionPane.showInputDialog(null, "1 - Cliente | 2 - Servidor");
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        try{
            int opcao = Integer.parseInt(opString);
            if(opcao == 1){
                FrameCliente cliente = new FrameCliente();
                cliente.setLocationRelativeTo(null);
                cliente.setVisible(true);
            }
            else if(opcao == 2){
                FrameServidor servidor = new FrameServidor();
                servidor.setLocationRelativeTo(null);
                servidor.setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    }
}
