package behavioral.chainofresponsibility;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		LoanApprover a = new Manager();
        LoanApprover b = new Director();
        LoanApprover c = new VicePresident();
        a.SetNextApprover(b);
        b.SetNextApprover(c);
        a.ApproveLoan(new Loan(50000));  //this will be approved by the manager
        a.ApproveLoan(new Loan(120000));  //this will be approved by the director
        a.ApproveLoan(new Loan(500000));  //this will be approved by the vice president
	}

}
