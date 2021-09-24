import java.io.*;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) {

        try {
            Socket conexao = new Socket("127.0.0.1", 50001);
            DataOutputStream resultado = new DataOutputStream(conexao.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String mensagem = br.readLine();
            re.writeUTF(mensagem);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
