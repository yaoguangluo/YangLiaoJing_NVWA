package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P;
public class PDN{
	public boolean[] getPdn() {
		return pdn;
	}

	public void I_Pdn(boolean[] pdn) {
		this.pdn = pdn;
	}

	private boolean[] pdn;
	public void IV_(boolean isMale) {
		pdn= new  boolean[1985525];
		for(int i= 0; i< pdn.length; i++) {
			if(isMale) {
				pdn[i]= true;
			}else {
				pdn[i]= false;
			}
		}
	}
}