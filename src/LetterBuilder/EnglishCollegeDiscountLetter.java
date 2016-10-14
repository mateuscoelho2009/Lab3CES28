package LetterBuilder;

public class EnglishCollegeDiscountLetter extends CollegeDiscountLetter {
    
    public EnglishCollegeDiscountLetter(Person sender, String numMatricula,
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
            return "I";
        };
   @Override     
        protected String nacionalidadeLanguages(){
            return "nacionality";
        };
   @Override
        protected String estadoCivilLanguages(){
            return "civil status";
        };
   @Override
        protected String profissaoLanguages(){
            return "occupation";
        };
    @Override
        protected String cpfLanguages(){
            return "CPF under number";
        };
    @Override
        protected String informarLanguages(){
            return "advise";
        };
    @Override    
        protected String nMatriculaLanguages(){
            return "enrolled in this institution on the number";
        };
    @Override    
        protected String razaoLanguages(){
            return "comes respectfully to the presence of your lordship, due to the fact finding";
        };
    @Override    
        protected String termosLanguages(){
            return "Terms that";
        };
    @Override    
        protected String pedeLanguages(){
            return "asks approval";
        };    
}
