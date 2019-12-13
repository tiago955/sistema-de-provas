package br.com.projetowilson.factory;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {

    //nome do usuario do mysql

    private static final String USERNAME = "root";


    // Senha do mysql
    private static final String PASSWORD = "root";

    //dados de caminho, porta e nome da base de dados que vai ser feito

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3636"

    /**
     * Cria uma conexão com o banco de dados MySQL utilizando o nome de usuário e senha fornecidos
     *
     * @param username
     * @param senha
     * @return uma conexão com o banco de dados
     * @throws Exception
     */

    public static Connection createConnectionToMySQL() throws Exception
        Class.forName("com.mysql.jdbc.Driver"); // classe que cria a conexão com baco de dados

    Connection connection = DriverManager.getConnection(DATABASE_URL)

                return connection;

}
public static void main(String[] args) throws Exception {

    //recuperação de conexão.


    Connection con = createConnectionToMySQL();


    //teste de conexão
    if (con ! = null){
        System.out.println("Conexão obtida com sucesso!" + con);
        con.close();

    }
}


}