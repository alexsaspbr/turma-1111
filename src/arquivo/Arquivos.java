package arquivo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arquivos {

    public static final String PATH_TELEFONE = "/home/alexaraujo/ada/Turmas/1111/logica-programacao/telefones.txt";
    public static final String PATH_CONTATO = "/home/alexaraujo/ada/Turmas/1111/logica-programacao/contatos.txt";

    public static void main(String[] args) {

        File telefone = new File(PATH_TELEFONE);
        System.out.println("Nome arquivo: " + telefone.getName());
        System.out.println("Tamanho do arquivo: " + telefone.length());

        //readFileWithFileReader(telefone);
        readFileWithScanner(telefone);

        //threads();

        File contato = new File(PATH_CONTATO);

        if(!contato.exists()) {
            try {
                contato.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

    private static void threads() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 1");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 2");
            }
        });

        t1.start();
        t2.start();
    }

    private static void readFileWithFileReader(File file) {

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bf = new BufferedReader(fileReader);
            String linha = bf.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = bf.readLine();
            }
            bf.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static List<Telefone> readFileWithScanner(File file) {
        List<Telefone> telefones = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String[] dadosTelefone = scanner.nextLine().split("\\|");
                Telefone telefone = new Telefone(Integer.valueOf(dadosTelefone[0]), dadosTelefone[1], dadosTelefone[2]);
                telefones.add(telefone);
            }
            return telefones;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
