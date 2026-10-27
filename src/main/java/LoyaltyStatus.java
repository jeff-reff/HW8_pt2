public class LoyaltyStatus {
    private boolean member;

    public LoyaltyStatus(boolean member){
        this.member = member;
    }

    public boolean isApartOfProgram(){
        return member;
    }

    public double applyDiscount(double total){
        if (isApartOfProgram()){
            return total * 0.80;
        } else {
            return total;
        }
    }

}
