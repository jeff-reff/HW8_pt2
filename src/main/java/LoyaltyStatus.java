public class LoyaltyStatus {
    private boolean member;

    public LoyaltyStatus(boolean member){
        this.member = member;
    }

    public boolean isApartOfProgram(){
        return member;
    }

    public double applyDiscount(double total){
        return 0.00;
    }

}
