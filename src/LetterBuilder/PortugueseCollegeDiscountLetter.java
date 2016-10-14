package LetterBuilder;

public class PortugueseCollegeDiscountLetter extends CollegeDiscountLetter {

	public PortugueseCollegeDiscountLetter(Person sender, String numMatricula,
											String destinatary, String departament,
											Address addressSender, Address addressDestiny,
											Date date){
		super(sender,numMatricula,
					destinatary, departament,
					addressSender, addressDestiny,
					date);
	}
	

	   @Override
		protected String EuLanguages(){
	            return "Eu";
	   	};
	   @Override     
	        protected String nacionalidadeLanguages(){
	            return "Nacionalidade";
	        };
	   @Override
	        protected String estadoCivilLanguages(){
	            return "Estado Civil";
	        };
	   @Override
	        protected String profissaoLanguages(){
	            return "Profiss�o";
	        };
	    @Override
	        protected String cpfLanguages(){
	            return "CPF";
	        };
	    @Override
	        protected String informarLanguages(){
	            return "Informar";
	        };
	    @Override    
	        protected String nMatriculaLanguages(){
	            return "matriculado nesta institui��o pelo numero";
	        };
	    @Override    
	        protected String razaoLanguages(){
	            return "vem, respeitosamente, a presen�a de Vossa Senhoria, em raz�o do fato de se encontrar";
	        };
	    @Override    
	        protected String termosLanguages(){
	            return "Termos em que";
	        };
	    @Override    
	        protected String pedeLanguages(){
	            return "Pede deferimento";
	        };

}
