package behavioral.chainofresponsibility;

class VicePresident extends LoanApprover
{
    public void ApproveLoan(Loan i)
    {
        System.out.println("Loan amount of " + i.getAmount() + " approved by the VicePresident"); 
    }
}