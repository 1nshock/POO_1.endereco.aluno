import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
 
public class App {
    public static void main(String[] args) throws Exception {
        endereco casa = new endereco("00000000", "sp", "abc ferraz",
        "sp", "abc", 0);
 
        contato celular = new contato(93000-0100, 11, "celular");
        contato residencial = new contato(4000-2313, 11, "residencial");
       
 
        List<contato> contatos = new ArrayList<>();
        contatos.add(residencial);
        contatos.add(celular);
 
        // data = Calendar.getInstance();
        //data.set (year:2004, Calendar.JULY,date:17);
        //LocalDate dataNascimento = data.getTime();
 
        aluno a = new aluno("000.000.000-00", "guilherme", "masculino", 310204, LocalDate.of(2004, 7,
                 14), casa, contatos);
 
 
         System.out.println(a.getEndereco());
         System.out.println(a.getNome());
 
 
    }
}