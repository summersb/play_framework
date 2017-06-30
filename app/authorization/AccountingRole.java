package authorization;

public class AccountingRole extends Secured {
    
    @Override
    public String getRequiredRoleName() {
        return Secured.ROLE_ACCOUNTING;
    }
}