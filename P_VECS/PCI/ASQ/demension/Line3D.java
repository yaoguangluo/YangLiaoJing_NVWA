package PCI.ASQ.demension;
//Theory: �޷���֤
//Application: Yaoguang.luo
public class Line3D{
	public AMV_MVS_VSQ_3D getBegin() {
		return begin;
	}
	public void I_Begin(AMV_MVS_VSQ_3D begin) {
		this.begin = begin;
	}
	public AMV_MVS_VSQ_3D getEnd() {
		return end;
	}
	public void I_End(AMV_MVS_VSQ_3D end) {
		this.end = end;
	}
	private AMV_MVS_VSQ_3D begin;
	private AMV_MVS_VSQ_3D end;
}