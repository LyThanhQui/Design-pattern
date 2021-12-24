package structural.adapter3;

public class UK2VNElectricity extends VNElectricSocket{
	private UKElectricSocket uk;
	public UK2VNElectricity(UKElectricSocket uk) {
		this.uk = uk;
	}
	public void plug() {
		uk.use();
		
	}
}
