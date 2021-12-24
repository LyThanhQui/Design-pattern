package behavioral.chainofresponsibility;

class Manager extends LoanApprover
{
    public void ApproveLoan(Loan i)
    {
        if (i.getAmount() <= 100000)
            System.out.println("Loan amount of " + i.getAmount() + " approved by the Manager"); 
        else
            nextApprover.ApproveLoan(i);
    }
}