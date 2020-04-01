package testes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestaFormatacaoData{
    public static void main(String[] args){
        LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter diaMesAno = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter diaMesAnoComHifen = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter diaMesAnoComPonto = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter mesDiaAno = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter formatoBizarro = DateTimeFormatter.ofPattern("dd(MM)yyyy(MM)dd");

        System.out.println(agora.format(diaMesAno));
        System.out.println(agora.format(diaMesAnoComHifen));
        System.out.println(agora.format(diaMesAnoComPonto));
        System.out.println(agora.format(mesDiaAno));
        System.out.println(agora.format(formatoBizarro)); //vice-versa
        System.out.println(formatoBizarro.format(agora)); //vice-versa

        String agoraEmTexto = "19/03/2020";
        LocalDate dataHoje = LocalDate.parse(agoraEmTexto,diaMesAno);
        System.out.println(dataHoje);


    }
}