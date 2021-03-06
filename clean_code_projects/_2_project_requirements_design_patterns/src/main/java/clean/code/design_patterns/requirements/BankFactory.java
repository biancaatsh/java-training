package clean.code.design_patterns.requirements;
// clasa factory care mosteneste clasa AbstractFactory pentru a genera obiectul clasei concrete pe baza info. date.
class BankFactory extends AbstractFactory{

    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("ING")){
            return new ING();
        } else if(bank.equalsIgnoreCase("BRD")){
            return new BRD();
        } else if(bank.equalsIgnoreCase("BCR")){
            return new BCR();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}