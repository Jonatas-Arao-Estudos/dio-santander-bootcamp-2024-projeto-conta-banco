import java.util.Locale;
import java.util.Scanner;

/**
* <h1>Sintaxe - Desafio Conta Banco</h1>
* <p>Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.</p>
*
* <ol>
*    <li>Crie o projeto <code>ContaBanco</code> que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:</li>
*    <li>Dentro do projeto, crie a classe <code>ContaTerminal.java</code> para realizar toda a codificação do nosso programa.</li>
*    <li> 
*       <p>Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:</p>
*       <blockquote>
*           <p>Programa: "Por favor, digite o número da Agência!"</p>
*           <p>Usuário: 1021 <em>(depois ENTER para o próximo campo)</em></p>
*       </blockquote> 
*    </li>
*    <li>
*       <p>Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:</p>
*       <blockquote>
*           <p>"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".</p>
*       </blockquote>
*       <p>Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.</p>     
*    </li>
* </ol>
*
* 
*
* @author  Jonatas Arão
* @version 1.0
* @since   18/06/2024
*/
public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja bem-vindo ao sistema do banco!");

        System.out.println("Por favor, digite o seu nome");
        String nomeCliente = scanner.next();
        
        System.out.println("Por favor, digite o número de sua agência incluindo digito verificador (Ex: 123-4): ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta (Ex: 1234)");
        int numero = scanner.nextInt();
        
        double saldo = 0;
        System.out.println("Por favor, digite o valor que deseja depositar");
        saldo = saldo + scanner.nextDouble();
        
        scanner.close();
        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");
    }
}
