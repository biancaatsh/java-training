package clean.code.design_patterns.requirements;
// clasa concreta
class BCR implements Bank{
    private final String Bank_NAME;
    public BCR(){
        Bank_NAME="BCR BANK";
    }
    public String getBankName(){

        return Bank_NAME;
    }
}