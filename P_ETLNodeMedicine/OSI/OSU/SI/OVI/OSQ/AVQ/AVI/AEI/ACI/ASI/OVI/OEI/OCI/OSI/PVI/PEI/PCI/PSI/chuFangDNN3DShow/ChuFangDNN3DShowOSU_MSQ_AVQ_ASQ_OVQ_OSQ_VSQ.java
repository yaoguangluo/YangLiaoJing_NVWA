package OSI.OSU.SI.OVI.OSQ.AVQ.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.chuFangDNN3DShow;
import java.awt.HeadlessException;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;

import IMO.EVU.biProcessor.CoAuthorForWord;
import ME.APM.VSQ.App;
import OCI.ME.analysis.C.A;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
public class ChuFangDNN3DShowOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ extends OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	public App u;
	public A _A;
	public Map<String, String> pos;
	public String DNNtext;
	public ChuFangDNN3DShowOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ(){
		super();
	}
	public void view() throws Exception{
		try {
			CoAuthorForWord app = null;
			try {
				app= new CoAuthorForWord(u, _A, pos);
				app.setSize(850, 400);
				app.setVisible(true);
				JFrame f= new JFrame();
				f.add(app);
				f.setTitle("����DNN��Ч�۲�");
				f.setLocationRelativeTo(null);
				f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				f.setSize(650,480);
				f.setVisible(true);
				app.bootZynkFlowerForest("ҩ����Чɭ��", DNNtext, true);
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}   
			close = false;
			
		}catch(Exception e) {
		}
		
	}
	@Override
	public OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ clone() {
		objectView = (OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ)super.clone();  
		return objectView;  
	}  
}