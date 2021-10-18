package api.tistech.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import api.tistech.questao8.Questao8;
import api.tistech.questao9.Questao9;
import api.tistech.questao9.dtos.BinaryTreeDto;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ApiController {

	private static final Logger log = LoggerFactory.getLogger(ApiController.class);
	
	public ApiController() {
	}

	@GetMapping(value = "/Tistech", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String welcomeAsHTML() {
		
		log.info("teste 001");
        return "<html>\n" + "<header><title>Questionario</title></header>\n" +
          "<body>\n" + "8 - Dados dois números inteiros A e B, crie um terceiro inteiro C seguindo as seguintes regras:\r\n"
          		+ "- O primeiro número de C é o primeiro número de A;\r\n"
          		+ "- O segundo número de C é o primeiro número de B;\r\n"
          		+ "- O terceiro número de C é o segundo número de A;\r\n"
          		+ "- O quarto número de C é o segundo número de B; Assim sucessivamente…\r\n"
          		+ "- Caso os números de A ou B sejam de tamanhos diferentes, completar C com o restante dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.\r\n"
          		+ "- Caso C seja maior que 1.000.000, retornar -1\r\n"
          		+ "Desenvolva um algoritmo que atenda a todos os requisitos acima.\r\n"
          		+ "9 - Considerando a estrutura de uma árvore binária:\r\n"
          		+ "public class BinaryTree {\r\n"
          		+ "int valor;\r\n"
          		+ "BinaryTree left;\r\n"
          		+ "BinaryTree right;\r\n"
          		+ "}\r\n"
          		+ "Desenvolva um método que dado um nó da árvore calcule a soma de todos os nós subsequentes\n" + 
          "</body>\n" + "</html>";       
                
    }
	
	
	  @GetMapping("numeroA/{numeroA}/numeroB/{numeroB}")
	  public Integer ApiMontaNumeroC( @PathVariable("numeroA") Integer numeroA, @PathVariable("numeroB") Integer numeroB ) {
		
		log.info("numeroA="+ numeroA );  
		log.info("numeroB="+ numeroB );
		Questao8 q8 = new Questao8();  
		Integer numeroC = q8.montaNumeroC( numeroA, numeroB );  
		
		log.info("numeroC="+numeroC);
	    return numeroC;
		  
	  }
	  
	  	  
	  @GetMapping("/BinaryTree")
	  public Integer SomaNodos( ) {
		
	        BinaryTreeDto bTree = new BinaryTreeDto();
	        bTree.setValor(15);

	        BinaryTreeDto bTree1 = new BinaryTreeDto();
	        bTree1.setValor(18);

	        BinaryTreeDto bTree2 = new BinaryTreeDto();
	        bTree2.setValor(10);
	        
	        BinaryTreeDto bTree3 = new BinaryTreeDto();
	        bTree3.setValor(14);
	        
	        bTree.setLeft(bTree1);

	        bTree1.setLeft(bTree2);
	        
	        bTree2.setLeft(bTree3);

	        Questao9 q9 = new Questao9(bTree);
	        
	        Integer soma = q9.SomaNodos();
	        log.info("BinaryTree nodes="+soma);
	        
	    return soma;
		  
	  }
	  
	
	
}