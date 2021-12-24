/*The adapter pattern(structural design pattern) allows two 
 unrelated interfaces to work together.
 
 I assume that your company has built an Human Resource Management 
 application. An employee can be: Engineer, Senior Engineer, or Manager.
 And your company just buy a library that support this application 
 about Salary Management. But this library called Engineer as Junior 
 and Senior as Senior Engineer. We apply Adapter pattern 
 to solve this problem.
 
 Steps to implements
 1. Create a JuniorToEngineerAdapter class extends from Engineer
 2. Create a SeniorToSeniorEngineerAdapter class extends from SeniorEngineer
 3. Before creating 2 classes above, we also create:
    - Engineer, SeniorEngineer for my application
    - Junior, Senior classes to simulate for the third party library 
  
 */
package structural.adapter3;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<VNElectricSocket> a = new ArrayList<VNElectricSocket>();
		a.add(new VNElectricSocket());
		a.add(new UK2VNElectricity(new UKElectricSocket()));
		
		
		
		VNElectricSocket x = a.get(1);
		
		x.plug();
	}

}
