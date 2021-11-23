package javacore.excecoes.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do \"ArrayIndexOutOfBoundsException\"");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do \"IndexOutOfBoundsException\"");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do \"IllegalArgumentException\"");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do \"ArithmeticException\"");
        } catch (RuntimeException e) {
            System.out.println("Dentro do \"RuntimeException\"");
        }

        try {
            talvezLanceException();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {
        // TODO document why this method is empty
    }
}
