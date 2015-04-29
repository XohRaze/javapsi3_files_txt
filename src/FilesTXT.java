import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FilesTXT {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String fileLocation = "C:\\Users\\a48035\\Desktop\\java.txt";
		
		FileWriter fw = new FileWriter(fileLocation);   //Objecto para manipular o ficheiro de uma file com previlegios de escrita
		
		PrintWriter pw = new PrintWriter(fw);			//objecto para escrever no ficheiro aberto em FW
		
		pw.println("Texto");
		pw.close();
		fw.close();
		
		System.out.println("Fim da escrita");
		
		System.in.read();
		
		FileReader fr = new FileReader(fileLocation);  //Objecto para manipular o ficheiro de uma file com previlegios de leitura
		
		BufferedReader br = new BufferedReader(fr);      //Objecto para ler do ficheiro
		
		String linha;									//Vai receber linha a linha
		
		while( (linha = br.readLine()) != null )
		{
			System.out.println(linha);
		}
		
		br.close();
		fr.close();
		
		System.out.println("Fim da leitura");
		
	}

}
